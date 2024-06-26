// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.photos.GetCommentsSort;
import com.vk.api.sdk.objects.photos.responses.GetCommentsExtendedResponse;
import com.vk.api.sdk.objects.users.Fields;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getComments method
 */
public class PhotosGetCommentsQueryWithExtended extends AbstractQueryBuilder<PhotosGetCommentsQueryWithExtended, GetCommentsExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param photoId value of "photo id" parameter.
     */
    public PhotosGetCommentsQueryWithExtended(VkApiClient client, UserActor actor,
            Integer photoId) {
        super(client, "photos.getComments", GetCommentsExtendedResponse.class);
        accessToken(actor.getAccessToken());
        photoId(photoId);
        extended(true);
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public PhotosGetCommentsQueryWithExtended ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo ID.
     *
     * @param value value of "photo id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photo_id")
    public PhotosGetCommentsQueryWithExtended photoId(Integer value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * '1' - to return an additional 'likes' field, '0' - (default)
     *
     * @param value value of "need likes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("need_likes")
    public PhotosGetCommentsQueryWithExtended needLikes(Boolean value) {
        return unsafeParam("need_likes", value);
    }

    /**
     * Set start comment id
     *
     * @param value value of "start comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("start_comment_id")
    public PhotosGetCommentsQueryWithExtended startCommentId(Integer value) {
        return unsafeParam("start_comment_id", value);
    }

    /**
     * Offset needed to return a specific subset of comments. By default, '0'.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public PhotosGetCommentsQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of comments to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public PhotosGetCommentsQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Sort order: 'asc' - old first, 'desc' - new first
     *
     * @param value value of "sort" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("sort")
    public PhotosGetCommentsQueryWithExtended sort(GetCommentsSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Set access key
     *
     * @param value value of "access key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("access_key")
    public PhotosGetCommentsQueryWithExtended accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    protected PhotosGetCommentsQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public PhotosGetCommentsQueryWithExtended fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public PhotosGetCommentsQueryWithExtended fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected PhotosGetCommentsQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo_id", "access_token");
    }
}
