// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.pages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;

import java.net.URI;
import java.util.Objects;

/**
 * WikipageFull object
 */
public class WikipageFull implements Validable {
    /**
     * Date when the page has been created in Unixtime
     */
    @SerializedName("created")
    @Required
    private Integer created;

    /**
     * Page creator ID
     * Entity: owner
     */
    @SerializedName("creator_id")
    private Long creatorId;

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
     * Entity: owner
     */
    @SerializedName("editor_id")
    private Long editorId;

    /**
     * Community ID
     * Entity: groups
     */
    @SerializedName("group_id")
    @Required
    private Long groupId;

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
     * Owner ID
     * Entity: owner
     */
    @SerializedName("owner_id")
    private Long ownerId;

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
     * URL
     */
    @SerializedName("url")
    private URI url;

    /**
     * URL of the page preview
     */
    @SerializedName("view_url")
    @Required
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
    @Required
    private PrivacySettings whoCanEdit;

    /**
     * View settings of the page
     */
    @SerializedName("who_can_view")
    @Required
    private PrivacySettings whoCanView;

    public Integer getCreated() {
        return created;
    }

    public WikipageFull setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public WikipageFull setCreatorId(Long creatorId) {
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

    public WikipageFull setEdited(Integer edited) {
        this.edited = edited;
        return this;
    }

    public Long getEditorId() {
        return editorId;
    }

    public WikipageFull setEditorId(Long editorId) {
        this.editorId = editorId;
        return this;
    }

    public Long getGroupId() {
        return groupId;
    }

    public WikipageFull setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getHtml() {
        return html;
    }

    public WikipageFull setHtml(String html) {
        this.html = html;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public WikipageFull setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public WikipageFull setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getParent() {
        return parent;
    }

    public WikipageFull setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getParent2() {
        return parent2;
    }

    public WikipageFull setParent2(String parent2) {
        this.parent2 = parent2;
        return this;
    }

    public String getSource() {
        return source;
    }

    public WikipageFull setSource(String source) {
        this.source = source;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public WikipageFull setTitle(String title) {
        this.title = title;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public WikipageFull setUrl(URI url) {
        this.url = url;
        return this;
    }

    public URI getViewUrl() {
        return viewUrl;
    }

    public WikipageFull setViewUrl(URI viewUrl) {
        this.viewUrl = viewUrl;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public WikipageFull setViews(Integer views) {
        this.views = views;
        return this;
    }

    public PrivacySettings getWhoCanEdit() {
        return whoCanEdit;
    }

    public WikipageFull setWhoCanEdit(PrivacySettings whoCanEdit) {
        this.whoCanEdit = whoCanEdit;
        return this;
    }

    public PrivacySettings getWhoCanView() {
        return whoCanView;
    }

    public WikipageFull setWhoCanView(PrivacySettings whoCanView) {
        this.whoCanView = whoCanView;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, editorId, edited, whoCanView, created, currentUserCanEditAccess, groupId, creatorId, source, ownerId, title, url, whoCanEdit, viewUrl, currentUserCanEdit, html, id, parent2, views);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WikipageFull wikipageFull = (WikipageFull) o;
        return Objects.equals(parent, wikipageFull.parent) &&
                Objects.equals(whoCanView, wikipageFull.whoCanView) &&
                Objects.equals(edited, wikipageFull.edited) &&
                Objects.equals(created, wikipageFull.created) &&
                Objects.equals(ownerId, wikipageFull.ownerId) &&
                Objects.equals(editorId, wikipageFull.editorId) &&
                Objects.equals(source, wikipageFull.source) &&
                Objects.equals(title, wikipageFull.title) &&
                Objects.equals(url, wikipageFull.url) &&
                Objects.equals(whoCanEdit, wikipageFull.whoCanEdit) &&
                Objects.equals(currentUserCanEdit, wikipageFull.currentUserCanEdit) &&
                Objects.equals(groupId, wikipageFull.groupId) &&
                Objects.equals(creatorId, wikipageFull.creatorId) &&
                Objects.equals(viewUrl, wikipageFull.viewUrl) &&
                Objects.equals(html, wikipageFull.html) &&
                Objects.equals(id, wikipageFull.id) &&
                Objects.equals(currentUserCanEditAccess, wikipageFull.currentUserCanEditAccess) &&
                Objects.equals(parent2, wikipageFull.parent2) &&
                Objects.equals(views, wikipageFull.views);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WikipageFull{");
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
        sb.append(", parent2='").append(parent2).append("'");
        sb.append(", views=").append(views);
        sb.append('}');
        return sb.toString();
    }
}
