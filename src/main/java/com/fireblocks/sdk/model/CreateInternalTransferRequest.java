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

/** CreateInternalTransferRequest */
@JsonPropertyOrder({
    CreateInternalTransferRequest.JSON_PROPERTY_ASSET,
    CreateInternalTransferRequest.JSON_PROPERTY_AMOUNT,
    CreateInternalTransferRequest.JSON_PROPERTY_SOURCE_TYPE,
    CreateInternalTransferRequest.JSON_PROPERTY_DEST_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateInternalTransferRequest {
    public static final String JSON_PROPERTY_ASSET = "asset";
    private String asset;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private String amount;

    public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
    private TradingAccountType sourceType;

    public static final String JSON_PROPERTY_DEST_TYPE = "destType";
    private TradingAccountType destType;

    public CreateInternalTransferRequest() {}

    public CreateInternalTransferRequest asset(String asset) {
        this.asset = asset;
        return this;
    }

    /**
     * Get asset
     *
     * @return asset
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ASSET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAsset() {
        return asset;
    }

    @JsonProperty(JSON_PROPERTY_ASSET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAsset(String asset) {
        this.asset = asset;
    }

    public CreateInternalTransferRequest amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAmount() {
        return amount;
    }

    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public CreateInternalTransferRequest sourceType(TradingAccountType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get sourceType
     *
     * @return sourceType
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TradingAccountType getSourceType() {
        return sourceType;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSourceType(TradingAccountType sourceType) {
        this.sourceType = sourceType;
    }

    public CreateInternalTransferRequest destType(TradingAccountType destType) {
        this.destType = destType;
        return this;
    }

    /**
     * Get destType
     *
     * @return destType
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DEST_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TradingAccountType getDestType() {
        return destType;
    }

    @JsonProperty(JSON_PROPERTY_DEST_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDestType(TradingAccountType destType) {
        this.destType = destType;
    }

    /** Return true if this CreateInternalTransferRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInternalTransferRequest createInternalTransferRequest =
                (CreateInternalTransferRequest) o;
        return Objects.equals(this.asset, createInternalTransferRequest.asset)
                && Objects.equals(this.amount, createInternalTransferRequest.amount)
                && Objects.equals(this.sourceType, createInternalTransferRequest.sourceType)
                && Objects.equals(this.destType, createInternalTransferRequest.destType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asset, amount, sourceType, destType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInternalTransferRequest {\n");
        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    destType: ").append(toIndentedString(destType)).append("\n");
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

        // add `asset` to the URL query string
        if (getAsset() != null) {
            joiner.add(
                    String.format(
                            "%sasset%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getAsset()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

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

        // add `sourceType` to the URL query string
        if (getSourceType() != null) {
            joiner.add(
                    String.format(
                            "%ssourceType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getSourceType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `destType` to the URL query string
        if (getDestType() != null) {
            joiner.add(
                    String.format(
                            "%sdestType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getDestType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
