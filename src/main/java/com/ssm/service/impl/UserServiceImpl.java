package com.ssm.service.impl;

import com.ssm.dao.UserMapper;
import com.ssm.entity.User;
import com.ssm.entity.UserExample;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public int findAll(User user, HttpSession session) {
        int flag = 0;
        UserExample userExample = new UserExample();
        List<User> users = userMapper.selectByExample(userExample);
        if (users == null) {
            System.out.println("user not found.");
        }
        for(User u:users){
            if(u.getUsername()!=null&&u.getPassword()!=null&&user.getUsername()!=null&&user.getPassword()!=null){
                if(u.getUsername().equals(user.getUsername())&&u.getPassword().equals(user.getPassword())){
                    if(u.getRole() == 1){
                        session.setAttribute("user",u);
                        return flag = 1;
                    }else if (u.getRole() == 3 || u.getRole() == 2){
                        u.setRole(2);
                        int i = userMapper.updateByPrimaryKeySelective(u);
                        session.setAttribute("user",u);
                        return flag = 2;
                    }else if (u.getRole() == 5 || u.getRole() == 4){
                        u.setRole(4);
                        int i = userMapper.updateByPrimaryKeySelective(u);
                        session.setAttribute("user",u);
                        return flag = 2;
                    }else if(u.getRole() == 6|| u.getRole() == 7 ){
                        u.setRole(6);
                        int i = userMapper.updateByPrimaryKeySelective(u);
                        session.setAttribute("user",u);
                        return flag = 3;
                    } else{
                        return flag = 2;
                    }
                }
            }
        }
        return flag;
    }

    @Override
    public List<User> findAllByName(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria or = userExample.or();
        or.andUsernameEqualTo(user.getUsername());
        return userMapper.selectByExample(userExample);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public List<User> findAdmin() {
        UserExample userExample = new UserExample();
        UserExample.Criteria or = userExample.or();
        or.andRoleEqualTo(1);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public User findUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateUserById(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> findUserByRole() {
        UserExample userExample = new UserExample();
        UserExample.Criteria or = userExample.or();
        or.andRoleEqualTo(2);

        UserExample userExample1 = new UserExample();
        UserExample.Criteria or1 = userExample1.or();
        or1.andRoleEqualTo(3);
        userExample.or(or1);

        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> findUserByRole1() {
        UserExample userExample = new UserExample();
        UserExample.Criteria or = userExample.or();
        or.andRoleEqualTo(4);

        UserExample userExample1 = new UserExample();
        UserExample.Criteria or1 = userExample1.or();
        or1.andRoleEqualTo(5);
        userExample.or(or1);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> findUserByRole2() {
        UserExample userExample = new UserExample();
        UserExample.Criteria or = userExample.or();
        or.andRoleEqualTo(6);
        UserExample.Criteria or2 = userExample.or();
        or2.andRoleEqualTo(7);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> findUserByRole3() {
        return userMapper.findUserByRole3();
    }

    @Override
    public int delUserById(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public long count(UserExample example) {
        return userMapper.countByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }



}
