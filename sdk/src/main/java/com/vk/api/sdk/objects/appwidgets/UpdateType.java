// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.appwidgets;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum UpdateType implements EnumParam<String> {
    @SerializedName("compact_list")
    COMPACT_LIST("compact_list"),

    @SerializedName("cover_list")
    COVER_LIST("cover_list"),

    @SerializedName("donation")
    DONATION("donation"),

    @SerializedName("list")
    LIST("list"),

    @SerializedName("match")
    MATCH("match"),

    @SerializedName("matches")
    MATCHES("matches"),

    @SerializedName("table")
    TABLE("table"),

    @SerializedName("text")
    TEXT("text"),

    @SerializedName("tiles")
    TILES("tiles");

    private final String value;

    UpdateType(String value) {
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
