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

/** CreateUserGroupResponse */
@JsonPropertyOrder({
    CreateUserGroupResponse.JSON_PROPERTY_ID,
    CreateUserGroupResponse.JSON_PROPERTY_NAME,
    CreateUserGroupResponse.JSON_PROPERTY_MEMBER_IDS,
    CreateUserGroupResponse.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateUserGroupResponse {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_MEMBER_IDS = "memberIds";
    private List<String> memberIds;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public CreateUserGroupResponse() {}

    public CreateUserGroupResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
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

    public CreateUserGroupResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
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

    public CreateUserGroupResponse memberIds(List<String> memberIds) {
        this.memberIds = memberIds;
        return this;
    }

    public CreateUserGroupResponse addMemberIdsItem(String memberIdsItem) {
        if (this.memberIds == null) {
            this.memberIds = new ArrayList<>();
        }
        this.memberIds.add(memberIdsItem);
        return this;
    }

    /**
     * Get memberIds
     *
     * @return memberIds
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_MEMBER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getMemberIds() {
        return memberIds;
    }

    @JsonProperty(JSON_PROPERTY_MEMBER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }

    public CreateUserGroupResponse status(String status) {
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
    public String getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(String status) {
        this.status = status;
    }

    /** Return true if this CreateUserGroupResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUserGroupResponse createUserGroupResponse = (CreateUserGroupResponse) o;
        return Objects.equals(this.id, createUserGroupResponse.id)
                && Objects.equals(this.name, createUserGroupResponse.name)
                && Objects.equals(this.memberIds, createUserGroupResponse.memberIds)
                && Objects.equals(this.status, createUserGroupResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, memberIds, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserGroupResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    memberIds: ").append(toIndentedString(memberIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

        // add `memberIds` to the URL query string
        if (getMemberIds() != null) {
            for (int i = 0; i < getMemberIds().size(); i++) {
                joiner.add(
                        String.format(
                                "%smemberIds%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                String.valueOf(getMemberIds().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
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

        return joiner.toString();
    }
}