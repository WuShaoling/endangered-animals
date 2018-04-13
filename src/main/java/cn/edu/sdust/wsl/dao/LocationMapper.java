package cn.edu.sdust.wsl.dao;

import cn.edu.sdust.wsl.bean.Location;

public interface LocationMapper {
    int insert(Location record);

    int insertSelective(Location record);

    Location selectByKey(Integer id);

    int updateByPrimaryKeySelective(Location record);
}