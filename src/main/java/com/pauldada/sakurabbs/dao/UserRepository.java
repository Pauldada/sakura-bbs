package com.pauldada.sakurabbs.dao;

import com.pauldada.sakurabbs.entities.User;
import org.springframework.data.repository.CrudRepository;

//指明 数据实体的类名 和 数据实体中的ID字段的类型 !!
public interface UserRepository extends CrudRepository<User,Long> {
}
