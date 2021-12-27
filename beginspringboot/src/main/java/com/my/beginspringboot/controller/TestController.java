package com.my.beginspringboot.controller;

import com.my.beginspringboot.dao.UserDao;
import com.my.beginspringboot.entity.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TestController {

    @Resource
    UserDao userDao;

    @GetMapping("/thymeleaf")
    public String sayHello(HttpServletRequest request, @RequestParam(value = "description", required = false,
            defaultValue = "springboot-thymeleaf") String description) {
        request.setAttribute("description", description);
        return "thymeleaf";
    }

    @GetMapping("/attributes")
    public String attributes(ModelMap map) {
        //更改html内容
        map.put("title", "thymeleaf标签演示");
        //更改id,name,value
        map.put("th_id", "thymeleaf-input");
        map.put("th_name", "thymeleaf-input");
        map.put("th_value", "13");
        //更改class、href
        map.put("th_class", "thymeleaf-class");
        map.put("th_href", "http://13blog.site");
        return "attributes";
    }

    /**
     * 查询所有记录
     */
    @ResponseBody
    @GetMapping("/queryAll")
    public List<User> queryAll() {
        return userDao.findAllUsers();
    }

    /**
     * 新增一位用户
     */
    @ResponseBody
    @GetMapping("/insert")
    public String isnert(String username, String password, Integer age, String email, String job, Integer sal, Integer bonus, Integer year) {
        //先判断用户是否已经存在
        if (userDao.queryUserByUsername(username).size()>0) {
            return "用户已存在了";
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        user.setEmail(email);
        user.setSal(sal);
        user.setBonus(bonus);
        user.setJob(job);
        user.setYear(year);
        userDao.insertUser(user);
        return  "新增用户成功！";
    }

    /**
     * 修改用户信息
     */
    @ResponseBody
    @GetMapping("/update")
    public String update(Integer id, String username, String password, Integer age, String email, String job, Integer sal, Integer bonus, Integer year) {
        //先判断用户是否存在
        if (userDao.queryUserById(id).size()<0) {
            return "该用户不存在";
        }
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        user.setEmail(email);
        user.setSal(sal);
        user.setBonus(bonus);
        user.setJob(job);
        user.setYear(year);
        userDao.updateUser(user);

        return  "信息修改成功";
    }

    /**
     * 删除用户
     */
    @ResponseBody
    @GetMapping("/delete")
    public Boolean delete(Integer id) {
        //先判断用户是否存在,有则进行删除
        if (userDao.queryUserById(id) ==null) {
            return false;
        }

        return userDao.deleteUser(id) > 0;
    }
}
