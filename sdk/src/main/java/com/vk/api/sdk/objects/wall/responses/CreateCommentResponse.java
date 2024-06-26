// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * CreateCommentResponse object
 */
public class CreateCommentResponse implements Validable {
    /**
     * Created comment ID
     */
    @SerializedName("comment_id")
    @Required
    private Integer commentId;

    @SerializedName("parents_stack")
    private List<Integer> parentsStack;

    public Integer getCommentId() {
        return commentId;
    }

    public CreateCommentResponse setCommentId(Integer commentId) {
        this.commentId = commentId;
        return this;
    }

    public List<Integer> getParentsStack() {
        return parentsStack;
    }

    public CreateCommentResponse setParentsStack(List<Integer> parentsStack) {
        this.parentsStack = parentsStack;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentsStack, commentId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCommentResponse createCommentResponse = (CreateCommentResponse) o;
        return Objects.equals(parentsStack, createCommentResponse.parentsStack) &&
                Objects.equals(commentId, createCommentResponse.commentId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CreateCommentResponse{");
        sb.append("parentsStack=").append(parentsStack);
        sb.append(", commentId=").append(commentId);
        sb.append('}');
        return sb.toString();
    }
}
