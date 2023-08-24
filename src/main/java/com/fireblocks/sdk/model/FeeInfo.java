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
 * Details of the transaction&#39;s fee.
 */
@JsonPropertyOrder({
  FeeInfo.JSON_PROPERTY_NETWORK_FEE,
  FeeInfo.JSON_PROPERTY_SERVICE_FEE,
  FeeInfo.JSON_PROPERTY_GAS_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeeInfo {
  public static final String JSON_PROPERTY_NETWORK_FEE = "networkFee";
  private String networkFee;

  public static final String JSON_PROPERTY_SERVICE_FEE = "serviceFee";
  private String serviceFee;

  public static final String JSON_PROPERTY_GAS_PRICE = "gasPrice";
  private String gasPrice;

  public FeeInfo() { 
  }

  public FeeInfo networkFee(String networkFee) {
    this.networkFee = networkFee;
    return this;
  }

   /**
   * The fee paid to the network
   * @return networkFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkFee() {
    return networkFee;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkFee(String networkFee) {
    this.networkFee = networkFee;
  }


  public FeeInfo serviceFee(String serviceFee) {
    this.serviceFee = serviceFee;
    return this;
  }

   /**
   * The total fee deducted by the exchange from the actual requested amount (serviceFee &#x3D; amount - netAmount)
   * @return serviceFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceFee() {
    return serviceFee;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceFee(String serviceFee) {
    this.serviceFee = serviceFee;
  }


  public FeeInfo gasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GAS_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGasPrice() {
    return gasPrice;
  }


  @JsonProperty(JSON_PROPERTY_GAS_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
  }


  /**
   * Return true if this FeeInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeInfo feeInfo = (FeeInfo) o;
    return Objects.equals(this.networkFee, feeInfo.networkFee) &&
        Objects.equals(this.serviceFee, feeInfo.serviceFee) &&
        Objects.equals(this.gasPrice, feeInfo.gasPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkFee, serviceFee, gasPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeInfo {\n");
    sb.append("    networkFee: ").append(toIndentedString(networkFee)).append("\n");
    sb.append("    serviceFee: ").append(toIndentedString(serviceFee)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
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
