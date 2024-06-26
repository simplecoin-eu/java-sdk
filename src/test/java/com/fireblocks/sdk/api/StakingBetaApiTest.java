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
import com.fireblocks.sdk.model.ChainInfoResponseDto;
import com.fireblocks.sdk.model.DelegationDto;
import com.fireblocks.sdk.model.DelegationSummaryDto;
import com.fireblocks.sdk.model.ExecuteActionRequest;
import com.fireblocks.sdk.model.ExecuteActionResponse;
import com.fireblocks.sdk.model.ProviderDto;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for StakingBetaApi */
@Ignore
public class StakingBetaApiTest {

    private final StakingBetaApi api = new StakingBetaApi();

    /**
     * Approve the terms of service of the staking provider. This must be called before performing a
     * staking action for the first time with this provider.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void approveTermsOfServiceByProviderIdTest() throws ApiException {
        String providerId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<Object>> response =
                api.approveTermsOfServiceByProviderId(providerId, idempotencyKey);
    }

    /**
     * Perform a chain-specific staking action (e.g. stake, unstake, withdraw).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executeActionTest() throws ApiException {
        ExecuteActionRequest executeActionRequest = null;
        String chainDescriptor = null;
        String actionId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<ExecuteActionResponse>> response =
                api.executeAction(executeActionRequest, chainDescriptor, actionId, idempotencyKey);
    }

    /**
     * Return detailed information on all staking positions, including the staked amount, rewards,
     * status and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllDelegationsTest() throws ApiException {
        String chainDescriptor = null;
        CompletableFuture<ApiResponse<List<DelegationDto>>> response =
                api.getAllDelegations(chainDescriptor);
    }

    /**
     * Return chain-specific, staking-related information summary (e.g. epoch details, lockup
     * durations, estimated rewards, etc.)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChainInfoTest() throws ApiException {
        String chainDescriptor = null;
        CompletableFuture<ApiResponse<ChainInfoResponseDto>> response =
                api.getChainInfo(chainDescriptor);
    }

    /**
     * Return an alphabetical list of supported chains.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChainsTest() throws ApiException {
        CompletableFuture<ApiResponse<List<String>>> response = api.getChains();
    }

    /**
     * Return detailed information on a staking position, including the staked amount, rewards,
     * status and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDelegationByIdTest() throws ApiException {
        String id = null;
        CompletableFuture<ApiResponse<DelegationDto>> response = api.getDelegationById(id);
    }

    /**
     * Return information on all the available staking providers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProvidersTest() throws ApiException {
        CompletableFuture<ApiResponse<List<ProviderDto>>> response = api.getProviders();
    }

    /**
     * Return a summary of all vaults, categorized by their status (active, inactive), the total
     * amounts staked and total rewards per-chain.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSummaryTest() throws ApiException {
        CompletableFuture<ApiResponse<DelegationSummaryDto>> response = api.getSummary();
    }

    /**
     * Return a summary for each vault, categorized by their status (active, inactive), the total
     * amounts staked and total rewards per-chain.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSummaryByVaultTest() throws ApiException {
        CompletableFuture<ApiResponse<Map<String, DelegationSummaryDto>>> response =
                api.getSummaryByVault();
    }
}
