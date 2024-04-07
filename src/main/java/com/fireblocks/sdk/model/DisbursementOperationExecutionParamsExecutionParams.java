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

/** DisbursementOperationExecutionParamsExecutionParams */
@JsonPropertyOrder({
    DisbursementOperationExecutionParamsExecutionParams.JSON_PROPERTY_AMOUNT,
    DisbursementOperationExecutionParamsExecutionParams.JSON_PROPERTY_PAYMENT_ACCOUNT,
    DisbursementOperationExecutionParamsExecutionParams.JSON_PROPERTY_INSTRUCTION_SET
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DisbursementOperationExecutionParamsExecutionParams {
    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private String amount;

    public static final String JSON_PROPERTY_PAYMENT_ACCOUNT = "paymentAccount";
    private Account paymentAccount;

    public static final String JSON_PROPERTY_INSTRUCTION_SET = "instructionSet";
    private List<DisbursementInstruction> instructionSet;

    public DisbursementOperationExecutionParamsExecutionParams() {}

    public DisbursementOperationExecutionParamsExecutionParams amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAmount() {
        return amount;
    }

    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public DisbursementOperationExecutionParamsExecutionParams paymentAccount(
            Account paymentAccount) {
        this.paymentAccount = paymentAccount;
        return this;
    }

    /**
     * Get paymentAccount
     *
     * @return paymentAccount
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PAYMENT_ACCOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Account getPaymentAccount() {
        return paymentAccount;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_ACCOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaymentAccount(Account paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public DisbursementOperationExecutionParamsExecutionParams instructionSet(
            List<DisbursementInstruction> instructionSet) {
        this.instructionSet = instructionSet;
        return this;
    }

    public DisbursementOperationExecutionParamsExecutionParams addInstructionSetItem(
            DisbursementInstruction instructionSetItem) {
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
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_INSTRUCTION_SET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<DisbursementInstruction> getInstructionSet() {
        return instructionSet;
    }

    @JsonProperty(JSON_PROPERTY_INSTRUCTION_SET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstructionSet(List<DisbursementInstruction> instructionSet) {
        this.instructionSet = instructionSet;
    }

    /**
     * Return true if this DisbursementOperationExecutionParams_executionParams object is equal to
     * o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisbursementOperationExecutionParamsExecutionParams
                disbursementOperationExecutionParamsExecutionParams =
                        (DisbursementOperationExecutionParamsExecutionParams) o;
        return Objects.equals(
                        this.amount, disbursementOperationExecutionParamsExecutionParams.amount)
                && Objects.equals(
                        this.paymentAccount,
                        disbursementOperationExecutionParamsExecutionParams.paymentAccount)
                && Objects.equals(
                        this.instructionSet,
                        disbursementOperationExecutionParamsExecutionParams.instructionSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, paymentAccount, instructionSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisbursementOperationExecutionParamsExecutionParams {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    paymentAccount: ").append(toIndentedString(paymentAccount)).append("\n");
        sb.append("    instructionSet: ").append(toIndentedString(instructionSet)).append("\n");
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

        // add `paymentAccount` to the URL query string
        if (getPaymentAccount() != null) {
            joiner.add(getPaymentAccount().toUrlQueryString(prefix + "paymentAccount" + suffix));
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

        return joiner.toString();
    }
}