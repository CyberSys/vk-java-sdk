// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.friends;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * OnlineUsers object
 */
public class OnlineUsers implements Validable {
    @SerializedName("online")
    @Required
    private List<Long> online;

    /**
     * Total online friends number
     */
    @SerializedName("total_count")
    private Integer totalCount;

    public List<Long> getOnline() {
        return online;
    }

    public OnlineUsers setOnline(List<Long> online) {
        this.online = online;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public OnlineUsers setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(online, totalCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineUsers onlineUsers = (OnlineUsers) o;
        return Objects.equals(totalCount, onlineUsers.totalCount) &&
                Objects.equals(online, onlineUsers.online);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("OnlineUsers{");
        sb.append("totalCount=").append(totalCount);
        sb.append(", online=").append(online);
        sb.append('}');
        return sb.toString();
    }
}