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
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** PayoutResponse */
@JsonPropertyOrder({
    PayoutResponse.JSON_PROPERTY_PAYOUT_ID,
    PayoutResponse.JSON_PROPERTY_PAYMENT_ACCOUNT,
    PayoutResponse.JSON_PROPERTY_CREATED_AT,
    PayoutResponse.JSON_PROPERTY_STATE,
    PayoutResponse.JSON_PROPERTY_STATUS,
    PayoutResponse.JSON_PROPERTY_REASON_OF_FAILURE,
    PayoutResponse.JSON_PROPERTY_INIT_METHOD,
    PayoutResponse.JSON_PROPERTY_INSTRUCTION_SET,
    PayoutResponse.JSON_PROPERTY_REPORT_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PayoutResponse {
    public static final String JSON_PROPERTY_PAYOUT_ID = "payoutId";
    private String payoutId;

    public static final String JSON_PROPERTY_PAYMENT_ACCOUNT = "paymentAccount";
    private PaymentAccountResponse paymentAccount;

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    private BigDecimal createdAt;

    public static final String JSON_PROPERTY_STATE = "state";
    private PayoutState state;

    public static final String JSON_PROPERTY_STATUS = "status";
    private PayoutStatus status;

    public static final String JSON_PROPERTY_REASON_OF_FAILURE = "reasonOfFailure";
    private String reasonOfFailure;

    public static final String JSON_PROPERTY_INIT_METHOD = "initMethod";
    private PayoutInitMethod initMethod;

    public static final String JSON_PROPERTY_INSTRUCTION_SET = "instructionSet";
    private List<PayoutInstructionResponse> instructionSet = new ArrayList<>();

    public static final String JSON_PROPERTY_REPORT_URL = "reportUrl";
    private String reportUrl;

    public PayoutResponse() {}

    public PayoutResponse payoutId(String payoutId) {
        this.payoutId = payoutId;
        return this;
    }

    /**
     * Get payoutId
     *
     * @return payoutId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PAYOUT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPayoutId() {
        return payoutId;
    }

    @JsonProperty(JSON_PROPERTY_PAYOUT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPayoutId(String payoutId) {
        this.payoutId = payoutId;
    }

    public PayoutResponse paymentAccount(PaymentAccountResponse paymentAccount) {
        this.paymentAccount = paymentAccount;
        return this;
    }

    /**
     * Get paymentAccount
     *
     * @return paymentAccount
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PAYMENT_ACCOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public PaymentAccountResponse getPaymentAccount() {
        return paymentAccount;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_ACCOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPaymentAccount(PaymentAccountResponse paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public PayoutResponse createdAt(BigDecimal createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreatedAt(BigDecimal createdAt) {
        this.createdAt = createdAt;
    }

    public PayoutResponse state(PayoutState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public PayoutState getState() {
        return state;
    }

    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setState(PayoutState state) {
        this.state = state;
    }

    public PayoutResponse status(PayoutStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public PayoutStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(PayoutStatus status) {
        this.status = status;
    }

    public PayoutResponse reasonOfFailure(String reasonOfFailure) {
        this.reasonOfFailure = reasonOfFailure;
        return this;
    }

    /**
     * &lt;ul&gt; &lt;li&gt; INSUFFICIENT_BALANCE&lt;/li&gt; &lt;li&gt;
     * SOURCE_TRANSLATION&lt;/li&gt; &lt;li&gt; SOURCE_NOT_UNIQUE&lt;/li&gt; &lt;li&gt;
     * SOURCE_NOT_FOUND&lt;/li&gt; &lt;li&gt; SOURCE_TYPE_NOT_SUPPORTED&lt;/li&gt; &lt;li&gt;
     * EMPTY_SOURCE&lt;/li&gt; &lt;li&gt; DESTINATION_TRANSLATION&lt;/li&gt; &lt;li&gt;
     * DESTINATION_NOT_UNIQUE&lt;/li&gt; &lt;li&gt; DESTINATION_NOT_FOUND&lt;/li&gt; &lt;li&gt;
     * EMPTY_DESTINATION&lt;/li&gt; &lt;li&gt; PARSING &lt;/li&gt; &lt;li&gt; UNKNOWN&lt;/li&gt;
     * &lt;li&gt; FIREBLOCKS_CLIENT&lt;/li&gt; &lt;li&gt; TRANSACTION_SUBMISSION&lt;/li&gt;
     * &lt;/ul&gt;
     *
     * @return reasonOfFailure
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_REASON_OF_FAILURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getReasonOfFailure() {
        return reasonOfFailure;
    }

    @JsonProperty(JSON_PROPERTY_REASON_OF_FAILURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReasonOfFailure(String reasonOfFailure) {
        this.reasonOfFailure = reasonOfFailure;
    }

    public PayoutResponse initMethod(PayoutInitMethod initMethod) {
        this.initMethod = initMethod;
        return this;
    }

    /**
     * Get initMethod
     *
     * @return initMethod
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_INIT_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PayoutInitMethod getInitMethod() {
        return initMethod;
    }

    @JsonProperty(JSON_PROPERTY_INIT_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInitMethod(PayoutInitMethod initMethod) {
        this.initMethod = initMethod;
    }

    public PayoutResponse instructionSet(List<PayoutInstructionResponse> instructionSet) {
        this.instructionSet = instructionSet;
        return this;
    }

    public PayoutResponse addInstructionSetItem(PayoutInstructionResponse instructionSetItem) {
        if (this.instructionSet == null) {
            this.instructionSet = new ArrayList<>();
        }
        this.instructionSet.add(instructionSetItem);
        return this;
    }

    /**
     * Get instructionSet
     *
     * @return instructionSet
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_INSTRUCTION_SET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<PayoutInstructionResponse> getInstructionSet() {
        return instructionSet;
    }

    @JsonProperty(JSON_PROPERTY_INSTRUCTION_SET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInstructionSet(List<PayoutInstructionResponse> instructionSet) {
        this.instructionSet = instructionSet;
    }

    public PayoutResponse reportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }

    /**
     * Get reportUrl
     *
     * @return reportUrl
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_REPORT_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getReportUrl() {
        return reportUrl;
    }

    @JsonProperty(JSON_PROPERTY_REPORT_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    /** Return true if this PayoutResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PayoutResponse payoutResponse = (PayoutResponse) o;
        return Objects.equals(this.payoutId, payoutResponse.payoutId)
                && Objects.equals(this.paymentAccount, payoutResponse.paymentAccount)
                && Objects.equals(this.createdAt, payoutResponse.createdAt)
                && Objects.equals(this.state, payoutResponse.state)
                && Objects.equals(this.status, payoutResponse.status)
                && Objects.equals(this.reasonOfFailure, payoutResponse.reasonOfFailure)
                && Objects.equals(this.initMethod, payoutResponse.initMethod)
                && Objects.equals(this.instructionSet, payoutResponse.instructionSet)
                && Objects.equals(this.reportUrl, payoutResponse.reportUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                payoutId,
                paymentAccount,
                createdAt,
                state,
                status,
                reasonOfFailure,
                initMethod,
                instructionSet,
                reportUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PayoutResponse {\n");
        sb.append("    payoutId: ").append(toIndentedString(payoutId)).append("\n");
        sb.append("    paymentAccount: ").append(toIndentedString(paymentAccount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reasonOfFailure: ").append(toIndentedString(reasonOfFailure)).append("\n");
        sb.append("    initMethod: ").append(toIndentedString(initMethod)).append("\n");
        sb.append("    instructionSet: ").append(toIndentedString(instructionSet)).append("\n");
        sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
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

        // add `payoutId` to the URL query string
        if (getPayoutId() != null) {
            joiner.add(
                    String.format(
                            "%spayoutId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getPayoutId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `paymentAccount` to the URL query string
        if (getPaymentAccount() != null) {
            joiner.add(getPaymentAccount().toUrlQueryString(prefix + "paymentAccount" + suffix));
        }

        // add `createdAt` to the URL query string
        if (getCreatedAt() != null) {
            joiner.add(
                    String.format(
                            "%screatedAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCreatedAt()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `state` to the URL query string
        if (getState() != null) {
            joiner.add(
                    String.format(
                            "%sstate%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
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

        // add `reasonOfFailure` to the URL query string
        if (getReasonOfFailure() != null) {
            joiner.add(
                    String.format(
                            "%sreasonOfFailure%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getReasonOfFailure()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `initMethod` to the URL query string
        if (getInitMethod() != null) {
            joiner.add(
                    String.format(
                            "%sinitMethod%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getInitMethod()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `instructionSet` to the URL query string
        if (getInstructionSet() != null) {
            for (int i = 0; i < getInstructionSet().size(); i++) {
                if (getInstructionSet().get(i) != null) {
                    joiner.add(
                            getInstructionSet()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sinstructionSet%s%s",
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

        // add `reportUrl` to the URL query string
        if (getReportUrl() != null) {
            joiner.add(
                    String.format(
                            "%sreportUrl%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getReportUrl()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
