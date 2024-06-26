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
import java.util.Objects;
import java.util.StringJoiner;

/** ScreeningVerdict */
@JsonPropertyOrder({
    ScreeningVerdict.JSON_PROPERTY_VERDICT,
    ScreeningVerdict.JSON_PROPERTY_EXECUTION_OPERATION_ID,
    ScreeningVerdict.JSON_PROPERTY_ACCOUNT,
    ScreeningVerdict.JSON_PROPERTY_ASSET_ID,
    ScreeningVerdict.JSON_PROPERTY_AMOUNT,
    ScreeningVerdict.JSON_PROPERTY_MATCHED_RULE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScreeningVerdict {
    /** Gets or Sets verdict */
    public enum VerdictEnum {
        PASSED("PASSED"),

        PASSED_WITH_ALERT("PASSED_WITH_ALERT"),

        REJECTED("REJECTED"),

        FAILED("FAILED"),

        BYPASSED("BYPASSED");

        private String value;

        VerdictEnum(String value) {
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
        public static VerdictEnum fromValue(String value) {
            for (VerdictEnum b : VerdictEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_VERDICT = "verdict";
    private VerdictEnum verdict;

    public static final String JSON_PROPERTY_EXECUTION_OPERATION_ID = "executionOperationId";
    private String executionOperationId;

    public static final String JSON_PROPERTY_ACCOUNT = "account";
    private Destination account;

    public static final String JSON_PROPERTY_ASSET_ID = "assetId";
    private String assetId;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private String amount;

    public static final String JSON_PROPERTY_MATCHED_RULE = "matchedRule";
    private ScreeningVerdictMatchedRule matchedRule;

    public ScreeningVerdict() {}

    public ScreeningVerdict verdict(VerdictEnum verdict) {
        this.verdict = verdict;
        return this;
    }

    /**
     * Get verdict
     *
     * @return verdict
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VERDICT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public VerdictEnum getVerdict() {
        return verdict;
    }

    @JsonProperty(JSON_PROPERTY_VERDICT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVerdict(VerdictEnum verdict) {
        this.verdict = verdict;
    }

    public ScreeningVerdict executionOperationId(String executionOperationId) {
        this.executionOperationId = executionOperationId;
        return this;
    }

    /**
     * Get executionOperationId
     *
     * @return executionOperationId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_EXECUTION_OPERATION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getExecutionOperationId() {
        return executionOperationId;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTION_OPERATION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setExecutionOperationId(String executionOperationId) {
        this.executionOperationId = executionOperationId;
    }

    public ScreeningVerdict account(Destination account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     *
     * @return account
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ACCOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Destination getAccount() {
        return account;
    }

    @JsonProperty(JSON_PROPERTY_ACCOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAccount(Destination account) {
        this.account = account;
    }

    public ScreeningVerdict assetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * Get assetId
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

    public ScreeningVerdict amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAmount() {
        return amount;
    }

    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public ScreeningVerdict matchedRule(ScreeningVerdictMatchedRule matchedRule) {
        this.matchedRule = matchedRule;
        return this;
    }

    /**
     * Get matchedRule
     *
     * @return matchedRule
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_MATCHED_RULE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ScreeningVerdictMatchedRule getMatchedRule() {
        return matchedRule;
    }

    @JsonProperty(JSON_PROPERTY_MATCHED_RULE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMatchedRule(ScreeningVerdictMatchedRule matchedRule) {
        this.matchedRule = matchedRule;
    }

    /** Return true if this ScreeningVerdict object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScreeningVerdict screeningVerdict = (ScreeningVerdict) o;
        return Objects.equals(this.verdict, screeningVerdict.verdict)
                && Objects.equals(this.executionOperationId, screeningVerdict.executionOperationId)
                && Objects.equals(this.account, screeningVerdict.account)
                && Objects.equals(this.assetId, screeningVerdict.assetId)
                && Objects.equals(this.amount, screeningVerdict.amount)
                && Objects.equals(this.matchedRule, screeningVerdict.matchedRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verdict, executionOperationId, account, assetId, amount, matchedRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScreeningVerdict {\n");
        sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
        sb.append("    executionOperationId: ")
                .append(toIndentedString(executionOperationId))
                .append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    matchedRule: ").append(toIndentedString(matchedRule)).append("\n");
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

        // add `verdict` to the URL query string
        if (getVerdict() != null) {
            joiner.add(
                    String.format(
                            "%sverdict%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getVerdict()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `executionOperationId` to the URL query string
        if (getExecutionOperationId() != null) {
            joiner.add(
                    String.format(
                            "%sexecutionOperationId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getExecutionOperationId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `account` to the URL query string
        if (getAccount() != null) {
            joiner.add(getAccount().toUrlQueryString(prefix + "account" + suffix));
        }

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

        // add `amount` to the URL query string
        if (getAmount() != null) {
            joiner.add(
                    String.format(
                            "%samount%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `matchedRule` to the URL query string
        if (getMatchedRule() != null) {
            joiner.add(getMatchedRule().toUrlQueryString(prefix + "matchedRule" + suffix));
        }

        return joiner.toString();
    }
}
