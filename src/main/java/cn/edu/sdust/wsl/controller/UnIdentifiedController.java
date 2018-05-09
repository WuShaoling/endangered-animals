package cn.edu.sdust.wsl.controller;

import cn.edu.sdust.wsl.bean.Animal;
import cn.edu.sdust.wsl.bean.Location;
import cn.edu.sdust.wsl.bean.UnIdentified;
import cn.edu.sdust.wsl.service.AnimalService;
import cn.edu.sdust.wsl.service.LocationService;
import cn.edu.sdust.wsl.service.UnIdentifiedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/un")
public class UnIdentifiedController {

    @Autowired
    private UnIdentifiedService unIdentifiedService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private AnimalService animalService;

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String routeIndex(Model model) { //@RequestParam
        List<UnIdentified> res = unIdentifiedService.selectAll(0);
        model.addAttribute("data", res);
        return "/WEB-INF/view/index";
    }

    @RequestMapping(value = "getdetail", method = RequestMethod.GET)
    public String getDetail(Integer uid, Model model) {
        UnIdentified un = unIdentifiedService.selectByPrimaryKey(uid);
        model.addAttribute("animal", un);
        model.addAttribute("location", locationService.selectByKey(un.getLid()));
        return "/WEB-INF/view/detail";
    }

    @RequestMapping(value = "nextdetail", method = RequestMethod.GET)
    public String nextDetail(Integer index, Model model) {
        UnIdentified un = unIdentifiedService.selectNext(index);
        if (null == un) {
            un = unIdentifiedService.selectByPrimaryKey(index);
        }
        model.addAttribute("animal", un);
        model.addAttribute("location", locationService.selectByKey(un.getLid()));
        return "/WEB-INF/view/detail";
    }

    @RequestMapping(value = "predetail", method = RequestMethod.GET)
    public String preDetail(Integer index, Model model) {
        UnIdentified un = unIdentifiedService.selectPre(index);
        if (null == un) {
            un = unIdentifiedService.selectByPrimaryKey(index);
        }
        model.addAttribute("animal", un);
        model.addAttribute("location", locationService.selectByKey(un.getLid()));
        return "detail";
    }

    @RequestMapping(value = "identified", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> deleteOneRecord(Integer uid, Integer degree, String aname, Integer lid) {
        Map<String, Object> result = new HashMap<>();

        //先获取，再删除
        UnIdentified un = unIdentifiedService.selectByPrimaryKey(uid);
        result.put("code", unIdentifiedService.deleteByPrimaryKey(uid));

        locationService.updateByPrimaryKeySelective(new Location(lid, aname));

        //插入动物表中
        animalService.insert(new Animal(aname, degree, new Date(), un.getUimage()));

        return result;
    }

}
