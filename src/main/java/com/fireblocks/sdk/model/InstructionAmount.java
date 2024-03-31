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

/** InstructionAmount */
@JsonPropertyOrder({
    InstructionAmount.JSON_PROPERTY_AMOUNT,
    InstructionAmount.JSON_PROPERTY_ASSET_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstructionAmount {
    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private String amount;

    public static final String JSON_PROPERTY_ASSET_ID = "assetId";
    private String assetId;

    public InstructionAmount() {}

    public InstructionAmount amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAmount() {
        return amount;
    }

    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public InstructionAmount assetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * Get assetId
     *
     * @return assetId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAssetId() {
        return assetId;
    }

    @JsonProperty(JSON_PROPERTY_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /** Return true if this InstructionAmount object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstructionAmount instructionAmount = (InstructionAmount) o;
        return Objects.equals(this.amount, instructionAmount.amount)
                && Objects.equals(this.assetId, instructionAmount.assetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, assetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstructionAmount {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

        // add `amount` to the URL query string
        if (getAmount() != null) {
            joiner.add(
                    String.format(
                            "%samount%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `assetId` to the URL query string
        if (getAssetId() != null) {
            joiner.add(
                    String.format(
                            "%sassetId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getAssetId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
