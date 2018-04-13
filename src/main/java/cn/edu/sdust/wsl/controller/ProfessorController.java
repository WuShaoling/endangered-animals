package cn.edu.sdust.wsl.controller;

import cn.edu.sdust.wsl.bean.Professor;
import cn.edu.sdust.wsl.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    /**
     * 注册
     *
     * @param professor
     * @return
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> registerProfessor(Professor professor) {
        Map<String, Object> result = new HashMap<String, Object>();

        String check = professorService.CheckProfessorInfo(professor);
        if (null != check) {
            result.put("code", -1);
            result.put("content", check);
            return result;
        }

        result.put("code", professorService.insert(professor));
        return result;
    }

}
