// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.GetByIdExtendedResponse;
import com.vk.api.sdk.objects.users.Fields;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getById method
 */
public class MessagesGetByIdQueryWithExtended extends AbstractQueryBuilder<MessagesGetByIdQueryWithExtended, GetByIdExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetByIdQueryWithExtended(VkApiClient client, GroupActor actor) {
        super(client, "messages.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetByIdQueryWithExtended(VkApiClient client, UserActor actor) {
        super(client, "messages.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * Number of characters after which to truncate a previewed message. To preview the full message, specify '0'. "NOTE: Messages are not truncated by default. Messages are truncated by words."
     *
     * @param value value of "preview length" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("preview_length")
    public MessagesGetByIdQueryWithExtended previewLength(Integer value) {
        return unsafeParam("preview_length", value);
    }

    /**
     * Information whether the response should be extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    protected MessagesGetByIdQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Group ID (for group messages with group access token)
     *
     * @param value value of "group id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MessagesGetByIdQueryWithExtended groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter. Entity - peer
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_id")
    public MessagesGetByIdQueryWithExtended peerId(Long value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * messageIds
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("message_ids")
    public MessagesGetByIdQueryWithExtended messageIds(Integer... value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("message_ids")
    public MessagesGetByIdQueryWithExtended messageIds(List<Integer> value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * fields
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public MessagesGetByIdQueryWithExtended fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public MessagesGetByIdQueryWithExtended fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    /**
     * cmids
     * Set cmids
     *
     * @param value value of "cmids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmids")
    public MessagesGetByIdQueryWithExtended cmids(Integer... value) {
        return unsafeParam("cmids", value);
    }

    /**
     * Set cmids
     *
     * @param value value of "cmids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmids")
    public MessagesGetByIdQueryWithExtended cmids(List<Integer> value) {
        return unsafeParam("cmids", value);
    }

    @Override
    protected MessagesGetByIdQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
