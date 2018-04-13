package cn.edu.sdust.wsl.service;

import cn.edu.sdust.wsl.bean.Location;
import cn.edu.sdust.wsl.dao.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService implements LocationMapper {

    @Autowired
    LocationMapper locationMapper;

    @Override
    public int insert(Location record) {
        return locationMapper.insert(record);
    }

    @Override
    public int insertSelective(Location record) {
        return 0;
    }

    @Override
    public Location selectByKey(Integer id) {
        return locationMapper.selectByKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Location record) {
        return locationMapper.updateByPrimaryKeySelective(record);
    }
}
