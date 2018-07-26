=begin
#Adobe Experience Manager (AEM) API

#Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

OpenAPI spec version: 2.0.0
Contact: opensource@shinesolutions.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.3.1

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerAemClient::CqApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CqApi' do
  before do
    # run before each test
    @instance = SwaggerAemClient::CqApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CqApi' do
    it 'should create an instance of CqApi' do
      expect(@instance).to be_instance_of(SwaggerAemClient::CqApi)
    end
  end

  # unit tests for get_login_page
  # 
  # 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'get_login_page test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_cq_actions
  # 
  # 
  # @param authorizable_id 
  # @param changelog 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'post_cq_actions test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
