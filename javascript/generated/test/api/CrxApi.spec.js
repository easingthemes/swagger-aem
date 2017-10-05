/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 1.2.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.NodeSwaggerAem);
  }
}(this, function(expect, NodeSwaggerAem) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new NodeSwaggerAem.CrxApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('CrxApi', function() {
    describe('getInstallStatus', function() {
      it('should call getInstallStatus successfully', function(done) {
        //uncomment below and update the code to test getInstallStatus
        //instance.getInstallStatus(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postPackageService', function() {
      it('should call postPackageService successfully', function(done) {
        //uncomment below and update the code to test postPackageService
        //instance.postPackageService(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postPackageServiceJson', function() {
      it('should call postPackageServiceJson successfully', function(done) {
        //uncomment below and update the code to test postPackageServiceJson
        //instance.postPackageServiceJson(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postPackageUpdate', function() {
      it('should call postPackageUpdate successfully', function(done) {
        //uncomment below and update the code to test postPackageUpdate
        //instance.postPackageUpdate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postSetPassword', function() {
      it('should call postSetPassword successfully', function(done) {
        //uncomment below and update the code to test postSetPassword
        //instance.postSetPassword(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
