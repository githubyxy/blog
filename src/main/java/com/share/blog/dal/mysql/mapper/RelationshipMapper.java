package com.share.blog.dal.mysql.mapper;

import com.share.blog.dal.mysql.dataobject.RelationshipDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface RelationshipMapper extends Mapper<RelationshipDO>, InsertListMapper<RelationshipDO> {
}