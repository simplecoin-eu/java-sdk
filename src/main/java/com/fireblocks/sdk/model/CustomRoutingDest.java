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
import java.util.Objects;
import java.util.StringJoiner;

/** CustomRoutingDest */
@JsonPropertyOrder({
    CustomRoutingDest.JSON_PROPERTY_SCHEME,
    CustomRoutingDest.JSON_PROPERTY_DST_TYPE,
    CustomRoutingDest.JSON_PROPERTY_DST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomRoutingDest {
    /** The network routing logic. */
    public enum SchemeEnum {
        CUSTOM("CUSTOM");

        private String value;

        SchemeEnum(String value) {
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
        public static SchemeEnum fromValue(String value) {
            for (SchemeEnum b : SchemeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_SCHEME = "scheme";
    private SchemeEnum scheme;

    /** The account the funds are being sent to. */
    public enum DstTypeEnum {
        FIAT_ACCOUNT("FIAT_ACCOUNT"),

        VAULT("VAULT"),

        EXCHANGE("EXCHANGE");

        private String value;

        DstTypeEnum(String value) {
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
        public static DstTypeEnum fromValue(String value) {
            for (DstTypeEnum b : DstTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_DST_TYPE = "dstType";
    private DstTypeEnum dstType;

    public static final String JSON_PROPERTY_DST_ID = "dstId";
    private String dstId;

    public CustomRoutingDest() {}

    public CustomRoutingDest scheme(SchemeEnum scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * The network routing logic.
     *
     * @return scheme
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SCHEME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public SchemeEnum getScheme() {
        return scheme;
    }

    @JsonProperty(JSON_PROPERTY_SCHEME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setScheme(SchemeEnum scheme) {
        this.scheme = scheme;
    }

    public CustomRoutingDest dstType(DstTypeEnum dstType) {
        this.dstType = dstType;
        return this;
    }

    /**
     * The account the funds are being sent to.
     *
     * @return dstType
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DST_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public DstTypeEnum getDstType() {
        return dstType;
    }

    @JsonProperty(JSON_PROPERTY_DST_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDstType(DstTypeEnum dstType) {
        this.dstType = dstType;
    }

    public CustomRoutingDest dstId(String dstId) {
        this.dstId = dstId;
        return this;
    }

    /**
     * The ID of the account the funds are being sent to.
     *
     * @return dstId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DST_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDstId() {
        return dstId;
    }

    @JsonProperty(JSON_PROPERTY_DST_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDstId(String dstId) {
        this.dstId = dstId;
    }

    /** Return true if this CustomRoutingDest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomRoutingDest customRoutingDest = (CustomRoutingDest) o;
        return Objects.equals(this.scheme, customRoutingDest.scheme)
                && Objects.equals(this.dstType, customRoutingDest.dstType)
                && Objects.equals(this.dstId, customRoutingDest.dstId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheme, dstType, dstId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomRoutingDest {\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
        sb.append("    dstType: ").append(toIndentedString(dstType)).append("\n");
        sb.append("    dstId: ").append(toIndentedString(dstId)).append("\n");
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

        // add `scheme` to the URL query string
        if (getScheme() != null) {
            joiner.add(
                    String.format(
                            "%sscheme%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getScheme()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `dstType` to the URL query string
        if (getDstType() != null) {
            joiner.add(
                    String.format(
                            "%sdstType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getDstType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `dstId` to the URL query string
        if (getDstId() != null) {
            joiner.add(
                    String.format(
                            "%sdstId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getDstId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
