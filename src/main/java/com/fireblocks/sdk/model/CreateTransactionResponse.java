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

/** CreateTransactionResponse */
@JsonPropertyOrder({
    CreateTransactionResponse.JSON_PROPERTY_ID,
    CreateTransactionResponse.JSON_PROPERTY_STATUS,
    CreateTransactionResponse.JSON_PROPERTY_SYSTEM_MESSAGES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTransactionResponse {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public static final String JSON_PROPERTY_SYSTEM_MESSAGES = "systemMessages";
    private SystemMessageInfo systemMessages;

    public CreateTransactionResponse() {}

    public CreateTransactionResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the transaction.
     *
     * @return id
     */
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

    public CreateTransactionResponse status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The primary status of the transaction. For details, see [Primary transaction statuses.]
     * (https://developers.fireblocks.com/reference/primary-transaction-statuses)
     *
     * @return status
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(String status) {
        this.status = status;
    }

    public CreateTransactionResponse systemMessages(SystemMessageInfo systemMessages) {
        this.systemMessages = systemMessages;
        return this;
    }

    /**
     * Get systemMessages
     *
     * @return systemMessages
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SYSTEM_MESSAGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SystemMessageInfo getSystemMessages() {
        return systemMessages;
    }

    @JsonProperty(JSON_PROPERTY_SYSTEM_MESSAGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSystemMessages(SystemMessageInfo systemMessages) {
        this.systemMessages = systemMessages;
    }

    /** Return true if this CreateTransactionResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransactionResponse createTransactionResponse = (CreateTransactionResponse) o;
        return Objects.equals(this.id, createTransactionResponse.id)
                && Objects.equals(this.status, createTransactionResponse.status)
                && Objects.equals(this.systemMessages, createTransactionResponse.systemMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, systemMessages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransactionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    systemMessages: ").append(toIndentedString(systemMessages)).append("\n");
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

        // add `systemMessages` to the URL query string
        if (getSystemMessages() != null) {
            joiner.add(getSystemMessages().toUrlQueryString(prefix + "systemMessages" + suffix));
        }

        return joiner.toString();
    }
}
