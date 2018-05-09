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
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    /**
     * 注册界面路由
     *
     * @return
     */
    @RequestMapping(value = "/toregister", method = {RequestMethod.GET})
    public String toRegister() {
        return "register";
    }

    /**
     * 注册
     *
     * @param account
     * @param username
     * @param password
     * @param phone
     * @param email
     * @return
     */
    @RequestMapping(value = "/professor/register", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> registerProfessor(String account,
                                                 String username,
                                                 String password,
                                                 String phone,
                                                 String email) {
        Map<String, Object> result = new HashMap<String, Object>();

        Professor professor = new Professor(account, username, password, phone, email);

        String check = professorService.CheckProfessorInfo(professor);
        if (null != check) {
            result.put("code", -1);
            result.put("content", check);
            return result;
        }

        System.out.println("this");

        Professor already = professorService.selectByAccount(account);
        System.out.println(already == null);

        if (already != null) {
            result.put("code", -1);
            result.put("content", "账号已存在");
            return result;
        }else{

        }

        result.put("code", professorService.insert(professor));
        return result;
    }

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/professor/login", method = RequestMethod.POST)
    @ResponseBody
    public String loginProfessor(String username, String password) {
        Professor p = professorService.selectByAccount(username);
        if (p == null) {
            return "用户不存在";
        } else if (!p.getPcode().equals(password)) {
            return "用户名或密码错误";
        } else {
            return "1";
        }
    }

}
