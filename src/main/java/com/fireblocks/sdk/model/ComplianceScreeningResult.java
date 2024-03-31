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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** ComplianceScreeningResult */
@JsonPropertyOrder({
    ComplianceScreeningResult.JSON_PROPERTY_PROVIDER,
    ComplianceScreeningResult.JSON_PROPERTY_PAYLOAD,
    ComplianceScreeningResult.JSON_PROPERTY_BYPASS_REASON,
    ComplianceScreeningResult.JSON_PROPERTY_SCREENING_STATUS,
    ComplianceScreeningResult.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComplianceScreeningResult {
    public static final String JSON_PROPERTY_PROVIDER = "provider";
    private String provider;

    public static final String JSON_PROPERTY_PAYLOAD = "payload";
    private Object payload;

    public static final String JSON_PROPERTY_BYPASS_REASON = "bypassReason";
    private String bypassReason;

    /** Gets or Sets screeningStatus */
    public enum ScreeningStatusEnum {
        COMPLETED("COMPLETED"),

        PENDING("PENDING"),

        BYPASSED("BYPASSED"),

        FAILED("FAILED"),

        FROZEN("FROZEN");

        private String value;

        ScreeningStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScreeningStatusEnum fromValue(String value) {
            for (ScreeningStatusEnum b : ScreeningStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_SCREENING_STATUS = "screeningStatus";
    private ScreeningStatusEnum screeningStatus;

    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    private BigDecimal timestamp;

    public ComplianceScreeningResult() {}

    public ComplianceScreeningResult provider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get provider
     *
     * @return provider
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PROVIDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProvider() {
        return provider;
    }

    @JsonProperty(JSON_PROPERTY_PROVIDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ComplianceScreeningResult payload(Object payload) {
        this.payload = payload;
        return this;
    }

    /**
     * The payload of the screening result. The payload is a JSON object that contains the screening
     * result. The payload is different for each screening provider.
     *
     * @return payload
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PAYLOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getPayload() {
        return payload;
    }

    @JsonProperty(JSON_PROPERTY_PAYLOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public ComplianceScreeningResult bypassReason(String bypassReason) {
        this.bypassReason = bypassReason;
        return this;
    }

    /**
     * Get bypassReason
     *
     * @return bypassReason
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BYPASS_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBypassReason() {
        return bypassReason;
    }

    @JsonProperty(JSON_PROPERTY_BYPASS_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBypassReason(String bypassReason) {
        this.bypassReason = bypassReason;
    }

    public ComplianceScreeningResult screeningStatus(ScreeningStatusEnum screeningStatus) {
        this.screeningStatus = screeningStatus;
        return this;
    }

    /**
     * Get screeningStatus
     *
     * @return screeningStatus
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SCREENING_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ScreeningStatusEnum getScreeningStatus() {
        return screeningStatus;
    }

    @JsonProperty(JSON_PROPERTY_SCREENING_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setScreeningStatus(ScreeningStatusEnum screeningStatus) {
        this.screeningStatus = screeningStatus;
    }

    public ComplianceScreeningResult timestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getTimestamp() {
        return timestamp;
    }

    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    /** Return true if this ComplianceScreeningResult object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplianceScreeningResult complianceScreeningResult = (ComplianceScreeningResult) o;
        return Objects.equals(this.provider, complianceScreeningResult.provider)
                && Objects.equals(this.payload, complianceScreeningResult.payload)
                && Objects.equals(this.bypassReason, complianceScreeningResult.bypassReason)
                && Objects.equals(this.screeningStatus, complianceScreeningResult.screeningStatus)
                && Objects.equals(this.timestamp, complianceScreeningResult.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, payload, bypassReason, screeningStatus, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComplianceScreeningResult {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    bypassReason: ").append(toIndentedString(bypassReason)).append("\n");
        sb.append("    screeningStatus: ").append(toIndentedString(screeningStatus)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

        // add `provider` to the URL query string
        if (getProvider() != null) {
            joiner.add(
                    String.format(
                            "%sprovider%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getProvider()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `payload` to the URL query string
        if (getPayload() != null) {
            joiner.add(
                    String.format(
                            "%spayload%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getPayload()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `bypassReason` to the URL query string
        if (getBypassReason() != null) {
            joiner.add(
                    String.format(
                            "%sbypassReason%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBypassReason()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `screeningStatus` to the URL query string
        if (getScreeningStatus() != null) {
            joiner.add(
                    String.format(
                            "%sscreeningStatus%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getScreeningStatus()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `timestamp` to the URL query string
        if (getTimestamp() != null) {
            joiner.add(
                    String.format(
                            "%stimestamp%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTimestamp()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
