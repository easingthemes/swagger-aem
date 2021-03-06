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


#include "OAITruststoreItems.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAITruststoreItems::OAITruststoreItems(QString json) {
    this->fromJson(json);
}

OAITruststoreItems::OAITruststoreItems() {
    this->init();
}

OAITruststoreItems::~OAITruststoreItems() {
    
}

void
OAITruststoreItems::init() {
    m_alias_isSet = false;
    m_entry_type_isSet = false;
    m_subject_isSet = false;
    m_issuer_isSet = false;
    m_not_before_isSet = false;
    m_not_after_isSet = false;
    m_serial_number_isSet = false;
}

void
OAITruststoreItems::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAITruststoreItems::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(alias, json[QString("alias")]);
    
    ::OpenAPI::fromJsonValue(entry_type, json[QString("entryType")]);
    
    ::OpenAPI::fromJsonValue(subject, json[QString("subject")]);
    
    ::OpenAPI::fromJsonValue(issuer, json[QString("issuer")]);
    
    ::OpenAPI::fromJsonValue(not_before, json[QString("notBefore")]);
    
    ::OpenAPI::fromJsonValue(not_after, json[QString("notAfter")]);
    
    ::OpenAPI::fromJsonValue(serial_number, json[QString("serialNumber")]);
    
}

QString
OAITruststoreItems::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAITruststoreItems::asJsonObject() const {
    QJsonObject obj;
	if(m_alias_isSet){
        obj.insert(QString("alias"), ::OpenAPI::toJsonValue(alias));
    }
	if(m_entry_type_isSet){
        obj.insert(QString("entryType"), ::OpenAPI::toJsonValue(entry_type));
    }
	if(m_subject_isSet){
        obj.insert(QString("subject"), ::OpenAPI::toJsonValue(subject));
    }
	if(m_issuer_isSet){
        obj.insert(QString("issuer"), ::OpenAPI::toJsonValue(issuer));
    }
	if(m_not_before_isSet){
        obj.insert(QString("notBefore"), ::OpenAPI::toJsonValue(not_before));
    }
	if(m_not_after_isSet){
        obj.insert(QString("notAfter"), ::OpenAPI::toJsonValue(not_after));
    }
	if(m_serial_number_isSet){
        obj.insert(QString("serialNumber"), ::OpenAPI::toJsonValue(serial_number));
    }
    return obj;
}

QString
OAITruststoreItems::getAlias() const {
    return alias;
}
void
OAITruststoreItems::setAlias(const QString &alias) {
    this->alias = alias;
    this->m_alias_isSet = true;
}

QString
OAITruststoreItems::getEntryType() const {
    return entry_type;
}
void
OAITruststoreItems::setEntryType(const QString &entry_type) {
    this->entry_type = entry_type;
    this->m_entry_type_isSet = true;
}

QString
OAITruststoreItems::getSubject() const {
    return subject;
}
void
OAITruststoreItems::setSubject(const QString &subject) {
    this->subject = subject;
    this->m_subject_isSet = true;
}

QString
OAITruststoreItems::getIssuer() const {
    return issuer;
}
void
OAITruststoreItems::setIssuer(const QString &issuer) {
    this->issuer = issuer;
    this->m_issuer_isSet = true;
}

QString
OAITruststoreItems::getNotBefore() const {
    return not_before;
}
void
OAITruststoreItems::setNotBefore(const QString &not_before) {
    this->not_before = not_before;
    this->m_not_before_isSet = true;
}

QString
OAITruststoreItems::getNotAfter() const {
    return not_after;
}
void
OAITruststoreItems::setNotAfter(const QString &not_after) {
    this->not_after = not_after;
    this->m_not_after_isSet = true;
}

qint32
OAITruststoreItems::getSerialNumber() const {
    return serial_number;
}
void
OAITruststoreItems::setSerialNumber(const qint32 &serial_number) {
    this->serial_number = serial_number;
    this->m_serial_number_isSet = true;
}


bool
OAITruststoreItems::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_alias_isSet){ isObjectUpdated = true; break;}
    
        if(m_entry_type_isSet){ isObjectUpdated = true; break;}
    
        if(m_subject_isSet){ isObjectUpdated = true; break;}
    
        if(m_issuer_isSet){ isObjectUpdated = true; break;}
    
        if(m_not_before_isSet){ isObjectUpdated = true; break;}
    
        if(m_not_after_isSet){ isObjectUpdated = true; break;}
    
        if(m_serial_number_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}

