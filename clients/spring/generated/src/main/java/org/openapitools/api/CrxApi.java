/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.2.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.InstallStatus;
import org.springframework.core.io.Resource;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-04T23:44:43.219Z[GMT]")

@Validated
@Api(value = "crx", description = "the crx API")
public interface CrxApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "getCrxdeStatus", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "CRXDE is enabled", response = String.class),
        @ApiResponse(code = 404, message = "CRXDE is disabled", response = String.class) })
    @RequestMapping(value = "/crx/server/crx.default/jcr:root/.1.json",
        produces = { "plain/text" }, 
        method = RequestMethod.GET)
    default ResponseEntity<String> getCrxdeStatus() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getInstallStatus", notes = "", response = InstallStatus.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved CRX package manager install status", response = InstallStatus.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    @RequestMapping(value = "/crx/packmgr/installstatus.jsp",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InstallStatus> getInstallStatus() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"status\" : {    \"finished\" : true,    \"itemCount\" : 0  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getPackageManagerServlet", notes = "", authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @ApiResponses(value = { 
        @ApiResponse(code = 404, message = "Package Manager Servlet is disabled", response = String.class),
        @ApiResponse(code = 405, message = "Package Manager Servlet is active", response = String.class) })
    @RequestMapping(value = "/crx/packmgr/service/script.html",
        produces = { "text/html" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> getPackageManagerServlet() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "postPackageService", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    @RequestMapping(value = "/crx/packmgr/service.jsp",
        produces = { "text/xml" }, 
        method = RequestMethod.POST)
    default ResponseEntity<String> postPackageService(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "cmd", required = true) String cmd) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "postPackageServiceJson", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    @RequestMapping(value = "/crx/packmgr/service/.json/{path}",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    default ResponseEntity<String> postPackageServiceJson(@ApiParam(value = "",required=true) @PathVariable("path") String path,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "cmd", required = true) String cmd,@ApiParam(value = "") @Valid @RequestParam(value = "groupName", required = false) String groupName,@ApiParam(value = "") @Valid @RequestParam(value = "packageName", required = false) String packageName,@ApiParam(value = "") @Valid @RequestParam(value = "packageVersion", required = false) String packageVersion,@ApiParam(value = "") @Valid @RequestParam(value = "_charset_", required = false) String charset,@ApiParam(value = "") @Valid @RequestParam(value = "force", required = false) Boolean force,@ApiParam(value = "") @Valid @RequestParam(value = "recursive", required = false) Boolean recursive,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile package) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "postPackageUpdate", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    @RequestMapping(value = "/crx/packmgr/update.jsp",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<String> postPackageUpdate(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "groupName", required = true) String groupName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "packageName", required = true) String packageName,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "version", required = true) String version,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "path", required = true) String path,@ApiParam(value = "") @Valid @RequestParam(value = "filter", required = false) String filter,@ApiParam(value = "") @Valid @RequestParam(value = "_charset_", required = false) String charset) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "postSetPassword", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    @RequestMapping(value = "/crx/explorer/ui/setpassword.jsp",
        produces = { "text/plain" }, 
        method = RequestMethod.POST)
    default ResponseEntity<String> postSetPassword(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "old", required = true) String old,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "plain", required = true) String plain,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "verify", required = true) String verify) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}