// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.prettycards;

import com.google.gson.*;
import com.vk.api.sdk.objects.base.Error;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public interface PrettyCardOrError {
    default PrettyCard getPrettycardsPrettyCardOrErrorAsPrettyCard() {
        return (PrettyCard) this;
    }

    default Error getPrettycardsPrettyCardOrErrorAsError() {
        return (Error) this;
    }

    class Deserializer implements JsonDeserializer<PrettyCardOrError> {
        private static final String discriminatorField = "inner_type";

        private static final Map<String, Class<? extends PrettyCardOrError>> subtypes = new HashMap<String, Class<? extends PrettyCardOrError>>() {{
        put("base_error", Error.class);
        put("prettyCards_prettyCard", PrettyCard.class);
        }};

        @Override
        public PrettyCardOrError deserialize(JsonElement json, Type typeOfT,
                JsonDeserializationContext context) throws JsonParseException {
            String errorTrace = "";
            try {
                JsonObject data = json.getAsJsonObject();
                String resultSubtypeValue = data.get(discriminatorField).getAsString();
                if (subtypes.containsKey(resultSubtypeValue)) {
                    return context.deserialize(data, subtypes.get(resultSubtypeValue));
                } else {
                    throw new JsonParseException("There is no discriminator field in JSON-object", new com.vk.api.sdk.exceptions.UnexpectedOneOfSubtypeException(resultSubtypeValue, Deserializer.class, subtypes.keySet()));
                }
            } catch (Exception e) {
                // Failed to deserialize PrettyCardOrError object from JSON
                errorTrace = e.getLocalizedMessage();
            }
            throw new JsonParseException("Failed to deserialize PrettyCardOrError object from JSON" + errorTrace);
        }
    }
}