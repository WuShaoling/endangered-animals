package cn.edu.sdust.wsl.dao;

import cn.edu.sdust.wsl.bean.Animal;

public interface AnimalMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Animal record);

    int insertSelective(Animal record);

    Animal selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Animal record);

    int updateByPrimaryKeyWithBLOBs(Animal record);

    int updateByPrimaryKey(Animal record);
}