/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 2.2.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraem4j.api;

import com.shinesolutions.swaggeraem4j.ApiException;
import java.math.BigDecimal;
import java.io.File;
import com.shinesolutions.swaggeraem4j.model.KeystoreInformations;
import com.shinesolutions.swaggeraem4j.model.TruststoreInformations;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SlingApi
 */
@Ignore
public class SlingApiTest {

    private final SlingApi api = new SlingApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAgentTest() throws ApiException {
        String runmode = null;
        String name = null;
        api.deleteAgent(runmode, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNodeTest() throws ApiException {
        String path = null;
        String name = null;
        api.deleteNode(path, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgentTest() throws ApiException {
        String runmode = null;
        String name = null;
        api.getAgent(runmode, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgentsTest() throws ApiException {
        String runmode = null;
        String response = api.getAgents(runmode);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthorizableKeystoreTest() throws ApiException {
        String intermediatePath = null;
        String authorizableId = null;
        KeystoreInformations response = api.getAuthorizableKeystore(intermediatePath, authorizableId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKeystoreTest() throws ApiException {
        String intermediatePath = null;
        String authorizableId = null;
        File response = api.getKeystore(intermediatePath, authorizableId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNodeTest() throws ApiException {
        String path = null;
        String name = null;
        api.getNode(path, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackageTest() throws ApiException {
        String group = null;
        String name = null;
        String version = null;
        File response = api.getPackage(group, name, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackageFilterTest() throws ApiException {
        String group = null;
        String name = null;
        String version = null;
        String response = api.getPackageFilter(group, name, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQueryTest() throws ApiException {
        String path = null;
        BigDecimal pLimit = null;
        String _1Property = null;
        String _1PropertyValue = null;
        String response = api.getQuery(path, pLimit, _1Property, _1PropertyValue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTruststoreTest() throws ApiException {
        File response = api.getTruststore();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTruststoreInformationsTest() throws ApiException {
        TruststoreInformations response = api.getTruststoreInformations();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAgentTest() throws ApiException {
        String runmode = null;
        String name = null;
        Boolean jcrcontentcqdistribute = null;
        String jcrcontentcqdistributeTypeHint = null;
        String jcrcontentcqname = null;
        String jcrcontentcqtemplate = null;
        Boolean jcrcontentenabled = null;
        String jcrcontentjcrdescription = null;
        String jcrcontentjcrlastModified = null;
        String jcrcontentjcrlastModifiedBy = null;
        String jcrcontentjcrmixinTypes = null;
        String jcrcontentjcrtitle = null;
        String jcrcontentlogLevel = null;
        Boolean jcrcontentnoStatusUpdate = null;
        Boolean jcrcontentnoVersioning = null;
        BigDecimal jcrcontentprotocolConnectTimeout = null;
        Boolean jcrcontentprotocolHTTPConnectionClosed = null;
        String jcrcontentprotocolHTTPExpired = null;
        List<String> jcrcontentprotocolHTTPHeaders = null;
        String jcrcontentprotocolHTTPHeadersTypeHint = null;
        String jcrcontentprotocolHTTPMethod = null;
        Boolean jcrcontentprotocolHTTPSRelaxed = null;
        String jcrcontentprotocolInterface = null;
        BigDecimal jcrcontentprotocolSocketTimeout = null;
        String jcrcontentprotocolVersion = null;
        String jcrcontentproxyNTLMDomain = null;
        String jcrcontentproxyNTLMHost = null;
        String jcrcontentproxyHost = null;
        String jcrcontentproxyPassword = null;
        BigDecimal jcrcontentproxyPort = null;
        String jcrcontentproxyUser = null;
        BigDecimal jcrcontentqueueBatchMaxSize = null;
        String jcrcontentqueueBatchMode = null;
        BigDecimal jcrcontentqueueBatchWaitTime = null;
        String jcrcontentretryDelay = null;
        Boolean jcrcontentreverseReplication = null;
        String jcrcontentserializationType = null;
        String jcrcontentslingresourceType = null;
        String jcrcontentssl = null;
        String jcrcontenttransportNTLMDomain = null;
        String jcrcontenttransportNTLMHost = null;
        String jcrcontenttransportPassword = null;
        String jcrcontenttransportUri = null;
        String jcrcontenttransportUser = null;
        Boolean jcrcontenttriggerDistribute = null;
        Boolean jcrcontenttriggerModified = null;
        Boolean jcrcontenttriggerOnOffTime = null;
        Boolean jcrcontenttriggerReceive = null;
        Boolean jcrcontenttriggerSpecific = null;
        String jcrcontentuserId = null;
        String jcrprimaryType = null;
        String operation = null;
        api.postAgent(runmode, name, jcrcontentcqdistribute, jcrcontentcqdistributeTypeHint, jcrcontentcqname, jcrcontentcqtemplate, jcrcontentenabled, jcrcontentjcrdescription, jcrcontentjcrlastModified, jcrcontentjcrlastModifiedBy, jcrcontentjcrmixinTypes, jcrcontentjcrtitle, jcrcontentlogLevel, jcrcontentnoStatusUpdate, jcrcontentnoVersioning, jcrcontentprotocolConnectTimeout, jcrcontentprotocolHTTPConnectionClosed, jcrcontentprotocolHTTPExpired, jcrcontentprotocolHTTPHeaders, jcrcontentprotocolHTTPHeadersTypeHint, jcrcontentprotocolHTTPMethod, jcrcontentprotocolHTTPSRelaxed, jcrcontentprotocolInterface, jcrcontentprotocolSocketTimeout, jcrcontentprotocolVersion, jcrcontentproxyNTLMDomain, jcrcontentproxyNTLMHost, jcrcontentproxyHost, jcrcontentproxyPassword, jcrcontentproxyPort, jcrcontentproxyUser, jcrcontentqueueBatchMaxSize, jcrcontentqueueBatchMode, jcrcontentqueueBatchWaitTime, jcrcontentretryDelay, jcrcontentreverseReplication, jcrcontentserializationType, jcrcontentslingresourceType, jcrcontentssl, jcrcontenttransportNTLMDomain, jcrcontenttransportNTLMHost, jcrcontenttransportPassword, jcrcontenttransportUri, jcrcontenttransportUser, jcrcontenttriggerDistribute, jcrcontenttriggerModified, jcrcontenttriggerOnOffTime, jcrcontenttriggerReceive, jcrcontenttriggerSpecific, jcrcontentuserId, jcrprimaryType, operation);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAuthorizableKeystoreTest() throws ApiException {
        String intermediatePath = null;
        String authorizableId = null;
        String operation = null;
        String currentPassword = null;
        String newPassword = null;
        String rePassword = null;
        String keyPassword = null;
        String keyStorePass = null;
        String operation2 = null;
        String alias = null;
        String newAlias = null;
        String removeAlias = null;
        File certChain = null;
        File pk = null;
        File keyStore = null;
        KeystoreInformations response = api.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, operation2, alias, newAlias, removeAlias, certChain, pk, keyStore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAuthorizablesTest() throws ApiException {
        String authorizableId = null;
        String intermediatePath = null;
        String createUser = null;
        String createGroup = null;
        String reppassword = null;
        String profilegivenName = null;
        String response = api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profilegivenName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postConfigAdobeGraniteSamlAuthenticationHandlerTest() throws ApiException {
        String keyStorePassword = null;
        String keyStorePasswordTypeHint = null;
        Integer serviceRanking = null;
        String serviceRankingTypeHint = null;
        Boolean idpHttpRedirect = null;
        String idpHttpRedirectTypeHint = null;
        Boolean createUser = null;
        String createUserTypeHint = null;
        String defaultRedirectUrl = null;
        String defaultRedirectUrlTypeHint = null;
        String userIDAttribute = null;
        String userIDAttributeTypeHint = null;
        List<String> defaultGroups = null;
        String defaultGroupsTypeHint = null;
        String idpCertAlias = null;
        String idpCertAliasTypeHint = null;
        Boolean addGroupMemberships = null;
        String addGroupMembershipsTypeHint = null;
        List<String> path = null;
        String pathTypeHint = null;
        List<String> synchronizeAttributes = null;
        String synchronizeAttributesTypeHint = null;
        Integer clockTolerance = null;
        String clockToleranceTypeHint = null;
        String groupMembershipAttribute = null;
        String groupMembershipAttributeTypeHint = null;
        String idpUrl = null;
        String idpUrlTypeHint = null;
        String logoutUrl = null;
        String logoutUrlTypeHint = null;
        String serviceProviderEntityId = null;
        String serviceProviderEntityIdTypeHint = null;
        String assertionConsumerServiceURL = null;
        String assertionConsumerServiceURLTypeHint = null;
        Boolean handleLogout = null;
        String handleLogoutTypeHint = null;
        String spPrivateKeyAlias = null;
        String spPrivateKeyAliasTypeHint = null;
        Boolean useEncryption = null;
        String useEncryptionTypeHint = null;
        String nameIdFormat = null;
        String nameIdFormatTypeHint = null;
        String digestMethod = null;
        String digestMethodTypeHint = null;
        String signatureMethod = null;
        String signatureMethodTypeHint = null;
        String userIntermediatePath = null;
        String userIntermediatePathTypeHint = null;
        api.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postConfigApacheFelixJettyBasedHttpServiceTest() throws ApiException {
        String runmode = null;
        Boolean orgApacheFelixHttpsNio = null;
        String orgApacheFelixHttpsNioTypeHint = null;
        String orgApacheFelixHttpsKeystore = null;
        String orgApacheFelixHttpsKeystoreTypeHint = null;
        String orgApacheFelixHttpsKeystorePassword = null;
        String orgApacheFelixHttpsKeystorePasswordTypeHint = null;
        String orgApacheFelixHttpsKeystoreKey = null;
        String orgApacheFelixHttpsKeystoreKeyTypeHint = null;
        String orgApacheFelixHttpsKeystoreKeyPassword = null;
        String orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = null;
        String orgApacheFelixHttpsTruststore = null;
        String orgApacheFelixHttpsTruststoreTypeHint = null;
        String orgApacheFelixHttpsTruststorePassword = null;
        String orgApacheFelixHttpsTruststorePasswordTypeHint = null;
        String orgApacheFelixHttpsClientcertificate = null;
        String orgApacheFelixHttpsClientcertificateTypeHint = null;
        Boolean orgApacheFelixHttpsEnable = null;
        String orgApacheFelixHttpsEnableTypeHint = null;
        String orgOsgiServiceHttpPortSecure = null;
        String orgOsgiServiceHttpPortSecureTypeHint = null;
        api.postConfigApacheFelixJettyBasedHttpService(runmode, orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postConfigApacheSlingDavExServletTest() throws ApiException {
        String runmode = null;
        String alias = null;
        String aliasTypeHint = null;
        Boolean davCreateAbsoluteUri = null;
        String davCreateAbsoluteUriTypeHint = null;
        api.postConfigApacheSlingDavExServlet(runmode, alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postConfigApacheSlingGetServletTest() throws ApiException {
        String runmode = null;
        String jsonMaximumresults = null;
        String jsonMaximumresultsTypeHint = null;
        Boolean enableHtml = null;
        String enableHtmlTypeHint = null;
        Boolean enableTxt = null;
        String enableTxtTypeHint = null;
        Boolean enableXml = null;
        String enableXmlTypeHint = null;
        api.postConfigApacheSlingGetServlet(runmode, jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postConfigApacheSlingReferrerFilterTest() throws ApiException {
        String runmode = null;
        Boolean allowEmpty = null;
        String allowEmptyTypeHint = null;
        String allowHosts = null;
        String allowHostsTypeHint = null;
        String allowHostsRegexp = null;
        String allowHostsRegexpTypeHint = null;
        String filterMethods = null;
        String filterMethodsTypeHint = null;
        api.postConfigApacheSlingReferrerFilter(runmode, allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNodeTest() throws ApiException {
        String path = null;
        String name = null;
        String operation = null;
        String deleteAuthorizable = null;
        File file = null;
        api.postNode(path, name, operation, deleteAuthorizable, file);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNodeRwTest() throws ApiException {
        String path = null;
        String name = null;
        String addMembers = null;
        api.postNodeRw(path, name, addMembers);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPathTest() throws ApiException {
        String path = null;
        String jcrprimaryType = null;
        String name = null;
        api.postPath(path, jcrprimaryType, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postQueryTest() throws ApiException {
        String path = null;
        BigDecimal pLimit = null;
        String _1Property = null;
        String _1PropertyValue = null;
        String response = api.postQuery(path, pLimit, _1Property, _1PropertyValue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTreeActivationTest() throws ApiException {
        Boolean ignoredeactivated = null;
        Boolean onlymodified = null;
        String path = null;
        api.postTreeActivation(ignoredeactivated, onlymodified, path);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTruststoreTest() throws ApiException {
        String operation = null;
        String newPassword = null;
        String rePassword = null;
        String keyStoreType = null;
        String removeAlias = null;
        File certificate = null;
        String response = api.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTruststorePKCS12Test() throws ApiException {
        File truststoreP12 = null;
        String response = api.postTruststorePKCS12(truststoreP12);

        // TODO: test validations
    }
    
}