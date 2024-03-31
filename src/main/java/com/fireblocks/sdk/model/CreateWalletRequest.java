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


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** CreateWalletRequest */
@JsonPropertyOrder({
    CreateWalletRequest.JSON_PROPERTY_NAME,
    CreateWalletRequest.JSON_PROPERTY_CUSTOMER_REF_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateWalletRequest {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_CUSTOMER_REF_ID = "customerRefId";
    private String customerRefId;

    public CreateWalletRequest() {}

    public CreateWalletRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * the wallet&#39;s display name
     *
     * @return name
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public CreateWalletRequest customerRefId(String customerRefId) {
        this.customerRefId = customerRefId;
        return this;
    }

    /**
     * Optional - Sets a customer reference ID
     *
     * @return customerRefId
     */
    @jakarta.annotation.Nullable
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

    /** Return true if this CreateWalletRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWalletRequest createWalletRequest = (CreateWalletRequest) o;
        return Objects.equals(this.name, createWalletRequest.name)
                && Objects.equals(this.customerRefId, createWalletRequest.customerRefId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, customerRefId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWalletRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    customerRefId: ").append(toIndentedString(customerRefId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(
                    String.format(
                            "%sname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `customerRefId` to the URL query string
        if (getCustomerRefId() != null) {
            joiner.add(
                    String.format(
                            "%scustomerRefId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCustomerRefId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
