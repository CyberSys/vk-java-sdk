// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Scope name
 */
public enum ScopeName implements EnumParam<String> {
    @SerializedName("friends")
    FRIENDS("friends"),

    @SerializedName("photos")
    PHOTOS("photos"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("pages")
    PAGES("pages"),

    @SerializedName("status")
    STATUS("status"),

    @SerializedName("notes")
    NOTES("notes"),

    @SerializedName("wall")
    WALL("wall"),

    @SerializedName("docs")
    DOCS("docs"),

    @SerializedName("groups")
    GROUPS("groups"),

    @SerializedName("stats")
    STATS("stats"),

    @SerializedName("market")
    MARKET("market"),

    @SerializedName("stories")
    STORIES("stories"),

    @SerializedName("app_widget")
    APP_WIDGET("app_widget"),

    @SerializedName("messages")
    MESSAGES("messages"),

    @SerializedName("manage")
    MANAGE("manage"),

    @SerializedName("notify")
    NOTIFY("notify"),

    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("support")
    SUPPORT("support"),

    @SerializedName("menu")
    MENU("menu"),

    @SerializedName("wallmenu")
    WALLMENU("wallmenu"),

    @SerializedName("ads")
    ADS("ads"),

    @SerializedName("offline")
    OFFLINE("offline"),

    @SerializedName("notifications")
    NOTIFICATIONS("notifications"),

    @SerializedName("email")
    EMAIL("email"),

    @SerializedName("adsweb")
    ADSWEB("adsweb"),

    @SerializedName("leads")
    LEADS("leads"),

    @SerializedName("group_messages")
    GROUP_MESSAGES("group_messages"),

    @SerializedName("exchange")
    EXCHANGE("exchange"),

    @SerializedName("phone")
    PHONE("phone");

    private final String value;

    ScopeName(String value) {
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
