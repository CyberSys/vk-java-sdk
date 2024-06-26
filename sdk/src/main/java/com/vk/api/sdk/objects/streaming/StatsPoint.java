// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.streaming;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * StatsPoint object
 */
public class StatsPoint implements Validable {
    @SerializedName("timestamp")
    @Required
    private Long timestamp;

    @SerializedName("value")
    @Required
    private Integer value;

    public Long getTimestamp() {
        return timestamp;
    }

    public StatsPoint setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Integer getValue() {
        return value;
    }

    public StatsPoint setValue(Integer value) {
        this.value = value;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, timestamp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsPoint statsPoint = (StatsPoint) o;
        return Objects.equals(value, statsPoint.value) &&
                Objects.equals(timestamp, statsPoint.timestamp);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StatsPoint{");
        sb.append("value=").append(value);
        sb.append(", timestamp=").append(timestamp);
        sb.append('}');
        return sb.toString();
    }
}
