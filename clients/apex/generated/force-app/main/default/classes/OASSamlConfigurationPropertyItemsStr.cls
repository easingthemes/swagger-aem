/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 3.2.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

/**
 * OASSamlConfigurationPropertyItemsStr
 */
public class OASSamlConfigurationPropertyItemsStr implements OAS.MappedProperties {
    /**
     * property name
     * @return name
     */
    public String name { get; set; }

    /**
     * True if optional
     * @return optional
     */
    public Boolean optional { get; set; }

    /**
     * True if property is set
     * @return isSet
     */
    public Boolean isSet { get; set; }

    /**
     * Property type, 1=String, 3=long, 11=boolean, 12=Password
     * @return r_type
     */
    public Integer r_type { get; set; }

    /**
     * Property value
     * @return value
     */
    public String value { get; set; }

    /**
     * Property description
     * @return description
     */
    public String description { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'is_set' => 'isSet',
        'type' => 'r_type'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASSamlConfigurationPropertyItemsStr getExample() {
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString = new OASSamlConfigurationPropertyItemsStr();
          samlConfigurationPropertyItemsString.name = '';
          samlConfigurationPropertyItemsString.optional = true;
          samlConfigurationPropertyItemsString.isSet = true;
          samlConfigurationPropertyItemsString.r_type = 0;
          samlConfigurationPropertyItemsString.value = '';
          samlConfigurationPropertyItemsString.description = '';
        return samlConfigurationPropertyItemsString;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASSamlConfigurationPropertyItemsStr) {           
            OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString = (OASSamlConfigurationPropertyItemsStr) obj;
            return this.name == samlConfigurationPropertyItemsString.name
                && this.optional == samlConfigurationPropertyItemsString.optional
                && this.isSet == samlConfigurationPropertyItemsString.isSet
                && this.r_type == samlConfigurationPropertyItemsString.r_type
                && this.value == samlConfigurationPropertyItemsString.value
                && this.description == samlConfigurationPropertyItemsString.description;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (optional == null ? 0 : System.hashCode(optional));
        hashCode = (17 * hashCode) + (isSet == null ? 0 : System.hashCode(isSet));
        hashCode = (17 * hashCode) + (r_type == null ? 0 : System.hashCode(r_type));
        hashCode = (17 * hashCode) + (value == null ? 0 : System.hashCode(value));
        hashCode = (17 * hashCode) + (description == null ? 0 : System.hashCode(description));
        return hashCode;
    }
}
