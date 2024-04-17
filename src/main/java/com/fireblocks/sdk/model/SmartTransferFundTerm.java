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

/** SmartTransferFundTerm */
@JsonPropertyOrder({
    SmartTransferFundTerm.JSON_PROPERTY_ASSET,
    SmartTransferFundTerm.JSON_PROPERTY_AMOUNT,
    SmartTransferFundTerm.JSON_PROPERTY_NETWORK_CONNECTION_ID,
    SmartTransferFundTerm.JSON_PROPERTY_SRC_ID,
    SmartTransferFundTerm.JSON_PROPERTY_SRC_TYPE,
    SmartTransferFundTerm.JSON_PROPERTY_FEE,
    SmartTransferFundTerm.JSON_PROPERTY_FEE_LEVEL,
    SmartTransferFundTerm.JSON_PROPERTY_NOTE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SmartTransferFundTerm {
    public static final String JSON_PROPERTY_ASSET = "asset";
    private String asset;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private String amount;

    public static final String JSON_PROPERTY_NETWORK_CONNECTION_ID = "networkConnectionId";
    private String networkConnectionId;

    public static final String JSON_PROPERTY_SRC_ID = "srcId";
    private String srcId;

    public static final String JSON_PROPERTY_SRC_TYPE = "srcType";
    private String srcType;

    public static final String JSON_PROPERTY_FEE = "fee";
    private String fee;

    public static final String JSON_PROPERTY_FEE_LEVEL = "feeLevel";
    private String feeLevel;

    public static final String JSON_PROPERTY_NOTE = "note";
    private String note;

    public SmartTransferFundTerm() {}

    public SmartTransferFundTerm asset(String asset) {
        this.asset = asset;
        return this;
    }

    /**
     * Asset name
     *
     * @return asset
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ASSET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAsset() {
        return asset;
    }

    @JsonProperty(JSON_PROPERTY_ASSET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAsset(String asset) {
        this.asset = asset;
    }

    public SmartTransferFundTerm amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Amount
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

    public SmartTransferFundTerm networkConnectionId(String networkConnectionId) {
        this.networkConnectionId = networkConnectionId;
        return this;
    }

    /**
     * Id of the network connection used.
     *
     * @return networkConnectionId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_NETWORK_CONNECTION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getNetworkConnectionId() {
        return networkConnectionId;
    }

    @JsonProperty(JSON_PROPERTY_NETWORK_CONNECTION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNetworkConnectionId(String networkConnectionId) {
        this.networkConnectionId = networkConnectionId;
    }

    public SmartTransferFundTerm srcId(String srcId) {
        this.srcId = srcId;
        return this;
    }

    /**
     * Id of the vault that is used as the source of the asset.
     *
     * @return srcId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SRC_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSrcId() {
        return srcId;
    }

    @JsonProperty(JSON_PROPERTY_SRC_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    public SmartTransferFundTerm srcType(String srcType) {
        this.srcType = srcType;
        return this;
    }

    /**
     * Source of the asset.
     *
     * @return srcType
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SRC_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSrcType() {
        return srcType;
    }

    @JsonProperty(JSON_PROPERTY_SRC_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSrcType(String srcType) {
        this.srcType = srcType;
    }

    public SmartTransferFundTerm fee(String fee) {
        this.fee = fee;
        return this;
    }

    /**
     * Transaction fee
     *
     * @return fee
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_FEE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFee() {
        return fee;
    }

    @JsonProperty(JSON_PROPERTY_FEE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFee(String fee) {
        this.fee = fee;
    }

    public SmartTransferFundTerm feeLevel(String feeLevel) {
        this.feeLevel = feeLevel;
        return this;
    }

    /**
     * Transaction fee level.
     *
     * @return feeLevel
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_FEE_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFeeLevel() {
        return feeLevel;
    }

    @JsonProperty(JSON_PROPERTY_FEE_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFeeLevel(String feeLevel) {
        this.feeLevel = feeLevel;
    }

    public SmartTransferFundTerm note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Transaction note
     *
     * @return note
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NOTE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNote() {
        return note;
    }

    @JsonProperty(JSON_PROPERTY_NOTE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNote(String note) {
        this.note = note;
    }

    /** Return true if this SmartTransferFundTerm object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmartTransferFundTerm smartTransferFundTerm = (SmartTransferFundTerm) o;
        return Objects.equals(this.asset, smartTransferFundTerm.asset)
                && Objects.equals(this.amount, smartTransferFundTerm.amount)
                && Objects.equals(
                        this.networkConnectionId, smartTransferFundTerm.networkConnectionId)
                && Objects.equals(this.srcId, smartTransferFundTerm.srcId)
                && Objects.equals(this.srcType, smartTransferFundTerm.srcType)
                && Objects.equals(this.fee, smartTransferFundTerm.fee)
                && Objects.equals(this.feeLevel, smartTransferFundTerm.feeLevel)
                && Objects.equals(this.note, smartTransferFundTerm.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                asset, amount, networkConnectionId, srcId, srcType, fee, feeLevel, note);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartTransferFundTerm {\n");
        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    networkConnectionId: ")
                .append(toIndentedString(networkConnectionId))
                .append("\n");
        sb.append("    srcId: ").append(toIndentedString(srcId)).append("\n");
        sb.append("    srcType: ").append(toIndentedString(srcType)).append("\n");
        sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
        sb.append("    feeLevel: ").append(toIndentedString(feeLevel)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

        // add `networkConnectionId` to the URL query string
        if (getNetworkConnectionId() != null) {
            joiner.add(
                    String.format(
                            "%snetworkConnectionId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getNetworkConnectionId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `srcId` to the URL query string
        if (getSrcId() != null) {
            joiner.add(
                    String.format(
                            "%ssrcId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getSrcId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `srcType` to the URL query string
        if (getSrcType() != null) {
            joiner.add(
                    String.format(
                            "%ssrcType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getSrcType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `fee` to the URL query string
        if (getFee() != null) {
            joiner.add(
                    String.format(
                            "%sfee%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getFee()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `feeLevel` to the URL query string
        if (getFeeLevel() != null) {
            joiner.add(
                    String.format(
                            "%sfeeLevel%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getFeeLevel()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `note` to the URL query string
        if (getNote() != null) {
            joiner.add(
                    String.format(
                            "%snote%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getNote()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
