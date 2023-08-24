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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * UnspentInput
 */
@JsonPropertyOrder({
  UnspentInput.JSON_PROPERTY_TX_HASH,
  UnspentInput.JSON_PROPERTY_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnspentInput {
  public static final String JSON_PROPERTY_TX_HASH = "txHash";
  private String txHash;

  public static final String JSON_PROPERTY_INDEX = "index";
  private BigDecimal index;

  public UnspentInput() { 
  }

  public UnspentInput txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * Get txHash
   * @return txHash
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TX_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxHash() {
    return txHash;
  }


  @JsonProperty(JSON_PROPERTY_TX_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  public UnspentInput index(BigDecimal index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(BigDecimal index) {
    this.index = index;
  }


  /**
   * Return true if this UnspentInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnspentInput unspentInput = (UnspentInput) o;
    return Objects.equals(this.txHash, unspentInput.txHash) &&
        Objects.equals(this.index, unspentInput.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHash, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnspentInput {\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
