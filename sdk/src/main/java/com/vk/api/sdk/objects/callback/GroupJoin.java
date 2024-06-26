// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.events.CallbackEvent;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * GroupJoin object
 */
public class GroupJoin implements Validable, CallbackEvent {
    @SerializedName("join_type")
    @Required
    private GroupJoinType joinType;

    /**
     * Entity: owner
     */
    @SerializedName("user_id")
    @Required
    private Long userId;

    public GroupJoinType getJoinType() {
        return joinType;
    }

    public GroupJoin setJoinType(GroupJoinType joinType) {
        this.joinType = joinType;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public GroupJoin setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(joinType, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupJoin groupJoin = (GroupJoin) o;
        return Objects.equals(joinType, groupJoin.joinType) &&
                Objects.equals(userId, groupJoin.userId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupJoin{");
        sb.append("joinType=").append(joinType);
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
