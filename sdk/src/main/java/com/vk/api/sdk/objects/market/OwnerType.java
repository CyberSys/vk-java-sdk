// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of the market group
 */
public enum OwnerType implements EnumParam<String> {
    @SerializedName("base")
    BASE("base"),

    @SerializedName("pro")
    PRO("pro"),

    @SerializedName("disabled")
    DISABLED("disabled");

    private final String value;

    OwnerType(String value) {
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