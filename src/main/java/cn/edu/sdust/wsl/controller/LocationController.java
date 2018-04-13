package cn.edu.sdust.wsl.controller;

import cn.edu.sdust.wsl.bean.Location;
import cn.edu.sdust.wsl.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    /**
     * 添加位置信息
     *
     * @param location
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addLocation(Location location) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", locationService.insert(location));
        return result;
    }

}
