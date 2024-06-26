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

/** EVMTokenCreateParamsDto */
@JsonPropertyOrder({
    EVMTokenCreateParamsDto.JSON_PROPERTY_CONTRACT_ID,
    EVMTokenCreateParamsDto.JSON_PROPERTY_CONSTRUCTOR_PARAMS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EVMTokenCreateParamsDto {
    public static final String JSON_PROPERTY_CONTRACT_ID = "contractId";
    private String contractId;

    public static final String JSON_PROPERTY_CONSTRUCTOR_PARAMS = "constructorParams";
    private List<List<ParameterWithValue>> constructorParams;

    public EVMTokenCreateParamsDto() {}

    public EVMTokenCreateParamsDto contractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    /**
     * The id of the contract template that will be used to create the token
     *
     * @return contractId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getContractId() {
        return contractId;
    }

    @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public EVMTokenCreateParamsDto constructorParams(
            List<List<ParameterWithValue>> constructorParams) {
        this.constructorParams = constructorParams;
        return this;
    }

    public EVMTokenCreateParamsDto addConstructorParamsItem(
            List<ParameterWithValue> constructorParamsItem) {
        if (this.constructorParams == null) {
            this.constructorParams = new ArrayList<>();
        }
        this.constructorParams.add(constructorParamsItem);
        return this;
    }

    /**
     * The constructor parameters and values of the contract template
     *
     * @return constructorParams
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CONSTRUCTOR_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<List<ParameterWithValue>> getConstructorParams() {
        return constructorParams;
    }

    @JsonProperty(JSON_PROPERTY_CONSTRUCTOR_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConstructorParams(List<List<ParameterWithValue>> constructorParams) {
        this.constructorParams = constructorParams;
    }

    /** Return true if this EVMTokenCreateParamsDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EVMTokenCreateParamsDto evMTokenCreateParamsDto = (EVMTokenCreateParamsDto) o;
        return Objects.equals(this.contractId, evMTokenCreateParamsDto.contractId)
                && Objects.equals(
                        this.constructorParams, evMTokenCreateParamsDto.constructorParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractId, constructorParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EVMTokenCreateParamsDto {\n");
        sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
        sb.append("    constructorParams: ")
                .append(toIndentedString(constructorParams))
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

        // add `contractId` to the URL query string
        if (getContractId() != null) {
            joiner.add(
                    String.format(
                            "%scontractId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getContractId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `constructorParams` to the URL query string
        if (getConstructorParams() != null) {
            for (int i = 0; i < getConstructorParams().size(); i++) {
                if (getConstructorParams().get(i) != null) {
                    joiner.add(
                            String.format(
                                    "%sconstructorParams%s%s=%s",
                                    prefix,
                                    suffix,
                                    "".equals(suffix)
                                            ? ""
                                            : String.format(
                                                    "%s%d%s", containerPrefix, i, containerSuffix),
                                    URLEncoder.encode(
                                                    String.valueOf(getConstructorParams().get(i)),
                                                    StandardCharsets.UTF_8)
                                            .replaceAll("\\+", "%20")));
                }
            }
        }

        return joiner.toString();
    }
}
