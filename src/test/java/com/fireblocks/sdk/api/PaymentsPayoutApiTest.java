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

package com.fireblocks.sdk.api;


import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.model.CreatePayoutRequest;
import com.fireblocks.sdk.model.DispatchPayoutResponse;
import com.fireblocks.sdk.model.PayoutResponse;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for PaymentsPayoutApi */
@Ignore
public class PaymentsPayoutApiTest {

    private final PaymentsPayoutApi api = new PaymentsPayoutApi();

    /**
     * Create a payout instruction set
     *
     * <p>**Note:** The reference content in this section documents the Payments Engine endpoint.
     * The Payments Engine endpoints include APIs available only for customers with Payments Engine
     * enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and
     * might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks
     * Payments Engine, please contact your Fireblocks Customer Success Manager or email
     * CSM@fireblocks.com. &lt;/br&gt; &lt;/br&gt; &lt;b u&gt;Create a payout instruction
     * set.&lt;/b&gt; &lt;/u&gt;&lt;/br&gt; A payout instruction set is a set of instructions for
     * distributing payments from a single payment account to a list of payee accounts. &lt;/br&gt;
     * The instruction set defines: &lt;/br&gt; &lt;ul&gt; &lt;li&gt;the payment account and its
     * account type (vault, exchange, or fiat). &lt;/li&gt; &lt;li&gt;the account type (vault
     * account, exchange account, whitelisted address, network connection, fiat account, or merchant
     * account), the amount, and the asset of payment for each payee account.&lt;/li&gt; &lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPayoutTest() throws ApiException {
        CreatePayoutRequest createPayoutRequest = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<PayoutResponse>> response =
                api.createPayout(createPayoutRequest, idempotencyKey);
    }

    /**
     * Execute a payout instruction set
     *
     * <p>**Note:** The reference content in this section documents the Payments Engine endpoint.
     * The Payments Engine endpoints include APIs available only for customers with Payments Engine
     * enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and
     * might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks
     * Payments Engine, please contact your Fireblocks Customer Success Manager or email
     * CSM@fireblocks.com. &lt;/br&gt; &lt;/br&gt;&lt;b u&gt;Execute a payout instruction
     * set.&lt;/b&gt; &lt;/u&gt; &lt;/br&gt; &lt;/br&gt;The instruction set will be verified and
     * executed.&lt;/br&gt; &lt;b&gt;&lt;u&gt;Source locking&lt;/br&gt;&lt;/b&gt; &lt;/u&gt; If you
     * are executing a payout instruction set from a payment account with an already active payout
     * the active payout will complete before the new payout instruction set can be executed.
     * &lt;/br&gt; You cannot execute the same payout instruction set more than once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executePayoutActionTest() throws ApiException {
        String payoutId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<DispatchPayoutResponse>> response =
                api.executePayoutAction(payoutId, idempotencyKey);
    }

    /**
     * Get the status of a payout instruction set
     *
     * <p>**Note:** The reference content in this section documents the Payments Engine endpoint.
     * The Payments Engine endpoints include APIs available only for customers with Payments Engine
     * enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and
     * might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks
     * Payments Engine, please contact your Fireblocks Customer Success Manager or email
     * CSM@fireblocks.com. &lt;/br&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPayoutTest() throws ApiException {
        String payoutId = null;
        CompletableFuture<ApiResponse<PayoutResponse>> response = api.getPayout(payoutId);
    }
}
