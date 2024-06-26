// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum AddSnippetVkRef implements EnumParam<String> {
    @SerializedName("snippet_im")
    SNIPPET_IM("snippet_im"),

    @SerializedName("snippet_post")
    SNIPPET_POST("snippet_post");

    private final String value;

    AddSnippetVkRef(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
