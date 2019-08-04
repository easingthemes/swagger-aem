<?php
/**
 * InstallStatusStatus
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
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
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the InstallStatusStatus model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class InstallStatusStatus 
{
        /**
     * @var bool|null
     * @SerializedName("finished")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $finished;

    /**
     * @var int|null
     * @SerializedName("itemCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $itemCount;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->finished = isset($data['finished']) ? $data['finished'] : null;
        $this->itemCount = isset($data['itemCount']) ? $data['itemCount'] : null;
    }

    /**
     * Gets finished.
     *
     * @return bool|null
     */
    public function isFinished()
    {
        return $this->finished;
    }

    /**
     * Sets finished.
     *
     * @param bool|null $finished
     *
     * @return $this
     */
    public function setFinished($finished = null)
    {
        $this->finished = $finished;

        return $this;
    }

    /**
     * Gets itemCount.
     *
     * @return int|null
     */
    public function getItemCount()
    {
        return $this->itemCount;
    }

    /**
     * Sets itemCount.
     *
     * @param int|null $itemCount
     *
     * @return $this
     */
    public function setItemCount($itemCount = null)
    {
        $this->itemCount = $itemCount;

        return $this;
    }
}

