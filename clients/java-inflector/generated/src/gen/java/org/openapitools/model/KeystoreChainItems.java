package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-04T23:41:21.082Z[GMT]")
public class KeystoreChainItems   {
  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("notBefore")
  private String notBefore = null;

  @JsonProperty("notAfter")
  private String notAfter = null;

  @JsonProperty("serialNumber")
  private Integer serialNumber = null;

  /**
   * e.g. \"CN=localhost\"
   **/
  public KeystoreChainItems subject(String subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"CN=localhost\"")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * e.g. \"CN=Admin\"
   **/
  public KeystoreChainItems issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"CN=Admin\"")
  @JsonProperty("issuer")
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
   **/
  public KeystoreChainItems notBefore(String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"Sun Jul 01 12:00:00 AEST 2018\"")
  @JsonProperty("notBefore")
  public String getNotBefore() {
    return notBefore;
  }
  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  /**
   * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
   **/
  public KeystoreChainItems notAfter(String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"Sun Jun 30 23:59:50 AEST 2019\"")
  @JsonProperty("notAfter")
  public String getNotAfter() {
    return notAfter;
  }
  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  /**
   * 18165099476682912368
   **/
  public KeystoreChainItems serialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  
  @ApiModelProperty(value = "18165099476682912368")
  @JsonProperty("serialNumber")
  public Integer getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreChainItems keystoreChainItems = (KeystoreChainItems) o;
    return Objects.equals(subject, keystoreChainItems.subject) &&
        Objects.equals(issuer, keystoreChainItems.issuer) &&
        Objects.equals(notBefore, keystoreChainItems.notBefore) &&
        Objects.equals(notAfter, keystoreChainItems.notAfter) &&
        Objects.equals(serialNumber, keystoreChainItems.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, issuer, notBefore, notAfter, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreChainItems {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

