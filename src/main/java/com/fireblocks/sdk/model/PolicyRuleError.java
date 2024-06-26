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
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** Rule validation result error */
@JsonPropertyOrder({
    PolicyRuleError.JSON_PROPERTY_ERROR_MESSAGE,
    PolicyRuleError.JSON_PROPERTY_ERROR_CODE,
    PolicyRuleError.JSON_PROPERTY_ERROR_CODE_NAME,
    PolicyRuleError.JSON_PROPERTY_ERROR_FIELD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyRuleError {
    public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
    private String errorMessage;

    public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
    private BigDecimal errorCode;

    public static final String JSON_PROPERTY_ERROR_CODE_NAME = "errorCodeName";
    private String errorCodeName;

    /**
     * The field which the error relates to * operator - transaction initiator * operators -
     * transaction initiators * authorizationGroups - transaction authorizer groups *
     * designatedSigner - transaction signer * designatedSigners - transaction signers *
     * contractMethods - contract methods * amountAggregation - transaction amount aggregation
     * configuration * src - transaction source asset configuration * dst - transaction destination
     * asset configuration
     */
    public enum ErrorFieldEnum {
        OPERATOR("operator"),

        OPERATORS("operators"),

        AUTHORIZATIONGROUPS("authorizationGroups"),

        DESIGNATEDSIGNER("designatedSigner"),

        DESIGNATEDSIGNERS("designatedSigners"),

        CONTRACTMETHODS("contractMethods"),

        AMOUNTAGGREGATION("amountAggregation"),

        SRC("src"),

        DST("dst");

        private String value;

        ErrorFieldEnum(String value) {
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
        public static ErrorFieldEnum fromValue(String value) {
            for (ErrorFieldEnum b : ErrorFieldEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_ERROR_FIELD = "errorField";
    private ErrorFieldEnum errorField;

    public PolicyRuleError() {}

    public PolicyRuleError errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Error message
     *
     * @return errorMessage
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public PolicyRuleError errorCode(BigDecimal errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * error code
     *
     * @return errorCode
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getErrorCode() {
        return errorCode;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setErrorCode(BigDecimal errorCode) {
        this.errorCode = errorCode;
    }

    public PolicyRuleError errorCodeName(String errorCodeName) {
        this.errorCodeName = errorCodeName;
        return this;
    }

    /**
     * error code name
     *
     * @return errorCodeName
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ERROR_CODE_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getErrorCodeName() {
        return errorCodeName;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_CODE_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setErrorCodeName(String errorCodeName) {
        this.errorCodeName = errorCodeName;
    }

    public PolicyRuleError errorField(ErrorFieldEnum errorField) {
        this.errorField = errorField;
        return this;
    }

    /**
     * The field which the error relates to * operator - transaction initiator * operators -
     * transaction initiators * authorizationGroups - transaction authorizer groups *
     * designatedSigner - transaction signer * designatedSigners - transaction signers *
     * contractMethods - contract methods * amountAggregation - transaction amount aggregation
     * configuration * src - transaction source asset configuration * dst - transaction destination
     * asset configuration
     *
     * @return errorField
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ERROR_FIELD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ErrorFieldEnum getErrorField() {
        return errorField;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_FIELD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setErrorField(ErrorFieldEnum errorField) {
        this.errorField = errorField;
    }

    /** Return true if this PolicyRuleError object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyRuleError policyRuleError = (PolicyRuleError) o;
        return Objects.equals(this.errorMessage, policyRuleError.errorMessage)
                && Objects.equals(this.errorCode, policyRuleError.errorCode)
                && Objects.equals(this.errorCodeName, policyRuleError.errorCodeName)
                && Objects.equals(this.errorField, policyRuleError.errorField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorMessage, errorCode, errorCodeName, errorField);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyRuleError {\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorCodeName: ").append(toIndentedString(errorCodeName)).append("\n");
        sb.append("    errorField: ").append(toIndentedString(errorField)).append("\n");
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

        // add `errorMessage` to the URL query string
        if (getErrorMessage() != null) {
            joiner.add(
                    String.format(
                            "%serrorMessage%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getErrorMessage()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `errorCode` to the URL query string
        if (getErrorCode() != null) {
            joiner.add(
                    String.format(
                            "%serrorCode%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getErrorCode()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `errorCodeName` to the URL query string
        if (getErrorCodeName() != null) {
            joiner.add(
                    String.format(
                            "%serrorCodeName%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getErrorCodeName()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `errorField` to the URL query string
        if (getErrorField() != null) {
            joiner.add(
                    String.format(
                            "%serrorField%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getErrorField()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
