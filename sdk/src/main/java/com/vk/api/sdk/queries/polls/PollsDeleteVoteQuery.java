// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.BoolResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.deleteVote method
 */
public class PollsDeleteVoteQuery extends AbstractQueryBuilder<PollsDeleteVoteQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pollId value of "poll id" parameter. Minimum is 0.
     */
    public PollsDeleteVoteQuery(VkApiClient client, UserActor actor, Integer pollId) {
        super(client, "polls.deleteVote", BoolResponse.class);
        accessToken(actor.getAccessToken());
        pollId(pollId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PollsDeleteVoteQuery(VkApiClient client, UserActor actor) {
        super(client, "polls.deleteVote", BoolResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the poll. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public PollsDeleteVoteQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Poll ID.
     *
     * @param value value of "poll id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("poll_id")
    public PollsDeleteVoteQuery pollId(Integer value) {
        return unsafeParam("poll_id", value);
    }

    /**
     * Set is board
     *
     * @param value value of "is board" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("is_board")
    public PollsDeleteVoteQuery isBoard(Boolean value) {
        return unsafeParam("is_board", value);
    }

    @Override
    protected PollsDeleteVoteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("poll_id", "access_token");
    }
}
