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

/** AdditionalInfoDto */
@JsonPropertyOrder({
    AdditionalInfoDto.JSON_PROPERTY_ESTIMATED_ANNUAL_REWARD,
    AdditionalInfoDto.JSON_PROPERTY_LOCKUP_PERIOD,
    AdditionalInfoDto.JSON_PROPERTY_ACTIVATION_PERIOD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdditionalInfoDto {
    public static final String JSON_PROPERTY_ESTIMATED_ANNUAL_REWARD = "estimatedAnnualReward";
    private BigDecimal estimatedAnnualReward;

    public static final String JSON_PROPERTY_LOCKUP_PERIOD = "lockupPeriod";
    private BigDecimal lockupPeriod;

    public static final String JSON_PROPERTY_ACTIVATION_PERIOD = "activationPeriod";
    private BigDecimal activationPeriod;

    public AdditionalInfoDto() {}

    public AdditionalInfoDto estimatedAnnualReward(BigDecimal estimatedAnnualReward) {
        this.estimatedAnnualReward = estimatedAnnualReward;
        return this;
    }

    /**
     * The estimated annual reward rate for the blockchain, represented as a decimal percentage
     * value.
     *
     * @return estimatedAnnualReward
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ESTIMATED_ANNUAL_REWARD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getEstimatedAnnualReward() {
        return estimatedAnnualReward;
    }

    @JsonProperty(JSON_PROPERTY_ESTIMATED_ANNUAL_REWARD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEstimatedAnnualReward(BigDecimal estimatedAnnualReward) {
        this.estimatedAnnualReward = estimatedAnnualReward;
    }

    public AdditionalInfoDto lockupPeriod(BigDecimal lockupPeriod) {
        this.lockupPeriod = lockupPeriod;
        return this;
    }

    /**
     * The duration of the lockup period for certain actions on the blockchain, measured in
     * milliseconds.
     *
     * @return lockupPeriod
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_LOCKUP_PERIOD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getLockupPeriod() {
        return lockupPeriod;
    }

    @JsonProperty(JSON_PROPERTY_LOCKUP_PERIOD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLockupPeriod(BigDecimal lockupPeriod) {
        this.lockupPeriod = lockupPeriod;
    }

    public AdditionalInfoDto activationPeriod(BigDecimal activationPeriod) {
        this.activationPeriod = activationPeriod;
        return this;
    }

    /**
     * The duration of the activation period for certain actions on the blockchain, measured in
     * milliseconds.
     *
     * @return activationPeriod
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ACTIVATION_PERIOD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getActivationPeriod() {
        return activationPeriod;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVATION_PERIOD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setActivationPeriod(BigDecimal activationPeriod) {
        this.activationPeriod = activationPeriod;
    }

    /** Return true if this AdditionalInfoDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdditionalInfoDto additionalInfoDto = (AdditionalInfoDto) o;
        return Objects.equals(this.estimatedAnnualReward, additionalInfoDto.estimatedAnnualReward)
                && Objects.equals(this.lockupPeriod, additionalInfoDto.lockupPeriod)
                && Objects.equals(this.activationPeriod, additionalInfoDto.activationPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estimatedAnnualReward, lockupPeriod, activationPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalInfoDto {\n");
        sb.append("    estimatedAnnualReward: ")
                .append(toIndentedString(estimatedAnnualReward))
                .append("\n");
        sb.append("    lockupPeriod: ").append(toIndentedString(lockupPeriod)).append("\n");
        sb.append("    activationPeriod: ").append(toIndentedString(activationPeriod)).append("\n");
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

        // add `estimatedAnnualReward` to the URL query string
        if (getEstimatedAnnualReward() != null) {
            joiner.add(
                    String.format(
                            "%sestimatedAnnualReward%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getEstimatedAnnualReward()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `lockupPeriod` to the URL query string
        if (getLockupPeriod() != null) {
            joiner.add(
                    String.format(
                            "%slockupPeriod%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getLockupPeriod()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `activationPeriod` to the URL query string
        if (getActivationPeriod() != null) {
            joiner.add(
                    String.format(
                            "%sactivationPeriod%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getActivationPeriod()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
