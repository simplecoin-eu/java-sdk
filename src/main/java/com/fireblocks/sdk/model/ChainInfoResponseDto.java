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
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** ChainInfoResponseDto */
@JsonPropertyOrder({
    ChainInfoResponseDto.JSON_PROPERTY_CHAIN_DESCRIPTOR,
    ChainInfoResponseDto.JSON_PROPERTY_CURRENT_EPOCH,
    ChainInfoResponseDto.JSON_PROPERTY_EPOCH_ELAPSED,
    ChainInfoResponseDto.JSON_PROPERTY_EPOCH_DURATION,
    ChainInfoResponseDto.JSON_PROPERTY_ADDITIONAL_INFO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChainInfoResponseDto {
    public static final String JSON_PROPERTY_CHAIN_DESCRIPTOR = "chainDescriptor";
    private String chainDescriptor;

    public static final String JSON_PROPERTY_CURRENT_EPOCH = "currentEpoch";
    private BigDecimal currentEpoch;

    public static final String JSON_PROPERTY_EPOCH_ELAPSED = "epochElapsed";
    private BigDecimal epochElapsed;

    public static final String JSON_PROPERTY_EPOCH_DURATION = "epochDuration";
    private BigDecimal epochDuration;

    public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
    private AdditionalInfoDto additionalInfo;

    public ChainInfoResponseDto() {}

    public ChainInfoResponseDto chainDescriptor(String chainDescriptor) {
        this.chainDescriptor = chainDescriptor;
        return this;
    }

    /**
     * The protocol identifier (e.g. \&quot;ETH\&quot;/\&quot;SOL\&quot;).
     *
     * @return chainDescriptor
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CHAIN_DESCRIPTOR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getChainDescriptor() {
        return chainDescriptor;
    }

    @JsonProperty(JSON_PROPERTY_CHAIN_DESCRIPTOR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setChainDescriptor(String chainDescriptor) {
        this.chainDescriptor = chainDescriptor;
    }

    public ChainInfoResponseDto currentEpoch(BigDecimal currentEpoch) {
        this.currentEpoch = currentEpoch;
        return this;
    }

    /**
     * The current epoch number of the blockchain network.
     *
     * @return currentEpoch
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CURRENT_EPOCH)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getCurrentEpoch() {
        return currentEpoch;
    }

    @JsonProperty(JSON_PROPERTY_CURRENT_EPOCH)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCurrentEpoch(BigDecimal currentEpoch) {
        this.currentEpoch = currentEpoch;
    }

    public ChainInfoResponseDto epochElapsed(BigDecimal epochElapsed) {
        this.epochElapsed = epochElapsed;
        return this;
    }

    /**
     * The percentage of time that has elapsed within the current epoch, represented as a decimal
     * value between 0 and 1.
     *
     * @return epochElapsed
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_EPOCH_ELAPSED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getEpochElapsed() {
        return epochElapsed;
    }

    @JsonProperty(JSON_PROPERTY_EPOCH_ELAPSED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEpochElapsed(BigDecimal epochElapsed) {
        this.epochElapsed = epochElapsed;
    }

    public ChainInfoResponseDto epochDuration(BigDecimal epochDuration) {
        this.epochDuration = epochDuration;
        return this;
    }

    /**
     * The total duration in milliseconds of a single epoch.
     *
     * @return epochDuration
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_EPOCH_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getEpochDuration() {
        return epochDuration;
    }

    @JsonProperty(JSON_PROPERTY_EPOCH_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEpochDuration(BigDecimal epochDuration) {
        this.epochDuration = epochDuration;
    }

    public ChainInfoResponseDto additionalInfo(AdditionalInfoDto additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * Additional information related to the blockchain. This may include extra details about the
     * blockchain network.
     *
     * @return additionalInfo
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public AdditionalInfoDto getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAdditionalInfo(AdditionalInfoDto additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** Return true if this ChainInfoResponseDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChainInfoResponseDto chainInfoResponseDto = (ChainInfoResponseDto) o;
        return Objects.equals(this.chainDescriptor, chainInfoResponseDto.chainDescriptor)
                && Objects.equals(this.currentEpoch, chainInfoResponseDto.currentEpoch)
                && Objects.equals(this.epochElapsed, chainInfoResponseDto.epochElapsed)
                && Objects.equals(this.epochDuration, chainInfoResponseDto.epochDuration)
                && Objects.equals(this.additionalInfo, chainInfoResponseDto.additionalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                chainDescriptor, currentEpoch, epochElapsed, epochDuration, additionalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChainInfoResponseDto {\n");
        sb.append("    chainDescriptor: ").append(toIndentedString(chainDescriptor)).append("\n");
        sb.append("    currentEpoch: ").append(toIndentedString(currentEpoch)).append("\n");
        sb.append("    epochElapsed: ").append(toIndentedString(epochElapsed)).append("\n");
        sb.append("    epochDuration: ").append(toIndentedString(epochDuration)).append("\n");
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

        // add `chainDescriptor` to the URL query string
        if (getChainDescriptor() != null) {
            joiner.add(
                    String.format(
                            "%schainDescriptor%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getChainDescriptor()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `currentEpoch` to the URL query string
        if (getCurrentEpoch() != null) {
            joiner.add(
                    String.format(
                            "%scurrentEpoch%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCurrentEpoch()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `epochElapsed` to the URL query string
        if (getEpochElapsed() != null) {
            joiner.add(
                    String.format(
                            "%sepochElapsed%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getEpochElapsed()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `epochDuration` to the URL query string
        if (getEpochDuration() != null) {
            joiner.add(
                    String.format(
                            "%sepochDuration%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getEpochDuration()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `additionalInfo` to the URL query string
        if (getAdditionalInfo() != null) {
            joiner.add(getAdditionalInfo().toUrlQueryString(prefix + "additionalInfo" + suffix));
        }

        return joiner.toString();
    }
}
