// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * GroupItemsResponse object
 */
public class GroupItemsResponse implements Validable {
    @SerializedName("item_group_id")
    @Required
    private Integer itemGroupId;

    public Integer getItemGroupId() {
        return itemGroupId;
    }

    public GroupItemsResponse setItemGroupId(Integer itemGroupId) {
        this.itemGroupId = itemGroupId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemGroupId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupItemsResponse groupItemsResponse = (GroupItemsResponse) o;
        return Objects.equals(itemGroupId, groupItemsResponse.itemGroupId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupItemsResponse{");
        sb.append("itemGroupId=").append(itemGroupId);
        sb.append('}');
        return sb.toString();
    }
}