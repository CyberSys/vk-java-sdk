// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.groups.responses.AddLinkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.addLink method
 */
public class GroupsAddLinkQuery extends AbstractQueryBuilder<GroupsAddLinkQuery, AddLinkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param link value of "link" parameter.
     */
    public GroupsAddLinkQuery(VkApiClient client, UserActor actor, Long groupId, String link) {
        super(client, "groups.addLink", AddLinkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        link(link);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsAddLinkQuery(VkApiClient client, UserActor actor) {
        super(client, "groups.addLink", AddLinkResponse.class);
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
    public GroupsAddLinkQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Link URL.
     *
     * @param value value of "link" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("link")
    public GroupsAddLinkQuery link(String value) {
        return unsafeParam("link", value);
    }

    /**
     * Description text for the link.
     *
     * @param value value of "text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("text")
    public GroupsAddLinkQuery text(String value) {
        return unsafeParam("text", value);
    }

    @Override
    protected GroupsAddLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "link", "access_token");
    }
}
