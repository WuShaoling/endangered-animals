package cn.edu.sdust.wsl.dao;

import cn.edu.sdust.wsl.bean.UnIdentified;

import java.util.List;

public interface UnIdentifiedMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UnIdentified record);

    int insertSelective(UnIdentified record);

    UnIdentified selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UnIdentified record);

    int updateByPrimaryKeyWithBLOBs(UnIdentified record);

    int updateByPrimaryKey(UnIdentified record);
	
    List<UnIdentified> selectAll(Integer index);

    UnIdentified selectNext(Integer index);

    UnIdentified selectPre(Integer index);
}