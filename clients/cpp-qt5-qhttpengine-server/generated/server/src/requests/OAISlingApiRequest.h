/**
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

#ifndef OAI_OAISlingApiRequest_H
#define OAI_OAISlingApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAIKeystoreInfo.h"
#include "OAINumber.h"
#include "OAITruststoreInfo.h"
#include <QIODevice>
#include <QString>
#include "OAISlingApiHandler.h"

namespace OpenAPI {

class OAISlingApiRequest : public QObject
{
    Q_OBJECT
    
public:
    OAISlingApiRequest(QHttpEngine::Socket *s, OAISlingApiHandler* handler);
    virtual ~OAISlingApiRequest();

    void deleteAgentRequest(const QString& runmode, const QString& name);
    void deleteNodeRequest(const QString& path, const QString& name);
    void getAgentRequest(const QString& runmode, const QString& name);
    void getAgentsRequest(const QString& runmode);
    void getAuthorizableKeystoreRequest(const QString& intermediate_path, const QString& authorizable_id);
    void getKeystoreRequest(const QString& intermediate_path, const QString& authorizable_id);
    void getNodeRequest(const QString& path, const QString& name);
    void getPackageRequest(const QString& group, const QString& name, const QString& version);
    void getPackageFilterRequest(const QString& group, const QString& name, const QString& version);
    void getQueryRequest();
    void getTruststoreRequest();
    void getTruststoreInfoRequest();
    void postAgentRequest(const QString& runmode, const QString& name);
    void postAuthorizableKeystoreRequest(const QString& intermediate_path, const QString& authorizable_id);
    void postAuthorizablesRequest();
    void postConfigAdobeGraniteSamlAuthenticationHandlerRequest();
    void postConfigApacheFelixJettyBasedHttpServiceRequest();
    void postConfigApacheHttpComponentsProxyConfigurationRequest();
    void postConfigApacheSlingDavExServletRequest();
    void postConfigApacheSlingGetServletRequest();
    void postConfigApacheSlingReferrerFilterRequest();
    void postNodeRequest(const QString& path, const QString& name);
    void postNodeRwRequest(const QString& path, const QString& name);
    void postPathRequest(const QString& path);
    void postQueryRequest();
    void postTreeActivationRequest();
    void postTruststoreRequest();
    void postTruststorePKCS12Request();
    

    void deleteAgentResponse();
    void deleteNodeResponse();
    void getAgentResponse();
    void getAgentsResponse(const QString& res);
    void getAuthorizableKeystoreResponse(const OAIKeystoreInfo& res);
    void getKeystoreResponse(const QIODevice*& res);
    void getNodeResponse();
    void getPackageResponse(const QIODevice*& res);
    void getPackageFilterResponse(const QString& res);
    void getQueryResponse(const QString& res);
    void getTruststoreResponse(const QIODevice*& res);
    void getTruststoreInfoResponse(const OAITruststoreInfo& res);
    void postAgentResponse();
    void postAuthorizableKeystoreResponse(const OAIKeystoreInfo& res);
    void postAuthorizablesResponse(const QString& res);
    void postConfigAdobeGraniteSamlAuthenticationHandlerResponse();
    void postConfigApacheFelixJettyBasedHttpServiceResponse();
    void postConfigApacheHttpComponentsProxyConfigurationResponse();
    void postConfigApacheSlingDavExServletResponse();
    void postConfigApacheSlingGetServletResponse();
    void postConfigApacheSlingReferrerFilterResponse();
    void postNodeResponse();
    void postNodeRwResponse();
    void postPathResponse();
    void postQueryResponse(const QString& res);
    void postTreeActivationResponse();
    void postTruststoreResponse(const QString& res);
    void postTruststorePKCS12Response(const QString& res);
    

    void deleteAgentError(QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteNodeError(QNetworkReply::NetworkError error_type, QString& error_str);
    void getAgentError(QNetworkReply::NetworkError error_type, QString& error_str);
    void getAgentsError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAuthorizableKeystoreError(const OAIKeystoreInfo& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getKeystoreError(const QIODevice*& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getNodeError(QNetworkReply::NetworkError error_type, QString& error_str);
    void getPackageError(const QIODevice*& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getPackageFilterError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getQueryError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getTruststoreError(const QIODevice*& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getTruststoreInfoError(const OAITruststoreInfo& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void postAgentError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postAuthorizableKeystoreError(const OAIKeystoreInfo& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void postAuthorizablesError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void postConfigAdobeGraniteSamlAuthenticationHandlerError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postConfigApacheFelixJettyBasedHttpServiceError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postConfigApacheHttpComponentsProxyConfigurationError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postConfigApacheSlingDavExServletError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postConfigApacheSlingGetServletError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postConfigApacheSlingReferrerFilterError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postNodeError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postNodeRwError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postPathError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postQueryError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void postTreeActivationError(QNetworkReply::NetworkError error_type, QString& error_str);
    void postTruststoreError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void postTruststorePKCS12Error(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void deleteAgent(QString runmode, QString name);
    void deleteNode(QString path, QString name);
    void getAgent(QString runmode, QString name);
    void getAgents(QString runmode);
    void getAuthorizableKeystore(QString intermediate_path, QString authorizable_id);
    void getKeystore(QString intermediate_path, QString authorizable_id);
    void getNode(QString path, QString name);
    void getPackage(QString group, QString name, QString version);
    void getPackageFilter(QString group, QString name, QString version);
    void getQuery(QString path, OAINumber p_limit, QString _1_property, QString _1_property_value);
    void getTruststore();
    void getTruststoreInfo();
    void postAgent(QString runmode, QString name, bool jcrcontentcqdistribute, QString jcrcontentcqdistribute_type_hint, QString jcrcontentcqname, QString jcrcontentcqtemplate, bool jcrcontentenabled, QString jcrcontentjcrdescription, QString jcrcontentjcrlast_modified, QString jcrcontentjcrlast_modified_by, QString jcrcontentjcrmixin_types, QString jcrcontentjcrtitle, QString jcrcontentlog_level, bool jcrcontentno_status_update, bool jcrcontentno_versioning, OAINumber jcrcontentprotocol_connect_timeout, bool jcrcontentprotocol_http_connection_closed, QString jcrcontentprotocol_http_expired, QList<QString> jcrcontentprotocol_http_headers, QString jcrcontentprotocol_http_headers_type_hint, QString jcrcontentprotocol_http_method, bool jcrcontentprotocol_https_relaxed, QString jcrcontentprotocol_interface, OAINumber jcrcontentprotocol_socket_timeout, QString jcrcontentprotocol_version, QString jcrcontentproxy_ntlm_domain, QString jcrcontentproxy_ntlm_host, QString jcrcontentproxy_host, QString jcrcontentproxy_password, OAINumber jcrcontentproxy_port, QString jcrcontentproxy_user, OAINumber jcrcontentqueue_batch_max_size, QString jcrcontentqueue_batch_mode, OAINumber jcrcontentqueue_batch_wait_time, QString jcrcontentretry_delay, bool jcrcontentreverse_replication, QString jcrcontentserialization_type, QString jcrcontentslingresource_type, QString jcrcontentssl, QString jcrcontenttransport_ntlm_domain, QString jcrcontenttransport_ntlm_host, QString jcrcontenttransport_password, QString jcrcontenttransport_uri, QString jcrcontenttransport_user, bool jcrcontenttrigger_distribute, bool jcrcontenttrigger_modified, bool jcrcontenttrigger_on_off_time, bool jcrcontenttrigger_receive, bool jcrcontenttrigger_specific, QString jcrcontentuser_id, QString jcrprimary_type, QString operation);
    void postAuthorizableKeystore(QString intermediate_path, QString authorizable_id, QString operation, QString current_password, QString new_password, QString re_password, QString key_password, QString key_store_pass, QString alias, QString new_alias, QString remove_alias, QIODevice* cert_chain, QIODevice* pk, QIODevice* key_store);
    void postAuthorizables(QString authorizable_id, QString intermediate_path, QString create_user, QString create_group, QString reppassword, QString profilegiven_name);
    void postConfigAdobeGraniteSamlAuthenticationHandler(QString key_store_password, QString key_store_password_type_hint, qint32 service_ranking, QString service_ranking_type_hint, bool idp_http_redirect, QString idp_http_redirect_type_hint, bool create_user, QString create_user_type_hint, QString default_redirect_url, QString default_redirect_url_type_hint, QString user_id_attribute, QString user_id_attribute_type_hint, QList<QString> default_groups, QString default_groups_type_hint, QString idp_cert_alias, QString idp_cert_alias_type_hint, bool add_group_memberships, QString add_group_memberships_type_hint, QList<QString> path, QString path_type_hint, QList<QString> synchronize_attributes, QString synchronize_attributes_type_hint, qint32 clock_tolerance, QString clock_tolerance_type_hint, QString group_membership_attribute, QString group_membership_attribute_type_hint, QString idp_url, QString idp_url_type_hint, QString logout_url, QString logout_url_type_hint, QString service_provider_entity_id, QString service_provider_entity_id_type_hint, QString assertion_consumer_service_url, QString assertion_consumer_service_url_type_hint, bool handle_logout, QString handle_logout_type_hint, QString sp_private_key_alias, QString sp_private_key_alias_type_hint, bool use_encryption, QString use_encryption_type_hint, QString name_id_format, QString name_id_format_type_hint, QString digest_method, QString digest_method_type_hint, QString signature_method, QString signature_method_type_hint, QString user_intermediate_path, QString user_intermediate_path_type_hint);
    void postConfigApacheFelixJettyBasedHttpService(bool org_apache_felix_https_nio, QString org_apache_felix_https_nio_type_hint, QString org_apache_felix_https_keystore, QString org_apache_felix_https_keystore_type_hint, QString org_apache_felix_https_keystore_password, QString org_apache_felix_https_keystore_password_type_hint, QString org_apache_felix_https_keystore_key, QString org_apache_felix_https_keystore_key_type_hint, QString org_apache_felix_https_keystore_key_password, QString org_apache_felix_https_keystore_key_password_type_hint, QString org_apache_felix_https_truststore, QString org_apache_felix_https_truststore_type_hint, QString org_apache_felix_https_truststore_password, QString org_apache_felix_https_truststore_password_type_hint, QString org_apache_felix_https_clientcertificate, QString org_apache_felix_https_clientcertificate_type_hint, bool org_apache_felix_https_enable, QString org_apache_felix_https_enable_type_hint, QString org_osgi_service_http_port_secure, QString org_osgi_service_http_port_secure_type_hint);
    void postConfigApacheHttpComponentsProxyConfiguration(QString proxy_host, QString proxy_host_type_hint, qint32 proxy_port, QString proxy_port_type_hint, QList<QString> proxy_exceptions, QString proxy_exceptions_type_hint, bool proxy_enabled, QString proxy_enabled_type_hint, QString proxy_user, QString proxy_user_type_hint, QString proxy_password, QString proxy_password_type_hint);
    void postConfigApacheSlingDavExServlet(QString alias, QString alias_type_hint, bool dav_create_absolute_uri, QString dav_create_absolute_uri_type_hint);
    void postConfigApacheSlingGetServlet(QString json_maximumresults, QString json_maximumresults_type_hint, bool enable_html, QString enable_html_type_hint, bool enable_txt, QString enable_txt_type_hint, bool enable_xml, QString enable_xml_type_hint);
    void postConfigApacheSlingReferrerFilter(bool allow_empty, QString allow_empty_type_hint, QString allow_hosts, QString allow_hosts_type_hint, QString allow_hosts_regexp, QString allow_hosts_regexp_type_hint, QString filter_methods, QString filter_methods_type_hint);
    void postNode(QString path, QString name, QString operation, QString delete_authorizable, QIODevice* file);
    void postNodeRw(QString path, QString name, QString add_members);
    void postPath(QString path, QString jcrprimary_type, QString name);
    void postQuery(QString path, OAINumber p_limit, QString _1_property, QString _1_property_value);
    void postTreeActivation(bool ignoredeactivated, bool onlymodified, QString path);
    void postTruststore(QString operation, QString new_password, QString re_password, QString key_store_type, QString remove_alias, QIODevice* certificate);
    void postTruststorePKCS12(QIODevice* truststore_p12);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    OAISlingApiHandler *handler;

    inline void writeResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
        socket->writeHeaders();        
    }
};

}

#endif // OAI_OAISlingApiRequest_H