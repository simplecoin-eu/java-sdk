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
import java.util.Objects;
import java.util.StringJoiner;

/** SetRoutingPolicyRequest */
@JsonPropertyOrder({SetRoutingPolicyRequest.JSON_PROPERTY_ROUTING_POLICY})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetRoutingPolicyRequest {
    public static final String JSON_PROPERTY_ROUTING_POLICY = "routingPolicy";
    private NetworkConnectionRoutingPolicy routingPolicy;

    public SetRoutingPolicyRequest() {}

    public SetRoutingPolicyRequest routingPolicy(NetworkConnectionRoutingPolicy routingPolicy) {
        this.routingPolicy = routingPolicy;
        return this;
    }

    /**
     * Get routingPolicy
     *
     * @return routingPolicy
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ROUTING_POLICY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public NetworkConnectionRoutingPolicy getRoutingPolicy() {
        return routingPolicy;
    }

    @JsonProperty(JSON_PROPERTY_ROUTING_POLICY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRoutingPolicy(NetworkConnectionRoutingPolicy routingPolicy) {
        this.routingPolicy = routingPolicy;
    }

    /** Return true if this SetRoutingPolicyRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetRoutingPolicyRequest setRoutingPolicyRequest = (SetRoutingPolicyRequest) o;
        return Objects.equals(this.routingPolicy, setRoutingPolicyRequest.routingPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routingPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRoutingPolicyRequest {\n");
        sb.append("    routingPolicy: ").append(toIndentedString(routingPolicy)).append("\n");
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

        // add `routingPolicy` to the URL query string
        if (getRoutingPolicy() != null) {
            joiner.add(getRoutingPolicy().toUrlQueryString(prefix + "routingPolicy" + suffix));
        }

        return joiner.toString();
    }
}
