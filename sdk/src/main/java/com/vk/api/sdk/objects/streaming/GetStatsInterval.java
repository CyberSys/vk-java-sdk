// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.streaming;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GetStatsInterval implements EnumParam<String> {
    @SerializedName("1h")
    _1H("1h"),

    @SerializedName("24h")
    _24H("24h"),

    @SerializedName("5m")
    _5M("5m");

    private final String value;

    GetStatsInterval(String value) {
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