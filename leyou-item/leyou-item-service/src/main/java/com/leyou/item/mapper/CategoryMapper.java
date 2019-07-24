package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @auther Mr.Liao
 * @date 2019/5/5 17:28
 */
public interface CategoryMapper extends Mapper<Category>, SelectByIdListMapper<Category, Long> {

}
