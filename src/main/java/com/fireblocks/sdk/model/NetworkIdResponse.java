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

/** NetworkIdResponse */
@JsonPropertyOrder({
    NetworkIdResponse.JSON_PROPERTY_ID,
    NetworkIdResponse.JSON_PROPERTY_NAME,
    NetworkIdResponse.JSON_PROPERTY_ROUTING_POLICY,
    NetworkIdResponse.JSON_PROPERTY_IS_DISCOVERABLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkIdResponse {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_ROUTING_POLICY = "routingPolicy";
    private NetworkIdRoutingPolicy routingPolicy;

    public static final String JSON_PROPERTY_IS_DISCOVERABLE = "isDiscoverable";
    private Boolean isDiscoverable;

    public NetworkIdResponse() {}

    public NetworkIdResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public NetworkIdResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public NetworkIdResponse routingPolicy(NetworkIdRoutingPolicy routingPolicy) {
        this.routingPolicy = routingPolicy;
        return this;
    }

    /**
     * Get routingPolicy
     *
     * @return routingPolicy
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ROUTING_POLICY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public NetworkIdRoutingPolicy getRoutingPolicy() {
        return routingPolicy;
    }

    @JsonProperty(JSON_PROPERTY_ROUTING_POLICY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRoutingPolicy(NetworkIdRoutingPolicy routingPolicy) {
        this.routingPolicy = routingPolicy;
    }

    public NetworkIdResponse isDiscoverable(Boolean isDiscoverable) {
        this.isDiscoverable = isDiscoverable;
        return this;
    }

    /**
     * The specific network is discoverable.
     *
     * @return isDiscoverable
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_IS_DISCOVERABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsDiscoverable() {
        return isDiscoverable;
    }

    @JsonProperty(JSON_PROPERTY_IS_DISCOVERABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsDiscoverable(Boolean isDiscoverable) {
        this.isDiscoverable = isDiscoverable;
    }

    /** Return true if this NetworkIdResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetworkIdResponse networkIdResponse = (NetworkIdResponse) o;
        return Objects.equals(this.id, networkIdResponse.id)
                && Objects.equals(this.name, networkIdResponse.name)
                && Objects.equals(this.routingPolicy, networkIdResponse.routingPolicy)
                && Objects.equals(this.isDiscoverable, networkIdResponse.isDiscoverable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, routingPolicy, isDiscoverable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkIdResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    routingPolicy: ").append(toIndentedString(routingPolicy)).append("\n");
        sb.append("    isDiscoverable: ").append(toIndentedString(isDiscoverable)).append("\n");
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

        // add `id` to the URL query string
        if (getId() != null) {
            joiner.add(
                    String.format(
                            "%sid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(
                    String.format(
                            "%sname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `routingPolicy` to the URL query string
        if (getRoutingPolicy() != null) {
            joiner.add(getRoutingPolicy().toUrlQueryString(prefix + "routingPolicy" + suffix));
        }

        // add `isDiscoverable` to the URL query string
        if (getIsDiscoverable() != null) {
            joiner.add(
                    String.format(
                            "%sisDiscoverable%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getIsDiscoverable()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
