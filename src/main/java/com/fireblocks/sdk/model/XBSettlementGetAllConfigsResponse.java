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
import com.fireblocks.sdk.model.XBSettlementConfigModel;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * XBSettlementGetAllConfigsResponse
 */
@JsonPropertyOrder({
  XBSettlementGetAllConfigsResponse.JSON_PROPERTY_CONFIGURATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class XBSettlementGetAllConfigsResponse {
  public static final String JSON_PROPERTY_CONFIGURATIONS = "configurations";
  private List<XBSettlementConfigModel> configurations = new ArrayList<>();

  public XBSettlementGetAllConfigsResponse() { 
  }

  public XBSettlementGetAllConfigsResponse configurations(List<XBSettlementConfigModel> configurations) {
    this.configurations = configurations;
    return this;
  }

  public XBSettlementGetAllConfigsResponse addConfigurationsItem(XBSettlementConfigModel configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

   /**
   * Get configurations
   * @return configurations
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<XBSettlementConfigModel> getConfigurations() {
    return configurations;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfigurations(List<XBSettlementConfigModel> configurations) {
    this.configurations = configurations;
  }


  /**
   * Return true if this XBSettlementGetAllConfigsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XBSettlementGetAllConfigsResponse xbSettlementGetAllConfigsResponse = (XBSettlementGetAllConfigsResponse) o;
    return Objects.equals(this.configurations, xbSettlementGetAllConfigsResponse.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XBSettlementGetAllConfigsResponse {\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
