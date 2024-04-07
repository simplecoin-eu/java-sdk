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

/** InternalTransferResponse */
@JsonPropertyOrder({InternalTransferResponse.JSON_PROPERTY_SUCCESS})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InternalTransferResponse {
    public static final String JSON_PROPERTY_SUCCESS = "success";
    private Boolean success;

    public InternalTransferResponse() {}

    public InternalTransferResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Indicates whether the transfer was successful
     *
     * @return success
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SUCCESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty(JSON_PROPERTY_SUCCESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /** Return true if this InternalTransferResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InternalTransferResponse internalTransferResponse = (InternalTransferResponse) o;
        return Objects.equals(this.success, internalTransferResponse.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InternalTransferResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

        // add `success` to the URL query string
        if (getSuccess() != null) {
            joiner.add(
                    String.format(
                            "%ssuccess%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getSuccess()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
