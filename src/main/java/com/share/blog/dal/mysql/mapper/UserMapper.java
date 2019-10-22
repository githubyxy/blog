package com.share.blog.dal.mysql.mapper;

import com.share.blog.dal.mysql.dataobject.UserDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface UserMapper extends Mapper<UserDO>, InsertListMapper<UserDO> {
}