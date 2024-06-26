// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.events.CallbackEvent;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * DonutSubscriptionCreate object
 */
public class DonutSubscriptionCreate implements Validable, CallbackEvent {
    @SerializedName("amount")
    @Required
    private Integer amount;

    @SerializedName("amount_without_fee")
    @Required
    private Number amountWithoutFee;

    /**
     * Entity: owner
     */
    @SerializedName("user_id")
    private Long userId;

    public Integer getAmount() {
        return amount;
    }

    public DonutSubscriptionCreate setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Number getAmountWithoutFee() {
        return amountWithoutFee;
    }

    public DonutSubscriptionCreate setAmountWithoutFee(Number amountWithoutFee) {
        this.amountWithoutFee = amountWithoutFee;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public DonutSubscriptionCreate setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, userId, amountWithoutFee);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonutSubscriptionCreate donutSubscriptionCreate = (DonutSubscriptionCreate) o;
        return Objects.equals(amount, donutSubscriptionCreate.amount) &&
                Objects.equals(userId, donutSubscriptionCreate.userId) &&
                Objects.equals(amountWithoutFee, donutSubscriptionCreate.amountWithoutFee);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DonutSubscriptionCreate{");
        sb.append("amount=").append(amount);
        sb.append(", userId=").append(userId);
        sb.append(", amountWithoutFee=").append(amountWithoutFee);
        sb.append('}');
        return sb.toString();
    }
}
