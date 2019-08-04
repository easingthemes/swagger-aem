/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 3.2.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraem4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraem4j.model.SamlConfigurationPropertyItemsArray;
import com.shinesolutions.swaggeraem4j.model.SamlConfigurationPropertyItemsBoolean;
import com.shinesolutions.swaggeraem4j.model.SamlConfigurationPropertyItemsLong;
import com.shinesolutions.swaggeraem4j.model.SamlConfigurationPropertyItemsString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SamlConfigurationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-04T23:41:12.174Z[GMT]")
public class SamlConfigurationProperties {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private SamlConfigurationPropertyItemsArray path = null;

  public static final String SERIALIZED_NAME_SERVICE_RANKING = "service.ranking";
  @SerializedName(SERIALIZED_NAME_SERVICE_RANKING)
  private SamlConfigurationPropertyItemsLong serviceRanking = null;

  public static final String SERIALIZED_NAME_IDP_URL = "idpUrl";
  @SerializedName(SERIALIZED_NAME_IDP_URL)
  private SamlConfigurationPropertyItemsString idpUrl = null;

  public static final String SERIALIZED_NAME_IDP_CERT_ALIAS = "idpCertAlias";
  @SerializedName(SERIALIZED_NAME_IDP_CERT_ALIAS)
  private SamlConfigurationPropertyItemsString idpCertAlias = null;

  public static final String SERIALIZED_NAME_IDP_HTTP_REDIRECT = "idpHttpRedirect";
  @SerializedName(SERIALIZED_NAME_IDP_HTTP_REDIRECT)
  private SamlConfigurationPropertyItemsBoolean idpHttpRedirect = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_ENTITY_ID = "serviceProviderEntityId";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_ENTITY_ID)
  private SamlConfigurationPropertyItemsString serviceProviderEntityId = null;

  public static final String SERIALIZED_NAME_ASSERTION_CONSUMER_SERVICE_U_R_L = "assertionConsumerServiceURL";
  @SerializedName(SERIALIZED_NAME_ASSERTION_CONSUMER_SERVICE_U_R_L)
  private SamlConfigurationPropertyItemsString assertionConsumerServiceURL = null;

  public static final String SERIALIZED_NAME_SP_PRIVATE_KEY_ALIAS = "spPrivateKeyAlias";
  @SerializedName(SERIALIZED_NAME_SP_PRIVATE_KEY_ALIAS)
  private SamlConfigurationPropertyItemsString spPrivateKeyAlias = null;

  public static final String SERIALIZED_NAME_KEY_STORE_PASSWORD = "keyStorePassword";
  @SerializedName(SERIALIZED_NAME_KEY_STORE_PASSWORD)
  private SamlConfigurationPropertyItemsString keyStorePassword = null;

  public static final String SERIALIZED_NAME_DEFAULT_REDIRECT_URL = "defaultRedirectUrl";
  @SerializedName(SERIALIZED_NAME_DEFAULT_REDIRECT_URL)
  private SamlConfigurationPropertyItemsString defaultRedirectUrl = null;

  public static final String SERIALIZED_NAME_USER_I_D_ATTRIBUTE = "userIDAttribute";
  @SerializedName(SERIALIZED_NAME_USER_I_D_ATTRIBUTE)
  private SamlConfigurationPropertyItemsString userIDAttribute = null;

  public static final String SERIALIZED_NAME_USE_ENCRYPTION = "useEncryption";
  @SerializedName(SERIALIZED_NAME_USE_ENCRYPTION)
  private SamlConfigurationPropertyItemsBoolean useEncryption = null;

  public static final String SERIALIZED_NAME_CREATE_USER = "createUser";
  @SerializedName(SERIALIZED_NAME_CREATE_USER)
  private SamlConfigurationPropertyItemsBoolean createUser = null;

  public static final String SERIALIZED_NAME_ADD_GROUP_MEMBERSHIPS = "addGroupMemberships";
  @SerializedName(SERIALIZED_NAME_ADD_GROUP_MEMBERSHIPS)
  private SamlConfigurationPropertyItemsBoolean addGroupMemberships = null;

  public static final String SERIALIZED_NAME_GROUP_MEMBERSHIP_ATTRIBUTE = "groupMembershipAttribute";
  @SerializedName(SERIALIZED_NAME_GROUP_MEMBERSHIP_ATTRIBUTE)
  private SamlConfigurationPropertyItemsString groupMembershipAttribute = null;

  public static final String SERIALIZED_NAME_DEFAULT_GROUPS = "defaultGroups";
  @SerializedName(SERIALIZED_NAME_DEFAULT_GROUPS)
  private SamlConfigurationPropertyItemsArray defaultGroups = null;

  public static final String SERIALIZED_NAME_NAME_ID_FORMAT = "nameIdFormat";
  @SerializedName(SERIALIZED_NAME_NAME_ID_FORMAT)
  private SamlConfigurationPropertyItemsString nameIdFormat = null;

  public static final String SERIALIZED_NAME_SYNCHRONIZE_ATTRIBUTES = "synchronizeAttributes";
  @SerializedName(SERIALIZED_NAME_SYNCHRONIZE_ATTRIBUTES)
  private SamlConfigurationPropertyItemsArray synchronizeAttributes = null;

  public static final String SERIALIZED_NAME_HANDLE_LOGOUT = "handleLogout";
  @SerializedName(SERIALIZED_NAME_HANDLE_LOGOUT)
  private SamlConfigurationPropertyItemsBoolean handleLogout = null;

  public static final String SERIALIZED_NAME_LOGOUT_URL = "logoutUrl";
  @SerializedName(SERIALIZED_NAME_LOGOUT_URL)
  private SamlConfigurationPropertyItemsString logoutUrl = null;

  public static final String SERIALIZED_NAME_CLOCK_TOLERANCE = "clockTolerance";
  @SerializedName(SERIALIZED_NAME_CLOCK_TOLERANCE)
  private SamlConfigurationPropertyItemsLong clockTolerance = null;

  public static final String SERIALIZED_NAME_DIGEST_METHOD = "digestMethod";
  @SerializedName(SERIALIZED_NAME_DIGEST_METHOD)
  private SamlConfigurationPropertyItemsString digestMethod = null;

  public static final String SERIALIZED_NAME_SIGNATURE_METHOD = "signatureMethod";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_METHOD)
  private SamlConfigurationPropertyItemsString signatureMethod = null;

  public static final String SERIALIZED_NAME_USER_INTERMEDIATE_PATH = "userIntermediatePath";
  @SerializedName(SERIALIZED_NAME_USER_INTERMEDIATE_PATH)
  private SamlConfigurationPropertyItemsString userIntermediatePath = null;

  public SamlConfigurationProperties path(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsArray getPath() {
    return path;
  }

  public void setPath(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
  }

  public SamlConfigurationProperties serviceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsLong getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public SamlConfigurationProperties idpUrl(SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

   /**
   * Get idpUrl
   * @return idpUrl
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getIdpUrl() {
    return idpUrl;
  }

  public void setIdpUrl(SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
  }

  public SamlConfigurationProperties idpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
    return this;
  }

   /**
   * Get idpCertAlias
   * @return idpCertAlias
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getIdpCertAlias() {
    return idpCertAlias;
  }

  public void setIdpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  public SamlConfigurationProperties idpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
    return this;
  }

   /**
   * Get idpHttpRedirect
   * @return idpHttpRedirect
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  public void setIdpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  public SamlConfigurationProperties serviceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

   /**
   * Get serviceProviderEntityId
   * @return serviceProviderEntityId
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  public void setServiceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  public SamlConfigurationProperties assertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

   /**
   * Get assertionConsumerServiceURL
   * @return assertionConsumerServiceURL
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  public void setAssertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  public SamlConfigurationProperties spPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    return this;
  }

   /**
   * Get spPrivateKeyAlias
   * @return spPrivateKeyAlias
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  public void setSpPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  public SamlConfigurationProperties keyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }

   /**
   * Get keyStorePassword
   * @return keyStorePassword
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getKeyStorePassword() {
    return keyStorePassword;
  }

  public void setKeyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  public SamlConfigurationProperties defaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

   /**
   * Get defaultRedirectUrl
   * @return defaultRedirectUrl
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  public void setDefaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  public SamlConfigurationProperties userIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
    return this;
  }

   /**
   * Get userIDAttribute
   * @return userIDAttribute
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getUserIDAttribute() {
    return userIDAttribute;
  }

  public void setUserIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  public SamlConfigurationProperties useEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
    return this;
  }

   /**
   * Get useEncryption
   * @return useEncryption
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsBoolean getUseEncryption() {
    return useEncryption;
  }

  public void setUseEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  public SamlConfigurationProperties createUser(SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
    return this;
  }

   /**
   * Get createUser
   * @return createUser
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsBoolean getCreateUser() {
    return createUser;
  }

  public void setCreateUser(SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
  }

  public SamlConfigurationProperties addGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
    return this;
  }

   /**
   * Get addGroupMemberships
   * @return addGroupMemberships
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  public void setAddGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  public SamlConfigurationProperties groupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
    return this;
  }

   /**
   * Get groupMembershipAttribute
   * @return groupMembershipAttribute
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  public void setGroupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  public SamlConfigurationProperties defaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

   /**
   * Get defaultGroups
   * @return defaultGroups
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsArray getDefaultGroups() {
    return defaultGroups;
  }

  public void setDefaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  public SamlConfigurationProperties nameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

   /**
   * Get nameIdFormat
   * @return nameIdFormat
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getNameIdFormat() {
    return nameIdFormat;
  }

  public void setNameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  public SamlConfigurationProperties synchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
    return this;
  }

   /**
   * Get synchronizeAttributes
   * @return synchronizeAttributes
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  public void setSynchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  public SamlConfigurationProperties handleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
    return this;
  }

   /**
   * Get handleLogout
   * @return handleLogout
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsBoolean getHandleLogout() {
    return handleLogout;
  }

  public void setHandleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  public SamlConfigurationProperties logoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

   /**
   * Get logoutUrl
   * @return logoutUrl
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public SamlConfigurationProperties clockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
    return this;
  }

   /**
   * Get clockTolerance
   * @return clockTolerance
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsLong getClockTolerance() {
    return clockTolerance;
  }

  public void setClockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  public SamlConfigurationProperties digestMethod(SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
    return this;
  }

   /**
   * Get digestMethod
   * @return digestMethod
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getDigestMethod() {
    return digestMethod;
  }

  public void setDigestMethod(SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
  }

  public SamlConfigurationProperties signatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
    return this;
  }

   /**
   * Get signatureMethod
   * @return signatureMethod
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getSignatureMethod() {
    return signatureMethod;
  }

  public void setSignatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  public SamlConfigurationProperties userIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
    return this;
  }

   /**
   * Get userIntermediatePath
   * @return userIntermediatePath
  **/
  @ApiModelProperty(value = "")
  public SamlConfigurationPropertyItemsString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  public void setUserIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfigurationProperties samlConfigurationProperties = (SamlConfigurationProperties) o;
    return Objects.equals(this.path, samlConfigurationProperties.path) &&
        Objects.equals(this.serviceRanking, samlConfigurationProperties.serviceRanking) &&
        Objects.equals(this.idpUrl, samlConfigurationProperties.idpUrl) &&
        Objects.equals(this.idpCertAlias, samlConfigurationProperties.idpCertAlias) &&
        Objects.equals(this.idpHttpRedirect, samlConfigurationProperties.idpHttpRedirect) &&
        Objects.equals(this.serviceProviderEntityId, samlConfigurationProperties.serviceProviderEntityId) &&
        Objects.equals(this.assertionConsumerServiceURL, samlConfigurationProperties.assertionConsumerServiceURL) &&
        Objects.equals(this.spPrivateKeyAlias, samlConfigurationProperties.spPrivateKeyAlias) &&
        Objects.equals(this.keyStorePassword, samlConfigurationProperties.keyStorePassword) &&
        Objects.equals(this.defaultRedirectUrl, samlConfigurationProperties.defaultRedirectUrl) &&
        Objects.equals(this.userIDAttribute, samlConfigurationProperties.userIDAttribute) &&
        Objects.equals(this.useEncryption, samlConfigurationProperties.useEncryption) &&
        Objects.equals(this.createUser, samlConfigurationProperties.createUser) &&
        Objects.equals(this.addGroupMemberships, samlConfigurationProperties.addGroupMemberships) &&
        Objects.equals(this.groupMembershipAttribute, samlConfigurationProperties.groupMembershipAttribute) &&
        Objects.equals(this.defaultGroups, samlConfigurationProperties.defaultGroups) &&
        Objects.equals(this.nameIdFormat, samlConfigurationProperties.nameIdFormat) &&
        Objects.equals(this.synchronizeAttributes, samlConfigurationProperties.synchronizeAttributes) &&
        Objects.equals(this.handleLogout, samlConfigurationProperties.handleLogout) &&
        Objects.equals(this.logoutUrl, samlConfigurationProperties.logoutUrl) &&
        Objects.equals(this.clockTolerance, samlConfigurationProperties.clockTolerance) &&
        Objects.equals(this.digestMethod, samlConfigurationProperties.digestMethod) &&
        Objects.equals(this.signatureMethod, samlConfigurationProperties.signatureMethod) &&
        Objects.equals(this.userIntermediatePath, samlConfigurationProperties.userIntermediatePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    idpUrl: ").append(toIndentedString(idpUrl)).append("\n");
    sb.append("    idpCertAlias: ").append(toIndentedString(idpCertAlias)).append("\n");
    sb.append("    idpHttpRedirect: ").append(toIndentedString(idpHttpRedirect)).append("\n");
    sb.append("    serviceProviderEntityId: ").append(toIndentedString(serviceProviderEntityId)).append("\n");
    sb.append("    assertionConsumerServiceURL: ").append(toIndentedString(assertionConsumerServiceURL)).append("\n");
    sb.append("    spPrivateKeyAlias: ").append(toIndentedString(spPrivateKeyAlias)).append("\n");
    sb.append("    keyStorePassword: ").append(toIndentedString(keyStorePassword)).append("\n");
    sb.append("    defaultRedirectUrl: ").append(toIndentedString(defaultRedirectUrl)).append("\n");
    sb.append("    userIDAttribute: ").append(toIndentedString(userIDAttribute)).append("\n");
    sb.append("    useEncryption: ").append(toIndentedString(useEncryption)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    addGroupMemberships: ").append(toIndentedString(addGroupMemberships)).append("\n");
    sb.append("    groupMembershipAttribute: ").append(toIndentedString(groupMembershipAttribute)).append("\n");
    sb.append("    defaultGroups: ").append(toIndentedString(defaultGroups)).append("\n");
    sb.append("    nameIdFormat: ").append(toIndentedString(nameIdFormat)).append("\n");
    sb.append("    synchronizeAttributes: ").append(toIndentedString(synchronizeAttributes)).append("\n");
    sb.append("    handleLogout: ").append(toIndentedString(handleLogout)).append("\n");
    sb.append("    logoutUrl: ").append(toIndentedString(logoutUrl)).append("\n");
    sb.append("    clockTolerance: ").append(toIndentedString(clockTolerance)).append("\n");
    sb.append("    digestMethod: ").append(toIndentedString(digestMethod)).append("\n");
    sb.append("    signatureMethod: ").append(toIndentedString(signatureMethod)).append("\n");
    sb.append("    userIntermediatePath: ").append(toIndentedString(userIntermediatePath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
