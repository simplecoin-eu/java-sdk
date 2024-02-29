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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicyCrypto;
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySen;
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySenTest;
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySignet;
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySignetTest;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkConnectionRoutingPolicy
 */
@JsonPropertyOrder({
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_CRYPTO,
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_SEN,
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_SIGNET,
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_SEN_TEST,
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_SIGNET_TEST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkConnectionRoutingPolicy {
  public static final String JSON_PROPERTY_CRYPTO = "crypto";
  private NetworkConnectionRoutingPolicyCrypto crypto;

  public static final String JSON_PROPERTY_SEN = "sen";
  private NetworkConnectionRoutingPolicySen sen;

  public static final String JSON_PROPERTY_SIGNET = "signet";
  private NetworkConnectionRoutingPolicySignet signet;

  public static final String JSON_PROPERTY_SEN_TEST = "sen_test";
  private NetworkConnectionRoutingPolicySenTest senTest;

  public static final String JSON_PROPERTY_SIGNET_TEST = "signet_test";
  private NetworkConnectionRoutingPolicySignetTest signetTest;

  public NetworkConnectionRoutingPolicy() { 
  }

  public NetworkConnectionRoutingPolicy crypto(NetworkConnectionRoutingPolicyCrypto crypto) {
    this.crypto = crypto;
    return this;
  }

   /**
   * Get crypto
   * @return crypto
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkConnectionRoutingPolicyCrypto getCrypto() {
    return crypto;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrypto(NetworkConnectionRoutingPolicyCrypto crypto) {
    this.crypto = crypto;
  }


  public NetworkConnectionRoutingPolicy sen(NetworkConnectionRoutingPolicySen sen) {
    this.sen = sen;
    return this;
  }

   /**
   * Get sen
   * @return sen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkConnectionRoutingPolicySen getSen() {
    return sen;
  }


  @JsonProperty(JSON_PROPERTY_SEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSen(NetworkConnectionRoutingPolicySen sen) {
    this.sen = sen;
  }


  public NetworkConnectionRoutingPolicy signet(NetworkConnectionRoutingPolicySignet signet) {
    this.signet = signet;
    return this;
  }

   /**
   * Get signet
   * @return signet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkConnectionRoutingPolicySignet getSignet() {
    return signet;
  }


  @JsonProperty(JSON_PROPERTY_SIGNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignet(NetworkConnectionRoutingPolicySignet signet) {
    this.signet = signet;
  }


  public NetworkConnectionRoutingPolicy senTest(NetworkConnectionRoutingPolicySenTest senTest) {
    this.senTest = senTest;
    return this;
  }

   /**
   * Get senTest
   * @return senTest
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEN_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkConnectionRoutingPolicySenTest getSenTest() {
    return senTest;
  }


  @JsonProperty(JSON_PROPERTY_SEN_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenTest(NetworkConnectionRoutingPolicySenTest senTest) {
    this.senTest = senTest;
  }


  public NetworkConnectionRoutingPolicy signetTest(NetworkConnectionRoutingPolicySignetTest signetTest) {
    this.signetTest = signetTest;
    return this;
  }

   /**
   * Get signetTest
   * @return signetTest
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNET_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkConnectionRoutingPolicySignetTest getSignetTest() {
    return signetTest;
  }


  @JsonProperty(JSON_PROPERTY_SIGNET_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignetTest(NetworkConnectionRoutingPolicySignetTest signetTest) {
    this.signetTest = signetTest;
  }


  /**
   * Return true if this NetworkConnectionRoutingPolicy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkConnectionRoutingPolicy networkConnectionRoutingPolicy = (NetworkConnectionRoutingPolicy) o;
    return Objects.equals(this.crypto, networkConnectionRoutingPolicy.crypto) &&
        Objects.equals(this.sen, networkConnectionRoutingPolicy.sen) &&
        Objects.equals(this.signet, networkConnectionRoutingPolicy.signet) &&
        Objects.equals(this.senTest, networkConnectionRoutingPolicy.senTest) &&
        Objects.equals(this.signetTest, networkConnectionRoutingPolicy.signetTest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crypto, sen, signet, senTest, signetTest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkConnectionRoutingPolicy {\n");
    sb.append("    crypto: ").append(toIndentedString(crypto)).append("\n");
    sb.append("    sen: ").append(toIndentedString(sen)).append("\n");
    sb.append("    signet: ").append(toIndentedString(signet)).append("\n");
    sb.append("    senTest: ").append(toIndentedString(senTest)).append("\n");
    sb.append("    signetTest: ").append(toIndentedString(signetTest)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `crypto` to the URL query string
    if (getCrypto() != null) {
      joiner.add(getCrypto().toUrlQueryString(prefix + "crypto" + suffix));
    }

    // add `sen` to the URL query string
    if (getSen() != null) {
      joiner.add(getSen().toUrlQueryString(prefix + "sen" + suffix));
    }

    // add `signet` to the URL query string
    if (getSignet() != null) {
      joiner.add(getSignet().toUrlQueryString(prefix + "signet" + suffix));
    }

    // add `sen_test` to the URL query string
    if (getSenTest() != null) {
      joiner.add(getSenTest().toUrlQueryString(prefix + "sen_test" + suffix));
    }

    // add `signet_test` to the URL query string
    if (getSignetTest() != null) {
      joiner.add(getSignetTest().toUrlQueryString(prefix + "signet_test" + suffix));
    }

    return joiner.toString();
  }
}

