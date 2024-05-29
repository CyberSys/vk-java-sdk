// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.apps.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.apps.CustomSnippet;

import java.util.List;
import java.util.Objects;

/**
 * GetSnippetsResponse object
 */
public class GetSnippetsResponse implements Validable {
    @SerializedName("items")
    private List<CustomSnippet> items;

    public List<CustomSnippet> getItems() {
        return items;
    }

    public GetSnippetsResponse setItems(List<CustomSnippet> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSnippetsResponse getSnippetsResponse = (GetSnippetsResponse) o;
        return Objects.equals(items, getSnippetsResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSnippetsResponse{");
        sb.append("items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}