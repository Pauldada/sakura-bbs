package com.pauldada.sakurabbs.controllers;

import com.pauldada.sakurabbs.dao.TaskRepository;
import com.pauldada.sakurabbs.dao.UserRepository;
import com.pauldada.sakurabbs.entities.Task;
import com.pauldada.sakurabbs.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String DisplayIndex(Model model){
        List<Task> tasks = taskRepository.findAll();
        List<User> users = userRepository.findAll();
        model.addAttribute("tasks",tasks);
        model.addAttribute("users",users);
        return "main/index";
    }
}
