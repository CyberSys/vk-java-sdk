// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.store.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.store.Product;

import java.util.List;
import java.util.Objects;

/**
 * GetProductsResponse object
 */
public class GetProductsResponse implements Validable {
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Product> items;

    public Integer getCount() {
        return count;
    }

    public GetProductsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Product> getItems() {
        return items;
    }

    public GetProductsResponse setItems(List<Product> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetProductsResponse getProductsResponse = (GetProductsResponse) o;
        return Objects.equals(count, getProductsResponse.count) &&
                Objects.equals(items, getProductsResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetProductsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
