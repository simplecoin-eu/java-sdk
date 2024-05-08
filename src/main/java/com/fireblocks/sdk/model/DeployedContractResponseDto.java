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

/** DeployedContractResponseDto */
@JsonPropertyOrder({
    DeployedContractResponseDto.JSON_PROPERTY_ID,
    DeployedContractResponseDto.JSON_PROPERTY_CONTRACT_ADDRESS,
    DeployedContractResponseDto.JSON_PROPERTY_CONTRACT_TEMPLATE_ID,
    DeployedContractResponseDto.JSON_PROPERTY_VAULT_ACCOUNT_ID,
    DeployedContractResponseDto.JSON_PROPERTY_BLOCKCHAIN_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeployedContractResponseDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_CONTRACT_ADDRESS = "contractAddress";
    private String contractAddress;

    public static final String JSON_PROPERTY_CONTRACT_TEMPLATE_ID = "contractTemplateId";
    private String contractTemplateId;

    public static final String JSON_PROPERTY_VAULT_ACCOUNT_ID = "vaultAccountId";
    private String vaultAccountId;

    public static final String JSON_PROPERTY_BLOCKCHAIN_ID = "blockchainId";
    private String blockchainId;

    public DeployedContractResponseDto() {}

    public DeployedContractResponseDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The deployed contract data identifier
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

    public DeployedContractResponseDto contractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
        return this;
    }

    /**
     * The contract&#39;s onchain address
     *
     * @return contractAddress
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getContractAddress() {
        return contractAddress;
    }

    @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public DeployedContractResponseDto contractTemplateId(String contractTemplateId) {
        this.contractTemplateId = contractTemplateId;
        return this;
    }

    /**
     * The contract template identifier
     *
     * @return contractTemplateId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CONTRACT_TEMPLATE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getContractTemplateId() {
        return contractTemplateId;
    }

    @JsonProperty(JSON_PROPERTY_CONTRACT_TEMPLATE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContractTemplateId(String contractTemplateId) {
        this.contractTemplateId = contractTemplateId;
    }

    public DeployedContractResponseDto vaultAccountId(String vaultAccountId) {
        this.vaultAccountId = vaultAccountId;
        return this;
    }

    /**
     * The vault account id this contract was deploy from
     *
     * @return vaultAccountId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVaultAccountId() {
        return vaultAccountId;
    }

    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVaultAccountId(String vaultAccountId) {
        this.vaultAccountId = vaultAccountId;
    }

    public DeployedContractResponseDto blockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /**
     * Get blockchainId
     *
     * @return blockchainId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBlockchainId() {
        return blockchainId;
    }

    @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    /** Return true if this DeployedContractResponseDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployedContractResponseDto deployedContractResponseDto = (DeployedContractResponseDto) o;
        return Objects.equals(this.id, deployedContractResponseDto.id)
                && Objects.equals(this.contractAddress, deployedContractResponseDto.contractAddress)
                && Objects.equals(
                        this.contractTemplateId, deployedContractResponseDto.contractTemplateId)
                && Objects.equals(this.vaultAccountId, deployedContractResponseDto.vaultAccountId)
                && Objects.equals(this.blockchainId, deployedContractResponseDto.blockchainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contractAddress, contractTemplateId, vaultAccountId, blockchainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployedContractResponseDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
        sb.append("    contractTemplateId: ")
                .append(toIndentedString(contractTemplateId))
                .append("\n");
        sb.append("    vaultAccountId: ").append(toIndentedString(vaultAccountId)).append("\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
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

        // add `contractAddress` to the URL query string
        if (getContractAddress() != null) {
            joiner.add(
                    String.format(
                            "%scontractAddress%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getContractAddress()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `contractTemplateId` to the URL query string
        if (getContractTemplateId() != null) {
            joiner.add(
                    String.format(
                            "%scontractTemplateId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getContractTemplateId()),
                                            StandardCharsets.UTF_8)
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

        // add `blockchainId` to the URL query string
        if (getBlockchainId() != null) {
            joiner.add(
                    String.format(
                            "%sblockchainId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBlockchainId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}