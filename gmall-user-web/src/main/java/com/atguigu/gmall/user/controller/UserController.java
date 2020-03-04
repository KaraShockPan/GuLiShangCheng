package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;


    /**
     *
     * @return
     */
    @RequestMapping("index")

    @ResponseBody

    public String index(){

        return "Hello, this is gmall-user/UserController 's index method!!!";

    }


    /**
     *
     * @return
     */
    @RequestMapping("getAllUser")

    @ResponseBody

    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;

    }


    /**
     *
     * @return
     */
    @RequestMapping("getReceiveAddressByMemberId")

    @ResponseBody

    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);

        return umsMemberReceiveAddresses;

    }


}
