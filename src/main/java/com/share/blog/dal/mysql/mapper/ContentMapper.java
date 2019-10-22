package com.share.blog.dal.mysql.mapper;

import com.share.blog.dal.mysql.dataobject.ContentDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface ContentMapper extends Mapper<ContentDO>, InsertListMapper<ContentDO> {
}