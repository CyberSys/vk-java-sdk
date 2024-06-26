// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.NameCase;
import com.vk.api.sdk.objects.polls.responses.GetVotersFieldsResponse;
import com.vk.api.sdk.objects.users.Fields;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.getVoters method
 */
public class PollsGetVotersQueryWithFields extends AbstractQueryBuilder<PollsGetVotersQueryWithFields, List<GetVotersFieldsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pollId value of "poll id" parameter. Minimum is 0.
     * @param answerIds value of "answer ids" parameter.
     */
    public PollsGetVotersQueryWithFields(VkApiClient client, UserActor actor, Integer pollId,
            Long[] answerIds, Fields... fields) {
        super(client, "polls.getVoters", Utils.buildParametrizedType(List.class, GetVotersFieldsResponse.class));
        accessToken(actor.getAccessToken());
        pollId(pollId);
        answerIds(answerIds);
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pollId value of "poll id" parameter. Minimum is 0.
     * @param answerIds value of "answer ids" parameter.
     */
    public PollsGetVotersQueryWithFields(VkApiClient client, UserActor actor, Integer pollId,
            List<Long> answerIds, List<Fields> fields) {
        super(client, "polls.getVoters", Utils.buildParametrizedType(List.class, GetVotersFieldsResponse.class));
        accessToken(actor.getAccessToken());
        pollId(pollId);
        answerIds(answerIds);
        fields(fields);
    }

    /**
     * ID of the user or community that owns the poll. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public PollsGetVotersQueryWithFields ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Poll ID.
     *
     * @param value value of "poll id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("poll_id")
    public PollsGetVotersQueryWithFields pollId(Integer value) {
        return unsafeParam("poll_id", value);
    }

    /**
     * Set is board
     *
     * @param value value of "is board" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("is_board")
    public PollsGetVotersQueryWithFields isBoard(Boolean value) {
        return unsafeParam("is_board", value);
    }

    /**
     * '1' - to return only current user's friends, '0' - to return all users (default),
     *
     * @param value value of "friends only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("friends_only")
    public PollsGetVotersQueryWithFields friendsOnly(Boolean value) {
        return unsafeParam("friends_only", value);
    }

    /**
     * Offset needed to return a specific subset of voters. '0' - (default)
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public PollsGetVotersQueryWithFields offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of user IDs to return (if the 'friends_only' parameter is not set, maximum '1000', otherwise '10'). '100' - (default)
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public PollsGetVotersQueryWithFields count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Case for declension of user name and surname: , 'nom' - nominative (default) , 'gen' - genitive , 'dat' - dative , 'acc' - accusative , 'ins' - instrumental , 'abl' - prepositional
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("name_case")
    public PollsGetVotersQueryWithFields nameCase(NameCase value) {
        return unsafeParam("name_case", value);
    }

    /**
     * answerIds
     * Answer IDs.
     *
     * @param value value of "answer ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("answer_ids")
    public PollsGetVotersQueryWithFields answerIds(Long... value) {
        return unsafeParam("answer_ids", value);
    }

    /**
     * Answer IDs.
     *
     * @param value value of "answer ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("answer_ids")
    public PollsGetVotersQueryWithFields answerIds(List<Long> value) {
        return unsafeParam("answer_ids", value);
    }

    /**
     * fields
     * Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate (birthdate)', 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    protected PollsGetVotersQueryWithFields fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate (birthdate)', 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    protected PollsGetVotersQueryWithFields fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected PollsGetVotersQueryWithFields getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("poll_id", "answer_ids", "access_token");
    }
}
