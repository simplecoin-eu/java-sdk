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
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

/** ConversionOperationFailure */
@JsonPropertyOrder({
    ConversionOperationFailure.JSON_PROPERTY_REASON,
    ConversionOperationFailure.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionOperationFailure {
    /** Gets or Sets reason */
    public enum ReasonEnum {
        INVALID_AMOUNT("INVALID_AMOUNT"),

        SLIPPAGE_EXCEEDED("SLIPPAGE_EXCEEDED"),

        AMOUNT_TOO_SMALL("AMOUNT_TOO_SMALL"),

        INSUFFICIENT_FUNDS("INSUFFICIENT_FUNDS");

        private String value;

        ReasonEnum(String value) {
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
        public static ReasonEnum fromValue(String value) {
            for (ReasonEnum b : ReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_REASON = "reason";
    private ReasonEnum reason;

    public static final String JSON_PROPERTY_DATA = "data";
    private Map<String, Object> data = new HashMap<>();

    public ConversionOperationFailure() {}

    public ConversionOperationFailure reason(ReasonEnum reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ReasonEnum getReason() {
        return reason;
    }

    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setReason(ReasonEnum reason) {
        this.reason = reason;
    }

    public ConversionOperationFailure data(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public ConversionOperationFailure putDataItem(String key, Object dataItem) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        this.data.put(key, dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, Object> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    /** Return true if this ConversionOperationFailure object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConversionOperationFailure conversionOperationFailure = (ConversionOperationFailure) o;
        return Objects.equals(this.reason, conversionOperationFailure.reason)
                && Objects.equals(this.data, conversionOperationFailure.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionOperationFailure {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

        // add `reason` to the URL query string
        if (getReason() != null) {
            joiner.add(
                    String.format(
                            "%sreason%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getReason()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `data` to the URL query string
        if (getData() != null) {
            for (String _key : getData().keySet()) {
                joiner.add(
                        String.format(
                                "%sdata%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, _key, containerSuffix),
                                getData().get(_key),
                                URLEncoder.encode(
                                                String.valueOf(getData().get(_key)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        return joiner.toString();
    }
}
