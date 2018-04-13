package cn.edu.sdust.wsl.service;

import cn.edu.sdust.wsl.bean.UnIdentified;
import cn.edu.sdust.wsl.dao.UnIdentifiedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnIdentifiedService implements UnIdentifiedMapper {

    @Autowired
    UnIdentifiedMapper unIdentifiedMapper;

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return unIdentifiedMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(UnIdentified record) {
        return 0;
    }

    @Override
    public int insertSelective(UnIdentified record) {
        return 0;
    }

    @Override
    public UnIdentified selectByPrimaryKey(Integer uid) {
        return unIdentifiedMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(UnIdentified record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(UnIdentified record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UnIdentified record) {
        return 0;
    }

    @Override
    public List<UnIdentified> selectAll(Integer index) {
        return unIdentifiedMapper.selectAll(index);
    }

    @Override
    public UnIdentified selectNext(Integer index) {
        return unIdentifiedMapper.selectNext(index);
    }

    @Override
    public UnIdentified selectPre(Integer index) {
        return unIdentifiedMapper.selectPre(index);
    }
}
