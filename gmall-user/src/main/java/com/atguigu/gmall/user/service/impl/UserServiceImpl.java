package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired

    UserMapper userMapper;


    /**
     *
     * @return
     */
    @Override

    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAll();

        return umsMemberList;

    }
}
