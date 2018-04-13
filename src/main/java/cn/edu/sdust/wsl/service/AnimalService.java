package cn.edu.sdust.wsl.service;

import cn.edu.sdust.wsl.bean.Animal;
import cn.edu.sdust.wsl.dao.AnimalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService implements AnimalMapper {

    @Autowired
    AnimalMapper animalMapper;

    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return 0;
    }

    @Override
    public int insert(Animal record) {
        return animalMapper.insert(record);
    }

    @Override
    public int insertSelective(Animal record) {
        return 0;
    }

    @Override
    public Animal selectByPrimaryKey(Integer aid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Animal record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Animal record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Animal record) {
        return 0;
    }
}
