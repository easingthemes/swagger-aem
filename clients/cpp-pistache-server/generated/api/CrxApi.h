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
/*
 * CrxApi.h
 *
 * 
 */

#ifndef CrxApi_H_
#define CrxApi_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>

#include <pistache/optional.h>

#include "InstallStatus.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

class  CrxApi {
public:
    CrxApi(Pistache::Address addr);
    virtual ~CrxApi() {};
    void init(size_t thr);
    void start();
    void shutdown();

    const std::string base = "/";

private:
    void setupRoutes();

    void get_crxde_status_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_install_status_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_package_manager_servlet_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void post_package_service_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void post_package_service_json_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void post_package_update_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void post_set_password_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void crx_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    Pistache::Http::Endpoint httpEndpoint;
    Pistache::Rest::Router router;


    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    virtual void get_crxde_status(Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    virtual void get_install_status(Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    virtual void get_package_manager_servlet(Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="cmd"></param>
    virtual void post_package_service(const Pistache::Optional<std::string> &cmd, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    virtual void post_package_service_json(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="groupName"></param>
    /// <param name="packageName"></param>
    /// <param name="version"></param>
    /// <param name="path"></param>
    /// <param name="filter"> (optional)</param>
    /// <param name="charset"> (optional)</param>
    virtual void post_package_update(const Pistache::Optional<std::string> &groupName, const Pistache::Optional<std::string> &packageName, const Pistache::Optional<std::string> &version, const Pistache::Optional<std::string> &path, const Pistache::Optional<std::string> &filter, const Pistache::Optional<std::string> &charset, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="old"></param>
    /// <param name="plain"></param>
    /// <param name="verify"></param>
    virtual void post_set_password(const Pistache::Optional<std::string> &old, const Pistache::Optional<std::string> &plain, const Pistache::Optional<std::string> &verify, Pistache::Http::ResponseWriter &response) = 0;

};

}
}
}
}

#endif /* CrxApi_H_ */

