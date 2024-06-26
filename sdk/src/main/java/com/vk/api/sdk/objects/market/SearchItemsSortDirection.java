// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum SearchItemsSortDirection implements EnumParam<Integer> {
    @SerializedName("0")
    _0(0),

    @SerializedName("1")
    _1(1);

    private final Integer value;

    SearchItemsSortDirection(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
