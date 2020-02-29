package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")

    @ResponseBody

    public String index(){

        return "Hello, this is gmall-user/UserController 's index method!!!";

    }

}
