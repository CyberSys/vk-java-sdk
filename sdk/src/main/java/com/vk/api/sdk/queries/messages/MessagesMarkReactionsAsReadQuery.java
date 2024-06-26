// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.BoolResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.markReactionsAsRead method
 */
public class MessagesMarkReactionsAsReadQuery extends AbstractQueryBuilder<MessagesMarkReactionsAsReadQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter. Entity - peer
     *
     */
    public MessagesMarkReactionsAsReadQuery(VkApiClient client, UserActor actor, Long peerId) {
        super(client, "messages.markReactionsAsRead", BoolResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesMarkReactionsAsReadQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.markReactionsAsRead", BoolResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter. Entity - peer
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_id")
    public MessagesMarkReactionsAsReadQuery peerId(Long value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * cmids
     * Set cmids
     *
     * @param value value of "cmids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmids")
    public MessagesMarkReactionsAsReadQuery cmids(Integer... value) {
        return unsafeParam("cmids", value);
    }

    /**
     * Set cmids
     *
     * @param value value of "cmids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmids")
    public MessagesMarkReactionsAsReadQuery cmids(List<Integer> value) {
        return unsafeParam("cmids", value);
    }

    @Override
    protected MessagesMarkReactionsAsReadQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "access_token");
    }
}
