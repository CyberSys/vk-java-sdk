// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.editChat method
 */
public class MessagesEditChatQuery extends AbstractQueryBuilder<MessagesEditChatQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param chatId value of "chat id" parameter. Maximum is 100000000. Minimum is 0.
     */
    public MessagesEditChatQuery(VkApiClient client, GroupActor actor, Integer chatId) {
        super(client, "messages.editChat", OkResponse.class);
        accessToken(actor.getAccessToken());
        chatId(chatId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesEditChatQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.editChat", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param chatId value of "chat id" parameter. Maximum is 100000000. Minimum is 0.
     */
    public MessagesEditChatQuery(VkApiClient client, UserActor actor, Integer chatId) {
        super(client, "messages.editChat", OkResponse.class);
        accessToken(actor.getAccessToken());
        chatId(chatId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesEditChatQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.editChat", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Chat ID.
     *
     * @param value value of "chat id" parameter. Maximum is 100000000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("chat_id")
    public MessagesEditChatQuery chatId(Integer value) {
        return unsafeParam("chat_id", value);
    }

    /**
     * New title of the chat.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("title")
    public MessagesEditChatQuery title(String value) {
        return unsafeParam("title", value);
    }

    @Override
    protected MessagesEditChatQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("chat_id", "access_token");
    }
}
