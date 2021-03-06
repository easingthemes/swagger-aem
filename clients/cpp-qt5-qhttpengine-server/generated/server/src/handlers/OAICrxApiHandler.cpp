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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAICrxApiHandler.h"
#include "OAICrxApiRequest.h"

namespace OpenAPI {

OAICrxApiHandler::OAICrxApiHandler(){

}

OAICrxApiHandler::~OAICrxApiHandler(){

}

void OAICrxApiHandler::getCrxdeStatus() {
    auto reqObj = qobject_cast<OAICrxApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QString res;
        reqObj->getCrxdeStatusResponse(res);
    }    
}
void OAICrxApiHandler::getInstallStatus() {
    auto reqObj = qobject_cast<OAICrxApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIInstallStatus res;
        reqObj->getInstallStatusResponse(res);
    }    
}
void OAICrxApiHandler::getPackageManagerServlet() {
    auto reqObj = qobject_cast<OAICrxApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->getPackageManagerServletResponse();
    }    
}
void OAICrxApiHandler::postPackageService(QString cmd) {
    Q_UNUSED(cmd);
    auto reqObj = qobject_cast<OAICrxApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QString res;
        reqObj->postPackageServiceResponse(res);
    }    
}
void OAICrxApiHandler::postPackageServiceJson(QString path, QString cmd, QString group_name, QString package_name, QString package_version, QString _charset_, bool force, bool recursive, QIODevice* package) {
    Q_UNUSED(path);
    Q_UNUSED(cmd);
    Q_UNUSED(group_name);
    Q_UNUSED(package_name);
    Q_UNUSED(package_version);
    Q_UNUSED(_charset_);
    Q_UNUSED(force);
    Q_UNUSED(recursive);
    Q_UNUSED(package);
    auto reqObj = qobject_cast<OAICrxApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QString res;
        reqObj->postPackageServiceJsonResponse(res);
    }    
}
void OAICrxApiHandler::postPackageUpdate(QString group_name, QString package_name, QString version, QString path, QString filter, QString _charset_) {
    Q_UNUSED(group_name);
    Q_UNUSED(package_name);
    Q_UNUSED(version);
    Q_UNUSED(path);
    Q_UNUSED(filter);
    Q_UNUSED(_charset_);
    auto reqObj = qobject_cast<OAICrxApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QString res;
        reqObj->postPackageUpdateResponse(res);
    }    
}
void OAICrxApiHandler::postSetPassword(QString old, QString plain, QString verify) {
    Q_UNUSED(old);
    Q_UNUSED(plain);
    Q_UNUSED(verify);
    auto reqObj = qobject_cast<OAICrxApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QString res;
        reqObj->postSetPasswordResponse(res);
    }    
}


}
