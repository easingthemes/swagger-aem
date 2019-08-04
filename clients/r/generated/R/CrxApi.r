# Adobe Experience Manager (AEM) API
#
# Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
#
# OpenAPI spec version: 3.2.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech

#' @title Crx operations
#' @description openapi.Crx
#'
#' @field path Stores url path of the request.
#' @field apiClient Handles the client-server communication.
#' @field userAgent Set the user agent of the request.
#'
#' @importFrom R6 R6Class
#'
#' @section Methods:
#' \describe{
#'
#' get_crxde_status 
#'
#'
#' get_install_status 
#'
#'
#' get_package_manager_servlet 
#'
#'
#' post_package_service 
#'
#'
#' post_package_service_json 
#'
#'
#' post_package_update 
#'
#'
#' post_set_password 
#'
#' }
#'
#' @export
CrxApi <- R6::R6Class(
  'CrxApi',
  public = list(
    userAgent = "OpenAPI-Generator/1.0.0/r",
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    get_crxde_status = function(...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/crx/server/crx.default/jcr:root/.1.json"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- Character$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    get_install_status = function(...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/crx/packmgr/installstatus.jsp"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- InstallStatus$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    get_package_manager_servlet = function(...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/crx/packmgr/service/script.html"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        # void response, no need to return anything
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    post_package_service = function(cmd, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`cmd`)) {
        queryParams['cmd'] <- cmd
      }

      urlPath <- "/crx/packmgr/service.jsp"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- Character$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    post_package_service_json = function(path, cmd, group_name, package_name, package_version, _charset_, force, recursive, package, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`cmd`)) {
        queryParams['cmd'] <- cmd
      }

      if (!missing(`group_name`)) {
        queryParams['groupName'] <- group_name
      }

      if (!missing(`package_name`)) {
        queryParams['packageName'] <- package_name
      }

      if (!missing(`package_version`)) {
        queryParams['packageVersion'] <- package_version
      }

      if (!missing(`_charset_`)) {
        queryParams['_charset_'] <- _charset_
      }

      if (!missing(`force`)) {
        queryParams['force'] <- force
      }

      if (!missing(`recursive`)) {
        queryParams['recursive'] <- recursive
      }

      body <- list(
          "package" = httr::upload_file(package)
      )

      urlPath <- "/crx/packmgr/service/.json/{path}"
      if (!missing(`path`)) {
        urlPath <- gsub(paste0("\\{", "path", "\\}"), `path`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- Character$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    post_package_update = function(group_name, package_name, version, path, filter, _charset_, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`group_name`)) {
        queryParams['groupName'] <- group_name
      }

      if (!missing(`package_name`)) {
        queryParams['packageName'] <- package_name
      }

      if (!missing(`version`)) {
        queryParams['version'] <- version
      }

      if (!missing(`path`)) {
        queryParams['path'] <- path
      }

      if (!missing(`filter`)) {
        queryParams['filter'] <- filter
      }

      if (!missing(`_charset_`)) {
        queryParams['_charset_'] <- _charset_
      }

      urlPath <- "/crx/packmgr/update.jsp"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- Character$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    post_set_password = function(old, plain, verify, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`old`)) {
        queryParams['old'] <- old
      }

      if (!missing(`plain`)) {
        queryParams['plain'] <- plain
      }

      if (!missing(`verify`)) {
        queryParams['verify'] <- verify
      }

      urlPath <- "/crx/explorer/ui/setpassword.jsp"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- Character$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
  )
)