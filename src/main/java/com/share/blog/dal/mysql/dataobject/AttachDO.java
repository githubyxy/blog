package com.share.blog.dal.mysql.dataobject;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "attach")
public class AttachDO implements Serializable {
    /**
     * 主键(自增ID)
     */
    @Id
    private Long id;

    private String fname;

    private String ftype;

    private String fkey;

    @Column(name = "author_id")
    private Integer authorId;

    private Integer created;

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
     * @return fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname
     */
    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    /**
     * @return ftype
     */
    public String getFtype() {
        return ftype;
    }

    /**
     * @param ftype
     */
    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    /**
     * @return fkey
     */
    public String getFkey() {
        return fkey;
    }

    /**
     * @param fkey
     */
    public void setFkey(String fkey) {
        this.fkey = fkey == null ? null : fkey.trim();
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
}