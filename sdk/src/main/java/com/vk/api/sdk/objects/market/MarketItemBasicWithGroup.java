// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * MarketItemBasicWithGroup object
 */
public class MarketItemBasicWithGroup extends MarketItemBasic implements Validable {
    @SerializedName("group_link")
    private String groupLink;

    @SerializedName("group_name")
    private String groupName;

    @SerializedName("is_adult")
    private Boolean isAdult;

    @SerializedName("is_group_verified")
    private Boolean isGroupVerified;

    @SerializedName("is_owner")
    private Boolean isOwner;

    public String getGroupLink() {
        return groupLink;
    }

    public MarketItemBasicWithGroup setGroupLink(String groupLink) {
        this.groupLink = groupLink;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public MarketItemBasicWithGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public Boolean getIsAdult() {
        return isAdult;
    }

    public MarketItemBasicWithGroup setIsAdult(Boolean isAdult) {
        this.isAdult = isAdult;
        return this;
    }

    public Boolean getIsGroupVerified() {
        return isGroupVerified;
    }

    public MarketItemBasicWithGroup setIsGroupVerified(Boolean isGroupVerified) {
        this.isGroupVerified = isGroupVerified;
        return this;
    }

    public Boolean getIsOwner() {
        return isOwner;
    }

    public MarketItemBasicWithGroup setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, isOwner, isGroupVerified, groupLink, isAdult);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketItemBasicWithGroup marketItemBasicWithGroup = (MarketItemBasicWithGroup) o;
        return Objects.equals(groupName, marketItemBasicWithGroup.groupName) &&
                Objects.equals(isOwner, marketItemBasicWithGroup.isOwner) &&
                Objects.equals(groupLink, marketItemBasicWithGroup.groupLink) &&
                Objects.equals(isGroupVerified, marketItemBasicWithGroup.isGroupVerified) &&
                Objects.equals(isAdult, marketItemBasicWithGroup.isAdult);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketItemBasicWithGroup{");
        sb.append("groupName='").append(groupName).append("'");
        sb.append(", isOwner=").append(isOwner);
        sb.append(", groupLink='").append(groupLink).append("'");
        sb.append(", isGroupVerified=").append(isGroupVerified);
        sb.append(", isAdult=").append(isAdult);
        sb.append('}');
        return sb.toString();
    }
}
