package com.pauldada.sakurabbs.controllers;

import com.pauldada.sakurabbs.dao.UserRepository;
import com.pauldada.sakurabbs.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller     //由Spring管理的控制层组件
@RequestMapping("users")        //指定该控制层的整体路径
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String DisplayUsers(Model model){
        List<User> users = userRepository.findAll();
        model.addAttribute("users",users);
        return "users/list-users";
    }

    @GetMapping("/new")     //响应访问管理用户页面的GET请求的新建任务
    public String DisplayUserForm(Model model){
        User aUser=new User();
        model.addAttribute("user",aUser);       //第一个参数为在HTML模板中对象的名称，第二个参数为在控制层中要传的数据
        return "users/new-user";
    }

    @PostMapping("/save")   //响应网站的POST请求后的保存用户，即处理保存到数据库的行为
    public String CreateUser(Model model,User user){
        userRepository.save(user);          //引用接入层的save方法保存实体到数据库!!
        return "redirect:/users/new";       //保存后回新建页面
    }
}
