=begin
#Adobe Experience Manager (AEM) API

#Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

OpenAPI spec version: 3.1.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.2.1-SNAPSHOT

=end

# Common files
require 'swagger_aem/api_client'
require 'swagger_aem/api_error'
require 'swagger_aem/version'
require 'swagger_aem/configuration'

# Models
require 'swagger_aem/models/install_status'
require 'swagger_aem/models/install_status_status'
require 'swagger_aem/models/keystore_chain_items'
require 'swagger_aem/models/keystore_info'
require 'swagger_aem/models/keystore_items'
require 'swagger_aem/models/saml_configuration_info'
require 'swagger_aem/models/saml_configuration_properties'
require 'swagger_aem/models/saml_configuration_property_items_array'
require 'swagger_aem/models/saml_configuration_property_items_boolean'
require 'swagger_aem/models/saml_configuration_property_items_long'
require 'swagger_aem/models/saml_configuration_property_items_string'
require 'swagger_aem/models/truststore_info'
require 'swagger_aem/models/truststore_items'

# APIs
require 'swagger_aem/api/console_api'
require 'swagger_aem/api/cq_api'
require 'swagger_aem/api/crx_api'
require 'swagger_aem/api/custom_api'
require 'swagger_aem/api/sling_api'

module SwaggerAemClient
  class << self
    # Customize default settings for the SDK using block.
    #   SwaggerAemClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
