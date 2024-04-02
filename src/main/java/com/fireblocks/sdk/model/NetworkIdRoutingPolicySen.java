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
@JsonDeserialize(using = NetworkIdRoutingPolicySen.NetworkIdRoutingPolicySenDeserializer.class)
@JsonSerialize(using = NetworkIdRoutingPolicySen.NetworkIdRoutingPolicySenSerializer.class)
public class NetworkIdRoutingPolicySen extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(NetworkIdRoutingPolicySen.class.getName());

    public static class NetworkIdRoutingPolicySenSerializer
            extends StdSerializer<NetworkIdRoutingPolicySen> {
        public NetworkIdRoutingPolicySenSerializer(Class<NetworkIdRoutingPolicySen> t) {
            super(t);
        }

        public NetworkIdRoutingPolicySenSerializer() {
            this(null);
        }

        @Override
        public void serialize(
                NetworkIdRoutingPolicySen value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class NetworkIdRoutingPolicySenDeserializer
            extends StdDeserializer<NetworkIdRoutingPolicySen> {
        public NetworkIdRoutingPolicySenDeserializer() {
            this(NetworkIdRoutingPolicySen.class);
        }

        public NetworkIdRoutingPolicySenDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public NetworkIdRoutingPolicySen deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CustomFiatRoutingDest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomFiatRoutingDest.class.equals(Integer.class)
                        || CustomFiatRoutingDest.class.equals(Long.class)
                        || CustomFiatRoutingDest.class.equals(Float.class)
                        || CustomFiatRoutingDest.class.equals(Double.class)
                        || CustomFiatRoutingDest.class.equals(Boolean.class)
                        || CustomFiatRoutingDest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                                ((CustomFiatRoutingDest.class.equals(Integer.class)
                                                || CustomFiatRoutingDest.class.equals(Long.class))
                                        && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                                ((CustomFiatRoutingDest.class.equals(Float.class)
                                                || CustomFiatRoutingDest.class.equals(Double.class))
                                        && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                                (CustomFiatRoutingDest.class.equals(Boolean.class)
                                        && (token == JsonToken.VALUE_FALSE
                                                || token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                                (CustomFiatRoutingDest.class.equals(String.class)
                                        && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized =
                            tree.traverse(jp.getCodec()).readValueAs(CustomFiatRoutingDest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CustomFiatRoutingDest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomFiatRoutingDest'", e);
            }

            // deserialize NoneNetworkRoutingDest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NoneNetworkRoutingDest.class.equals(Integer.class)
                        || NoneNetworkRoutingDest.class.equals(Long.class)
                        || NoneNetworkRoutingDest.class.equals(Float.class)
                        || NoneNetworkRoutingDest.class.equals(Double.class)
                        || NoneNetworkRoutingDest.class.equals(Boolean.class)
                        || NoneNetworkRoutingDest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                                ((NoneNetworkRoutingDest.class.equals(Integer.class)
                                                || NoneNetworkRoutingDest.class.equals(Long.class))
                                        && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                                ((NoneNetworkRoutingDest.class.equals(Float.class)
                                                || NoneNetworkRoutingDest.class.equals(
                                                        Double.class))
                                        && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                                (NoneNetworkRoutingDest.class.equals(Boolean.class)
                                        && (token == JsonToken.VALUE_FALSE
                                                || token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                                (NoneNetworkRoutingDest.class.equals(String.class)
                                        && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized =
                            tree.traverse(jp.getCodec()).readValueAs(NoneNetworkRoutingDest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'NoneNetworkRoutingDest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                        Level.FINER,
                        "Input data does not match schema 'NoneNetworkRoutingDest'",
                        e);
            }

            if (match == 1) {
                NetworkIdRoutingPolicySen ret = new NetworkIdRoutingPolicySen();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(
                    String.format(
                            "Failed deserialization for NetworkIdRoutingPolicySen: %d classes match"
                                    + " result, expected 1",
                            match));
        }

        /** Handle deserialization of the 'null' value. */
        @Override
        public NetworkIdRoutingPolicySen getNullValue(DeserializationContext ctxt)
                throws JsonMappingException {
            throw new JsonMappingException(
                    ctxt.getParser(), "NetworkIdRoutingPolicySen cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public NetworkIdRoutingPolicySen() {
        super("oneOf", Boolean.FALSE);
    }

    public NetworkIdRoutingPolicySen(CustomFiatRoutingDest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NetworkIdRoutingPolicySen(NoneNetworkRoutingDest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CustomFiatRoutingDest", CustomFiatRoutingDest.class);
        schemas.put("NoneNetworkRoutingDest", NoneNetworkRoutingDest.class);
        JSON.registerDescendants(
                NetworkIdRoutingPolicySen.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return NetworkIdRoutingPolicySen.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check the instance parameter is valid
     * against the oneOf child schemas: CustomFiatRoutingDest, NoneNetworkRoutingDest
     *
     * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be
     * a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CustomFiatRoutingDest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(NoneNetworkRoutingDest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
                "Invalid instance type. Must be CustomFiatRoutingDest, NoneNetworkRoutingDest");
    }

    /**
     * Get the actual instance, which can be the following: CustomFiatRoutingDest,
     * NoneNetworkRoutingDest
     *
     * @return The actual instance (CustomFiatRoutingDest, NoneNetworkRoutingDest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomFiatRoutingDest`. If the actual instance is not
     * `CustomFiatRoutingDest`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomFiatRoutingDest`
     * @throws ClassCastException if the instance is not `CustomFiatRoutingDest`
     */
    public CustomFiatRoutingDest getCustomFiatRoutingDest() throws ClassCastException {
        return (CustomFiatRoutingDest) super.getActualInstance();
    }

    /**
     * Get the actual instance of `NoneNetworkRoutingDest`. If the actual instance is not
     * `NoneNetworkRoutingDest`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `NoneNetworkRoutingDest`
     * @throws ClassCastException if the instance is not `NoneNetworkRoutingDest`
     */
    public NoneNetworkRoutingDest getNoneNetworkRoutingDest() throws ClassCastException {
        return (NoneNetworkRoutingDest) super.getActualInstance();
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

        if (getActualInstance() instanceof CustomFiatRoutingDest) {
            if (getActualInstance() != null) {
                joiner.add(
                        ((CustomFiatRoutingDest) getActualInstance())
                                .toUrlQueryString(prefix + "one_of_0" + suffix));
            }
            return joiner.toString();
        }
        if (getActualInstance() instanceof NoneNetworkRoutingDest) {
            if (getActualInstance() != null) {
                joiner.add(
                        ((NoneNetworkRoutingDest) getActualInstance())
                                .toUrlQueryString(prefix + "one_of_1" + suffix));
            }
            return joiner.toString();
        }
        return null;
    }
}
