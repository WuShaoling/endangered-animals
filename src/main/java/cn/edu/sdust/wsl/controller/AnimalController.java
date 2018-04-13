package cn.edu.sdust.wsl.controller;

import cn.edu.sdust.wsl.bean.Animal;
import cn.edu.sdust.wsl.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    /**
     * 添加animal信息
     *
     * @param animal
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addAnimal(Animal animal) {
        Map<String, Object> result = new HashMap<String, Object>();

        result.put("code", animalService.insert(animal));

        return result;
    }

}
