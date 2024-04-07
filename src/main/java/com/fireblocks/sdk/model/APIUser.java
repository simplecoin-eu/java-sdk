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

/** APIUser */
@JsonPropertyOrder({
    APIUser.JSON_PROPERTY_ID,
    APIUser.JSON_PROPERTY_NAME,
    APIUser.JSON_PROPERTY_ROLE,
    APIUser.JSON_PROPERTY_ENABLED,
    APIUser.JSON_PROPERTY_STATUS,
    APIUser.JSON_PROPERTY_USER_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIUser {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_ROLE = "role";
    private UserRole role;

    public static final String JSON_PROPERTY_ENABLED = "enabled";
    private Boolean enabled;

    public static final String JSON_PROPERTY_STATUS = "status";
    private UserStatus status;

    public static final String JSON_PROPERTY_USER_TYPE = "userType";
    private UserType userType;

    public APIUser() {}

    public APIUser id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the user
     *
     * @return id
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public APIUser name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the user
     *
     * @return name
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public APIUser role(UserRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get role
     *
     * @return role
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ROLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UserRole getRole() {
        return role;
    }

    @JsonProperty(JSON_PROPERTY_ROLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRole(UserRole role) {
        this.role = role;
    }

    public APIUser enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Whether the user is enabled
     *
     * @return enabled
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public APIUser status(UserStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UserStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public APIUser userType(UserType userType) {
        this.userType = userType;
        return this;
    }

    /**
     * Get userType
     *
     * @return userType
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_USER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UserType getUserType() {
        return userType;
    }

    @JsonProperty(JSON_PROPERTY_USER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    /** Return true if this APIUser object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        APIUser apIUser = (APIUser) o;
        return Objects.equals(this.id, apIUser.id)
                && Objects.equals(this.name, apIUser.name)
                && Objects.equals(this.role, apIUser.role)
                && Objects.equals(this.enabled, apIUser.enabled)
                && Objects.equals(this.status, apIUser.status)
                && Objects.equals(this.userType, apIUser.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, enabled, status, userType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class APIUser {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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

        // add `role` to the URL query string
        if (getRole() != null) {
            joiner.add(
                    String.format(
                            "%srole%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getRole()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `enabled` to the URL query string
        if (getEnabled() != null) {
            joiner.add(
                    String.format(
                            "%senabled%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getEnabled()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `status` to the URL query string
        if (getStatus() != null) {
            joiner.add(
                    String.format(
                            "%sstatus%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `userType` to the URL query string
        if (getUserType() != null) {
            joiner.add(
                    String.format(
                            "%suserType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getUserType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
