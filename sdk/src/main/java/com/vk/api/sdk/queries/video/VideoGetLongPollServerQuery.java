// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.video.responses.GetLongPollServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getLongPollServer method
 */
public class VideoGetLongPollServerQuery extends AbstractQueryBuilder<VideoGetLongPollServerQuery, GetLongPollServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param videoId value of "video id" parameter. Minimum is 0.
     */
    public VideoGetLongPollServerQuery(VkApiClient client, UserActor actor, Integer videoId) {
        super(client, "video.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
        videoId(videoId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public VideoGetLongPollServerQuery(VkApiClient client, UserActor actor) {
        super(client, "video.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public VideoGetLongPollServerQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set video id
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("video_id")
    public VideoGetLongPollServerQuery videoId(Integer value) {
        return unsafeParam("video_id", value);
    }

    @Override
    protected VideoGetLongPollServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "access_token");
    }
}
