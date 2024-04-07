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

/** ExecutionDisbursementOperation */
@JsonPropertyOrder({
    ExecutionDisbursementOperation.JSON_PROPERTY_OPERATION_ID,
    ExecutionDisbursementOperation.JSON_PROPERTY_STATUS,
    ExecutionDisbursementOperation.JSON_PROPERTY_VALIDATION_FAILURE,
    ExecutionDisbursementOperation.JSON_PROPERTY_OPERATION_TYPE,
    ExecutionDisbursementOperation.JSON_PROPERTY_PREVIEW,
    ExecutionDisbursementOperation.JSON_PROPERTY_EXECUTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecutionDisbursementOperation {
    public static final String JSON_PROPERTY_OPERATION_ID = "operationId";
    private String operationId;

    public static final String JSON_PROPERTY_STATUS = "status";
    private ExecutionOperationStatus status;

    public static final String JSON_PROPERTY_VALIDATION_FAILURE = "validationFailure";
    private DisbursementValidationFailure validationFailure;

    public static final String JSON_PROPERTY_OPERATION_TYPE = "operationType";
    private DisbursementOperationType operationType;

    public static final String JSON_PROPERTY_PREVIEW = "preview";
    private DisbursementOperationPreview preview;

    public static final String JSON_PROPERTY_EXECUTION = "execution";
    private DisbursementOperationExecution execution;

    public ExecutionDisbursementOperation() {}

    public ExecutionDisbursementOperation operationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get operationId
     *
     * @return operationId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_OPERATION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOperationId() {
        return operationId;
    }

    @JsonProperty(JSON_PROPERTY_OPERATION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public ExecutionDisbursementOperation status(ExecutionOperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ExecutionOperationStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(ExecutionOperationStatus status) {
        this.status = status;
    }

    public ExecutionDisbursementOperation validationFailure(
            DisbursementValidationFailure validationFailure) {
        this.validationFailure = validationFailure;
        return this;
    }

    /**
     * Get validationFailure
     *
     * @return validationFailure
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_VALIDATION_FAILURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DisbursementValidationFailure getValidationFailure() {
        return validationFailure;
    }

    @JsonProperty(JSON_PROPERTY_VALIDATION_FAILURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValidationFailure(DisbursementValidationFailure validationFailure) {
        this.validationFailure = validationFailure;
    }

    public ExecutionDisbursementOperation operationType(DisbursementOperationType operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Get operationType
     *
     * @return operationType
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public DisbursementOperationType getOperationType() {
        return operationType;
    }

    @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOperationType(DisbursementOperationType operationType) {
        this.operationType = operationType;
    }

    public ExecutionDisbursementOperation preview(DisbursementOperationPreview preview) {
        this.preview = preview;
        return this;
    }

    /**
     * Get preview
     *
     * @return preview
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PREVIEW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DisbursementOperationPreview getPreview() {
        return preview;
    }

    @JsonProperty(JSON_PROPERTY_PREVIEW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPreview(DisbursementOperationPreview preview) {
        this.preview = preview;
    }

    public ExecutionDisbursementOperation execution(DisbursementOperationExecution execution) {
        this.execution = execution;
        return this;
    }

    /**
     * Get execution
     *
     * @return execution
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DisbursementOperationExecution getExecution() {
        return execution;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExecution(DisbursementOperationExecution execution) {
        this.execution = execution;
    }

    /** Return true if this ExecutionDisbursementOperation object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutionDisbursementOperation executionDisbursementOperation =
                (ExecutionDisbursementOperation) o;
        return Objects.equals(this.operationId, executionDisbursementOperation.operationId)
                && Objects.equals(this.status, executionDisbursementOperation.status)
                && Objects.equals(
                        this.validationFailure, executionDisbursementOperation.validationFailure)
                && Objects.equals(this.operationType, executionDisbursementOperation.operationType)
                && Objects.equals(this.preview, executionDisbursementOperation.preview)
                && Objects.equals(this.execution, executionDisbursementOperation.execution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                operationId, status, validationFailure, operationType, preview, execution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionDisbursementOperation {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    validationFailure: ")
                .append(toIndentedString(validationFailure))
                .append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
        sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
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

        // add `operationId` to the URL query string
        if (getOperationId() != null) {
            joiner.add(
                    String.format(
                            "%soperationId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getOperationId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `status` to the URL query string
        if (getStatus() != null) {
            joiner.add(
                    String.format(
                            "%sstatus%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `validationFailure` to the URL query string
        if (getValidationFailure() != null) {
            joiner.add(
                    getValidationFailure().toUrlQueryString(prefix + "validationFailure" + suffix));
        }

        // add `operationType` to the URL query string
        if (getOperationType() != null) {
            joiner.add(
                    String.format(
                            "%soperationType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getOperationType()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `preview` to the URL query string
        if (getPreview() != null) {
            joiner.add(getPreview().toUrlQueryString(prefix + "preview" + suffix));
        }

        // add `execution` to the URL query string
        if (getExecution() != null) {
            joiner.add(getExecution().toUrlQueryString(prefix + "execution" + suffix));
        }

        return joiner.toString();
    }
}
