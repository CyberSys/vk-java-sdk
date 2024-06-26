// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.unbanOwner method
 */
public class StoriesUnbanOwnerQuery extends AbstractQueryBuilder<StoriesUnbanOwnerQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownersIds value of "owners ids" parameter.
     */
    public StoriesUnbanOwnerQuery(VkApiClient client, UserActor actor, Long... ownersIds) {
        super(client, "stories.unbanOwner", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownersIds(ownersIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownersIds value of "owners ids" parameter.
     */
    public StoriesUnbanOwnerQuery(VkApiClient client, UserActor actor, List<Long> ownersIds) {
        super(client, "stories.unbanOwner", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownersIds(ownersIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesUnbanOwnerQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.unbanOwner", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ownersIds
     * List of hidden sources to show stories from.
     *
     * @param value value of "owners ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owners_ids")
    public StoriesUnbanOwnerQuery ownersIds(Long... value) {
        return unsafeParam("owners_ids", value);
    }

    /**
     * List of hidden sources to show stories from.
     *
     * @param value value of "owners ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owners_ids")
    public StoriesUnbanOwnerQuery ownersIds(List<Long> value) {
        return unsafeParam("owners_ids", value);
    }

    @Override
    protected StoriesUnbanOwnerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owners_ids", "access_token");
    }
}
