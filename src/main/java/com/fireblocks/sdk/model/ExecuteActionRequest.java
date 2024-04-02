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
@JsonDeserialize(using = ExecuteActionRequest.ExecuteActionRequestDeserializer.class)
@JsonSerialize(using = ExecuteActionRequest.ExecuteActionRequestSerializer.class)
public class ExecuteActionRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ExecuteActionRequest.class.getName());

    public static class ExecuteActionRequestSerializer extends StdSerializer<ExecuteActionRequest> {
        public ExecuteActionRequestSerializer(Class<ExecuteActionRequest> t) {
            super(t);
        }

        public ExecuteActionRequestSerializer() {
            this(null);
        }

        @Override
        public void serialize(
                ExecuteActionRequest value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ExecuteActionRequestDeserializer
            extends StdDeserializer<ExecuteActionRequest> {
        public ExecuteActionRequestDeserializer() {
            this(ExecuteActionRequest.class);
        }

        public ExecuteActionRequestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ExecuteActionRequest deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize StakeRequestDto
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (StakeRequestDto.class.equals(Integer.class)
                        || StakeRequestDto.class.equals(Long.class)
                        || StakeRequestDto.class.equals(Float.class)
                        || StakeRequestDto.class.equals(Double.class)
                        || StakeRequestDto.class.equals(Boolean.class)
                        || StakeRequestDto.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                                ((StakeRequestDto.class.equals(Integer.class)
                                                || StakeRequestDto.class.equals(Long.class))
                                        && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                                ((StakeRequestDto.class.equals(Float.class)
                                                || StakeRequestDto.class.equals(Double.class))
                                        && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                                (StakeRequestDto.class.equals(Boolean.class)
                                        && (token == JsonToken.VALUE_FALSE
                                                || token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                                (StakeRequestDto.class.equals(String.class)
                                        && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(StakeRequestDto.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'StakeRequestDto'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'StakeRequestDto'", e);
            }

            // deserialize UnstakeRequestDto
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UnstakeRequestDto.class.equals(Integer.class)
                        || UnstakeRequestDto.class.equals(Long.class)
                        || UnstakeRequestDto.class.equals(Float.class)
                        || UnstakeRequestDto.class.equals(Double.class)
                        || UnstakeRequestDto.class.equals(Boolean.class)
                        || UnstakeRequestDto.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                                ((UnstakeRequestDto.class.equals(Integer.class)
                                                || UnstakeRequestDto.class.equals(Long.class))
                                        && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                                ((UnstakeRequestDto.class.equals(Float.class)
                                                || UnstakeRequestDto.class.equals(Double.class))
                                        && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                                (UnstakeRequestDto.class.equals(Boolean.class)
                                        && (token == JsonToken.VALUE_FALSE
                                                || token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                                (UnstakeRequestDto.class.equals(String.class)
                                        && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized =
                            tree.traverse(jp.getCodec()).readValueAs(UnstakeRequestDto.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UnstakeRequestDto'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UnstakeRequestDto'", e);
            }

            // deserialize WithdrawRequestDto
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WithdrawRequestDto.class.equals(Integer.class)
                        || WithdrawRequestDto.class.equals(Long.class)
                        || WithdrawRequestDto.class.equals(Float.class)
                        || WithdrawRequestDto.class.equals(Double.class)
                        || WithdrawRequestDto.class.equals(Boolean.class)
                        || WithdrawRequestDto.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                                ((WithdrawRequestDto.class.equals(Integer.class)
                                                || WithdrawRequestDto.class.equals(Long.class))
                                        && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                                ((WithdrawRequestDto.class.equals(Float.class)
                                                || WithdrawRequestDto.class.equals(Double.class))
                                        && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                                (WithdrawRequestDto.class.equals(Boolean.class)
                                        && (token == JsonToken.VALUE_FALSE
                                                || token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                                (WithdrawRequestDto.class.equals(String.class)
                                        && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized =
                            tree.traverse(jp.getCodec()).readValueAs(WithdrawRequestDto.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WithdrawRequestDto'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WithdrawRequestDto'", e);
            }

            if (match == 1) {
                ExecuteActionRequest ret = new ExecuteActionRequest();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(
                    String.format(
                            "Failed deserialization for ExecuteActionRequest: %d classes match"
                                    + " result, expected 1",
                            match));
        }

        /** Handle deserialization of the 'null' value. */
        @Override
        public ExecuteActionRequest getNullValue(DeserializationContext ctxt)
                throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ExecuteActionRequest cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public ExecuteActionRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public ExecuteActionRequest(StakeRequestDto o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ExecuteActionRequest(UnstakeRequestDto o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ExecuteActionRequest(WithdrawRequestDto o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("StakeRequestDto", StakeRequestDto.class);
        schemas.put("UnstakeRequestDto", UnstakeRequestDto.class);
        schemas.put("WithdrawRequestDto", WithdrawRequestDto.class);
        JSON.registerDescendants(ExecuteActionRequest.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ExecuteActionRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check the instance parameter is valid
     * against the oneOf child schemas: StakeRequestDto, UnstakeRequestDto, WithdrawRequestDto
     *
     * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be
     * a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(StakeRequestDto.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnstakeRequestDto.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WithdrawRequestDto.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
                "Invalid instance type. Must be StakeRequestDto, UnstakeRequestDto,"
                        + " WithdrawRequestDto");
    }

    /**
     * Get the actual instance, which can be the following: StakeRequestDto, UnstakeRequestDto,
     * WithdrawRequestDto
     *
     * @return The actual instance (StakeRequestDto, UnstakeRequestDto, WithdrawRequestDto)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `StakeRequestDto`. If the actual instance is not
     * `StakeRequestDto`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `StakeRequestDto`
     * @throws ClassCastException if the instance is not `StakeRequestDto`
     */
    public StakeRequestDto getStakeRequestDto() throws ClassCastException {
        return (StakeRequestDto) super.getActualInstance();
    }

    /**
     * Get the actual instance of `UnstakeRequestDto`. If the actual instance is not
     * `UnstakeRequestDto`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `UnstakeRequestDto`
     * @throws ClassCastException if the instance is not `UnstakeRequestDto`
     */
    public UnstakeRequestDto getUnstakeRequestDto() throws ClassCastException {
        return (UnstakeRequestDto) super.getActualInstance();
    }

    /**
     * Get the actual instance of `WithdrawRequestDto`. If the actual instance is not
     * `WithdrawRequestDto`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `WithdrawRequestDto`
     * @throws ClassCastException if the instance is not `WithdrawRequestDto`
     */
    public WithdrawRequestDto getWithdrawRequestDto() throws ClassCastException {
        return (WithdrawRequestDto) super.getActualInstance();
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

        if (getActualInstance() instanceof StakeRequestDto) {
            if (getActualInstance() != null) {
                joiner.add(
                        ((StakeRequestDto) getActualInstance())
                                .toUrlQueryString(prefix + "one_of_0" + suffix));
            }
            return joiner.toString();
        }
        if (getActualInstance() instanceof UnstakeRequestDto) {
            if (getActualInstance() != null) {
                joiner.add(
                        ((UnstakeRequestDto) getActualInstance())
                                .toUrlQueryString(prefix + "one_of_1" + suffix));
            }
            return joiner.toString();
        }
        if (getActualInstance() instanceof WithdrawRequestDto) {
            if (getActualInstance() != null) {
                joiner.add(
                        ((WithdrawRequestDto) getActualInstance())
                                .toUrlQueryString(prefix + "one_of_2" + suffix));
            }
            return joiner.toString();
        }
        return null;
    }
}
