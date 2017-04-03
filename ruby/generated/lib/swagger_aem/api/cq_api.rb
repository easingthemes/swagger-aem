=begin
#Adobe Experience Manager (AEM) API

#Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

OpenAPI spec version: 1.1.10
Contact: opensource@shinesolutions.com
Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerAemClient
  class CqApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # 
    # 
    # @param [Hash] opts the optional parameters
    # @return [String]
    def get_login_page(opts = {})
      data, _status_code, _headers = get_login_page_with_http_info(opts)
      return data
    end

    # 
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def get_login_page_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: CqApi.get_login_page ..."
      end
      # resource path
      local_var_path = "/libs/granite/core/content/login.html".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/html'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CqApi#get_login_page\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # 
    # 
    # @param authorizable_id 
    # @param changelog 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def post_cq_actions(authorizable_id, changelog, opts = {})
      post_cq_actions_with_http_info(authorizable_id, changelog, opts)
      return nil
    end

    # 
    # 
    # @param authorizable_id 
    # @param changelog 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def post_cq_actions_with_http_info(authorizable_id, changelog, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: CqApi.post_cq_actions ..."
      end
      # verify the required parameter 'authorizable_id' is set
      fail ArgumentError, "Missing the required parameter 'authorizable_id' when calling CqApi.post_cq_actions" if authorizable_id.nil?
      # verify the required parameter 'changelog' is set
      fail ArgumentError, "Missing the required parameter 'changelog' when calling CqApi.post_cq_actions" if changelog.nil?
      # resource path
      local_var_path = "/.cqactions.html".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'authorizableId'] = authorizable_id
      query_params[:'changelog'] = changelog

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/plain'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['aemAuth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CqApi#post_cq_actions\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
