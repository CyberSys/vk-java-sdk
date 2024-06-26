// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.deleteCampaigns method
 */
public class AdsDeleteCampaignsQuery extends AbstractQueryBuilder<AdsDeleteCampaignsQuery, List<Integer>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param ids value of "ids" parameter.
     */
    public AdsDeleteCampaignsQuery(VkApiClient client, UserActor actor, Integer accountId,
            String ids) {
        super(client, "ads.deleteCampaigns", Utils.buildParametrizedType(List.class, Integer.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
        ids(ids);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdsDeleteCampaignsQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.deleteCampaigns", Utils.buildParametrizedType(List.class, Integer.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("account_id")
    public AdsDeleteCampaignsQuery accountId(Integer value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Serialized JSON array with IDs of deleted campaigns.
     *
     * @param value value of "ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("ids")
    public AdsDeleteCampaignsQuery ids(String value) {
        return unsafeParam("ids", value);
    }

    @Override
    protected AdsDeleteCampaignsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("ids", "account_id", "access_token");
    }
}
