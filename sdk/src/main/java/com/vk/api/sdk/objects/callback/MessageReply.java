// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.events.CallbackEvent;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.messages.Message;

import java.util.Objects;

/**
 * MessageReply object
 */
public class MessageReply extends Base implements Validable, CallbackEvent {
    @SerializedName("object")
    @Required
    private Message object;

    public Message getObject() {
        return object;
    }

    public MessageReply setObject(Message object) {
        this.object = object;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageReply messageReply = (MessageReply) o;
        return Objects.equals(object, messageReply.object);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageReply{");
        sb.append("object=").append(object);
        sb.append('}');
        return sb.toString();
    }
}
