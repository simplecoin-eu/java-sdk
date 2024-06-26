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
import com.fireblocks.sdk.model.CreateAssetsBulkRequest;
import com.fireblocks.sdk.model.JobCreated;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for AssetsApi */
@Ignore
public class AssetsApiTest {

    private final AssetsApi api = new AssetsApi();

    /**
     * Bulk creation of wallets
     *
     * <p>Create multiple wallets for a given vault account by running an async job. &lt;/br&gt;
     * **Note**: - These endpoints are currently in beta and might be subject to changes. - We limit
     * accounts to 10k per operation and 200k per customer during beta testing. - Currently, we are
     * only supporting EVM wallets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAssetsBulkTest() throws ApiException {
        CreateAssetsBulkRequest createAssetsBulkRequest = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<JobCreated>> response =
                api.createAssetsBulk(createAssetsBulkRequest, idempotencyKey);
    }
}
