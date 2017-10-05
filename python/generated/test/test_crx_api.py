# coding: utf-8

"""
    Adobe Experience Manager (AEM) API

    Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

    OpenAPI spec version: 1.2.0
    Contact: opensource@shinesolutions.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import swaggeraem
from swaggeraem.rest import ApiException
from swaggeraem.apis.crx_api import CrxApi


class TestCrxApi(unittest.TestCase):
    """ CrxApi unit test stubs """

    def setUp(self):
        self.api = swaggeraem.apis.crx_api.CrxApi()

    def tearDown(self):
        pass

    def test_get_install_status(self):
        """
        Test case for get_install_status

        
        """
        pass

    def test_post_package_service(self):
        """
        Test case for post_package_service

        
        """
        pass

    def test_post_package_service_json(self):
        """
        Test case for post_package_service_json

        
        """
        pass

    def test_post_package_update(self):
        """
        Test case for post_package_update

        
        """
        pass

    def test_post_set_password(self):
        """
        Test case for post_set_password

        
        """
        pass


if __name__ == '__main__':
    unittest.main()
