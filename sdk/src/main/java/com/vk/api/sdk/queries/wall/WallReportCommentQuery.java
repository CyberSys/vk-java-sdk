// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.wall.ReportCommentReason;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.reportComment method
 */
public class WallReportCommentQuery extends AbstractQueryBuilder<WallReportCommentQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param commentId value of "comment id" parameter. Minimum is 0.
     * @param reason value of "reason" parameter. Minimum is 0.
     */
    public WallReportCommentQuery(VkApiClient client, UserActor actor, Long ownerId,
            Integer commentId, ReportCommentReason reason) {
        super(client, "wall.reportComment", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        commentId(commentId);
        reason(reason);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public WallReportCommentQuery(VkApiClient client, UserActor actor) {
        super(client, "wall.reportComment", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the wall.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public WallReportCommentQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Comment ID.
     *
     * @param value value of "comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("comment_id")
    public WallReportCommentQuery commentId(Integer value) {
        return unsafeParam("comment_id", value);
    }

    /**
     * Reason for the complaint: '0' - spam, '1' - child pornography, '2' - extremism, '3' - violence, '4' - drug propaganda, '5' - adult material, '6' - insult, abuse
     *
     * @param value value of "reason" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("reason")
    public WallReportCommentQuery reason(ReportCommentReason value) {
        return unsafeParam("reason", value);
    }

    @Override
    protected WallReportCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("reason", "owner_id", "comment_id", "access_token");
    }
}
