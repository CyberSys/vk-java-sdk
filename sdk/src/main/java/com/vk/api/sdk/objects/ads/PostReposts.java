// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * Reposts
 */
public class PostReposts implements Validable {
    /**
     * Count
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Mail count
     */
    @SerializedName("mail_count")
    private Integer mailCount;

    /**
     * Wall count
     */
    @SerializedName("wall_count")
    private Integer wallCount;

    public Integer getCount() {
        return count;
    }

    public PostReposts setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getMailCount() {
        return mailCount;
    }

    public PostReposts setMailCount(Integer mailCount) {
        this.mailCount = mailCount;
        return this;
    }

    public Integer getWallCount() {
        return wallCount;
    }

    public PostReposts setWallCount(Integer wallCount) {
        this.wallCount = wallCount;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wallCount, count, mailCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostReposts postReposts = (PostReposts) o;
        return Objects.equals(mailCount, postReposts.mailCount) &&
                Objects.equals(count, postReposts.count) &&
                Objects.equals(wallCount, postReposts.wallCount);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PostReposts{");
        sb.append("mailCount=").append(mailCount);
        sb.append(", count=").append(count);
        sb.append(", wallCount=").append(wallCount);
        sb.append('}');
        return sb.toString();
    }
}
