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

/** TransactionRequestDestination */
@JsonPropertyOrder({
    TransactionRequestDestination.JSON_PROPERTY_AMOUNT,
    TransactionRequestDestination.JSON_PROPERTY_DESTINATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionRequestDestination {
    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private String amount;

    public static final String JSON_PROPERTY_DESTINATION = "destination";
    private DestinationTransferPeerPath destination;

    public TransactionRequestDestination() {}

    public TransactionRequestDestination amount(String amount) {
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

    public TransactionRequestDestination destination(DestinationTransferPeerPath destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get destination
     *
     * @return destination
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DESTINATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DestinationTransferPeerPath getDestination() {
        return destination;
    }

    @JsonProperty(JSON_PROPERTY_DESTINATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDestination(DestinationTransferPeerPath destination) {
        this.destination = destination;
    }

    /** Return true if this TransactionRequestDestination object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionRequestDestination transactionRequestDestination =
                (TransactionRequestDestination) o;
        return Objects.equals(this.amount, transactionRequestDestination.amount)
                && Objects.equals(this.destination, transactionRequestDestination.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, destination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionRequestDestination {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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

        // add `destination` to the URL query string
        if (getDestination() != null) {
            joiner.add(getDestination().toUrlQueryString(prefix + "destination" + suffix));
        }

        return joiner.toString();
    }
}
