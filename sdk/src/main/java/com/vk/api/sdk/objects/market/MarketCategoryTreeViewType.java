// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum MarketCategoryTreeViewType implements EnumParam<String> {
    @SerializedName("tab_root")
    TAB_ROOT("tab_root");

    private final String value;

    MarketCategoryTreeViewType(String value) {
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
