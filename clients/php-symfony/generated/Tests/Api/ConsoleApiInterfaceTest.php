<?php
/**
 * ConsoleApiInterfaceTest
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 3.2.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the endpoint.
 */

namespace OpenAPI\Server\Tests\Api;

use OpenAPI\Server\Configuration;
use OpenAPI\Server\ApiClient;
use OpenAPI\Server\ApiException;
use OpenAPI\Server\ObjectSerializer;
use Symfony\Bundle\FrameworkBundle\Test\WebTestCase;

/**
 * ConsoleApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */
class ConsoleApiInterfaceTest extends WebTestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test case for getAemProductInfo
     *
     * .
     *
     */
    public function testGetAemProductInfo()
    {
        $client = static::createClient();

        $path = '/system/console/status-productinfo.json';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getConfigMgr
     *
     * .
     *
     */
    public function testGetConfigMgr()
    {
        $client = static::createClient();

        $path = '/system/console/configMgr';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for postBundle
     *
     * .
     *
     */
    public function testPostBundle()
    {
        $client = static::createClient();

        $path = '/system/console/bundles/{name}';
        $pattern = '{name}';
        $data = $this->genTestData('[a-z0-9]+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for postJmxRepository
     *
     * .
     *
     */
    public function testPostJmxRepository()
    {
        $client = static::createClient();

        $path = '/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}';
        $pattern = '{action}';
        $data = $this->genTestData('[a-z0-9]+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for postSamlConfiguration
     *
     * .
     *
     */
    public function testPostSamlConfiguration()
    {
        $client = static::createClient();

        $path = '/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler';

        $crawler = $client->request('POST', $path);
    }

    protected function genTestData($regexp)
    {
        $grammar  = new \Hoa\File\Read('hoa://Library/Regex/Grammar.pp');
        $compiler = \Hoa\Compiler\Llk\Llk::load($grammar);
        $ast      = $compiler->parse($regexp);
        $generator = new \Hoa\Regex\Visitor\Isotropic(new \Hoa\Math\Sampler\Random());

        return $generator->visit($ast); 
    }
}