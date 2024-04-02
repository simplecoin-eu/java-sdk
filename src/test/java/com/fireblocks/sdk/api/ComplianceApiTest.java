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
import com.fireblocks.sdk.model.ScreeningConfigurationsRequest;
import com.fireblocks.sdk.model.ScreeningPolicyResponse;
import com.fireblocks.sdk.model.ScreeningProviderRulesConfigurationResponse;
import com.fireblocks.sdk.model.ScreeningUpdateConfigurationsRequest;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for ComplianceApi */
@Ignore
public class ComplianceApiTest {

    private final ComplianceApi api = new ComplianceApi();

    /**
     * AML - View Post-Screening Policy
     *
     * <p>Get the post-screening policy for AML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAmlPostScreeningPolicyTest() throws ApiException {
        CompletableFuture<ApiResponse<ScreeningPolicyResponse>> response =
                api.getAmlPostScreeningPolicy();
    }

    /**
     * AML - View Screening Policy
     *
     * <p>Get the screening policy for AML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAmlScreeningPolicyTest() throws ApiException {
        CompletableFuture<ApiResponse<ScreeningProviderRulesConfigurationResponse>> response =
                api.getAmlScreeningPolicy();
    }

    /**
     * Travel Rule - View Post-Screening Policy
     *
     * <p>Get the post-screening policy for Travel Rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPostScreeningPolicyTest() throws ApiException {
        CompletableFuture<ApiResponse<ScreeningPolicyResponse>> response =
                api.getPostScreeningPolicy();
    }

    /**
     * Travel Rule - View Screening Policy
     *
     * <p>Get the screening policy for Travel Rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScreeningPolicyTest() throws ApiException {
        CompletableFuture<ApiResponse<ScreeningProviderRulesConfigurationResponse>> response =
                api.getScreeningPolicy();
    }

    /**
     * Update AML Configuration
     *
     * <p>Updates bypass screening, inbound delay, or outbound delay configurations for AML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAmlScreeningConfigurationTest() throws ApiException {
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> response =
                api.updateAmlScreeningConfiguration(idempotencyKey);
    }

    /**
     * Tenant - Screening Configuration
     *
     * <p>Update tenant screening configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateScreeningConfigurationTest() throws ApiException {
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<ScreeningUpdateConfigurationsRequest>> response =
                api.updateScreeningConfiguration(idempotencyKey);
    }

    /**
     * Update Travel Rule Configuration
     *
     * <p>Updates bypass screening, inbound delay, or outbound delay configurations for Travel Rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTravelRuleConfigTest() throws ApiException {
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> response =
                api.updateTravelRuleConfig(idempotencyKey);
    }
}