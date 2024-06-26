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

/** GetMaxSpendableAmountResponse */
@JsonPropertyOrder({GetMaxSpendableAmountResponse.JSON_PROPERTY_MAX_SPENDABLE_AMOUNT})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetMaxSpendableAmountResponse {
    public static final String JSON_PROPERTY_MAX_SPENDABLE_AMOUNT = "maxSpendableAmount";
    private String maxSpendableAmount;

    public GetMaxSpendableAmountResponse() {}

    public GetMaxSpendableAmountResponse maxSpendableAmount(String maxSpendableAmount) {
        this.maxSpendableAmount = maxSpendableAmount;
        return this;
    }

    /**
     * The maximum amount that can be spent from the vault account
     *
     * @return maxSpendableAmount
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_MAX_SPENDABLE_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMaxSpendableAmount() {
        return maxSpendableAmount;
    }

    @JsonProperty(JSON_PROPERTY_MAX_SPENDABLE_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMaxSpendableAmount(String maxSpendableAmount) {
        this.maxSpendableAmount = maxSpendableAmount;
    }

    /** Return true if this GetMaxSpendableAmountResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMaxSpendableAmountResponse getMaxSpendableAmountResponse =
                (GetMaxSpendableAmountResponse) o;
        return Objects.equals(
                this.maxSpendableAmount, getMaxSpendableAmountResponse.maxSpendableAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpendableAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMaxSpendableAmountResponse {\n");
        sb.append("    maxSpendableAmount: ")
                .append(toIndentedString(maxSpendableAmount))
                .append("\n");
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

        // add `maxSpendableAmount` to the URL query string
        if (getMaxSpendableAmount() != null) {
            joiner.add(
                    String.format(
                            "%smaxSpendableAmount%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getMaxSpendableAmount()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
