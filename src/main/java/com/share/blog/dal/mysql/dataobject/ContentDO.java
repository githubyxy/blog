package com.share.blog.dal.mysql.dataobject;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "contents")
public class ContentDO implements Serializable {
    /**
     * 主键(自增ID)
     */
    @Id
    private Long id;

    private String title;

    private String slug;

    @Column(name = "thumb_img")
    private String thumbImg;

    private Integer created;

    private Integer modified;

    @Column(name = "author_id")
    private Integer authorId;

    private String type;

    private String status;

    @Column(name = "fmt_type")
    private String fmtType;

    private String tags;

    private String categories;

    private Integer hits;

    @Column(name = "comments_num")
    private Integer commentsNum;

    @Column(name = "allow_comment")
    private Integer allowComment;

    @Column(name = "allow_ping")
    private Integer allowPing;

    @Column(name = "allow_feed")
    private Integer allowFeed;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modify")
    private Date gmtModify;

    private String content;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键(自增ID)
     *
     * @return id - 主键(自增ID)
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键(自增ID)
     *
     * @param id 主键(自增ID)
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * @param slug
     */
    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    /**
     * @return thumb_img
     */
    public String getThumbImg() {
        return thumbImg;
    }

    /**
     * @param thumbImg
     */
    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg == null ? null : thumbImg.trim();
    }

    /**
     * @return created
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * @return modified
     */
    public Integer getModified() {
        return modified;
    }

    /**
     * @param modified
     */
    public void setModified(Integer modified) {
        this.modified = modified;
    }

    /**
     * @return author_id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * @param authorId
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return fmt_type
     */
    public String getFmtType() {
        return fmtType;
    }

    /**
     * @param fmtType
     */
    public void setFmtType(String fmtType) {
        this.fmtType = fmtType == null ? null : fmtType.trim();
    }

    /**
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * @return categories
     */
    public String getCategories() {
        return categories;
    }

    /**
     * @param categories
     */
    public void setCategories(String categories) {
        this.categories = categories == null ? null : categories.trim();
    }

    /**
     * @return hits
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * @param hits
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     * @return comments_num
     */
    public Integer getCommentsNum() {
        return commentsNum;
    }

    /**
     * @param commentsNum
     */
    public void setCommentsNum(Integer commentsNum) {
        this.commentsNum = commentsNum;
    }

    /**
     * @return allow_comment
     */
    public Integer getAllowComment() {
        return allowComment;
    }

    /**
     * @param allowComment
     */
    public void setAllowComment(Integer allowComment) {
        this.allowComment = allowComment;
    }

    /**
     * @return allow_ping
     */
    public Integer getAllowPing() {
        return allowPing;
    }

    /**
     * @param allowPing
     */
    public void setAllowPing(Integer allowPing) {
        this.allowPing = allowPing;
    }

    /**
     * @return allow_feed
     */
    public Integer getAllowFeed() {
        return allowFeed;
    }

    /**
     * @param allowFeed
     */
    public void setAllowFeed(Integer allowFeed) {
        this.allowFeed = allowFeed;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modify - 修改时间
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModify 修改时间
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}