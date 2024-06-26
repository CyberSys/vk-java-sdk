// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Error;

import java.util.Objects;

/**
 * UpdateOfficeUsersResult object
 */
public class UpdateOfficeUsersResult implements Validable {
    @SerializedName("error")
    private Error error;

    @SerializedName("is_success")
    @Required
    private Boolean isSuccess;

    /**
     * Entity: owner
     */
    @SerializedName("user_id")
    @Required
    private Long userId;

    public Error getError() {
        return error;
    }

    public UpdateOfficeUsersResult setError(Error error) {
        this.error = error;
        return this;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public UpdateOfficeUsersResult setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public UpdateOfficeUsersResult setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, userId, isSuccess);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateOfficeUsersResult updateOfficeUsersResult = (UpdateOfficeUsersResult) o;
        return Objects.equals(userId, updateOfficeUsersResult.userId) &&
                Objects.equals(error, updateOfficeUsersResult.error) &&
                Objects.equals(isSuccess, updateOfficeUsersResult.isSuccess);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UpdateOfficeUsersResult{");
        sb.append("userId=").append(userId);
        sb.append(", error=").append(error);
        sb.append(", isSuccess=").append(isSuccess);
        sb.append('}');
        return sb.toString();
    }
}
