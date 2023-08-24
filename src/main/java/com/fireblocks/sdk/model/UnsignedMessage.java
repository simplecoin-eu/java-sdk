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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * UnsignedMessage
 */
@JsonPropertyOrder({
  UnsignedMessage.JSON_PROPERTY_CONTENT,
  UnsignedMessage.JSON_PROPERTY_BIP44ADDRESS_INDEX,
  UnsignedMessage.JSON_PROPERTY_BIP44CHANGE,
  UnsignedMessage.JSON_PROPERTY_DERIVATION_PATH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnsignedMessage {
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_BIP44ADDRESS_INDEX = "bip44addressIndex";
  private Integer bip44addressIndex;

  public static final String JSON_PROPERTY_BIP44CHANGE = "bip44change";
  private BigDecimal bip44change;

  public static final String JSON_PROPERTY_DERIVATION_PATH = "derivationPath";
  private List<BigDecimal> derivationPath;

  public UnsignedMessage() { 
  }

  public UnsignedMessage content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(String content) {
    this.content = content;
  }


  public UnsignedMessage bip44addressIndex(Integer bip44addressIndex) {
    this.bip44addressIndex = bip44addressIndex;
    return this;
  }

   /**
   * Get bip44addressIndex
   * @return bip44addressIndex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIP44ADDRESS_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBip44addressIndex() {
    return bip44addressIndex;
  }


  @JsonProperty(JSON_PROPERTY_BIP44ADDRESS_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBip44addressIndex(Integer bip44addressIndex) {
    this.bip44addressIndex = bip44addressIndex;
  }


  public UnsignedMessage bip44change(BigDecimal bip44change) {
    this.bip44change = bip44change;
    return this;
  }

   /**
   * Get bip44change
   * @return bip44change
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIP44CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBip44change() {
    return bip44change;
  }


  @JsonProperty(JSON_PROPERTY_BIP44CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBip44change(BigDecimal bip44change) {
    this.bip44change = bip44change;
  }


  public UnsignedMessage derivationPath(List<BigDecimal> derivationPath) {
    this.derivationPath = derivationPath;
    return this;
  }

  public UnsignedMessage addDerivationPathItem(BigDecimal derivationPathItem) {
    if (this.derivationPath == null) {
      this.derivationPath = new ArrayList<>();
    }
    this.derivationPath.add(derivationPathItem);
    return this;
  }

   /**
   * Get derivationPath
   * @return derivationPath
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DERIVATION_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BigDecimal> getDerivationPath() {
    return derivationPath;
  }


  @JsonProperty(JSON_PROPERTY_DERIVATION_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDerivationPath(List<BigDecimal> derivationPath) {
    this.derivationPath = derivationPath;
  }


  /**
   * Return true if this UnsignedMessage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsignedMessage unsignedMessage = (UnsignedMessage) o;
    return Objects.equals(this.content, unsignedMessage.content) &&
        Objects.equals(this.bip44addressIndex, unsignedMessage.bip44addressIndex) &&
        Objects.equals(this.bip44change, unsignedMessage.bip44change) &&
        Objects.equals(this.derivationPath, unsignedMessage.derivationPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, bip44addressIndex, bip44change, derivationPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsignedMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    bip44addressIndex: ").append(toIndentedString(bip44addressIndex)).append("\n");
    sb.append("    bip44change: ").append(toIndentedString(bip44change)).append("\n");
    sb.append("    derivationPath: ").append(toIndentedString(derivationPath)).append("\n");
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
