package com.share.blog.dal.mysql.mapper;

import com.share.blog.dal.mysql.dataobject.AttachDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface AttachMapper extends Mapper<AttachDO>, InsertListMapper<AttachDO> {
}