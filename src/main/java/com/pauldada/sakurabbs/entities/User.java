package com.pauldada.sakurabbs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity     //将此POJO转数据实体!!
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)     //唯一的UID由数据库负责生成!!
    private long user_uid;          //用户UID
    private String user_name;       //用户名字
    private String user_email;      //用户邮箱
    private String user_twitter_id; //用户推特ID

    public User() {
    }

    public User(String user_name, String user_email, String user_twitter_id) {
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_twitter_id = user_twitter_id;
    }

    public long getUser_uid() {
        return user_uid;
    }

    public void setUser_uid(long user_uid) {
        this.user_uid = user_uid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_twitter_id() {
        return user_twitter_id;
    }

    public void setUser_twitter_id(String user_twitter_id) {
        this.user_twitter_id = user_twitter_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_uid=" + user_uid +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_twitter_id='" + user_twitter_id + '\'' +
                '}';
    }
}
