/*
 * Fireblocks API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.6.2
 * Contact: support@fireblocks.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fireblocks.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * TravelRuleIssuer
 */
@JsonPropertyOrder({
  TravelRuleIssuer.JSON_PROPERTY_ISSUER_DID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleIssuer {
  public static final String JSON_PROPERTY_ISSUER_DID = "issuerDid";
  private String issuerDid;

  public TravelRuleIssuer() { 
  }

  public TravelRuleIssuer issuerDid(String issuerDid) {
    this.issuerDid = issuerDid;
    return this;
  }

   /**
   * Get issuerDid
   * @return issuerDid
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUER_DID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIssuerDid() {
    return issuerDid;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_DID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuerDid(String issuerDid) {
    this.issuerDid = issuerDid;
  }


  /**
   * Return true if this TravelRuleIssuer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelRuleIssuer travelRuleIssuer = (TravelRuleIssuer) o;
    return Objects.equals(this.issuerDid, travelRuleIssuer.issuerDid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerDid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRuleIssuer {\n");
    sb.append("    issuerDid: ").append(toIndentedString(issuerDid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
