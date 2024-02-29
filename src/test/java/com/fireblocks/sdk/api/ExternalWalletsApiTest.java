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
import com.fireblocks.sdk.model.AddAssetToExternalWalletRequest;
import com.fireblocks.sdk.model.CreateWalletRequest;
import com.fireblocks.sdk.model.ErrorSchema;
import com.fireblocks.sdk.model.ExternalWalletAsset;
import com.fireblocks.sdk.model.SetCustomerRefIdRequest;
import com.fireblocks.sdk.model.UnmanagedWallet;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for ExternalWalletsApi
 */
@Ignore
public class ExternalWalletsApiTest {

    private final ExternalWalletsApi api = new ExternalWalletsApi();

    
    /**
     * Add an asset to an external wallet.
     *
     * Adds an asset to an existing external wallet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAssetToExternalWalletTest() throws ApiException {
        String walletId = null;
        String assetId = null;
        AddAssetToExternalWalletRequest addAssetToExternalWalletRequest = null;
        String idempotencyKey = null;
        CompletableFuture<ExternalWalletAsset> response = 
        api.addAssetToExternalWallet(walletId, assetId, addAssetToExternalWalletRequest, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Create an external wallet
     *
     * Creates a new external wallet with the requested name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExternalWalletTest() throws ApiException {
        CreateWalletRequest createWalletRequest = null;
        String idempotencyKey = null;
        CompletableFuture<UnmanagedWallet> response = 
        api.createExternalWallet(createWalletRequest, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Delete an external wallet
     *
     * Deletes an external wallet by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteExternalWalletTest() throws ApiException {
        String walletId = null;
        
        CompletableFuture<Void> response = api.deleteExternalWallet(walletId);
        
        // TODO: test validations
    }
    
    /**
     * Find an external wallet
     *
     * Returns an external wallet by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalWalletTest() throws ApiException {
        String walletId = null;
        CompletableFuture<UnmanagedWallet> response = 
        api.getExternalWallet(walletId);
        
        // TODO: test validations
    }
    
    /**
     * Get an asset from an external wallet
     *
     * Returns an external wallet by wallet ID and asset ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalWalletAssetTest() throws ApiException {
        String walletId = null;
        String assetId = null;
        CompletableFuture<ExternalWalletAsset> response = 
        api.getExternalWalletAsset(walletId, assetId);
        
        // TODO: test validations
    }
    
    /**
     * List external wallets
     *
     * Gets a list of external wallets under the workspace.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalWalletsTest() throws ApiException {
        CompletableFuture<List<UnmanagedWallet>> response = 
        api.getExternalWallets();
        
        // TODO: test validations
    }
    
    /**
     * Delete an asset from an external wallet
     *
     * Deletes an external wallet asset by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAssetFromExternalWalletTest() throws ApiException {
        String walletId = null;
        String assetId = null;
        
        CompletableFuture<Void> response = api.removeAssetFromExternalWallet(walletId, assetId);
        
        // TODO: test validations
    }
    
    /**
     * Set an AML customer reference ID for an external wallet
     *
     * Sets an AML/KYT customer reference ID for the specific external wallet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalWalletCustomerRefIdTest() throws ApiException {
        SetCustomerRefIdRequest setCustomerRefIdRequest = null;
        String walletId = null;
        String idempotencyKey = null;
        
        CompletableFuture<Void> response = api.setExternalWalletCustomerRefId(setCustomerRefIdRequest, walletId, idempotencyKey);
        
        // TODO: test validations
    }
    
}
