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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * - NOT_STARTED - waiting to start - TRANSACTION_SENT - an underlying transaction was sent - COMPLETED - completed successfully - FAILED - failed - TRANSLATION_ERROR -lookup of the destination failed (due to changes in the underlying whitelisted external wallet or similar) - SKIPPED- no transaction(s) created for this instruction 
 */
public enum PayoutInstructionState {
  
  NOT_STARTED("NOT_STARTED"),
  
  TRANSACTION_SENT("TRANSACTION_SENT"),
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED"),
  
  TRANSLATION_ERROR("TRANSLATION_ERROR"),
  
  SKIPPED("SKIPPED");

  private String value;

  PayoutInstructionState(String value) {
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
  public static PayoutInstructionState fromValue(String value) {
    for (PayoutInstructionState b : PayoutInstructionState.values()) {
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

