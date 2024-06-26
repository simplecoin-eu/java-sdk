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

/** UnmanagedWallet */
@JsonPropertyOrder({
    UnmanagedWallet.JSON_PROPERTY_ID,
    UnmanagedWallet.JSON_PROPERTY_NAME,
    UnmanagedWallet.JSON_PROPERTY_CUSTOMER_REF_ID,
    UnmanagedWallet.JSON_PROPERTY_ASSETS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnmanagedWallet {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_CUSTOMER_REF_ID = "customerRefId";
    private String customerRefId;

    public static final String JSON_PROPERTY_ASSETS = "assets";
    private List<WalletAsset> assets = new ArrayList<>();

    public UnmanagedWallet() {}

    public UnmanagedWallet id(String id) {
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

    public UnmanagedWallet name(String name) {
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

    public UnmanagedWallet customerRefId(String customerRefId) {
        this.customerRefId = customerRefId;
        return this;
    }

    /**
     * Get customerRefId
     *
     * @return customerRefId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CUSTOMER_REF_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCustomerRefId() {
        return customerRefId;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOMER_REF_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomerRefId(String customerRefId) {
        this.customerRefId = customerRefId;
    }

    public UnmanagedWallet assets(List<WalletAsset> assets) {
        this.assets = assets;
        return this;
    }

    public UnmanagedWallet addAssetsItem(WalletAsset assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    /**
     * Get assets
     *
     * @return assets
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ASSETS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<WalletAsset> getAssets() {
        return assets;
    }

    @JsonProperty(JSON_PROPERTY_ASSETS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAssets(List<WalletAsset> assets) {
        this.assets = assets;
    }

    /** Return true if this UnmanagedWallet object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnmanagedWallet unmanagedWallet = (UnmanagedWallet) o;
        return Objects.equals(this.id, unmanagedWallet.id)
                && Objects.equals(this.name, unmanagedWallet.name)
                && Objects.equals(this.customerRefId, unmanagedWallet.customerRefId)
                && Objects.equals(this.assets, unmanagedWallet.assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, customerRefId, assets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnmanagedWallet {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    customerRefId: ").append(toIndentedString(customerRefId)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

        // add `customerRefId` to the URL query string
        if (getCustomerRefId() != null) {
            joiner.add(
                    String.format(
                            "%scustomerRefId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCustomerRefId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `assets` to the URL query string
        if (getAssets() != null) {
            for (int i = 0; i < getAssets().size(); i++) {
                if (getAssets().get(i) != null) {
                    joiner.add(
                            getAssets()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sassets%s%s",
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
