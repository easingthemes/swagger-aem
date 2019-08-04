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

#ifndef OAI_OAICqApiHandler_H
#define OAI_OAICqApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAICqApiHandler : public QObject
{
    Q_OBJECT
    
public:
    OAICqApiHandler();
    virtual ~OAICqApiHandler();


public slots:
    virtual void getLoginPage();
    virtual void postCqActions(QString authorizable_id, QString changelog);
    

};

}

#endif // OAI_OAICqApiHandler_H