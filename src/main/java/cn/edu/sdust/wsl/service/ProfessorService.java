package cn.edu.sdust.wsl.service;

import cn.edu.sdust.wsl.bean.Professor;
import cn.edu.sdust.wsl.dao.ProfessorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService implements ProfessorMapper {

    @Autowired
    ProfessorMapper professorMapper;

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return 0;
    }

    @Override
    public int insert(Professor record) {
        return professorMapper.insert(record);
    }

    @Override
    public int insertSelective(Professor record) {
        return 0;
    }

    @Override
    public Professor selectByPrimaryKey(Integer pid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Professor record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Professor record) {
        return 0;
    }

    public String CheckProfessorInfo(Professor record) {
        if (record.getPphone().length() != 11) {
            return "手机号格式不正确";
        } else if (!record.getPemail().contains("@")) {
            return "邮箱格式不正确";
        } else if (record.getPanme().length() > 20) {
            return "用户名过长";
        } else if (record.getPcode().length() > 20) {
            return "密码过长";
        } else if (record.getPaccount().length() > 20) {
            return "账号过长";
        }
        return null;
    }
}
