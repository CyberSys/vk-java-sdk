package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.Image;
import java.util.List;
import java.util.Objects;

/**
 * SaveOwnerCoverPhotoResponse object
 */
public class SaveOwnerCoverPhotoResponse implements Validable {
    @SerializedName("images")
    private List<Image> images;

    public List<Image> getImages() {
        return images;
    }

    public SaveOwnerCoverPhotoResponse setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(images);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveOwnerCoverPhotoResponse saveOwnerCoverPhotoResponse = (SaveOwnerCoverPhotoResponse) o;
        return Objects.equals(images, saveOwnerCoverPhotoResponse.images);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveOwnerCoverPhotoResponse{");
        sb.append("images=").append(images);
        sb.append('}');
        return sb.toString();
    }
}