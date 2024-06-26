// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.PropertyExists;

import java.util.List;
import java.util.Objects;

/**
 * VideoAlbumFull object
 */
public class VideoAlbumFull extends VideoAlbum implements Validable {
    /**
     * Is user can delete playlist
     */
    @SerializedName("can_delete")
    private BoolInt canDelete;

    /**
     * Is user can edit playlist
     */
    @SerializedName("can_edit")
    private BoolInt canEdit;

    /**
     * Is user can upload video to playlist
     */
    @SerializedName("can_upload")
    private BoolInt canUpload;

    /**
     * Total number of videos in album
     */
    @SerializedName("count")
    @Required
    private Integer count;

    /**
     * Album cover image in different sizes
     */
    @SerializedName("image")
    private List<VideoImage> image;

    /**
     * Need blur album thumb or not
     */
    @SerializedName("image_blur")
    private PropertyExists imageBlur;

    /**
     * Information whether album is system
     */
    @SerializedName("is_system")
    private PropertyExists isSystem;

    /**
     * Date when the album has been updated last time in Unixtime
     */
    @SerializedName("updated_time")
    @Required
    private Integer updatedTime;

    public boolean canDelete() {
        return canDelete == BoolInt.YES;
    }

    public BoolInt getCanDelete() {
        return canDelete;
    }

    public boolean canEdit() {
        return canEdit == BoolInt.YES;
    }

    public BoolInt getCanEdit() {
        return canEdit;
    }

    public boolean canUpload() {
        return canUpload == BoolInt.YES;
    }

    public BoolInt getCanUpload() {
        return canUpload;
    }

    public Integer getCount() {
        return count;
    }

    public VideoAlbumFull setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<VideoImage> getImage() {
        return image;
    }

    public VideoAlbumFull setImage(List<VideoImage> image) {
        this.image = image;
        return this;
    }

    public boolean isImageBlur() {
        return imageBlur == PropertyExists.PROPERTY_EXISTS;
    }

    public boolean isSystem() {
        return isSystem == PropertyExists.PROPERTY_EXISTS;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public VideoAlbumFull setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSystem, image, updatedTime, imageBlur, canEdit, count, canDelete, canUpload);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoAlbumFull videoAlbumFull = (VideoAlbumFull) o;
        return Objects.equals(image, videoAlbumFull.image) &&
                Objects.equals(isSystem, videoAlbumFull.isSystem) &&
                Objects.equals(updatedTime, videoAlbumFull.updatedTime) &&
                Objects.equals(imageBlur, videoAlbumFull.imageBlur) &&
                Objects.equals(canDelete, videoAlbumFull.canDelete) &&
                Objects.equals(count, videoAlbumFull.count) &&
                Objects.equals(canEdit, videoAlbumFull.canEdit) &&
                Objects.equals(canUpload, videoAlbumFull.canUpload);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoAlbumFull{");
        sb.append("image=").append(image);
        sb.append(", isSystem=").append(isSystem);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", imageBlur=").append(imageBlur);
        sb.append(", canDelete=").append(canDelete);
        sb.append(", count=").append(count);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", canUpload=").append(canUpload);
        sb.append('}');
        return sb.toString();
    }
}
