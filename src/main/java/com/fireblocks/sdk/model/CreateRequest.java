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
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
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
@JsonDeserialize(using = CreateRequest.CreateRequestDeserializer.class)
@JsonSerialize(using = CreateRequest.CreateRequestSerializer.class)
public class CreateRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateRequest.class.getName());

    public static class CreateRequestSerializer extends StdSerializer<CreateRequest> {
        public CreateRequestSerializer(Class<CreateRequest> t) {
            super(t);
        }

        public CreateRequestSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreateRequest value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateRequestDeserializer extends StdDeserializer<CreateRequest> {
        public CreateRequestDeserializer() {
            this(CreateRequest.class);
        }

        public CreateRequestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateRequest deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CreateConnectionRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateConnectionRequest.class.equals(Integer.class)
                        || CreateConnectionRequest.class.equals(Long.class)
                        || CreateConnectionRequest.class.equals(Float.class)
                        || CreateConnectionRequest.class.equals(Double.class)
                        || CreateConnectionRequest.class.equals(Boolean.class)
                        || CreateConnectionRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                                ((CreateConnectionRequest.class.equals(Integer.class)
                                                || CreateConnectionRequest.class.equals(Long.class))
                                        && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                                ((CreateConnectionRequest.class.equals(Float.class)
                                                || CreateConnectionRequest.class.equals(
                                                        Double.class))
                                        && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                                (CreateConnectionRequest.class.equals(Boolean.class)
                                        && (token == JsonToken.VALUE_FALSE
                                                || token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                                (CreateConnectionRequest.class.equals(String.class)
                                        && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized =
                            tree.traverse(jp.getCodec()).readValueAs(CreateConnectionRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateConnectionRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                        Level.FINER,
                        "Input data does not match schema 'CreateConnectionRequest'",
                        e);
            }

            // deserialize CreateNcwConnectionRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateNcwConnectionRequest.class.equals(Integer.class)
                        || CreateNcwConnectionRequest.class.equals(Long.class)
                        || CreateNcwConnectionRequest.class.equals(Float.class)
                        || CreateNcwConnectionRequest.class.equals(Double.class)
                        || CreateNcwConnectionRequest.class.equals(Boolean.class)
                        || CreateNcwConnectionRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                                ((CreateNcwConnectionRequest.class.equals(Integer.class)
                                                || CreateNcwConnectionRequest.class.equals(
                                                        Long.class))
                                        && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                                ((CreateNcwConnectionRequest.class.equals(Float.class)
                                                || CreateNcwConnectionRequest.class.equals(
                                                        Double.class))
                                        && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                                (CreateNcwConnectionRequest.class.equals(Boolean.class)
                                        && (token == JsonToken.VALUE_FALSE
                                                || token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                                (CreateNcwConnectionRequest.class.equals(String.class)
                                        && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized =
                            tree.traverse(jp.getCodec())
                                    .readValueAs(CreateNcwConnectionRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateNcwConnectionRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                        Level.FINER,
                        "Input data does not match schema 'CreateNcwConnectionRequest'",
                        e);
            }

            if (match == 1) {
                CreateRequest ret = new CreateRequest();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(
                    String.format(
                            "Failed deserialization for CreateRequest: %d classes match result,"
                                    + " expected 1",
                            match));
        }

        /** Handle deserialization of the 'null' value. */
        @Override
        public CreateRequest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreateRequest cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public CreateRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateRequest(CreateConnectionRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateRequest(CreateNcwConnectionRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateConnectionRequest", CreateConnectionRequest.class);
        schemas.put("CreateNcwConnectionRequest", CreateNcwConnectionRequest.class);
        JSON.registerDescendants(CreateRequest.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check the instance parameter is valid
     * against the oneOf child schemas: CreateConnectionRequest, CreateNcwConnectionRequest
     *
     * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be
     * a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CreateConnectionRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(
                CreateNcwConnectionRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
                "Invalid instance type. Must be CreateConnectionRequest,"
                        + " CreateNcwConnectionRequest");
    }

    /**
     * Get the actual instance, which can be the following: CreateConnectionRequest,
     * CreateNcwConnectionRequest
     *
     * @return The actual instance (CreateConnectionRequest, CreateNcwConnectionRequest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateConnectionRequest`. If the actual instance is not
     * `CreateConnectionRequest`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateConnectionRequest`
     * @throws ClassCastException if the instance is not `CreateConnectionRequest`
     */
    public CreateConnectionRequest getCreateConnectionRequest() throws ClassCastException {
        return (CreateConnectionRequest) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateNcwConnectionRequest`. If the actual instance is not
     * `CreateNcwConnectionRequest`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateNcwConnectionRequest`
     * @throws ClassCastException if the instance is not `CreateNcwConnectionRequest`
     */
    public CreateNcwConnectionRequest getCreateNcwConnectionRequest() throws ClassCastException {
        return (CreateNcwConnectionRequest) super.getActualInstance();
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

        if (getActualInstance() instanceof CreateConnectionRequest) {
            if (getActualInstance() != null) {
                joiner.add(
                        ((CreateConnectionRequest) getActualInstance())
                                .toUrlQueryString(prefix + "one_of_0" + suffix));
            }
            return joiner.toString();
        }
        if (getActualInstance() instanceof CreateNcwConnectionRequest) {
            if (getActualInstance() != null) {
                joiner.add(
                        ((CreateNcwConnectionRequest) getActualInstance())
                                .toUrlQueryString(prefix + "one_of_1" + suffix));
            }
            return joiner.toString();
        }
        return null;
    }
}
