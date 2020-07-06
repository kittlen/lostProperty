package com.team.lostProperty.mapper;

import com.team.lostProperty.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //注解接口为bean
public interface UserDao {
    List<User> getUser();
    int insert(User user);
}
