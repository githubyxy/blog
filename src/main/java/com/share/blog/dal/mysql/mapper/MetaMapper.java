package com.share.blog.dal.mysql.mapper;

import com.share.blog.dal.mysql.dataobject.MetaDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface MetaMapper extends Mapper<MetaDO>, InsertListMapper<MetaDO> {
}