package com.share.blog.dal.mysql.mapper;

import com.share.blog.dal.mysql.dataobject.CommentDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface CommentMapper extends Mapper<CommentDO>, InsertListMapper<CommentDO> {
}