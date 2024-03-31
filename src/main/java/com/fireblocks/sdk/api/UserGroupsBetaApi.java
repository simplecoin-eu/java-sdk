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


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.model.CreateUserGroupResponse;
import com.fireblocks.sdk.model.UserGroupCreateRequest;
import com.fireblocks.sdk.model.UserGroupCreateResponse;
import com.fireblocks.sdk.model.UserGroupResponse;
import com.fireblocks.sdk.model.UserGroupUpdateRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserGroupsBetaApi {
    private final HttpClient memberVarHttpClient;
    private final ObjectMapper memberVarObjectMapper;
    private final String memberVarBaseUri;
    private final Consumer<HttpRequest.Builder> memberVarInterceptor;
    private final Duration memberVarReadTimeout;
    private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
    private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

    public UserGroupsBetaApi() {
        this(new ApiClient());
    }

    public UserGroupsBetaApi(ApiClient apiClient) {
        memberVarHttpClient = apiClient.getHttpClient();
        memberVarObjectMapper = apiClient.getObjectMapper();
        memberVarBaseUri = apiClient.getBaseUri();
        memberVarInterceptor = apiClient.getRequestInterceptor();
        memberVarReadTimeout = apiClient.getReadTimeout();
        memberVarResponseInterceptor = apiClient.getResponseInterceptor();
        memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
    }

    private ApiException getApiException(String operationId, HttpResponse<String> response) {
        String message =
                formatExceptionMessage(operationId, response.statusCode(), response.body());
        return new ApiException(
                response.statusCode(), message, response.headers(), response.body());
    }

    private String formatExceptionMessage(String operationId, int statusCode, String body) {
        if (body == null || body.isEmpty()) {
            body = "[no body]";
        }
        return operationId + " call failed with: " + statusCode + " - " + body;
    }

    /**
     * Create user group Create a new user group.&lt;/br&gt; **Note**: - This endpoint is now in
     * Beta, disabled for general availability at this time. - Please note that this endpoint is
     * available only for API keys with Admin permissions.
     *
     * @param userGroupCreateRequest (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;CreateUserGroupResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<CreateUserGroupResponse>> createUserGroup(
            UserGroupCreateRequest userGroupCreateRequest, String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    createUserGroupRequestBuilder(userGroupCreateRequest, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("createUserGroup", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<CreateUserGroupResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            CreateUserGroupResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder createUserGroupRequestBuilder(
            UserGroupCreateRequest userGroupCreateRequest, String idempotencyKey)
            throws ApiException {
        // verify the required parameter 'userGroupCreateRequest' is set
        if (userGroupCreateRequest == null) {
            throw new ApiException(
                    400,
                    "Missing the required parameter 'userGroupCreateRequest' when calling"
                            + " createUserGroup");
        }

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/management/user_groups";

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(userGroupCreateRequest);
            localVarRequestBuilder.method(
                    "POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
        } catch (IOException e) {
            throw new ApiException(e);
        }
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
    /**
     * Delete user group Delete a user group by ID.&lt;/br&gt; **Note**: - This endpoint is now in
     * Beta, disabled for general availability at this time. - Please note that this endpoint is
     * available only for API keys with Admin permissions.
     *
     * @param groupId The ID of the user group (required)
     * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<Void>> deleteUserGroup(String groupId)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder = deleteUserGroupRequestBuilder(groupId);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("deleteUserGroup", localVarResponse));
                                }
                                return CompletableFuture.completedFuture(
                                        new ApiResponse<Void>(
                                                localVarResponse.statusCode(),
                                                localVarResponse.headers().map(),
                                                null));
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder deleteUserGroupRequestBuilder(String groupId) throws ApiException {
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException(
                    400, "Missing the required parameter 'groupId' when calling deleteUserGroup");
        }

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/management/user_groups/{groupId}"
                        .replace("{groupId}", ApiClient.urlEncode(groupId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        localVarRequestBuilder.header("Accept", "application/json");

        localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
    /**
     * Get user group Get a user group by ID.&lt;/br&gt; **Note**: - This endpoint is now in Beta,
     * disabled for general availability at this time. - Please note that this endpoint is available
     * only for API keys with Admin permissions.
     *
     * @param groupId The ID of the user group (required)
     * @return CompletableFuture&lt;ApiResponse&lt;UserGroupResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<UserGroupResponse>> getUserGroup(String groupId)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder = getUserGroupRequestBuilder(groupId);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("getUserGroup", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<UserGroupResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            UserGroupResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getUserGroupRequestBuilder(String groupId) throws ApiException {
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException(
                    400, "Missing the required parameter 'groupId' when calling getUserGroup");
        }

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/management/user_groups/{groupId}"
                        .replace("{groupId}", ApiClient.urlEncode(groupId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        localVarRequestBuilder.header("Accept", "application/json");

        localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
    /**
     * List user groups Get all user groups in your workspace. &lt;/br&gt; **Note**: - This endpoint
     * is now in Beta, disabled for general availability at this time. - Please note that this
     * endpoint is available only for API keys with Admin permissions.
     *
     * @return CompletableFuture&lt;ApiResponse&lt;List&lt;UserGroupResponse&gt;&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<List<UserGroupResponse>>> getUserGroups()
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder = getUserGroupsRequestBuilder();
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("getUserGroups", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<List<UserGroupResponse>>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            List<
                                                                                    UserGroupResponse>>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getUserGroupsRequestBuilder() throws ApiException {

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/management/user_groups";

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        localVarRequestBuilder.header("Accept", "application/json");

        localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
    /**
     * Update user group Update a user group by ID.&lt;/br&gt; **Note**: - This endpoint is now in
     * Beta, disabled for general availability at this time. - Please note that this endpoint is
     * available only for API keys with Admin permissions.
     *
     * @param userGroupUpdateRequest (required)
     * @param groupId The ID of the user group (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;UserGroupCreateResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<UserGroupCreateResponse>> updateUserGroup(
            UserGroupUpdateRequest userGroupUpdateRequest, String groupId, String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    updateUserGroupRequestBuilder(userGroupUpdateRequest, groupId, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("updateUserGroup", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<UserGroupCreateResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            UserGroupCreateResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder updateUserGroupRequestBuilder(
            UserGroupUpdateRequest userGroupUpdateRequest, String groupId, String idempotencyKey)
            throws ApiException {
        // verify the required parameter 'userGroupUpdateRequest' is set
        if (userGroupUpdateRequest == null) {
            throw new ApiException(
                    400,
                    "Missing the required parameter 'userGroupUpdateRequest' when calling"
                            + " updateUserGroup");
        }
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException(
                    400, "Missing the required parameter 'groupId' when calling updateUserGroup");
        }

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/management/user_groups/{groupId}"
                        .replace("{groupId}", ApiClient.urlEncode(groupId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(userGroupUpdateRequest);
            localVarRequestBuilder.method(
                    "PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
        } catch (IOException e) {
            throw new ApiException(e);
        }
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
}
