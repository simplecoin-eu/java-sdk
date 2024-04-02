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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** ExchangeSettlementTransactionsResponse */
@JsonPropertyOrder({
    ExchangeSettlementTransactionsResponse.JSON_PROPERTY_TO_EXCHANGE,
    ExchangeSettlementTransactionsResponse.JSON_PROPERTY_TO_COLLATERAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExchangeSettlementTransactionsResponse {
    public static final String JSON_PROPERTY_TO_EXCHANGE = "toExchange";
    private List<ToExchangeTransaction> toExchange;

    public static final String JSON_PROPERTY_TO_COLLATERAL = "toCollateral";
    private List<ToCollateralTransaction> toCollateral;

    public ExchangeSettlementTransactionsResponse() {}

    public ExchangeSettlementTransactionsResponse toExchange(
            List<ToExchangeTransaction> toExchange) {
        this.toExchange = toExchange;
        return this;
    }

    public ExchangeSettlementTransactionsResponse addToExchangeItem(
            ToExchangeTransaction toExchangeItem) {
        if (this.toExchange == null) {
            this.toExchange = new ArrayList<>();
        }
        this.toExchange.add(toExchangeItem);
        return this;
    }

    /**
     * Get toExchange
     *
     * @return toExchange
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TO_EXCHANGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ToExchangeTransaction> getToExchange() {
        return toExchange;
    }

    @JsonProperty(JSON_PROPERTY_TO_EXCHANGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setToExchange(List<ToExchangeTransaction> toExchange) {
        this.toExchange = toExchange;
    }

    public ExchangeSettlementTransactionsResponse toCollateral(
            List<ToCollateralTransaction> toCollateral) {
        this.toCollateral = toCollateral;
        return this;
    }

    public ExchangeSettlementTransactionsResponse addToCollateralItem(
            ToCollateralTransaction toCollateralItem) {
        if (this.toCollateral == null) {
            this.toCollateral = new ArrayList<>();
        }
        this.toCollateral.add(toCollateralItem);
        return this;
    }

    /**
     * Get toCollateral
     *
     * @return toCollateral
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TO_COLLATERAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ToCollateralTransaction> getToCollateral() {
        return toCollateral;
    }

    @JsonProperty(JSON_PROPERTY_TO_COLLATERAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setToCollateral(List<ToCollateralTransaction> toCollateral) {
        this.toCollateral = toCollateral;
    }

    /** Return true if this ExchangeSettlementTransactionsResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExchangeSettlementTransactionsResponse exchangeSettlementTransactionsResponse =
                (ExchangeSettlementTransactionsResponse) o;
        return Objects.equals(this.toExchange, exchangeSettlementTransactionsResponse.toExchange)
                && Objects.equals(
                        this.toCollateral, exchangeSettlementTransactionsResponse.toCollateral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toExchange, toCollateral);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExchangeSettlementTransactionsResponse {\n");
        sb.append("    toExchange: ").append(toIndentedString(toExchange)).append("\n");
        sb.append("    toCollateral: ").append(toIndentedString(toCollateral)).append("\n");
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

        // add `toExchange` to the URL query string
        if (getToExchange() != null) {
            for (int i = 0; i < getToExchange().size(); i++) {
                if (getToExchange().get(i) != null) {
                    joiner.add(
                            getToExchange()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%stoExchange%s%s",
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

        // add `toCollateral` to the URL query string
        if (getToCollateral() != null) {
            for (int i = 0; i < getToCollateral().size(); i++) {
                if (getToCollateral().get(i) != null) {
                    joiner.add(
                            getToCollateral()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%stoCollateral%s%s",
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