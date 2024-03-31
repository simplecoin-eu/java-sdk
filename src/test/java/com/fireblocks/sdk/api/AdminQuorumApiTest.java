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
import com.fireblocks.sdk.model.SetAdminQuorumThresholdRequest;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for AdminQuorumApi */
@Ignore
public class AdminQuorumApiTest {

    private final AdminQuorumApi api = new AdminQuorumApi();

    /**
     * Update admin quorum threshold
     *
     * <p>Update admin quorum threshold
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setAdminQuorumThresholdTest() throws ApiException {
        SetAdminQuorumThresholdRequest setAdminQuorumThresholdRequest = null;
        String idempotencyKey = null;

        CompletableFuture<ApiResponse<Void>> response =
                api.setAdminQuorumThreshold(setAdminQuorumThresholdRequest, idempotencyKey);
    }
}
