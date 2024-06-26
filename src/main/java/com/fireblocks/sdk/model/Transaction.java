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

/** Transaction */
@JsonPropertyOrder({
    Transaction.JSON_PROPERTY_ID,
    Transaction.JSON_PROPERTY_STATE,
    Transaction.JSON_PROPERTY_TIMESTAMP,
    Transaction.JSON_PROPERTY_INSTRUCTION_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Transaction {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    /** Gets or Sets state */
    public enum StateEnum {
        SUBMITTED("SUBMITTED"),

        QUEUED("QUEUED"),

        PENDING_AUTHORIZATION("PENDING_AUTHORIZATION"),

        PENDING_SIGNATURE("PENDING_SIGNATURE"),

        BROADCASTING("BROADCASTING"),

        PENDING_3RD_PARTY_MANUAL_APPROVAL("PENDING_3RD_PARTY_MANUAL_APPROVAL"),

        PENDING_3RD_PARTY("PENDING_3RD_PARTY"),

        PENDING("PENDING"),

        CONFIRMING("CONFIRMING"),

        CONFIRMED("CONFIRMED"),

        COMPLETED("COMPLETED"),

        PARTIALLY_COMPLETED("PARTIALLY_COMPLETED"),

        PENDING_AML_SCREENING("PENDING_AML_SCREENING"),

        CANCELLING("CANCELLING"),

        CANCELLED("CANCELLED"),

        REJECTED("REJECTED"),

        BLOCKED("BLOCKED"),

        FAILED("FAILED"),

        TIMEOUT("TIMEOUT");

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_STATE = "state";
    private StateEnum state;

    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    private BigDecimal timestamp;

    public static final String JSON_PROPERTY_INSTRUCTION_ID = "instructionId";
    private String instructionId;

    public Transaction() {}

    public Transaction id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
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

    public Transaction state(StateEnum state) {
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
    public StateEnum getState() {
        return state;
    }

    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setState(StateEnum state) {
        this.state = state;
    }

    public Transaction timestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getTimestamp() {
        return timestamp;
    }

    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public Transaction instructionId(String instructionId) {
        this.instructionId = instructionId;
        return this;
    }

    /**
     * Get instructionId
     *
     * @return instructionId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_INSTRUCTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getInstructionId() {
        return instructionId;
    }

    @JsonProperty(JSON_PROPERTY_INSTRUCTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId;
    }

    /** Return true if this Transaction object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transaction transaction = (Transaction) o;
        return Objects.equals(this.id, transaction.id)
                && Objects.equals(this.state, transaction.state)
                && Objects.equals(this.timestamp, transaction.timestamp)
                && Objects.equals(this.instructionId, transaction.instructionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, timestamp, instructionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Transaction {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    instructionId: ").append(toIndentedString(instructionId)).append("\n");
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

        // add `timestamp` to the URL query string
        if (getTimestamp() != null) {
            joiner.add(
                    String.format(
                            "%stimestamp%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTimestamp()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `instructionId` to the URL query string
        if (getInstructionId() != null) {
            joiner.add(
                    String.format(
                            "%sinstructionId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getInstructionId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
