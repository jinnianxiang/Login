package com.ssm.controller;

import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by beiwei on 2017/5/18.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/Login")
    public String login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String name, String password) {

        /**
         * 判断用户名和密码
         */
        if (name == null || password ==null || name =="" || password == "") {
            return "error";
        } else {
            return "Login";
        }
    }
}
