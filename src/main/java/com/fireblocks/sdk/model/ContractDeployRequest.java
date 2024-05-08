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

/** ContractDeployRequest */
@JsonPropertyOrder({
    ContractDeployRequest.JSON_PROPERTY_ASSET_ID,
    ContractDeployRequest.JSON_PROPERTY_VAULT_ACCOUNT_ID,
    ContractDeployRequest.JSON_PROPERTY_CONSTRUCTOR_PARAMETERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContractDeployRequest {
    public static final String JSON_PROPERTY_ASSET_ID = "assetId";
    private String assetId;

    public static final String JSON_PROPERTY_VAULT_ACCOUNT_ID = "vaultAccountId";
    private String vaultAccountId;

    public static final String JSON_PROPERTY_CONSTRUCTOR_PARAMETERS = "constructorParameters";
    private List<ParameterWithValue> constructorParameters;

    public ContractDeployRequest() {}

    public ContractDeployRequest assetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * The base asset identifier of the blockchain you want to deploy to
     *
     * @return assetId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAssetId() {
        return assetId;
    }

    @JsonProperty(JSON_PROPERTY_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ContractDeployRequest vaultAccountId(String vaultAccountId) {
        this.vaultAccountId = vaultAccountId;
        return this;
    }

    /**
     * The vault account id you wish to deploy from
     *
     * @return vaultAccountId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getVaultAccountId() {
        return vaultAccountId;
    }

    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVaultAccountId(String vaultAccountId) {
        this.vaultAccountId = vaultAccountId;
    }

    public ContractDeployRequest constructorParameters(
            List<ParameterWithValue> constructorParameters) {
        this.constructorParameters = constructorParameters;
        return this;
    }

    public ContractDeployRequest addConstructorParametersItem(
            ParameterWithValue constructorParametersItem) {
        if (this.constructorParameters == null) {
            this.constructorParameters = new ArrayList<>();
        }
        this.constructorParameters.add(constructorParametersItem);
        return this;
    }

    /**
     * The constructor parameters of this contract
     *
     * @return constructorParameters
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CONSTRUCTOR_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ParameterWithValue> getConstructorParameters() {
        return constructorParameters;
    }

    @JsonProperty(JSON_PROPERTY_CONSTRUCTOR_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConstructorParameters(List<ParameterWithValue> constructorParameters) {
        this.constructorParameters = constructorParameters;
    }

    /** Return true if this ContractDeployRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContractDeployRequest contractDeployRequest = (ContractDeployRequest) o;
        return Objects.equals(this.assetId, contractDeployRequest.assetId)
                && Objects.equals(this.vaultAccountId, contractDeployRequest.vaultAccountId)
                && Objects.equals(
                        this.constructorParameters, contractDeployRequest.constructorParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, vaultAccountId, constructorParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContractDeployRequest {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    vaultAccountId: ").append(toIndentedString(vaultAccountId)).append("\n");
        sb.append("    constructorParameters: ")
                .append(toIndentedString(constructorParameters))
                .append("\n");
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

        // add `assetId` to the URL query string
        if (getAssetId() != null) {
            joiner.add(
                    String.format(
                            "%sassetId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getAssetId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `vaultAccountId` to the URL query string
        if (getVaultAccountId() != null) {
            joiner.add(
                    String.format(
                            "%svaultAccountId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getVaultAccountId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `constructorParameters` to the URL query string
        if (getConstructorParameters() != null) {
            for (int i = 0; i < getConstructorParameters().size(); i++) {
                if (getConstructorParameters().get(i) != null) {
                    joiner.add(
                            getConstructorParameters()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sconstructorParameters%s%s",
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