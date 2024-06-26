// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.apps.responses.CreatedGroupResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.updateMetaForTestingGroup method
 */
public class AppsUpdateMetaForTestingGroupQueryWithGroup extends AbstractQueryBuilder<AppsUpdateMetaForTestingGroupQueryWithGroup, CreatedGroupResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param webview value of "webview" parameter.
     * @param name value of "name" parameter.
     * @param platforms value of "platforms" parameter.
     */
    public AppsUpdateMetaForTestingGroupQueryWithGroup(VkApiClient client, ServiceActor actor,
            String webview, String name, String... platforms) {
        super(client, "apps.updateMetaForTestingGroup", CreatedGroupResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        webview(webview);
        name(name);
        platforms(platforms);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param webview value of "webview" parameter.
     * @param name value of "name" parameter.
     * @param platforms value of "platforms" parameter.
     */
    public AppsUpdateMetaForTestingGroupQueryWithGroup(VkApiClient client, ServiceActor actor,
            String webview, String name, List<String> platforms) {
        super(client, "apps.updateMetaForTestingGroup", CreatedGroupResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        webview(webview);
        name(name);
        platforms(platforms);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Maximum is 25. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public AppsUpdateMetaForTestingGroupQueryWithGroup groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set webview
     *
     * @param value value of "webview" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("webview")
    public AppsUpdateMetaForTestingGroupQueryWithGroup webview(String value) {
        return unsafeParam("webview", value);
    }

    /**
     * Set name
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("name")
    public AppsUpdateMetaForTestingGroupQueryWithGroup name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * platforms
     * Set platforms
     *
     * @param value value of "platforms" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("platforms")
    public AppsUpdateMetaForTestingGroupQueryWithGroup platforms(String... value) {
        return unsafeParam("platforms", value);
    }

    /**
     * Set platforms
     *
     * @param value value of "platforms" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("platforms")
    public AppsUpdateMetaForTestingGroupQueryWithGroup platforms(List<String> value) {
        return unsafeParam("platforms", value);
    }

    /**
     * userIds
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids")
    public AppsUpdateMetaForTestingGroupQueryWithGroup userIds(Long... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids")
    public AppsUpdateMetaForTestingGroupQueryWithGroup userIds(List<Long> value) {
        return unsafeParam("user_ids", value);
    }

    @Override
    protected AppsUpdateMetaForTestingGroupQueryWithGroup getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("platforms", "name", "webview", "access_token");
    }
}
