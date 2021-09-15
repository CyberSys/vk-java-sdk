package com.vk.api.sdk.objects.orders.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetByIdResponse object
 */
public class GetByIdResponse implements Validable {
    /**
     * Amount
     */
    @SerializedName("amount")
    @Required
    private String amount;

    /**
     * App order ID
     */
    @SerializedName("app_order_id")
    private String appOrderId;

    /**
     * Cancel transaction ID
     */
    @SerializedName("cancel_transaction_id")
    private String cancelTransactionId;

    /**
     * Date of creation in Unixtime
     */
    @SerializedName("date")
    @Required
    private String date;

    /**
     * Order ID
     */
    @SerializedName("id")
    @Required
    private String id;

    /**
     * Order item
     */
    @SerializedName("item")
    @Required
    private String item;

    /**
     * Receiver ID
     */
    @SerializedName("receiver_id")
    private String receiverId;

    /**
     * Order status
     */
    @SerializedName("status")
    @Required
    private GetByIdResponseStatus status;

    /**
     * Transaction ID
     */
    @SerializedName("transaction_id")
    private String transactionId;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private String userId;

    public String getAmount() {
        return amount;
    }

    public GetByIdResponse setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getAppOrderId() {
        return appOrderId;
    }

    public GetByIdResponse setAppOrderId(String appOrderId) {
        this.appOrderId = appOrderId;
        return this;
    }

    public String getCancelTransactionId() {
        return cancelTransactionId;
    }

    public GetByIdResponse setCancelTransactionId(String cancelTransactionId) {
        this.cancelTransactionId = cancelTransactionId;
        return this;
    }

    public String getDate() {
        return date;
    }

    public GetByIdResponse setDate(String date) {
        this.date = date;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetByIdResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getItem() {
        return item;
    }

    public GetByIdResponse setItem(String item) {
        this.item = item;
        return this;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public GetByIdResponse setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }

    public GetByIdResponseStatus getStatus() {
        return status;
    }

    public GetByIdResponse setStatus(GetByIdResponseStatus status) {
        this.status = status;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public GetByIdResponse setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public GetByIdResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount, item, receiverId, appOrderId, cancelTransactionId, id, userId, transactionId, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetByIdResponse getByIdResponse = (GetByIdResponse) o;
        return Objects.equals(date, getByIdResponse.date) &&
                Objects.equals(transactionId, getByIdResponse.transactionId) &&
                Objects.equals(cancelTransactionId, getByIdResponse.cancelTransactionId) &&
                Objects.equals(amount, getByIdResponse.amount) &&
                Objects.equals(item, getByIdResponse.item) &&
                Objects.equals(userId, getByIdResponse.userId) &&
                Objects.equals(receiverId, getByIdResponse.receiverId) &&
                Objects.equals(id, getByIdResponse.id) &&
                Objects.equals(appOrderId, getByIdResponse.appOrderId) &&
                Objects.equals(status, getByIdResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetByIdResponse{");
        sb.append("date='").append(date).append("'");
        sb.append(", transactionId='").append(transactionId).append("'");
        sb.append(", cancelTransactionId='").append(cancelTransactionId).append("'");
        sb.append(", amount='").append(amount).append("'");
        sb.append(", item='").append(item).append("'");
        sb.append(", userId='").append(userId).append("'");
        sb.append(", receiverId='").append(receiverId).append("'");
        sb.append(", id='").append(id).append("'");
        sb.append(", appOrderId='").append(appOrderId).append("'");
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}