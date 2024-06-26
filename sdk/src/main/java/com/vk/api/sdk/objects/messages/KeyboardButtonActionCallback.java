// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * Description of the action, that should be performed on button click
 */
public class KeyboardButtonActionCallback implements KeyboardButtonPropertyAction, Validable {
    /**
     * Label for button
     */
    @SerializedName("label")
    @Required
    private String label;

    /**
     * Additional data sent along with message for developer convenience
     */
    @SerializedName("payload")
    private String payload;

    @SerializedName("type")
    @Required
    private KeyboardButtonActionCallbackType type;

    public String getLabel() {
        return label;
    }

    public KeyboardButtonActionCallback setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public KeyboardButtonActionCallback setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public KeyboardButtonActionCallbackType getType() {
        return type;
    }

    public KeyboardButtonActionCallback setType(KeyboardButtonActionCallbackType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, label, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyboardButtonActionCallback keyboardButtonActionCallback = (KeyboardButtonActionCallback) o;
        return Objects.equals(payload, keyboardButtonActionCallback.payload) &&
                Objects.equals(label, keyboardButtonActionCallback.label) &&
                Objects.equals(type, keyboardButtonActionCallback.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("KeyboardButtonActionCallback{");
        sb.append("payload='").append(payload).append("'");
        sb.append(", label='").append(label).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
