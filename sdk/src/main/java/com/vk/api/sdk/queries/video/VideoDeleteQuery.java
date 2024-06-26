// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.delete method
 */
public class VideoDeleteQuery extends AbstractQueryBuilder<VideoDeleteQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param videoId value of "video id" parameter. Minimum is 0.
     */
    public VideoDeleteQuery(VkApiClient client, UserActor actor, Integer videoId) {
        super(client, "video.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
        videoId(videoId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public VideoDeleteQuery(VkApiClient client, UserActor actor) {
        super(client, "video.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Video ID.
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("video_id")
    public VideoDeleteQuery videoId(Integer value) {
        return unsafeParam("video_id", value);
    }

    /**
     * ID of the user or community that owns the video.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public VideoDeleteQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set target id
     *
     * @param value value of "target id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("target_id")
    public VideoDeleteQuery targetId(Long value) {
        return unsafeParam("target_id", value);
    }

    @Override
    protected VideoDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "access_token");
    }
}
