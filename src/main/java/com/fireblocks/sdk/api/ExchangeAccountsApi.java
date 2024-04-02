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
import com.fireblocks.sdk.Pair;
import com.fireblocks.sdk.model.ConvertAssetsRequest;
import com.fireblocks.sdk.model.CreateInternalTransferRequest;
import com.fireblocks.sdk.model.ExchangeAccount;
import com.fireblocks.sdk.model.ExchangeAccountsPaged;
import com.fireblocks.sdk.model.ExchangeAsset;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExchangeAccountsApi {
    private final HttpClient memberVarHttpClient;
    private final ObjectMapper memberVarObjectMapper;
    private final String memberVarBaseUri;
    private final Consumer<HttpRequest.Builder> memberVarInterceptor;
    private final Duration memberVarReadTimeout;
    private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
    private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

    public ExchangeAccountsApi() {
        this(new ApiClient());
    }

    public ExchangeAccountsApi(ApiClient apiClient) {
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
     * Convert exchange account funds from the source asset to the destination asset. Convert
     * exchange account funds from the source asset to the destination asset. Coinbase (USD to USDC,
     * USDC to USD) and Bitso (MXN to USD) are supported conversions.
     *
     * @param exchangeAccountId The ID of the exchange account. Please make sure the exchange
     *     supports conversions. To find the ID of your exchange account, use GET/exchange_accounts.
     *     (required)
     * @param convertAssetsRequest (optional)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<Void>> convertAssets(
            String exchangeAccountId,
            ConvertAssetsRequest convertAssetsRequest,
            String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    convertAssetsRequestBuilder(
                            exchangeAccountId, convertAssetsRequest, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("convertAssets", localVarResponse));
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

    private HttpRequest.Builder convertAssetsRequestBuilder(
            String exchangeAccountId,
            ConvertAssetsRequest convertAssetsRequest,
            String idempotencyKey)
            throws ApiException {
        // verify the required parameter 'exchangeAccountId' is set
        if (exchangeAccountId == null) {
            throw new ApiException(
                    400,
                    "Missing the required parameter 'exchangeAccountId' when calling"
                            + " convertAssets");
        }

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/exchange_accounts/{exchangeAccountId}/convert"
                        .replace(
                                "{exchangeAccountId}",
                                ApiClient.urlEncode(exchangeAccountId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(convertAssetsRequest);
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
     * Find a specific exchange account Returns an exchange account by ID.
     *
     * @param exchangeAccountId The ID of the exchange account to return (required)
     * @return CompletableFuture&lt;ApiResponse&lt;ExchangeAccount&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<ExchangeAccount>> getExchangeAccount(
            String exchangeAccountId) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getExchangeAccountRequestBuilder(exchangeAccountId);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException(
                                                    "getExchangeAccount", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<ExchangeAccount>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            ExchangeAccount>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getExchangeAccountRequestBuilder(String exchangeAccountId)
            throws ApiException {
        // verify the required parameter 'exchangeAccountId' is set
        if (exchangeAccountId == null) {
            throw new ApiException(
                    400,
                    "Missing the required parameter 'exchangeAccountId' when calling"
                            + " getExchangeAccount");
        }

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/exchange_accounts/{exchangeAccountId}"
                        .replace(
                                "{exchangeAccountId}",
                                ApiClient.urlEncode(exchangeAccountId.toString()));

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
     * Find an asset for an exchange account Returns an asset for an exchange account.
     *
     * @param exchangeAccountId The ID of the exchange account to return (required)
     * @param assetId The ID of the asset to return (required)
     * @return CompletableFuture&lt;ApiResponse&lt;ExchangeAsset&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<ExchangeAsset>> getExchangeAccountAsset(
            String exchangeAccountId, String assetId) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getExchangeAccountAssetRequestBuilder(exchangeAccountId, assetId);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException(
                                                    "getExchangeAccountAsset", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<ExchangeAsset>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            ExchangeAsset>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getExchangeAccountAssetRequestBuilder(
            String exchangeAccountId, String assetId) throws ApiException {
        // verify the required parameter 'exchangeAccountId' is set
        if (exchangeAccountId == null) {
            throw new ApiException(
                    400,
                    "Missing the required parameter 'exchangeAccountId' when calling"
                            + " getExchangeAccountAsset");
        }
        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new ApiException(
                    400,
                    "Missing the required parameter 'assetId' when calling"
                            + " getExchangeAccountAsset");
        }

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/exchange_accounts/{exchangeAccountId}/{assetId}"
                        .replace(
                                "{exchangeAccountId}",
                                ApiClient.urlEncode(exchangeAccountId.toString()))
                        .replace("{assetId}", ApiClient.urlEncode(assetId.toString()));

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
     * Pagination list exchange accounts Returns a page include exchange accounts.
     *
     * @param limit number of exchanges per page (required)
     * @param before (optional)
     * @param after (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;List&lt;ExchangeAccountsPaged&gt;&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<List<ExchangeAccountsPaged>>> getPagedExchangeAccounts(
            BigDecimal limit, String before, String after) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getPagedExchangeAccountsRequestBuilder(limit, before, after);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException(
                                                    "getPagedExchangeAccounts", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<List<ExchangeAccountsPaged>>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            List<
                                                                                    ExchangeAccountsPaged>>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getPagedExchangeAccountsRequestBuilder(
            BigDecimal limit, String before, String after) throws ApiException {
        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new ApiException(
                    400,
                    "Missing the required parameter 'limit' when calling getPagedExchangeAccounts");
        }

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/exchange_accounts/paged";

        List<Pair> localVarQueryParams = new ArrayList<>();
        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        localVarQueryParameterBaseName = "before";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("before", before));
        localVarQueryParameterBaseName = "after";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("after", after));
        localVarQueryParameterBaseName = "limit";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("limit", limit));

        if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
            StringJoiner queryJoiner = new StringJoiner("&");
            localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
            if (localVarQueryStringJoiner.length() != 0) {
                queryJoiner.add(localVarQueryStringJoiner.toString());
            }
            localVarRequestBuilder.uri(
                    URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
        } else {
            localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
        }

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
     * Internal transfer for exchange accounts Transfers funds between trading accounts under the
     * same exchange account.
     *
     * @param exchangeAccountId The ID of the exchange account to return (required)
     * @param createInternalTransferRequest (optional)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<Void>> internalTransfer(
            String exchangeAccountId,
            CreateInternalTransferRequest createInternalTransferRequest,
            String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    internalTransferRequestBuilder(
                            exchangeAccountId, createInternalTransferRequest, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("internalTransfer", localVarResponse));
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

    private HttpRequest.Builder internalTransferRequestBuilder(
            String exchangeAccountId,
            CreateInternalTransferRequest createInternalTransferRequest,
            String idempotencyKey)
            throws ApiException {
        // verify the required parameter 'exchangeAccountId' is set
        if (exchangeAccountId == null) {
            throw new ApiException(
                    400,
                    "Missing the required parameter 'exchangeAccountId' when calling"
                            + " internalTransfer");
        }

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/exchange_accounts/{exchangeAccountId}/internal_transfer"
                        .replace(
                                "{exchangeAccountId}",
                                ApiClient.urlEncode(exchangeAccountId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(createInternalTransferRequest);
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
}
