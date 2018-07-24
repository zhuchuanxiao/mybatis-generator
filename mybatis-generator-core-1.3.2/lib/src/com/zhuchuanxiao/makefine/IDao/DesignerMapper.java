package com.zhuchuanxiao.makefine.IDao;

import com.zhuchuanxiao.makefine.domain.Designer;

public interface DesignerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Designer record);

    int insertSelective(Designer record);

    Designer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Designer record);

    int updateByPrimaryKey(Designer record);
}