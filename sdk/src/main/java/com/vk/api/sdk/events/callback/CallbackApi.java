package com.vk.api.sdk.events.callback;

import com.google.gson.JsonObject;
import com.vk.api.sdk.client.GsonHolder;
import com.vk.api.sdk.events.CallbackEvent;
import com.vk.api.sdk.objects.callback.messages.CallbackMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CallbackApi implements CallbackEvent {

    private static final Logger LOG = LoggerFactory.getLogger(CallbackApi.class);

    private final String confirmationCode;

    private final String secretKey;

    private boolean isSecretKeyValid(String receivedKey) {
        if (secretKey == null && receivedKey == null) // secret key was not received and not initialized for API client
            return true;
        if (secretKey == null || receivedKey == null) // secret key was not received but was expected, or vice versa
            return false;
        return secretKey.equals(receivedKey);
    }

    @Override
    public String confirmation() {
        return this.confirmationCode;
    }

    protected CallbackApi(String confirmationCode) {
        this.confirmationCode = confirmationCode;
        this.secretKey = null;
    }

    protected CallbackApi(String confirmationCode, String secretKey) {
        this.confirmationCode = confirmationCode;
        this.secretKey = secretKey;
    }

    public String parse(String json) {
        return parse(new GsonHolder().getGson().fromJson(json, CallbackMessage.class));
    }

    public String parse(JsonObject json) {
        return parse(new GsonHolder().getGson().fromJson(json, CallbackMessage.class));
    }

    public String parseMessage(CallbackMessage message) {
        if (isSecretKeyValid(message.getSecret()))
            return this.parse(message);
        LOG.error("Secret key check was failed");
        return "failed";
    }
}