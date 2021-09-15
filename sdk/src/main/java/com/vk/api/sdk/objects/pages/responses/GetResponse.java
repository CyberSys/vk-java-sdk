package com.vk.api.sdk.objects.pages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.pages.PrivacySettings;
import java.net.URI;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    /**
     * Date when the page has been created in Unixtime
     */
    @SerializedName("created")
    @Required
    private Integer created;

    /**
     * Page creator ID
     */
    @SerializedName("creator_id")
    private Integer creatorId;

    /**
     * Information whether current user can edit the page
     */
    @SerializedName("current_user_can_edit")
    private BoolInt currentUserCanEdit;

    /**
     * Information whether current user can edit the page access settings
     */
    @SerializedName("current_user_can_edit_access")
    private BoolInt currentUserCanEditAccess;

    /**
     * Date when the page has been edited in Unixtime
     */
    @SerializedName("edited")
    @Required
    private Integer edited;

    /**
     * Last editor ID
     */
    @SerializedName("editor_id")
    private Integer editorId;

    /**
     * Community ID
     */
    @SerializedName("group_id")
    private Integer groupId;

    /**
     * Page content, HTML
     */
    @SerializedName("html")
    private String html;

    /**
     * Page ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Page content, wiki
     */
    @SerializedName("source")
    private String source;

    /**
     * Page title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * URL of the page preview
     */
    @SerializedName("view_url")
    private URI viewUrl;

    /**
     * Views number
     */
    @SerializedName("views")
    @Required
    private Integer views;

    /**
     * Edit settings of the page
     */
    @SerializedName("who_can_edit")
    private PrivacySettings whoCanEdit;

    /**
     * View settings of the page
     */
    @SerializedName("who_can_view")
    private PrivacySettings whoCanView;

    /**
     * URL
     */
    @SerializedName("url")
    private URI url;

    /**
     * Parent
     */
    @SerializedName("parent")
    private String parent;

    /**
     * Parent2
     */
    @SerializedName("parent2")
    private String parent2;

    /**
     * Owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    public Integer getCreated() {
        return created;
    }

    public GetResponse setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public GetResponse setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public boolean isCurrentUserCanEdit() {
        return currentUserCanEdit == BoolInt.YES;
    }

    public BoolInt getCurrentUserCanEdit() {
        return currentUserCanEdit;
    }

    public boolean isCurrentUserCanEditAccess() {
        return currentUserCanEditAccess == BoolInt.YES;
    }

    public BoolInt getCurrentUserCanEditAccess() {
        return currentUserCanEditAccess;
    }

    public Integer getEdited() {
        return edited;
    }

    public GetResponse setEdited(Integer edited) {
        this.edited = edited;
        return this;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public GetResponse setEditorId(Integer editorId) {
        this.editorId = editorId;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public GetResponse setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getHtml() {
        return html;
    }

    public GetResponse setHtml(String html) {
        this.html = html;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getSource() {
        return source;
    }

    public GetResponse setSource(String source) {
        this.source = source;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public URI getViewUrl() {
        return viewUrl;
    }

    public GetResponse setViewUrl(URI viewUrl) {
        this.viewUrl = viewUrl;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public GetResponse setViews(Integer views) {
        this.views = views;
        return this;
    }

    public PrivacySettings getWhoCanEdit() {
        return whoCanEdit;
    }

    public GetResponse setWhoCanEdit(PrivacySettings whoCanEdit) {
        this.whoCanEdit = whoCanEdit;
        return this;
    }

    public PrivacySettings getWhoCanView() {
        return whoCanView;
    }

    public GetResponse setWhoCanView(PrivacySettings whoCanView) {
        this.whoCanView = whoCanView;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public GetResponse setUrl(URI url) {
        this.url = url;
        return this;
    }

    public String getParent() {
        return parent;
    }

    public GetResponse setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getParent2() {
        return parent2;
    }

    public GetResponse setParent2(String parent2) {
        this.parent2 = parent2;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public GetResponse setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, editorId, edited, whoCanView, created, currentUserCanEditAccess, groupId, creatorId, source, ownerId, title, url, whoCanEdit, viewUrl, currentUserCanEdit, html, id, views, parent2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(parent, getResponse.parent) &&
                Objects.equals(whoCanView, getResponse.whoCanView) &&
                Objects.equals(edited, getResponse.edited) &&
                Objects.equals(created, getResponse.created) &&
                Objects.equals(ownerId, getResponse.ownerId) &&
                Objects.equals(editorId, getResponse.editorId) &&
                Objects.equals(source, getResponse.source) &&
                Objects.equals(title, getResponse.title) &&
                Objects.equals(url, getResponse.url) &&
                Objects.equals(whoCanEdit, getResponse.whoCanEdit) &&
                Objects.equals(currentUserCanEdit, getResponse.currentUserCanEdit) &&
                Objects.equals(groupId, getResponse.groupId) &&
                Objects.equals(creatorId, getResponse.creatorId) &&
                Objects.equals(viewUrl, getResponse.viewUrl) &&
                Objects.equals(html, getResponse.html) &&
                Objects.equals(id, getResponse.id) &&
                Objects.equals(currentUserCanEditAccess, getResponse.currentUserCanEditAccess) &&
                Objects.equals(views, getResponse.views) &&
                Objects.equals(parent2, getResponse.parent2);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("parent='").append(parent).append("'");
        sb.append(", whoCanView=").append(whoCanView);
        sb.append(", edited=").append(edited);
        sb.append(", created=").append(created);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", editorId=").append(editorId);
        sb.append(", source='").append(source).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", url=").append(url);
        sb.append(", whoCanEdit=").append(whoCanEdit);
        sb.append(", currentUserCanEdit=").append(currentUserCanEdit);
        sb.append(", groupId=").append(groupId);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", viewUrl=").append(viewUrl);
        sb.append(", html='").append(html).append("'");
        sb.append(", id=").append(id);
        sb.append(", currentUserCanEditAccess=").append(currentUserCanEditAccess);
        sb.append(", views=").append(views);
        sb.append(", parent2='").append(parent2).append("'");
        sb.append('}');
        return sb.toString();
    }
}