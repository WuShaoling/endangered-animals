package cn.edu.sdust.wsl.dao;

import cn.edu.sdust.wsl.bean.Professor;

public interface ProfessorMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Professor record);

    int insertSelective(Professor record);

    Professor selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Professor record);

    int updateByPrimaryKey(Professor record);
}