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
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets or Sets TransferPeerPathSubType */
public enum TransferPeerPathSubType {
    BINANCE("BINANCE"),

    BINANCEUS("BINANCEUS"),

    BITFINEX("BITFINEX"),

    BITHUMB("BITHUMB"),

    BITMEX("BITMEX"),

    BITSO("BITSO"),

    BITSTAMP("BITSTAMP"),

    BITTREX("BITTREX"),

    BLINC("BLINC"),

    BYBIT("BYBIT"),

    CIRCLE("CIRCLE"),

    COINBASEEXCHANGE("COINBASEEXCHANGE"),

    COINBASEPRO("COINBASEPRO"),

    COINMETRO("COINMETRO"),

    COINSPRO("COINSPRO"),

    CRYPTOCOM("CRYPTOCOM"),

    DERIBIT("DERIBIT"),

    GEMINI("GEMINI"),

    HITBTC("HITBTC"),

    HUOBI("HUOBI"),

    INDEPENDENTRESERVE("INDEPENDENTRESERVE"),

    KORBIT("KORBIT"),

    KRAKEN("KRAKEN"),

    KRAKENINTL("KRAKENINTL"),

    KUCOIN("KUCOIN"),

    LIQUID("LIQUID"),

    OKCOIN("OKCOIN"),

    OKEX("OKEX"),

    PAXOS("PAXOS"),

    POLONIEX("POLONIEX"),

    EXTERNAL("External"),

    INTERNAL("Internal");

    private String value;

    TransferPeerPathSubType(String value) {
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
    public static TransferPeerPathSubType fromValue(String value) {
        for (TransferPeerPathSubType b : TransferPeerPathSubType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }

        return String.format("%s=%s", prefix, this.toString());
    }
}
