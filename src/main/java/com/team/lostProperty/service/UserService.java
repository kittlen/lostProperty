package com.team.lostProperty.service;

import com.team.lostProperty.base.MyBatisDao;
import com.team.lostProperty.mapper.UserDao;
import com.team.lostProperty.entities.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service //注解Service为bean
public class UserService {

    @Resource //依赖注入
    private UserDao userDao;

    public List<User> getUser(){
//        SqlSession sqlSession = MyBatisDao.getSession();
//        userDao=sqlSession.getMapper(UserDao.class);
        List<User> list=userDao.getUser();
        return list;
    }
}
