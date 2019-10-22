package com.share.blog.dal.mysql.mapper;

import com.share.blog.dal.mysql.dataobject.OptionDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface OptionMapper extends Mapper<OptionDO>, InsertListMapper<OptionDO> {
}