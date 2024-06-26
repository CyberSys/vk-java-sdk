// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.newsfeed.ItemWallpostFeedback;

import java.util.List;
import java.util.Objects;

/**
 * WallpostFull object
 */
public class WallpostFull extends Wallpost implements Validable {
    /**
     * Information whether current user can delete the post
     */
    @SerializedName("can_delete")
    private BoolInt canDelete;

    /**
     * Information whether current user can edit the post
     */
    @SerializedName("can_edit")
    private BoolInt canEdit;

    /**
     * Information whether current user can pin the post
     */
    @SerializedName("can_pin")
    private BoolInt canPin;

    /**
     * Index of current carousel element
     */
    @SerializedName("carousel_offset")
    private Integer carouselOffset;

    @SerializedName("comments")
    private CommentsInfo comments;

    @SerializedName("copy_history")
    private List<WallpostFull> copyHistory;

    /**
     * Post creator ID (if post still can be edited)
     * Entity: owner
     */
    @SerializedName("created_by")
    private Long createdBy;

    @SerializedName("donut")
    private WallpostDonut donut;

    @SerializedName("feedback")
    private ItemWallpostFeedback feedback;

    /**
     * Hash for sharing
     */
    @SerializedName("hash")
    private String hash;

    /**
     * Information whether the post is pinned
     */
    @SerializedName("is_pinned")
    private BoolInt isPinned;

    /**
     * Information whether the post is marked as ads
     */
    @SerializedName("marked_as_ads")
    private BoolInt markedAsAds;

    /**
     * Preview length control parameter
     */
    @SerializedName("short_text_rate")
    private Number shortTextRate;

    /**
     * Entity: owner
     */
    @SerializedName("to_id")
    private Long toId;

    /**
     * Topic ID. Allowed values can be obtained from newsfeed.getPostTopics method
     */
    @SerializedName("topic_id")
    private WallpostFullTopicId topicId;

    @SerializedName("type")
    private PostType type;

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

    public boolean canPin() {
        return canPin == BoolInt.YES;
    }

    public BoolInt getCanPin() {
        return canPin;
    }

    public Integer getCarouselOffset() {
        return carouselOffset;
    }

    public WallpostFull setCarouselOffset(Integer carouselOffset) {
        this.carouselOffset = carouselOffset;
        return this;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public WallpostFull setComments(CommentsInfo comments) {
        this.comments = comments;
        return this;
    }

    public List<WallpostFull> getCopyHistory() {
        return copyHistory;
    }

    public WallpostFull setCopyHistory(List<WallpostFull> copyHistory) {
        this.copyHistory = copyHistory;
        return this;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public WallpostFull setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public WallpostDonut getDonut() {
        return donut;
    }

    public WallpostFull setDonut(WallpostDonut donut) {
        this.donut = donut;
        return this;
    }

    public ItemWallpostFeedback getFeedback() {
        return feedback;
    }

    public WallpostFull setFeedback(ItemWallpostFeedback feedback) {
        this.feedback = feedback;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public WallpostFull setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public boolean isPinned() {
        return isPinned == BoolInt.YES;
    }

    public BoolInt getIsPinned() {
        return isPinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds == BoolInt.YES;
    }

    public BoolInt getMarkedAsAds() {
        return markedAsAds;
    }

    public Number getShortTextRate() {
        return shortTextRate;
    }

    public WallpostFull setShortTextRate(Number shortTextRate) {
        this.shortTextRate = shortTextRate;
        return this;
    }

    public Long getToId() {
        return toId;
    }

    public WallpostFull setToId(Long toId) {
        this.toId = toId;
        return this;
    }

    public WallpostFullTopicId getTopicId() {
        return topicId;
    }

    public WallpostFull setTopicId(WallpostFullTopicId topicId) {
        this.topicId = topicId;
        return this;
    }

    public PostType getType() {
        return type;
    }

    public WallpostFull setType(PostType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toId, carouselOffset, comments, isPinned, canEdit, shortTextRate, type, feedback, topicId, createdBy, donut, canDelete, canPin, markedAsAds, hash, copyHistory);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostFull wallpostFull = (WallpostFull) o;
        return Objects.equals(comments, wallpostFull.comments) &&
                Objects.equals(canEdit, wallpostFull.canEdit) &&
                Objects.equals(toId, wallpostFull.toId) &&
                Objects.equals(type, wallpostFull.type) &&
                Objects.equals(createdBy, wallpostFull.createdBy) &&
                Objects.equals(canPin, wallpostFull.canPin) &&
                Objects.equals(copyHistory, wallpostFull.copyHistory) &&
                Objects.equals(isPinned, wallpostFull.isPinned) &&
                Objects.equals(feedback, wallpostFull.feedback) &&
                Objects.equals(shortTextRate, wallpostFull.shortTextRate) &&
                Objects.equals(canDelete, wallpostFull.canDelete) &&
                Objects.equals(donut, wallpostFull.donut) &&
                Objects.equals(markedAsAds, wallpostFull.markedAsAds) &&
                Objects.equals(topicId, wallpostFull.topicId) &&
                Objects.equals(carouselOffset, wallpostFull.carouselOffset) &&
                Objects.equals(hash, wallpostFull.hash);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallpostFull{");
        sb.append("comments=").append(comments);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", toId=").append(toId);
        sb.append(", type=").append(type);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", canPin=").append(canPin);
        sb.append(", copyHistory=").append(copyHistory);
        sb.append(", isPinned=").append(isPinned);
        sb.append(", feedback=").append(feedback);
        sb.append(", shortTextRate=").append(shortTextRate);
        sb.append(", canDelete=").append(canDelete);
        sb.append(", donut=").append(donut);
        sb.append(", markedAsAds=").append(markedAsAds);
        sb.append(", topicId=").append(topicId);
        sb.append(", carouselOffset=").append(carouselOffset);
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
