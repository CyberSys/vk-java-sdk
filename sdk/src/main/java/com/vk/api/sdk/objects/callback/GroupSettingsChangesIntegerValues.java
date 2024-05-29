// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.events.CallbackEvent;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * GroupSettingsChangesIntegerValues object
 */
public class GroupSettingsChangesIntegerValues implements Validable, CallbackEvent {
    @SerializedName("new_value")
    private Integer newValue;

    @SerializedName("old_value")
    private Integer oldValue;

    public Integer getNewValue() {
        return newValue;
    }

    public GroupSettingsChangesIntegerValues setNewValue(Integer newValue) {
        this.newValue = newValue;
        return this;
    }

    public Integer getOldValue() {
        return oldValue;
    }

    public GroupSettingsChangesIntegerValues setOldValue(Integer oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(newValue, oldValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupSettingsChangesIntegerValues groupSettingsChangesIntegerValues = (GroupSettingsChangesIntegerValues) o;
        return Objects.equals(oldValue, groupSettingsChangesIntegerValues.oldValue) &&
                Objects.equals(newValue, groupSettingsChangesIntegerValues.newValue);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupSettingsChangesIntegerValues{");
        sb.append("oldValue=").append(oldValue);
        sb.append(", newValue=").append(newValue);
        sb.append('}');
        return sb.toString();
    }
}