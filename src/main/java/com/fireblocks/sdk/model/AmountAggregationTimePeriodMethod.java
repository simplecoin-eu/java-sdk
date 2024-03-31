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

/**
 * * PER_SINGLE_MATCH - Apply the limit to each listed entity * ACROSS_ALL_MATCHES - Apply the limit
 * to the sum of all listed entities
 */
public enum AmountAggregationTimePeriodMethod {
    PER_SINGLE_MATCH("PER_SINGLE_MATCH"),

    ACROSS_ALL_MATCHES("ACROSS_ALL_MATCHES");

    private String value;

    AmountAggregationTimePeriodMethod(String value) {
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
    public static AmountAggregationTimePeriodMethod fromValue(String value) {
        for (AmountAggregationTimePeriodMethod b : AmountAggregationTimePeriodMethod.values()) {
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
