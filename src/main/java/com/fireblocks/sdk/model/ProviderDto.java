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

/** ProviderDto */
@JsonPropertyOrder({
    ProviderDto.JSON_PROPERTY_ID,
    ProviderDto.JSON_PROPERTY_PROVIDER_NAME,
    ProviderDto.JSON_PROPERTY_VALIDATORS,
    ProviderDto.JSON_PROPERTY_ICON_URL,
    ProviderDto.JSON_PROPERTY_TERMS_OF_SERVICE_URL,
    ProviderDto.JSON_PROPERTY_IS_TERMS_OF_SERVICE_APPROVED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProviderDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
    private String providerName;

    public static final String JSON_PROPERTY_VALIDATORS = "validators";
    private List<ValidatorDto> validators = new ArrayList<>();

    public static final String JSON_PROPERTY_ICON_URL = "iconUrl";
    private String iconUrl;

    public static final String JSON_PROPERTY_TERMS_OF_SERVICE_URL = "termsOfServiceUrl";
    private String termsOfServiceUrl;

    public static final String JSON_PROPERTY_IS_TERMS_OF_SERVICE_APPROVED =
            "isTermsOfServiceApproved";
    private Boolean isTermsOfServiceApproved;

    public ProviderDto() {}

    public ProviderDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the provider
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

    public ProviderDto providerName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * Name of the provider
     *
     * @return providerName
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getProviderName() {
        return providerName;
    }

    @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ProviderDto validators(List<ValidatorDto> validators) {
        this.validators = validators;
        return this;
    }

    public ProviderDto addValidatorsItem(ValidatorDto validatorsItem) {
        if (this.validators == null) {
            this.validators = new ArrayList<>();
        }
        this.validators.add(validatorsItem);
        return this;
    }

    /**
     * An array of objects that includes chain descriptors and the corresponding fee percentages for
     * validators supported by the provider
     *
     * @return validators
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VALIDATORS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<ValidatorDto> getValidators() {
        return validators;
    }

    @JsonProperty(JSON_PROPERTY_VALIDATORS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValidators(List<ValidatorDto> validators) {
        this.validators = validators;
    }

    public ProviderDto iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * URL to the validator&#39;s icon
     *
     * @return iconUrl
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ICON_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty(JSON_PROPERTY_ICON_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public ProviderDto termsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
        return this;
    }

    /**
     * URL to the terms of service
     *
     * @return termsOfServiceUrl
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TERMS_OF_SERVICE_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    @JsonProperty(JSON_PROPERTY_TERMS_OF_SERVICE_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public ProviderDto isTermsOfServiceApproved(Boolean isTermsOfServiceApproved) {
        this.isTermsOfServiceApproved = isTermsOfServiceApproved;
        return this;
    }

    /**
     * Indicates whether the terms of service are approved
     *
     * @return isTermsOfServiceApproved
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IS_TERMS_OF_SERVICE_APPROVED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getIsTermsOfServiceApproved() {
        return isTermsOfServiceApproved;
    }

    @JsonProperty(JSON_PROPERTY_IS_TERMS_OF_SERVICE_APPROVED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsTermsOfServiceApproved(Boolean isTermsOfServiceApproved) {
        this.isTermsOfServiceApproved = isTermsOfServiceApproved;
    }

    /** Return true if this ProviderDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProviderDto providerDto = (ProviderDto) o;
        return Objects.equals(this.id, providerDto.id)
                && Objects.equals(this.providerName, providerDto.providerName)
                && Objects.equals(this.validators, providerDto.validators)
                && Objects.equals(this.iconUrl, providerDto.iconUrl)
                && Objects.equals(this.termsOfServiceUrl, providerDto.termsOfServiceUrl)
                && Objects.equals(
                        this.isTermsOfServiceApproved, providerDto.isTermsOfServiceApproved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, providerName, validators, iconUrl, termsOfServiceUrl, isTermsOfServiceApproved);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProviderDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    termsOfServiceUrl: ")
                .append(toIndentedString(termsOfServiceUrl))
                .append("\n");
        sb.append("    isTermsOfServiceApproved: ")
                .append(toIndentedString(isTermsOfServiceApproved))
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

        // add `providerName` to the URL query string
        if (getProviderName() != null) {
            joiner.add(
                    String.format(
                            "%sproviderName%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getProviderName()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `validators` to the URL query string
        if (getValidators() != null) {
            for (int i = 0; i < getValidators().size(); i++) {
                if (getValidators().get(i) != null) {
                    joiner.add(
                            getValidators()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%svalidators%s%s",
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

        // add `iconUrl` to the URL query string
        if (getIconUrl() != null) {
            joiner.add(
                    String.format(
                            "%siconUrl%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getIconUrl()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `termsOfServiceUrl` to the URL query string
        if (getTermsOfServiceUrl() != null) {
            joiner.add(
                    String.format(
                            "%stermsOfServiceUrl%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTermsOfServiceUrl()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `isTermsOfServiceApproved` to the URL query string
        if (getIsTermsOfServiceApproved() != null) {
            joiner.add(
                    String.format(
                            "%sisTermsOfServiceApproved%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getIsTermsOfServiceApproved()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
