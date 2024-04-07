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


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fireblocks.sdk.JSON;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(
        using =
                CreateWorkflowExecutionRequestParamsInner
                        .CreateWorkflowExecutionRequestParamsInnerDeserializer.class)
@JsonSerialize(
        using =
                CreateWorkflowExecutionRequestParamsInner
                        .CreateWorkflowExecutionRequestParamsInnerSerializer.class)
public class CreateWorkflowExecutionRequestParamsInner extends AbstractOpenApiSchema {
    private static final Logger log =
            Logger.getLogger(CreateWorkflowExecutionRequestParamsInner.class.getName());

    public static class CreateWorkflowExecutionRequestParamsInnerSerializer
            extends StdSerializer<CreateWorkflowExecutionRequestParamsInner> {
        public CreateWorkflowExecutionRequestParamsInnerSerializer(
                Class<CreateWorkflowExecutionRequestParamsInner> t) {
            super(t);
        }

        public CreateWorkflowExecutionRequestParamsInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(
                CreateWorkflowExecutionRequestParamsInner value,
                JsonGenerator jgen,
                SerializerProvider provider)
                throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateWorkflowExecutionRequestParamsInnerDeserializer
            extends StdDeserializer<CreateWorkflowExecutionRequestParamsInner> {
        public CreateWorkflowExecutionRequestParamsInnerDeserializer() {
            this(CreateWorkflowExecutionRequestParamsInner.class);
        }

        public CreateWorkflowExecutionRequestParamsInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateWorkflowExecutionRequestParamsInner deserialize(
                JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize ConversionOperationExecutionParams
            try {
                deserialized =
                        tree.traverse(jp.getCodec())
                                .readValueAs(ConversionOperationExecutionParams.class);
                CreateWorkflowExecutionRequestParamsInner ret =
                        new CreateWorkflowExecutionRequestParamsInner();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(
                        Level.FINER,
                        "Input data does not match 'CreateWorkflowExecutionRequestParamsInner'",
                        e);
            }

            // deserialize DisbursementOperationExecutionParams
            try {
                deserialized =
                        tree.traverse(jp.getCodec())
                                .readValueAs(DisbursementOperationExecutionParams.class);
                CreateWorkflowExecutionRequestParamsInner ret =
                        new CreateWorkflowExecutionRequestParamsInner();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(
                        Level.FINER,
                        "Input data does not match 'CreateWorkflowExecutionRequestParamsInner'",
                        e);
            }

            // deserialize TransferOperationExecutionParams
            try {
                deserialized =
                        tree.traverse(jp.getCodec())
                                .readValueAs(TransferOperationExecutionParams.class);
                CreateWorkflowExecutionRequestParamsInner ret =
                        new CreateWorkflowExecutionRequestParamsInner();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(
                        Level.FINER,
                        "Input data does not match 'CreateWorkflowExecutionRequestParamsInner'",
                        e);
            }

            throw new IOException(
                    String.format(
                            "Failed deserialization for CreateWorkflowExecutionRequestParamsInner:"
                                    + " no match found"));
        }

        /** Handle deserialization of the 'null' value. */
        @Override
        public CreateWorkflowExecutionRequestParamsInner getNullValue(DeserializationContext ctxt)
                throws JsonMappingException {
            throw new JsonMappingException(
                    ctxt.getParser(), "CreateWorkflowExecutionRequestParamsInner cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateWorkflowExecutionRequestParamsInner() {
        super("anyOf", Boolean.FALSE);
    }

    public CreateWorkflowExecutionRequestParamsInner(ConversionOperationExecutionParams o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateWorkflowExecutionRequestParamsInner(DisbursementOperationExecutionParams o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateWorkflowExecutionRequestParamsInner(TransferOperationExecutionParams o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ConversionOperationExecutionParams", ConversionOperationExecutionParams.class);
        schemas.put(
                "DisbursementOperationExecutionParams", DisbursementOperationExecutionParams.class);
        schemas.put("TransferOperationExecutionParams", TransferOperationExecutionParams.class);
        JSON.registerDescendants(
                CreateWorkflowExecutionRequestParamsInner.class,
                Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateWorkflowExecutionRequestParamsInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check the instance parameter is valid
     * against the anyOf child schemas: ConversionOperationExecutionParams,
     * DisbursementOperationExecutionParams, TransferOperationExecutionParams
     *
     * <p>It could be an instance of the 'anyOf' schemas. The anyOf child schemas may themselves be
     * a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(
                ConversionOperationExecutionParams.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(
                DisbursementOperationExecutionParams.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(
                TransferOperationExecutionParams.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
                "Invalid instance type. Must be ConversionOperationExecutionParams,"
                    + " DisbursementOperationExecutionParams, TransferOperationExecutionParams");
    }

    /**
     * Get the actual instance, which can be the following: ConversionOperationExecutionParams,
     * DisbursementOperationExecutionParams, TransferOperationExecutionParams
     *
     * @return The actual instance (ConversionOperationExecutionParams,
     *     DisbursementOperationExecutionParams, TransferOperationExecutionParams)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConversionOperationExecutionParams`. If the actual instance is
     * not `ConversionOperationExecutionParams`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConversionOperationExecutionParams`
     * @throws ClassCastException if the instance is not `ConversionOperationExecutionParams`
     */
    public ConversionOperationExecutionParams getConversionOperationExecutionParams()
            throws ClassCastException {
        return (ConversionOperationExecutionParams) super.getActualInstance();
    }

    /**
     * Get the actual instance of `DisbursementOperationExecutionParams`. If the actual instance is
     * not `DisbursementOperationExecutionParams`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `DisbursementOperationExecutionParams`
     * @throws ClassCastException if the instance is not `DisbursementOperationExecutionParams`
     */
    public DisbursementOperationExecutionParams getDisbursementOperationExecutionParams()
            throws ClassCastException {
        return (DisbursementOperationExecutionParams) super.getActualInstance();
    }

    /**
     * Get the actual instance of `TransferOperationExecutionParams`. If the actual instance is not
     * `TransferOperationExecutionParams`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransferOperationExecutionParams`
     * @throws ClassCastException if the instance is not `TransferOperationExecutionParams`
     */
    public TransferOperationExecutionParams getTransferOperationExecutionParams()
            throws ClassCastException {
        return (TransferOperationExecutionParams) super.getActualInstance();
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

        return null;
    }
}
