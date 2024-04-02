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
import com.fireblocks.sdk.model.GetWorkspaceStatus200Response;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for WorkspaceStatusBetaApi */
@Ignore
public class WorkspaceStatusBetaApiTest {

    private final WorkspaceStatusBetaApi api = new WorkspaceStatusBetaApi();

    /**
     * Returns current workspace status
     *
     * <p>Returns current workspace status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkspaceStatusTest() throws ApiException {
        CompletableFuture<ApiResponse<GetWorkspaceStatus200Response>> response =
                api.getWorkspaceStatus();
    }
}