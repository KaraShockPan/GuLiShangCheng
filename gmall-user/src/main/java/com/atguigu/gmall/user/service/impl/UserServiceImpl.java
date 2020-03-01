package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired

    UserMapper userMapper;


    @Autowired

    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;



    /**
     *
     * @return
     */
    @Override

    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAll();

        return umsMemberList;

    }


    /**
     *
     * @param memberId
     * @return
     */
    @Override

    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        Example e = new Example(UmsMemberReceiveAddress.class);

        e.createCriteria().andEqualTo("memberId",memberId);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(e);

//        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//
//        umsMemberReceiveAddress.setMemberId(memberId);
//
////        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);
//
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return umsMemberReceiveAddresses;

    }
}
