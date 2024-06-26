// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Objects;

/**
 * MarketAlbum object
 */
public class MarketAlbum implements Validable {
    /**
     * Items number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    /**
     * Market album ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Is album needed to be blurred (18+) or not
     */
    @SerializedName("is_blur_enabled")
    private Boolean isBlurEnabled;

    /**
     * Is album hidden
     */
    @SerializedName("is_hidden")
    private Boolean isHidden;

    /**
     * Is album main for owner
     */
    @SerializedName("is_main")
    private Boolean isMain;

    /**
     * Market album owner's ID
     * Entity: owner
     */
    @SerializedName("owner_id")
    @Required
    private Long ownerId;

    @SerializedName("photo")
    private Photo photo;

    /**
     * Market album title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Type of album
     */
    @SerializedName("type")
    private MarketAlbumType type;

    /**
     * Date when album has been updated last time in Unixtime
     */
    @SerializedName("updated_time")
    @Required
    private Integer updatedTime;

    public Integer getCount() {
        return count;
    }

    public MarketAlbum setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public MarketAlbum setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsBlurEnabled() {
        return isBlurEnabled;
    }

    public MarketAlbum setIsBlurEnabled(Boolean isBlurEnabled) {
        this.isBlurEnabled = isBlurEnabled;
        return this;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public MarketAlbum setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public MarketAlbum setIsMain(Boolean isMain) {
        this.isMain = isMain;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public MarketAlbum setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public MarketAlbum setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MarketAlbum setTitle(String title) {
        this.title = title;
        return this;
    }

    public MarketAlbumType getType() {
        return type;
    }

    public MarketAlbum setType(MarketAlbumType type) {
        this.type = type;
        return this;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public MarketAlbum setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatedTime, isBlurEnabled, isMain, count, photo, id, ownerId, title, type, isHidden);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketAlbum marketAlbum = (MarketAlbum) o;
        return Objects.equals(updatedTime, marketAlbum.updatedTime) &&
                Objects.equals(ownerId, marketAlbum.ownerId) &&
                Objects.equals(isMain, marketAlbum.isMain) &&
                Objects.equals(count, marketAlbum.count) &&
                Objects.equals(isHidden, marketAlbum.isHidden) &&
                Objects.equals(photo, marketAlbum.photo) &&
                Objects.equals(id, marketAlbum.id) &&
                Objects.equals(isBlurEnabled, marketAlbum.isBlurEnabled) &&
                Objects.equals(title, marketAlbum.title) &&
                Objects.equals(type, marketAlbum.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketAlbum{");
        sb.append("updatedTime=").append(updatedTime);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", isMain=").append(isMain);
        sb.append(", count=").append(count);
        sb.append(", isHidden=").append(isHidden);
        sb.append(", photo=").append(photo);
        sb.append(", id=").append(id);
        sb.append(", isBlurEnabled=").append(isBlurEnabled);
        sb.append(", title='").append(title).append("'");
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
