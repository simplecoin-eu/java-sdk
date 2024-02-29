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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fireblocks.sdk.model.AmlScreeningResult;
import com.fireblocks.sdk.model.AmountInfo;
import com.fireblocks.sdk.model.AuthorizationInfo;
import com.fireblocks.sdk.model.BlockInfo;
import com.fireblocks.sdk.model.ComplianceResult;
import com.fireblocks.sdk.model.DestinationTransferPeerPathResponse;
import com.fireblocks.sdk.model.FeeInfo;
import com.fireblocks.sdk.model.GetTransactionOperation;
import com.fireblocks.sdk.model.NetworkRecord;
import com.fireblocks.sdk.model.RewardInfo;
import com.fireblocks.sdk.model.SignedMessage;
import com.fireblocks.sdk.model.SourceTransferPeerPathResponse;
import com.fireblocks.sdk.model.SystemMessageInfo;
import com.fireblocks.sdk.model.TransactionResponseContractCallDecodedData;
import com.fireblocks.sdk.model.TransactionResponseDestination;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Model tests for TransactionResponse
 */
public class TransactionResponseTest {
    private final TransactionResponse model = new TransactionResponse();

    /**
     * Model tests for TransactionResponse
     */
    @Test
    public void testTransactionResponse() {
        // TODO: test TransactionResponse
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'externalTxId'
     */
    @Test
    public void externalTxIdTest() {
        // TODO: test externalTxId
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'subStatus'
     */
    @Test
    public void subStatusTest() {
        // TODO: test subStatus
    }

    /**
     * Test the property 'txHash'
     */
    @Test
    public void txHashTest() {
        // TODO: test txHash
    }

    /**
     * Test the property 'operation'
     */
    @Test
    public void operationTest() {
        // TODO: test operation
    }

    /**
     * Test the property 'note'
     */
    @Test
    public void noteTest() {
        // TODO: test note
    }

    /**
     * Test the property 'assetId'
     */
    @Test
    public void assetIdTest() {
        // TODO: test assetId
    }

    /**
     * Test the property 'source'
     */
    @Test
    public void sourceTest() {
        // TODO: test source
    }

    /**
     * Test the property 'sourceAddress'
     */
    @Test
    public void sourceAddressTest() {
        // TODO: test sourceAddress
    }

    /**
     * Test the property 'tag'
     */
    @Test
    public void tagTest() {
        // TODO: test tag
    }

    /**
     * Test the property 'destination'
     */
    @Test
    public void destinationTest() {
        // TODO: test destination
    }

    /**
     * Test the property 'destinations'
     */
    @Test
    public void destinationsTest() {
        // TODO: test destinations
    }

    /**
     * Test the property 'destinationAddress'
     */
    @Test
    public void destinationAddressTest() {
        // TODO: test destinationAddress
    }

    /**
     * Test the property 'destinationAddressDescription'
     */
    @Test
    public void destinationAddressDescriptionTest() {
        // TODO: test destinationAddressDescription
    }

    /**
     * Test the property 'destinationTag'
     */
    @Test
    public void destinationTagTest() {
        // TODO: test destinationTag
    }

    /**
     * Test the property 'contractCallDecodedData'
     */
    @Test
    public void contractCallDecodedDataTest() {
        // TODO: test contractCallDecodedData
    }

    /**
     * Test the property 'amountInfo'
     */
    @Test
    public void amountInfoTest() {
        // TODO: test amountInfo
    }

    /**
     * Test the property 'treatAsGrossAmount'
     */
    @Test
    public void treatAsGrossAmountTest() {
        // TODO: test treatAsGrossAmount
    }

    /**
     * Test the property 'feeInfo'
     */
    @Test
    public void feeInfoTest() {
        // TODO: test feeInfo
    }

    /**
     * Test the property 'feeCurrency'
     */
    @Test
    public void feeCurrencyTest() {
        // TODO: test feeCurrency
    }

    /**
     * Test the property 'networkRecords'
     */
    @Test
    public void networkRecordsTest() {
        // TODO: test networkRecords
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'lastUpdated'
     */
    @Test
    public void lastUpdatedTest() {
        // TODO: test lastUpdated
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'signedBy'
     */
    @Test
    public void signedByTest() {
        // TODO: test signedBy
    }

    /**
     * Test the property 'rejectedBy'
     */
    @Test
    public void rejectedByTest() {
        // TODO: test rejectedBy
    }

    /**
     * Test the property 'authorizationInfo'
     */
    @Test
    public void authorizationInfoTest() {
        // TODO: test authorizationInfo
    }

    /**
     * Test the property 'exchangeTxId'
     */
    @Test
    public void exchangeTxIdTest() {
        // TODO: test exchangeTxId
    }

    /**
     * Test the property 'customerRefId'
     */
    @Test
    public void customerRefIdTest() {
        // TODO: test customerRefId
    }

    /**
     * Test the property 'amlScreeningResult'
     */
    @Test
    public void amlScreeningResultTest() {
        // TODO: test amlScreeningResult
    }

    /**
     * Test the property 'complianceResult'
     */
    @Test
    public void complianceResultTest() {
        // TODO: test complianceResult
    }

    /**
     * Test the property 'extraParameters'
     */
    @Test
    public void extraParametersTest() {
        // TODO: test extraParameters
    }

    /**
     * Test the property 'signedMessages'
     */
    @Test
    public void signedMessagesTest() {
        // TODO: test signedMessages
    }

    /**
     * Test the property 'numOfConfirmations'
     */
    @Test
    public void numOfConfirmationsTest() {
        // TODO: test numOfConfirmations
    }

    /**
     * Test the property 'blockInfo'
     */
    @Test
    public void blockInfoTest() {
        // TODO: test blockInfo
    }

    /**
     * Test the property 'index'
     */
    @Test
    public void indexTest() {
        // TODO: test index
    }

    /**
     * Test the property 'rewardInfo'
     */
    @Test
    public void rewardInfoTest() {
        // TODO: test rewardInfo
    }

    /**
     * Test the property 'systemMessages'
     */
    @Test
    public void systemMessagesTest() {
        // TODO: test systemMessages
    }

    /**
     * Test the property 'addressType'
     */
    @Test
    public void addressTypeTest() {
        // TODO: test addressType
    }

    /**
     * Test the property 'requestedAmount'
     */
    @Test
    public void requestedAmountTest() {
        // TODO: test requestedAmount
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'netAmount'
     */
    @Test
    public void netAmountTest() {
        // TODO: test netAmount
    }

    /**
     * Test the property 'amountUSD'
     */
    @Test
    public void amountUSDTest() {
        // TODO: test amountUSD
    }

    /**
     * Test the property 'serviceFee'
     */
    @Test
    public void serviceFeeTest() {
        // TODO: test serviceFee
    }

    /**
     * Test the property 'fee'
     */
    @Test
    public void feeTest() {
        // TODO: test fee
    }

    /**
     * Test the property 'networkFee'
     */
    @Test
    public void networkFeeTest() {
        // TODO: test networkFee
    }

}
