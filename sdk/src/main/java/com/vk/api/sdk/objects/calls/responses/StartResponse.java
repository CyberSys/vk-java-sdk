// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.calls.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * StartResponse object
 */
public class StartResponse implements Validable {
    /**
     * video id for streaming
     */
    @SerializedName("broadcast_ov_id")
    private String broadcastOvId;

    /**
     * video id for link
     */
    @SerializedName("broadcast_video_id")
    private String broadcastVideoId;

    /**
     * Call id
     */
    @SerializedName("call_id")
    private String callId;

    /**
     * Join link
     */
    @SerializedName("join_link")
    @Required
    private String joinLink;

    /**
     * OK join link
     */
    @SerializedName("ok_join_link")
    @Required
    private String okJoinLink;

    public String getBroadcastOvId() {
        return broadcastOvId;
    }

    public StartResponse setBroadcastOvId(String broadcastOvId) {
        this.broadcastOvId = broadcastOvId;
        return this;
    }

    public String getBroadcastVideoId() {
        return broadcastVideoId;
    }

    public StartResponse setBroadcastVideoId(String broadcastVideoId) {
        this.broadcastVideoId = broadcastVideoId;
        return this;
    }

    public String getCallId() {
        return callId;
    }

    public StartResponse setCallId(String callId) {
        this.callId = callId;
        return this;
    }

    public String getJoinLink() {
        return joinLink;
    }

    public StartResponse setJoinLink(String joinLink) {
        this.joinLink = joinLink;
        return this;
    }

    public String getOkJoinLink() {
        return okJoinLink;
    }

    public StartResponse setOkJoinLink(String okJoinLink) {
        this.okJoinLink = okJoinLink;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(broadcastOvId, callId, broadcastVideoId, joinLink, okJoinLink);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StartResponse startResponse = (StartResponse) o;
        return Objects.equals(broadcastOvId, startResponse.broadcastOvId) &&
                Objects.equals(joinLink, startResponse.joinLink) &&
                Objects.equals(broadcastVideoId, startResponse.broadcastVideoId) &&
                Objects.equals(okJoinLink, startResponse.okJoinLink) &&
                Objects.equals(callId, startResponse.callId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StartResponse{");
        sb.append("broadcastOvId='").append(broadcastOvId).append("'");
        sb.append(", joinLink='").append(joinLink).append("'");
        sb.append(", broadcastVideoId='").append(broadcastVideoId).append("'");
        sb.append(", okJoinLink='").append(okJoinLink).append("'");
        sb.append(", callId='").append(callId).append("'");
        sb.append('}');
        return sb.toString();
    }
}
