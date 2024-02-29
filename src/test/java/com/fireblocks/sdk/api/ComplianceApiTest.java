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
import com.fireblocks.sdk.model.ScreeningConfigurationsRequest;
import com.fireblocks.sdk.model.ScreeningPolicyResponse;
import com.fireblocks.sdk.model.ScreeningProviderRulesConfigurationResponse;
import com.fireblocks.sdk.model.ScreeningUpdateConfigurationsRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for ComplianceApi
 */
@Ignore
public class ComplianceApiTest {

    private final ComplianceApi api = new ComplianceApi();

    
    /**
     * AML - View Post-Screening Policy
     *
     * Get the post-screening policy for AML.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAmlPostScreeningPolicyTest() throws ApiException {
        CompletableFuture<ScreeningPolicyResponse> response = 
        api.getAmlPostScreeningPolicy();
        
        // TODO: test validations
    }
    
    /**
     * AML - View Screening Policy
     *
     * Get the screening policy for AML.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAmlScreeningPolicyTest() throws ApiException {
        CompletableFuture<ScreeningProviderRulesConfigurationResponse> response = 
        api.getAmlScreeningPolicy();
        
        // TODO: test validations
    }
    
    /**
     * Travel Rule - View Post-Screening Policy
     *
     * Get the post-screening policy for Travel Rule.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPostScreeningPolicyTest() throws ApiException {
        CompletableFuture<ScreeningPolicyResponse> response = 
        api.getPostScreeningPolicy();
        
        // TODO: test validations
    }
    
    /**
     * Travel Rule - View Screening Policy
     *
     * Get the screening policy for Travel Rule.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScreeningPolicyTest() throws ApiException {
        CompletableFuture<ScreeningProviderRulesConfigurationResponse> response = 
        api.getScreeningPolicy();
        
        // TODO: test validations
    }
    
    /**
     * Update AML Configuration
     *
     * Updates bypass screening, inbound delay, or outbound delay configurations for AML.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAmlScreeningConfigurationTest() throws ApiException {
        String idempotencyKey = null;
        CompletableFuture<ScreeningConfigurationsRequest> response = 
        api.updateAmlScreeningConfiguration(idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Tenant - Screening Configuration
     *
     * Update tenant screening configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateScreeningConfigurationTest() throws ApiException {
        String idempotencyKey = null;
        CompletableFuture<ScreeningUpdateConfigurationsRequest> response = 
        api.updateScreeningConfiguration(idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Update Travel Rule Configuration
     *
     * Updates bypass screening, inbound delay, or outbound delay configurations for Travel Rule.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTravelRuleConfigTest() throws ApiException {
        String idempotencyKey = null;
        CompletableFuture<ScreeningConfigurationsRequest> response = 
        api.updateTravelRuleConfig(idempotencyKey);
        
        // TODO: test validations
    }
    
}
