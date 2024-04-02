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
import java.util.UUID;

/** The source of the transaction. */
@JsonPropertyOrder({
    SourceTransferPeerPath.JSON_PROPERTY_TYPE,
    SourceTransferPeerPath.JSON_PROPERTY_SUB_TYPE,
    SourceTransferPeerPath.JSON_PROPERTY_ID,
    SourceTransferPeerPath.JSON_PROPERTY_NAME,
    SourceTransferPeerPath.JSON_PROPERTY_WALLET_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SourceTransferPeerPath {
    public static final String JSON_PROPERTY_TYPE = "type";
    private TransferPeerPathType type;

    public static final String JSON_PROPERTY_SUB_TYPE = "subType";
    private TransferPeerPathSubType subType;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_WALLET_ID = "walletId";
    private UUID walletId;

    public SourceTransferPeerPath() {}

    public SourceTransferPeerPath type(TransferPeerPathType type) {
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
    public TransferPeerPathType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TransferPeerPathType type) {
        this.type = type;
    }

    public SourceTransferPeerPath subType(TransferPeerPathSubType subType) {
        this.subType = subType;
        return this;
    }

    /**
     * Get subType
     *
     * @return subType
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SUB_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TransferPeerPathSubType getSubType() {
        return subType;
    }

    @JsonProperty(JSON_PROPERTY_SUB_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubType(TransferPeerPathSubType subType) {
        this.subType = subType;
    }

    public SourceTransferPeerPath id(String id) {
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

    public SourceTransferPeerPath name(String name) {
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

    public SourceTransferPeerPath walletId(UUID walletId) {
        this.walletId = walletId;
        return this;
    }

    /**
     * Get walletId
     *
     * @return walletId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_WALLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getWalletId() {
        return walletId;
    }

    @JsonProperty(JSON_PROPERTY_WALLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWalletId(UUID walletId) {
        this.walletId = walletId;
    }

    /** Return true if this SourceTransferPeerPath object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceTransferPeerPath sourceTransferPeerPath = (SourceTransferPeerPath) o;
        return Objects.equals(this.type, sourceTransferPeerPath.type)
                && Objects.equals(this.subType, sourceTransferPeerPath.subType)
                && Objects.equals(this.id, sourceTransferPeerPath.id)
                && Objects.equals(this.name, sourceTransferPeerPath.name)
                && Objects.equals(this.walletId, sourceTransferPeerPath.walletId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, subType, id, name, walletId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceTransferPeerPath {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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

        // add `subType` to the URL query string
        if (getSubType() != null) {
            joiner.add(
                    String.format(
                            "%ssubType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getSubType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

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

        // add `walletId` to the URL query string
        if (getWalletId() != null) {
            joiner.add(
                    String.format(
                            "%swalletId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getWalletId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
