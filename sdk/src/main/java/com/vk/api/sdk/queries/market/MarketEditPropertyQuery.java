// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.editProperty method
 */
public class MarketEditPropertyQuery extends AbstractQueryBuilder<MarketEditPropertyQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param propertyId value of "property id" parameter. Minimum is 0.
     * @param title value of "title" parameter.
     */
    public MarketEditPropertyQuery(VkApiClient client, UserActor actor, Long groupId,
            Integer propertyId, String title) {
        super(client, "market.editProperty", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        propertyId(propertyId);
        title(title);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketEditPropertyQuery(VkApiClient client, UserActor actor) {
        super(client, "market.editProperty", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Group id.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MarketEditPropertyQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Property id.
     *
     * @param value value of "property id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("property_id")
    public MarketEditPropertyQuery propertyId(Integer value) {
        return unsafeParam("property_id", value);
    }

    /**
     * Property name
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("title")
    public MarketEditPropertyQuery title(String value) {
        return unsafeParam("title", value);
    }

    @Override
    protected MarketEditPropertyQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "title", "property_id", "access_token");
    }
}
