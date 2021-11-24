package com.pauldada.sakurabbs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity     //将此POJO转数据实体!!
public class Task {

    @Id     //对应字段与数据库中的主键列!!
    @GeneratedValue(strategy = GenerationType.AUTO)     //唯一的ID由数据库负责生成!!
    private long task_id;                  //任务ID
    private String task_name;              //任务名字
    private String task_stage;             //任务状态
    private String task_description;       //任务介绍

    public Task() {
    }

    public Task(String task_name, String task_stage, String task_description) {
        this.task_name = task_name;
        this.task_stage = task_stage;
        this.task_description = task_description;
    }

    public long getTask_id() {
        return task_id;
    }

    public void setTask_id(long task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_stage() {
        return task_stage;
    }

    public void setTask_stage(String task_stage) {
        this.task_stage = task_stage;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", task_name='" + task_name + '\'' +
                ", task_stage='" + task_stage + '\'' +
                ", task_description='" + task_description + '\'' +
                '}';
    }
}
