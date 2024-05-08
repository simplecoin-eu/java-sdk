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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** ReadAbiFunction */
@JsonPropertyOrder({
    ReadAbiFunction.JSON_PROPERTY_STATE_MUTABILITY,
    ReadAbiFunction.JSON_PROPERTY_OUTPUTS,
    ReadAbiFunction.JSON_PROPERTY_NAME,
    ReadAbiFunction.JSON_PROPERTY_TYPE,
    ReadAbiFunction.JSON_PROPERTY_INPUTS,
    ReadAbiFunction.JSON_PROPERTY_DESCRIPTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadAbiFunction {
    /** Gets or Sets stateMutability */
    public enum StateMutabilityEnum {
        PURE("pure"),

        VIEW("view");

        private String value;

        StateMutabilityEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateMutabilityEnum fromValue(String value) {
            for (StateMutabilityEnum b : StateMutabilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_STATE_MUTABILITY = "stateMutability";
    private StateMutabilityEnum stateMutability;

    public static final String JSON_PROPERTY_OUTPUTS = "outputs";
    private List<Parameter> outputs;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_INPUTS = "inputs";
    private List<ParameterWithValue> inputs = new ArrayList<>();

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public ReadAbiFunction() {}

    public ReadAbiFunction stateMutability(StateMutabilityEnum stateMutability) {
        this.stateMutability = stateMutability;
        return this;
    }

    /**
     * Get stateMutability
     *
     * @return stateMutability
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATE_MUTABILITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public StateMutabilityEnum getStateMutability() {
        return stateMutability;
    }

    @JsonProperty(JSON_PROPERTY_STATE_MUTABILITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStateMutability(StateMutabilityEnum stateMutability) {
        this.stateMutability = stateMutability;
    }

    public ReadAbiFunction outputs(List<Parameter> outputs) {
        this.outputs = outputs;
        return this;
    }

    public ReadAbiFunction addOutputsItem(Parameter outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    /**
     * Get outputs
     *
     * @return outputs
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_OUTPUTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Parameter> getOutputs() {
        return outputs;
    }

    @JsonProperty(JSON_PROPERTY_OUTPUTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOutputs(List<Parameter> outputs) {
        this.outputs = outputs;
    }

    public ReadAbiFunction name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public ReadAbiFunction type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(String type) {
        this.type = type;
    }

    public ReadAbiFunction inputs(List<ParameterWithValue> inputs) {
        this.inputs = inputs;
        return this;
    }

    public ReadAbiFunction addInputsItem(ParameterWithValue inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    /**
     * Get inputs
     *
     * @return inputs
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_INPUTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<ParameterWithValue> getInputs() {
        return inputs;
    }

    @JsonProperty(JSON_PROPERTY_INPUTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInputs(List<ParameterWithValue> inputs) {
        this.inputs = inputs;
    }

    public ReadAbiFunction description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    /** Return true if this ReadAbiFunction object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadAbiFunction readAbiFunction = (ReadAbiFunction) o;
        return Objects.equals(this.stateMutability, readAbiFunction.stateMutability)
                && Objects.equals(this.outputs, readAbiFunction.outputs)
                && Objects.equals(this.name, readAbiFunction.name)
                && Objects.equals(this.type, readAbiFunction.type)
                && Objects.equals(this.inputs, readAbiFunction.inputs)
                && Objects.equals(this.description, readAbiFunction.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateMutability, outputs, name, type, inputs, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadAbiFunction {\n");
        sb.append("    stateMutability: ").append(toIndentedString(stateMutability)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

        // add `stateMutability` to the URL query string
        if (getStateMutability() != null) {
            joiner.add(
                    String.format(
                            "%sstateMutability%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getStateMutability()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `outputs` to the URL query string
        if (getOutputs() != null) {
            for (int i = 0; i < getOutputs().size(); i++) {
                if (getOutputs().get(i) != null) {
                    joiner.add(
                            getOutputs()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%soutputs%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

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

        // add `type` to the URL query string
        if (getType() != null) {
            joiner.add(
                    String.format(
                            "%stype%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `inputs` to the URL query string
        if (getInputs() != null) {
            for (int i = 0; i < getInputs().size(); i++) {
                if (getInputs().get(i) != null) {
                    joiner.add(
                            getInputs()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sinputs%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        // add `description` to the URL query string
        if (getDescription() != null) {
            joiner.add(
                    String.format(
                            "%sdescription%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getDescription()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}