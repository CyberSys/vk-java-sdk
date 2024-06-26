// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.List;
import java.util.Objects;

/**
 * VideoFull object
 */
public class VideoFull extends Video implements Validable {
    /**
     * List of video episodes with timecodes
     */
    @SerializedName("episodes")
    private List<Episode> episodes;

    @SerializedName("files")
    private VideoFiles files;

    /**
     * Settings for live stream
     */
    @SerializedName("live_settings")
    private LiveSettings liveSettings;

    @SerializedName("trailer")
    private VideoFiles trailer;

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public VideoFull setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
        return this;
    }

    public VideoFiles getFiles() {
        return files;
    }

    public VideoFull setFiles(VideoFiles files) {
        this.files = files;
        return this;
    }

    public LiveSettings getLiveSettings() {
        return liveSettings;
    }

    public VideoFull setLiveSettings(LiveSettings liveSettings) {
        this.liveSettings = liveSettings;
        return this;
    }

    public VideoFiles getTrailer() {
        return trailer;
    }

    public VideoFull setTrailer(VideoFiles trailer) {
        this.trailer = trailer;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trailer, files, liveSettings, episodes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFull videoFull = (VideoFull) o;
        return Objects.equals(trailer, videoFull.trailer) &&
                Objects.equals(files, videoFull.files) &&
                Objects.equals(liveSettings, videoFull.liveSettings) &&
                Objects.equals(episodes, videoFull.episodes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoFull{");
        sb.append("trailer=").append(trailer);
        sb.append(", files=").append(files);
        sb.append(", liveSettings=").append(liveSettings);
        sb.append(", episodes=").append(episodes);
        sb.append('}');
        return sb.toString();
    }
}
