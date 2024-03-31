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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The information about your [Transaction Authorization Policy
 * (TAP).](https://developers.fireblocks.com/docs/capabilities#transaction-authorization-policy-tap)
 */
@JsonPropertyOrder({
    AuthorizationInfo.JSON_PROPERTY_ALLOW_OPERATOR_AS_AUTHORIZER,
    AuthorizationInfo.JSON_PROPERTY_LOGIC,
    AuthorizationInfo.JSON_PROPERTY_GROUPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthorizationInfo {
    public static final String JSON_PROPERTY_ALLOW_OPERATOR_AS_AUTHORIZER =
            "allowOperatorAsAuthorizer";
    private Boolean allowOperatorAsAuthorizer;

    /** Gets or Sets logic */
    public enum LogicEnum {
        AND("AND"),

        OR("OR");

        private String value;

        LogicEnum(String value) {
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
        public static LogicEnum fromValue(String value) {
            for (LogicEnum b : LogicEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_LOGIC = "logic";
    private LogicEnum logic;

    public static final String JSON_PROPERTY_GROUPS = "groups";
    private List<AuthorizationGroups> groups;

    public AuthorizationInfo() {}

    public AuthorizationInfo allowOperatorAsAuthorizer(Boolean allowOperatorAsAuthorizer) {
        this.allowOperatorAsAuthorizer = allowOperatorAsAuthorizer;
        return this;
    }

    /**
     * Get allowOperatorAsAuthorizer
     *
     * @return allowOperatorAsAuthorizer
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ALLOW_OPERATOR_AS_AUTHORIZER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAllowOperatorAsAuthorizer() {
        return allowOperatorAsAuthorizer;
    }

    @JsonProperty(JSON_PROPERTY_ALLOW_OPERATOR_AS_AUTHORIZER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAllowOperatorAsAuthorizer(Boolean allowOperatorAsAuthorizer) {
        this.allowOperatorAsAuthorizer = allowOperatorAsAuthorizer;
    }

    public AuthorizationInfo logic(LogicEnum logic) {
        this.logic = logic;
        return this;
    }

    /**
     * Get logic
     *
     * @return logic
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LOGIC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LogicEnum getLogic() {
        return logic;
    }

    @JsonProperty(JSON_PROPERTY_LOGIC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLogic(LogicEnum logic) {
        this.logic = logic;
    }

    public AuthorizationInfo groups(List<AuthorizationGroups> groups) {
        this.groups = groups;
        return this;
    }

    public AuthorizationInfo addGroupsItem(AuthorizationGroups groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * Get groups
     *
     * @return groups
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_GROUPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<AuthorizationGroups> getGroups() {
        return groups;
    }

    @JsonProperty(JSON_PROPERTY_GROUPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGroups(List<AuthorizationGroups> groups) {
        this.groups = groups;
    }

    /** Return true if this AuthorizationInfo object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizationInfo authorizationInfo = (AuthorizationInfo) o;
        return Objects.equals(
                        this.allowOperatorAsAuthorizer, authorizationInfo.allowOperatorAsAuthorizer)
                && Objects.equals(this.logic, authorizationInfo.logic)
                && Objects.equals(this.groups, authorizationInfo.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowOperatorAsAuthorizer, logic, groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationInfo {\n");
        sb.append("    allowOperatorAsAuthorizer: ")
                .append(toIndentedString(allowOperatorAsAuthorizer))
                .append("\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

        // add `allowOperatorAsAuthorizer` to the URL query string
        if (getAllowOperatorAsAuthorizer() != null) {
            joiner.add(
                    String.format(
                            "%sallowOperatorAsAuthorizer%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getAllowOperatorAsAuthorizer()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `logic` to the URL query string
        if (getLogic() != null) {
            joiner.add(
                    String.format(
                            "%slogic%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getLogic()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `groups` to the URL query string
        if (getGroups() != null) {
            for (int i = 0; i < getGroups().size(); i++) {
                if (getGroups().get(i) != null) {
                    joiner.add(
                            getGroups()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sgroups%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }
}
