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
 * SetCustomerRefIdForVaultAccountRequest
 */
@JsonPropertyOrder({
  SetCustomerRefIdForVaultAccountRequest.JSON_PROPERTY_CUSTOMER_REF_ID
})
@JsonTypeName("setCustomerRefIdForVaultAccount_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetCustomerRefIdForVaultAccountRequest {
  public static final String JSON_PROPERTY_CUSTOMER_REF_ID = "customerRefId";
  private String customerRefId;

  public SetCustomerRefIdForVaultAccountRequest() { 
  }

  public SetCustomerRefIdForVaultAccountRequest customerRefId(String customerRefId) {
    this.customerRefId = customerRefId;
    return this;
  }

   /**
   * Customer reference ID
   * @return customerRefId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerRefId() {
    return customerRefId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerRefId(String customerRefId) {
    this.customerRefId = customerRefId;
  }


  /**
   * Return true if this setCustomerRefIdForVaultAccount_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest = (SetCustomerRefIdForVaultAccountRequest) o;
    return Objects.equals(this.customerRefId, setCustomerRefIdForVaultAccountRequest.customerRefId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerRefId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCustomerRefIdForVaultAccountRequest {\n");
    sb.append("    customerRefId: ").append(toIndentedString(customerRefId)).append("\n");
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
