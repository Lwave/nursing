package com.ssm.service;

import com.ssm.entity.User;
import com.ssm.entity.UserExample;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public interface UserService {

    int findAll(User user, HttpSession session);

    //List<User> findAllUser(UserExample example);

    List<User> findAllByName(User user);

    int insertUser(User user);

    List<User> findAdmin();

    User findUserById(int id);

    int updateUserById(User user);

    List<User> findUserByRole();

    List<User> findUserByRole1();

    List<User> findUserByRole2();

    List<User> findUserByRole3();

    int delUserById(int id);

    long count(UserExample example);

    User selectByPrimaryKey(Integer id);




}
