// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.groups.responses.GetLongPollSettingsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getLongPollSettings method
 */
public class GroupsGetLongPollSettingsQuery extends AbstractQueryBuilder<GroupsGetLongPollSettingsQuery, GetLongPollSettingsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     */
    public GroupsGetLongPollSettingsQuery(VkApiClient client, GroupActor actor, Long groupId) {
        super(client, "groups.getLongPollSettings", GetLongPollSettingsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsGetLongPollSettingsQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.getLongPollSettings", GetLongPollSettingsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     */
    public GroupsGetLongPollSettingsQuery(VkApiClient client, UserActor actor, Long groupId) {
        super(client, "groups.getLongPollSettings", GetLongPollSettingsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsGetLongPollSettingsQuery(VkApiClient client, UserActor actor) {
        super(client, "groups.getLongPollSettings", GetLongPollSettingsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public GroupsGetLongPollSettingsQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected GroupsGetLongPollSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
