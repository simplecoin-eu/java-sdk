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

/** CreateTransferConfigOperationRequest */
@JsonPropertyOrder({
    CreateTransferConfigOperationRequest.JSON_PROPERTY_TYPE,
    CreateTransferConfigOperationRequest.JSON_PROPERTY_PARAMS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTransferConfigOperationRequest {
    public static final String JSON_PROPERTY_TYPE = "type";
    private TransferOperationType type;

    public static final String JSON_PROPERTY_PARAMS = "params";
    private TransferOperationConfigParams params;

    public CreateTransferConfigOperationRequest() {}

    public CreateTransferConfigOperationRequest type(TransferOperationType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TransferOperationType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TransferOperationType type) {
        this.type = type;
    }

    public CreateTransferConfigOperationRequest params(TransferOperationConfigParams params) {
        this.params = params;
        return this;
    }

    /**
     * Get params
     *
     * @return params
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TransferOperationConfigParams getParams() {
        return params;
    }

    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setParams(TransferOperationConfigParams params) {
        this.params = params;
    }

    /** Return true if this CreateTransferConfigOperationRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransferConfigOperationRequest createTransferConfigOperationRequest =
                (CreateTransferConfigOperationRequest) o;
        return Objects.equals(this.type, createTransferConfigOperationRequest.type)
                && Objects.equals(this.params, createTransferConfigOperationRequest.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransferConfigOperationRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

        // add `type` to the URL query string
        if (getType() != null) {
            joiner.add(
                    String.format(
                            "%stype%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `params` to the URL query string
        if (getParams() != null) {
            joiner.add(getParams().toUrlQueryString(prefix + "params" + suffix));
        }

        return joiner.toString();
    }
}
