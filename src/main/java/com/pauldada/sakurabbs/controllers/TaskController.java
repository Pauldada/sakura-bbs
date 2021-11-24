package com.pauldada.sakurabbs.controllers;

import com.pauldada.sakurabbs.dao.TaskRepository;
import com.pauldada.sakurabbs.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     //由Spring管理的控制层组件
@RequestMapping("tasks")        //指定该控制层的整体路径
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/new")     //响应访问管理任务页面的GET请求的新建任务
    public String DisplayTaskForm(Model model){
        Task aTask=new Task();
        model.addAttribute("task",aTask);       //第一个参数为在HTML模板中对象的名称，第二个参数为在控制层中要传的数据
        return "tasks/new-task";
    }

    @PostMapping("/save")   //响应网站的POST请求后的保存任务，即处理保存到数据库的行为
    public String CreateTask(Model model,Task task){
        taskRepository.save(task);          //引用接入层的save方法保存实体到数据库!!
        return "redirect:/tasks/new";       //保存后回新建页面
    }
}
