// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.UpdateCampaignsResponse;
import com.vk.api.sdk.objects.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.updateCampaigns method
 */
public class AdsUpdateCampaignsQuery extends AbstractQueryBuilder<AdsUpdateCampaignsQuery, List<UpdateCampaignsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param data value of "data" parameter.
     */
    public AdsUpdateCampaignsQuery(VkApiClient client, UserActor actor, Integer accountId,
            String data) {
        super(client, "ads.updateCampaigns", Utils.buildParametrizedType(List.class, UpdateCampaignsResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
        data(data);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdsUpdateCampaignsQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.updateCampaigns", Utils.buildParametrizedType(List.class, UpdateCampaignsResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("account_id")
    public AdsUpdateCampaignsQuery accountId(Integer value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Serialized JSON array of objects that describe changes in campaigns. Description of 'campaign_mod' objects see below.
     *
     * @param value value of "data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("data")
    public AdsUpdateCampaignsQuery data(String value) {
        return unsafeParam("data", value);
    }

    @Override
    protected AdsUpdateCampaignsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("data", "account_id", "access_token");
    }
}
