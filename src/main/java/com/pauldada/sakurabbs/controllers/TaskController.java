package com.pauldada.sakurabbs.controllers;

import com.pauldada.sakurabbs.entities.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     //由Spring管理的控制层组件
@RequestMapping("tasks")        //指定该控制层的整体路径
public class TaskController {

    @GetMapping("/new")     //响应访问管理任务页面的GET请求
    public String DisplayTaskForm(Model model){
        Task aTask=new Task();
        model.addAttribute("task",aTask);       //第一个参数为在HTML模板中对象的名称，第二个参数为在控制层中要传的数据
        return "new-task";
    }
}
