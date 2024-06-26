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

package com.fireblocks.sdk;

public class AdditionalOptions {
    private boolean isAnonymousPlatform;
    private String userAgent;

    public boolean isAnonymousPlatform() {
        return isAnonymousPlatform;
    }

    public AdditionalOptions isAnonymousPlatform(boolean isAnonymousPlatform) {
        this.isAnonymousPlatform = isAnonymousPlatform;
        return this;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public AdditionalOptions userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
}
