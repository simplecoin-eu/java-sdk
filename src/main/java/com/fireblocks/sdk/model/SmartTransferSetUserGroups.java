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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** SmartTransferSetUserGroups */
@JsonPropertyOrder({SmartTransferSetUserGroups.JSON_PROPERTY_USER_GROUP_IDS})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SmartTransferSetUserGroups {
    public static final String JSON_PROPERTY_USER_GROUP_IDS = "userGroupIds";
    private List<String> userGroupIds = new ArrayList<>();

    public SmartTransferSetUserGroups() {}

    public SmartTransferSetUserGroups userGroupIds(List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }

    public SmartTransferSetUserGroups addUserGroupIdsItem(String userGroupIdsItem) {
        if (this.userGroupIds == null) {
            this.userGroupIds = new ArrayList<>();
        }
        this.userGroupIds.add(userGroupIdsItem);
        return this;
    }

    /**
     * Get userGroupIds
     *
     * @return userGroupIds
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_USER_GROUP_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getUserGroupIds() {
        return userGroupIds;
    }

    @JsonProperty(JSON_PROPERTY_USER_GROUP_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUserGroupIds(List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
    }

    /** Return true if this SmartTransferSetUserGroups object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmartTransferSetUserGroups smartTransferSetUserGroups = (SmartTransferSetUserGroups) o;
        return Objects.equals(this.userGroupIds, smartTransferSetUserGroups.userGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userGroupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartTransferSetUserGroups {\n");
        sb.append("    userGroupIds: ").append(toIndentedString(userGroupIds)).append("\n");
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

        // add `userGroupIds` to the URL query string
        if (getUserGroupIds() != null) {
            for (int i = 0; i < getUserGroupIds().size(); i++) {
                joiner.add(
                        String.format(
                                "%suserGroupIds%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                String.valueOf(getUserGroupIds().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        return joiner.toString();
    }
}
