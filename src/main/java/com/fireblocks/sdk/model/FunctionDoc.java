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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

/** FunctionDoc */
@JsonPropertyOrder({
    FunctionDoc.JSON_PROPERTY_DETAILS,
    FunctionDoc.JSON_PROPERTY_PARAMS,
    FunctionDoc.JSON_PROPERTY_RETURNS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FunctionDoc {
    public static final String JSON_PROPERTY_DETAILS = "details";
    private String details;

    public static final String JSON_PROPERTY_PARAMS = "params";
    private Map<String, String> params = new HashMap<>();

    public static final String JSON_PROPERTY_RETURNS = "returns";
    private Map<String, String> returns = new HashMap<>();

    public FunctionDoc() {}

    public FunctionDoc details(String details) {
        this.details = details;
        return this;
    }

    /**
     * A description of the function
     *
     * @return details
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDetails() {
        return details;
    }

    @JsonProperty(JSON_PROPERTY_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDetails(String details) {
        this.details = details;
    }

    public FunctionDoc params(Map<String, String> params) {
        this.params = params;
        return this;
    }

    public FunctionDoc putParamsItem(String key, String paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    /**
     * A description of the function parameters
     *
     * @return params
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, String> getParams() {
        return params;
    }

    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public FunctionDoc returns(Map<String, String> returns) {
        this.returns = returns;
        return this;
    }

    public FunctionDoc putReturnsItem(String key, String returnsItem) {
        if (this.returns == null) {
            this.returns = new HashMap<>();
        }
        this.returns.put(key, returnsItem);
        return this;
    }

    /**
     * A description of the function return values. only for read functions
     *
     * @return returns
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_RETURNS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, String> getReturns() {
        return returns;
    }

    @JsonProperty(JSON_PROPERTY_RETURNS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReturns(Map<String, String> returns) {
        this.returns = returns;
    }

    /** Return true if this FunctionDoc object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctionDoc functionDoc = (FunctionDoc) o;
        return Objects.equals(this.details, functionDoc.details)
                && Objects.equals(this.params, functionDoc.params)
                && Objects.equals(this.returns, functionDoc.returns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(details, params, returns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionDoc {\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
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

        // add `details` to the URL query string
        if (getDetails() != null) {
            joiner.add(
                    String.format(
                            "%sdetails%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getDetails()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `params` to the URL query string
        if (getParams() != null) {
            for (String _key : getParams().keySet()) {
                joiner.add(
                        String.format(
                                "%sparams%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, _key, containerSuffix),
                                getParams().get(_key),
                                URLEncoder.encode(
                                                String.valueOf(getParams().get(_key)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `returns` to the URL query string
        if (getReturns() != null) {
            for (String _key : getReturns().keySet()) {
                joiner.add(
                        String.format(
                                "%sreturns%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, _key, containerSuffix),
                                getReturns().get(_key),
                                URLEncoder.encode(
                                                String.valueOf(getReturns().get(_key)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        return joiner.toString();
    }
}
