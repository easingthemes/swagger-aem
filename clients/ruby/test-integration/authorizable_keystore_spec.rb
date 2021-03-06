require_relative 'spec_helper'

describe 'Authorizable Keystore' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure authorizable keystore doesn't exist prior to testing
    begin
      data, status_code, headers = @sling.post_node_with_http_info(
        path = '/home/users/system/authentication-service/keystore',
        name = 'store.p12',
        {
          :operation => 'delete'
        }
      )
      # delete authorizable keystore when it exists
      expect([200, 204]).to include(status_code)
    rescue SwaggerAemClient::ApiError => err
      # ignore when authorizable keystore does not exist
      expect([403, 404]).to include(err.code)
    end

    # create authorizable keystore
    data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
      intermediate_path = '/home/users/system',
      authorizable_id = 'authentication-service',
      {
        :new_password => 'somekeystorepassword',
        :re_password  => 'somekeystorepassword',
        :operation    => 'createStore'
      }
    )
    expect([200, 201]).to include(status_code)
  end

  after do
  end

  describe 'test create' do

    it 'should have aliases when it exists' do
      data, status_code, headers = @sling.get_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service'
      )
      expect(status_code).to eq(200)
      expect(data.aliases.size).to eq(0)
    end

  end

  describe 'test delete' do

    it 'should not have aliases when it is deleted' do
      # delete authorizable keystore
      data, status_code, headers = @sling.post_node_with_http_info(
        path = '/home/users/system/authentication-service/keystore',
        name = 'store.p12',
        {
          :operation => 'delete'
        }
      )
      expect([200, 204]).to include(status_code)

      # get keystore info
      data, status_code, headers = @sling.get_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service'
      )
      expect(status_code).to eq(200)
      expect(data.exists).to eq(false)
      expect(data.aliases).to eq(nil)
    end

  end

  describe 'test change password' do

    it 'should succeed' do
      data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service',
        {
          :current_password => 'somekeystorepassword',
          :new_password => 'somenewkeystorepassword',
          :re_password => 'somenewkeystorepassword'
        }
      )
      expect(status_code).to eq(200)
    end

  end

  describe 'test upload certificate chain then download the keystore and re-upload the keystore' do

    it 'should succeed' do
      # upload a cert chain to the keystore
      # this cert chain is needed otherwise uploading an empty keystore wouldn't work
      File.open("./test-integration/fixtures/cert_chain.crt", 'r') { |keystore_cert_chain_file|
        File.open("./test-integration/fixtures/private_key.der", 'r') { |keystore_private_key_file|
          data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
            intermediate_path = '/home/users/system',
            authorizable_id = 'authentication-service',
            {
              :_alias => 'somecertchainalias',
              :cert_chain => keystore_cert_chain_file,
              :pk => keystore_private_key_file
            }
          )
          expect(status_code).to eq(200)
        }
      }

      # Check if Certalias exists in keystore
      data, status_code, headers = @sling.get_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service'
      )
      data.aliases.each { |aliases|
        @cert_alias_exists = true if aliases._alias.eql?('somecertchainalias')
      }
      expect(@cert_alias_exists).to eq(true)

      # download keystore
      data, status_code, headers = @sling.get_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service'
      )
      expect(status_code).to eq(200)

      # data is a temporary file created by Swagger API client
      FileUtils.cp(data.path, "#{@temp_dir}/somekeystore.pkcs12")
      expect(File.file? "#{@temp_dir}/somekeystore.pkcs12").to be(true)
      download_data = data

      # upload the downloaded keystore
      File.open("#{@temp_dir}/somekeystore.pkcs12", 'r') { |file|
        data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
          intermediate_path = '/home/users/system',
          authorizable_id = 'authentication-service',
          {
            :new_alias => 'somekeystorealias',
            :key_store => file,
            :key_store_pass => 'somekeystorepassword',
            :_alias => 'somecertchainalias',
            :key_password => 'somekeystorepassword'
          }
        )
        expect(status_code).to eq(200)
      }

      # Check if Certalias exists in keystore
      data, status_code, headers = @sling.get_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service'
      )
      data.aliases.each { |aliases|
        @cert_alias_exists = true if aliases._alias.eql?('somekeystorealias')
      }
      expect(@cert_alias_exists).to eq(true)

      download_data.delete
    end

  end

  describe 'test upload and delete certificate chain' do

    it 'should succeed' do
      # upload the cert chain in fixtures (generated from `make fixtures`)
      File.open("./test-integration/fixtures/cert_chain.crt", 'r') { |keystore_cert_chain_file|
        File.open("./test-integration/fixtures/private_key.der", 'r') { |keystore_private_key_file|
          data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
            intermediate_path = '/home/users/system',
            authorizable_id = 'authentication-service',
            {
              :_alias => 'somecertchainalias',
              :cert_chain => keystore_cert_chain_file,
              :pk => keystore_private_key_file
            }
          )
          expect(status_code).to eq(200)
        }
      }

      # Check if Certalias exists in keystore
      data, status_code, headers = @sling.get_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service'
      )
      data.aliases.each { |aliases|
        @cert_alias_exists = true if aliases._alias.eql?('somecertchainalias')
      }
      expect(@cert_alias_exists).to eq(true)

      # delete the uploaded cert chain by specifying the alias
      data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service',
        {
          :remove_alias => 'somecertchainalias'
        }
      )
      expect(status_code).to eq(200)

      # Check if Certalias don't exist in keystore
      data, status_code, headers = @sling.get_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service'
      )
      if data.aliases.size.eql?(0)
        @cert_alias_exists = false
      else
        data.aliases.each { |aliases|
          @cert_alias_exists = false unless aliases._alias.eql?('somecertchainalias')
        }
      end
      expect(@cert_alias_exists).to eq(false)
    end

  end

end
