package com.vk.api.sdk.queries.leadforms;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.leadforms.responses.GetLeadsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for LeadForms.getLeads method
 */
public class LeadFormsGetLeadsQuery extends AbstractQueryBuilder<LeadFormsGetLeadsQuery, GetLeadsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     * @param formId value of "form id" parameter.
     */
    public LeadFormsGetLeadsQuery(VkApiClient client, UserActor actor, int groupId, int formId) {
        super(client, "leadForms.getLeads", GetLeadsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        formId(formId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsGetLeadsQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set form id
     *
     * @param value value of "form id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsGetLeadsQuery formId(int value) {
        return unsafeParam("form_id", value);
    }

    /**
     * Set limit
     *
     * @param value value of "limit" parameter. Maximum is 1000. Minimum is 1. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsGetLeadsQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * Set next page token
     *
     * @param value value of "next page token" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsGetLeadsQuery nextPageToken(String value) {
        return unsafeParam("next_page_token", value);
    }

    @Override
    protected LeadFormsGetLeadsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "form_id", "access_token");
    }
}