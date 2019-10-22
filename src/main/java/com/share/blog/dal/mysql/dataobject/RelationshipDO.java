package com.share.blog.dal.mysql.dataobject;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "relationships")
public class RelationshipDO implements Serializable {
    private Long id;

    private Long mid;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return mid
     */
    public Long getMid() {
        return mid;
    }

    /**
     * @param mid
     */
    public void setMid(Long mid) {
        this.mid = mid;
    }
}