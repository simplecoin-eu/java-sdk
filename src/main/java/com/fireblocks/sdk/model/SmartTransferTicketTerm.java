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
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Data object with result data
 */
@JsonPropertyOrder({
  SmartTransferTicketTerm.JSON_PROPERTY_ID,
  SmartTransferTicketTerm.JSON_PROPERTY_TICKET_ID,
  SmartTransferTicketTerm.JSON_PROPERTY_ASSET,
  SmartTransferTicketTerm.JSON_PROPERTY_AMOUNT,
  SmartTransferTicketTerm.JSON_PROPERTY_AMOUNT_USD,
  SmartTransferTicketTerm.JSON_PROPERTY_FROM_NETWORK_ID,
  SmartTransferTicketTerm.JSON_PROPERTY_FROM_NETWORK_ID_NAME,
  SmartTransferTicketTerm.JSON_PROPERTY_TO_NETWORK_ID,
  SmartTransferTicketTerm.JSON_PROPERTY_TO_NETWORK_ID_NAME,
  SmartTransferTicketTerm.JSON_PROPERTY_TX_HASH,
  SmartTransferTicketTerm.JSON_PROPERTY_FB_TX_ID,
  SmartTransferTicketTerm.JSON_PROPERTY_TX_STATUS,
  SmartTransferTicketTerm.JSON_PROPERTY_STATUS,
  SmartTransferTicketTerm.JSON_PROPERTY_CREATED_AT,
  SmartTransferTicketTerm.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SmartTransferTicketTerm {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TICKET_ID = "ticketId";
  private String ticketId;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_AMOUNT_USD = "amountUsd";
  private String amountUsd;

  public static final String JSON_PROPERTY_FROM_NETWORK_ID = "fromNetworkId";
  private String fromNetworkId;

  public static final String JSON_PROPERTY_FROM_NETWORK_ID_NAME = "fromNetworkIdName";
  private String fromNetworkIdName;

  public static final String JSON_PROPERTY_TO_NETWORK_ID = "toNetworkId";
  private String toNetworkId;

  public static final String JSON_PROPERTY_TO_NETWORK_ID_NAME = "toNetworkIdName";
  private String toNetworkIdName;

  public static final String JSON_PROPERTY_TX_HASH = "txHash";
  private String txHash;

  public static final String JSON_PROPERTY_FB_TX_ID = "fbTxId";
  private String fbTxId;

  /**
   * Ticket term transaction status
   */
  public enum TxStatusEnum {
    QUEUED("queued"),
    
    SUBMITTED("submitted"),
    
    PENDINGSIGNATURE("pendingSignature"),
    
    PENDINGAUTHORIZATION("pendingAuthorization"),
    
    BROADCASTING("broadcasting"),
    
    CONFIRMING("confirming"),
    
    PENDINGAMLSCREENING("pendingAmlScreening"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled"),
    
    FAILED("failed"),
    
    REJECTED("rejected"),
    
    BLOCKED("blocked"),
    
    THIRDPARTYPENDINGMANUALAPPROVAL("thirdPartyPendingManualApproval"),
    
    THIRDPARTYPENDING("thirdPartyPending"),
    
    PARTIALLYCOMPLETED("partiallyCompleted"),
    
    CANCELLING("cancelling");

    private String value;

    TxStatusEnum(String value) {
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
    public static TxStatusEnum fromValue(String value) {
      for (TxStatusEnum b : TxStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_TX_STATUS = "txStatus";
  private TxStatusEnum txStatus;

  /**
   * Ticket term status
   */
  public enum StatusEnum {
    CREATED("CREATED"),
    
    FUNDING("FUNDING"),
    
    FUNDING_FAILED("FUNDING_FAILED"),
    
    FUNDED("FUNDED"),
    
    REJECTED("REJECTED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public SmartTransferTicketTerm() { 
  }

  public SmartTransferTicketTerm id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique id of Smart Transfer ticket term
   * @return id
  **/
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


  public SmartTransferTicketTerm ticketId(String ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * Unique id of Smart Transfer ticket
   * @return ticketId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TICKET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTicketId() {
    return ticketId;
  }


  @JsonProperty(JSON_PROPERTY_TICKET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }


  public SmartTransferTicketTerm asset(String asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Asset name
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAsset() {
    return asset;
  }


  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAsset(String asset) {
    this.asset = asset;
  }


  public SmartTransferTicketTerm amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount
   * @return amount
  **/
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


  public SmartTransferTicketTerm amountUsd(String amountUsd) {
    this.amountUsd = amountUsd;
    return this;
  }

   /**
   * Amount USD
   * @return amountUsd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_USD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmountUsd() {
    return amountUsd;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_USD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountUsd(String amountUsd) {
    this.amountUsd = amountUsd;
  }


  public SmartTransferTicketTerm fromNetworkId(String fromNetworkId) {
    this.fromNetworkId = fromNetworkId;
    return this;
  }

   /**
   * Identifier of the origination Network Profile
   * @return fromNetworkId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFromNetworkId() {
    return fromNetworkId;
  }


  @JsonProperty(JSON_PROPERTY_FROM_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromNetworkId(String fromNetworkId) {
    this.fromNetworkId = fromNetworkId;
  }


  public SmartTransferTicketTerm fromNetworkIdName(String fromNetworkIdName) {
    this.fromNetworkIdName = fromNetworkIdName;
    return this;
  }

   /**
   * Source network name
   * @return fromNetworkIdName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_NETWORK_ID_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFromNetworkIdName() {
    return fromNetworkIdName;
  }


  @JsonProperty(JSON_PROPERTY_FROM_NETWORK_ID_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromNetworkIdName(String fromNetworkIdName) {
    this.fromNetworkIdName = fromNetworkIdName;
  }


  public SmartTransferTicketTerm toNetworkId(String toNetworkId) {
    this.toNetworkId = toNetworkId;
    return this;
  }

   /**
   * Identifier of the destination Network Profile
   * @return toNetworkId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TO_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToNetworkId() {
    return toNetworkId;
  }


  @JsonProperty(JSON_PROPERTY_TO_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToNetworkId(String toNetworkId) {
    this.toNetworkId = toNetworkId;
  }


  public SmartTransferTicketTerm toNetworkIdName(String toNetworkIdName) {
    this.toNetworkIdName = toNetworkIdName;
    return this;
  }

   /**
   * Destination network name
   * @return toNetworkIdName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TO_NETWORK_ID_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToNetworkIdName() {
    return toNetworkIdName;
  }


  @JsonProperty(JSON_PROPERTY_TO_NETWORK_ID_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToNetworkIdName(String toNetworkIdName) {
    this.toNetworkIdName = toNetworkIdName;
  }


  public SmartTransferTicketTerm txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * Blockchain TX hash
   * @return txHash
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TX_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTxHash() {
    return txHash;
  }


  @JsonProperty(JSON_PROPERTY_TX_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  public SmartTransferTicketTerm fbTxId(String fbTxId) {
    this.fbTxId = fbTxId;
    return this;
  }

   /**
   * Fireblocks transaction ID. It is set when the funding transaction is created.
   * @return fbTxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FB_TX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFbTxId() {
    return fbTxId;
  }


  @JsonProperty(JSON_PROPERTY_FB_TX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFbTxId(String fbTxId) {
    this.fbTxId = fbTxId;
  }


  public SmartTransferTicketTerm txStatus(TxStatusEnum txStatus) {
    this.txStatus = txStatus;
    return this;
  }

   /**
   * Ticket term transaction status
   * @return txStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TX_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TxStatusEnum getTxStatus() {
    return txStatus;
  }


  @JsonProperty(JSON_PROPERTY_TX_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTxStatus(TxStatusEnum txStatus) {
    this.txStatus = txStatus;
  }


  public SmartTransferTicketTerm status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Ticket term status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SmartTransferTicketTerm createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date and time when the term is created.
   * @return createdAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SmartTransferTicketTerm updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Date and time of last term update.
   * @return updatedAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this SmartTransferTicketTerm object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransferTicketTerm smartTransferTicketTerm = (SmartTransferTicketTerm) o;
    return Objects.equals(this.id, smartTransferTicketTerm.id) &&
        Objects.equals(this.ticketId, smartTransferTicketTerm.ticketId) &&
        Objects.equals(this.asset, smartTransferTicketTerm.asset) &&
        Objects.equals(this.amount, smartTransferTicketTerm.amount) &&
        Objects.equals(this.amountUsd, smartTransferTicketTerm.amountUsd) &&
        Objects.equals(this.fromNetworkId, smartTransferTicketTerm.fromNetworkId) &&
        Objects.equals(this.fromNetworkIdName, smartTransferTicketTerm.fromNetworkIdName) &&
        Objects.equals(this.toNetworkId, smartTransferTicketTerm.toNetworkId) &&
        Objects.equals(this.toNetworkIdName, smartTransferTicketTerm.toNetworkIdName) &&
        Objects.equals(this.txHash, smartTransferTicketTerm.txHash) &&
        Objects.equals(this.fbTxId, smartTransferTicketTerm.fbTxId) &&
        Objects.equals(this.txStatus, smartTransferTicketTerm.txStatus) &&
        Objects.equals(this.status, smartTransferTicketTerm.status) &&
        Objects.equals(this.createdAt, smartTransferTicketTerm.createdAt) &&
        Objects.equals(this.updatedAt, smartTransferTicketTerm.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ticketId, asset, amount, amountUsd, fromNetworkId, fromNetworkIdName, toNetworkId, toNetworkIdName, txHash, fbTxId, txStatus, status, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransferTicketTerm {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountUsd: ").append(toIndentedString(amountUsd)).append("\n");
    sb.append("    fromNetworkId: ").append(toIndentedString(fromNetworkId)).append("\n");
    sb.append("    fromNetworkIdName: ").append(toIndentedString(fromNetworkIdName)).append("\n");
    sb.append("    toNetworkId: ").append(toIndentedString(toNetworkId)).append("\n");
    sb.append("    toNetworkIdName: ").append(toIndentedString(toNetworkIdName)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    fbTxId: ").append(toIndentedString(fbTxId)).append("\n");
    sb.append("    txStatus: ").append(toIndentedString(txStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

    // add `ticketId` to the URL query string
    if (getTicketId() != null) {
      joiner.add(String.format("%sticketId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTicketId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `asset` to the URL query string
    if (getAsset() != null) {
      joiner.add(String.format("%sasset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAsset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amountUsd` to the URL query string
    if (getAmountUsd() != null) {
      joiner.add(String.format("%samountUsd%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountUsd()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fromNetworkId` to the URL query string
    if (getFromNetworkId() != null) {
      joiner.add(String.format("%sfromNetworkId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFromNetworkId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fromNetworkIdName` to the URL query string
    if (getFromNetworkIdName() != null) {
      joiner.add(String.format("%sfromNetworkIdName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFromNetworkIdName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toNetworkId` to the URL query string
    if (getToNetworkId() != null) {
      joiner.add(String.format("%stoNetworkId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToNetworkId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toNetworkIdName` to the URL query string
    if (getToNetworkIdName() != null) {
      joiner.add(String.format("%stoNetworkIdName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToNetworkIdName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `txHash` to the URL query string
    if (getTxHash() != null) {
      joiner.add(String.format("%stxHash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTxHash()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fbTxId` to the URL query string
    if (getFbTxId() != null) {
      joiner.add(String.format("%sfbTxId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFbTxId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `txStatus` to the URL query string
    if (getTxStatus() != null) {
      joiner.add(String.format("%stxStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTxStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

