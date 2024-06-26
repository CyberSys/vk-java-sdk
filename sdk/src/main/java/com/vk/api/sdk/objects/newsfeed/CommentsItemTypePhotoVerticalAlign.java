// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sets vertical alignment of a photo
 */
public enum CommentsItemTypePhotoVerticalAlign implements EnumParam<String> {
    @SerializedName("top")
    TOP("top"),

    @SerializedName("middle")
    MIDDLE("middle"),

    @SerializedName("bottom")
    BOTTOM("bottom");

    private final String value;

    CommentsItemTypePhotoVerticalAlign(String value) {
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
