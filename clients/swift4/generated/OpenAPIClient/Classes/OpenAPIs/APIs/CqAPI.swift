//
// CqAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import Alamofire



open class CqAPI {
    /**

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getLoginPage(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        getLoginPageWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     - GET /libs/granite/core/content/login.html
     - returns: RequestBuilder<String> 
     */
    open class func getLoginPageWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/libs/granite/core/content/login.html"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**

     - parameter authorizableId: (query)  
     - parameter changelog: (query)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func postCqActions(authorizableId: String, changelog: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        postCqActionsWithRequestBuilder(authorizableId: authorizableId, changelog: changelog).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     - POST /.cqactions.html
     - BASIC:
       - type: http
       - name: aemAuth
     - parameter authorizableId: (query)  
     - parameter changelog: (query)  
     - returns: RequestBuilder<Void> 
     */
    open class func postCqActionsWithRequestBuilder(authorizableId: String, changelog: String) -> RequestBuilder<Void> {
        let path = "/.cqactions.html"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "authorizableId": authorizableId, 
            "changelog": changelog
        ])

        let requestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
