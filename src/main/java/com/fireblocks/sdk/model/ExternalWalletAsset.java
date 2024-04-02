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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** ExternalWalletAsset */
@JsonPropertyOrder({
    ExternalWalletAsset.JSON_PROPERTY_ID,
    ExternalWalletAsset.JSON_PROPERTY_STATUS,
    ExternalWalletAsset.JSON_PROPERTY_ADDRESS,
    ExternalWalletAsset.JSON_PROPERTY_BALANCE,
    ExternalWalletAsset.JSON_PROPERTY_LOCKED_AMOUNT,
    ExternalWalletAsset.JSON_PROPERTY_TAG,
    ExternalWalletAsset.JSON_PROPERTY_ACTIVATION_TIME,
    ExternalWalletAsset.JSON_PROPERTY_ADDITIONAL_INFO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalWalletAsset {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_STATUS = "status";
    private ConfigChangeRequestStatus status;

    public static final String JSON_PROPERTY_ADDRESS = "address";
    private String address;

    public static final String JSON_PROPERTY_BALANCE = "balance";
    private String balance;

    public static final String JSON_PROPERTY_LOCKED_AMOUNT = "lockedAmount";
    private String lockedAmount;

    public static final String JSON_PROPERTY_TAG = "tag";
    private String tag;

    public static final String JSON_PROPERTY_ACTIVATION_TIME = "activationTime";
    private String activationTime;

    public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
    private List<WalletAssetAdditionalInfo> additionalInfo;

    public ExternalWalletAsset() {}

    public ExternalWalletAsset id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public ExternalWalletAsset status(ConfigChangeRequestStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ConfigChangeRequestStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(ConfigChangeRequestStatus status) {
        this.status = status;
    }

    public ExternalWalletAsset address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAddress() {
        return address;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAddress(String address) {
        this.address = address;
    }

    public ExternalWalletAsset balance(String balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Get balance
     *
     * @return balance
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BALANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBalance() {
        return balance;
    }

    @JsonProperty(JSON_PROPERTY_BALANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public ExternalWalletAsset lockedAmount(String lockedAmount) {
        this.lockedAmount = lockedAmount;
        return this;
    }

    /**
     * Get lockedAmount
     *
     * @return lockedAmount
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LOCKED_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLockedAmount() {
        return lockedAmount;
    }

    @JsonProperty(JSON_PROPERTY_LOCKED_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLockedAmount(String lockedAmount) {
        this.lockedAmount = lockedAmount;
    }

    public ExternalWalletAsset tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get tag
     *
     * @return tag
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TAG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTag() {
        return tag;
    }

    @JsonProperty(JSON_PROPERTY_TAG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTag(String tag) {
        this.tag = tag;
    }

    public ExternalWalletAsset activationTime(String activationTime) {
        this.activationTime = activationTime;
        return this;
    }

    /**
     * Get activationTime
     *
     * @return activationTime
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ACTIVATION_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getActivationTime() {
        return activationTime;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVATION_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivationTime(String activationTime) {
        this.activationTime = activationTime;
    }

    public ExternalWalletAsset additionalInfo(List<WalletAssetAdditionalInfo> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public ExternalWalletAsset addAdditionalInfoItem(WalletAssetAdditionalInfo additionalInfoItem) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new ArrayList<>();
        }
        this.additionalInfo.add(additionalInfoItem);
        return this;
    }

    /**
     * Get additionalInfo
     *
     * @return additionalInfo
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<WalletAssetAdditionalInfo> getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAdditionalInfo(List<WalletAssetAdditionalInfo> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** Return true if this ExternalWalletAsset object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalWalletAsset externalWalletAsset = (ExternalWalletAsset) o;
        return Objects.equals(this.id, externalWalletAsset.id)
                && Objects.equals(this.status, externalWalletAsset.status)
                && Objects.equals(this.address, externalWalletAsset.address)
                && Objects.equals(this.balance, externalWalletAsset.balance)
                && Objects.equals(this.lockedAmount, externalWalletAsset.lockedAmount)
                && Objects.equals(this.tag, externalWalletAsset.tag)
                && Objects.equals(this.activationTime, externalWalletAsset.activationTime)
                && Objects.equals(this.additionalInfo, externalWalletAsset.additionalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, status, address, balance, lockedAmount, tag, activationTime, additionalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalWalletAsset {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    lockedAmount: ").append(toIndentedString(lockedAmount)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    activationTime: ").append(toIndentedString(activationTime)).append("\n");
        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

        // add `id` to the URL query string
        if (getId() != null) {
            joiner.add(
                    String.format(
                            "%sid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `status` to the URL query string
        if (getStatus() != null) {
            joiner.add(
                    String.format(
                            "%sstatus%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `address` to the URL query string
        if (getAddress() != null) {
            joiner.add(
                    String.format(
                            "%saddress%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getAddress()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `balance` to the URL query string
        if (getBalance() != null) {
            joiner.add(
                    String.format(
                            "%sbalance%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getBalance()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `lockedAmount` to the URL query string
        if (getLockedAmount() != null) {
            joiner.add(
                    String.format(
                            "%slockedAmount%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getLockedAmount()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `tag` to the URL query string
        if (getTag() != null) {
            joiner.add(
                    String.format(
                            "%stag%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getTag()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `activationTime` to the URL query string
        if (getActivationTime() != null) {
            joiner.add(
                    String.format(
                            "%sactivationTime%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getActivationTime()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `additionalInfo` to the URL query string
        if (getAdditionalInfo() != null) {
            for (int i = 0; i < getAdditionalInfo().size(); i++) {
                if (getAdditionalInfo().get(i) != null) {
                    joiner.add(
                            getAdditionalInfo()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sadditionalInfo%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }
}
