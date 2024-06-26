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

package com.fireblocks.sdk.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** AuditorData */
@JsonPropertyOrder({
    AuditorData.JSON_PROPERTY_NAME,
    AuditorData.JSON_PROPERTY_IMAGE_U_R_L,
    AuditorData.JSON_PROPERTY_LINK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditorData {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_IMAGE_U_R_L = "imageURL";
    private String imageURL;

    public static final String JSON_PROPERTY_LINK = "link";
    private String link;

    public AuditorData() {}

    public AuditorData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public AuditorData imageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    /**
     * Get imageURL
     *
     * @return imageURL
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IMAGE_U_R_L)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getImageURL() {
        return imageURL;
    }

    @JsonProperty(JSON_PROPERTY_IMAGE_U_R_L)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public AuditorData link(String link) {
        this.link = link;
        return this;
    }

    /**
     * Get link
     *
     * @return link
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_LINK)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getLink() {
        return link;
    }

    @JsonProperty(JSON_PROPERTY_LINK)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLink(String link) {
        this.link = link;
    }

    /** Return true if this AuditorData object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuditorData auditorData = (AuditorData) o;
        return Objects.equals(this.name, auditorData.name)
                && Objects.equals(this.imageURL, auditorData.imageURL)
                && Objects.equals(this.link, auditorData.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageURL, link);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditorData {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(
                    String.format(
                            "%sname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `imageURL` to the URL query string
        if (getImageURL() != null) {
            joiner.add(
                    String.format(
                            "%simageURL%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getImageURL()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `link` to the URL query string
        if (getLink() != null) {
            joiner.add(
                    String.format(
                            "%slink%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getLink()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
