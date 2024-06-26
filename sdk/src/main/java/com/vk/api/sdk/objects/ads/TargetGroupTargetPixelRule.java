// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.List;
import java.util.Objects;

/**
 * TargetGroupTargetPixelRule object
 */
public class TargetGroupTargetPixelRule implements Validable {
    @SerializedName("event_full_match")
    private String eventFullMatch;

    @SerializedName("event_regex_match")
    private String eventRegexMatch;

    @SerializedName("event_substrings_match")
    private List<String> eventSubstringsMatch;

    @SerializedName("url_full_match")
    private String urlFullMatch;

    @SerializedName("url_regex_match")
    private String urlRegexMatch;

    @SerializedName("url_substrings_match")
    private List<String> urlSubstringsMatch;

    public String getEventFullMatch() {
        return eventFullMatch;
    }

    public TargetGroupTargetPixelRule setEventFullMatch(String eventFullMatch) {
        this.eventFullMatch = eventFullMatch;
        return this;
    }

    public String getEventRegexMatch() {
        return eventRegexMatch;
    }

    public TargetGroupTargetPixelRule setEventRegexMatch(String eventRegexMatch) {
        this.eventRegexMatch = eventRegexMatch;
        return this;
    }

    public List<String> getEventSubstringsMatch() {
        return eventSubstringsMatch;
    }

    public TargetGroupTargetPixelRule setEventSubstringsMatch(List<String> eventSubstringsMatch) {
        this.eventSubstringsMatch = eventSubstringsMatch;
        return this;
    }

    public String getUrlFullMatch() {
        return urlFullMatch;
    }

    public TargetGroupTargetPixelRule setUrlFullMatch(String urlFullMatch) {
        this.urlFullMatch = urlFullMatch;
        return this;
    }

    public String getUrlRegexMatch() {
        return urlRegexMatch;
    }

    public TargetGroupTargetPixelRule setUrlRegexMatch(String urlRegexMatch) {
        this.urlRegexMatch = urlRegexMatch;
        return this;
    }

    public List<String> getUrlSubstringsMatch() {
        return urlSubstringsMatch;
    }

    public TargetGroupTargetPixelRule setUrlSubstringsMatch(List<String> urlSubstringsMatch) {
        this.urlSubstringsMatch = urlSubstringsMatch;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventRegexMatch, urlRegexMatch, eventFullMatch, eventSubstringsMatch, urlSubstringsMatch, urlFullMatch);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetGroupTargetPixelRule targetGroupTargetPixelRule = (TargetGroupTargetPixelRule) o;
        return Objects.equals(urlSubstringsMatch, targetGroupTargetPixelRule.urlSubstringsMatch) &&
                Objects.equals(eventFullMatch, targetGroupTargetPixelRule.eventFullMatch) &&
                Objects.equals(eventRegexMatch, targetGroupTargetPixelRule.eventRegexMatch) &&
                Objects.equals(urlRegexMatch, targetGroupTargetPixelRule.urlRegexMatch) &&
                Objects.equals(eventSubstringsMatch, targetGroupTargetPixelRule.eventSubstringsMatch) &&
                Objects.equals(urlFullMatch, targetGroupTargetPixelRule.urlFullMatch);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TargetGroupTargetPixelRule{");
        sb.append("urlSubstringsMatch='").append(urlSubstringsMatch).append("'");
        sb.append(", eventFullMatch='").append(eventFullMatch).append("'");
        sb.append(", eventRegexMatch='").append(eventRegexMatch).append("'");
        sb.append(", urlRegexMatch='").append(urlRegexMatch).append("'");
        sb.append(", eventSubstringsMatch='").append(eventSubstringsMatch).append("'");
        sb.append(", urlFullMatch='").append(urlFullMatch).append("'");
        sb.append('}');
        return sb.toString();
    }
}
