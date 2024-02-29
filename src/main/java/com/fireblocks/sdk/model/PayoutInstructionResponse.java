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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fireblocks.sdk.model.InstructionAmount;
import com.fireblocks.sdk.model.PayeeAccountResponse;
import com.fireblocks.sdk.model.PayoutInstructionState;
import com.fireblocks.sdk.model.Transaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PayoutInstructionResponse
 */
@JsonPropertyOrder({
  PayoutInstructionResponse.JSON_PROPERTY_ID,
  PayoutInstructionResponse.JSON_PROPERTY_PAYEE_ACCOUNT,
  PayoutInstructionResponse.JSON_PROPERTY_AMOUNT,
  PayoutInstructionResponse.JSON_PROPERTY_STATE,
  PayoutInstructionResponse.JSON_PROPERTY_TRANSACTIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PayoutInstructionResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PAYEE_ACCOUNT = "payeeAccount";
  private PayeeAccountResponse payeeAccount;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private InstructionAmount amount;

  public static final String JSON_PROPERTY_STATE = "state";
  private PayoutInstructionState state;

  public static final String JSON_PROPERTY_TRANSACTIONS = "transactions";
  private List<Transaction> transactions = new ArrayList<>();

  public PayoutInstructionResponse() { 
  }

  public PayoutInstructionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
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


  public PayoutInstructionResponse payeeAccount(PayeeAccountResponse payeeAccount) {
    this.payeeAccount = payeeAccount;
    return this;
  }

   /**
   * Get payeeAccount
   * @return payeeAccount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYEE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PayeeAccountResponse getPayeeAccount() {
    return payeeAccount;
  }


  @JsonProperty(JSON_PROPERTY_PAYEE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayeeAccount(PayeeAccountResponse payeeAccount) {
    this.payeeAccount = payeeAccount;
  }


  public PayoutInstructionResponse amount(InstructionAmount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InstructionAmount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(InstructionAmount amount) {
    this.amount = amount;
  }


  public PayoutInstructionResponse state(PayoutInstructionState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PayoutInstructionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(PayoutInstructionState state) {
    this.state = state;
  }


  public PayoutInstructionResponse transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public PayoutInstructionResponse addTransactionsItem(Transaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Transaction> getTransactions() {
    return transactions;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  /**
   * Return true if this PayoutInstructionResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutInstructionResponse payoutInstructionResponse = (PayoutInstructionResponse) o;
    return Objects.equals(this.id, payoutInstructionResponse.id) &&
        Objects.equals(this.payeeAccount, payoutInstructionResponse.payeeAccount) &&
        Objects.equals(this.amount, payoutInstructionResponse.amount) &&
        Objects.equals(this.state, payoutInstructionResponse.state) &&
        Objects.equals(this.transactions, payoutInstructionResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, payeeAccount, amount, state, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutInstructionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payeeAccount: ").append(toIndentedString(payeeAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `payeeAccount` to the URL query string
    if (getPayeeAccount() != null) {
      joiner.add(getPayeeAccount().toUrlQueryString(prefix + "payeeAccount" + suffix));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(getAmount().toUrlQueryString(prefix + "amount" + suffix));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `transactions` to the URL query string
    if (getTransactions() != null) {
      for (int i = 0; i < getTransactions().size(); i++) {
        if (getTransactions().get(i) != null) {
          joiner.add(getTransactions().get(i).toUrlQueryString(String.format("%stransactions%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

