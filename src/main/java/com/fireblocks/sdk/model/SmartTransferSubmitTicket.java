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

/** SmartTransferSubmitTicket */
@JsonPropertyOrder({SmartTransferSubmitTicket.JSON_PROPERTY_EXPIRES_IN})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SmartTransferSubmitTicket {
    public static final String JSON_PROPERTY_EXPIRES_IN = "expiresIn";
    private BigDecimal expiresIn;

    public SmartTransferSubmitTicket() {}

    public SmartTransferSubmitTicket expiresIn(BigDecimal expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Sets the ticket expiration time (in hours) after the ticket is submitted. If no funding
     * source is set for any term, the ticket will automatically expire after given time. If
     * expiresIn is not sent ticket will not expire. minimum: 1 maximum: 48
     *
     * @return expiresIn
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getExpiresIn() {
        return expiresIn;
    }

    @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExpiresIn(BigDecimal expiresIn) {
        this.expiresIn = expiresIn;
    }

    /** Return true if this SmartTransferSubmitTicket object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmartTransferSubmitTicket smartTransferSubmitTicket = (SmartTransferSubmitTicket) o;
        return Objects.equals(this.expiresIn, smartTransferSubmitTicket.expiresIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiresIn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartTransferSubmitTicket {\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

        // add `expiresIn` to the URL query string
        if (getExpiresIn() != null) {
            joiner.add(
                    String.format(
                            "%sexpiresIn%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getExpiresIn()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
