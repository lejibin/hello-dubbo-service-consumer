package com.binhow.hello.dubbo.service.consumer.controller;

import com.binhow.entity.User;
import com.binhow.service.api.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @DubboReference(version = "${user.service.version}")
    private UserService userService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hi1(String name) {
        return "Hello" + name;
    }

    @ResponseBody
    @RequestMapping(value = "getUserById", method = RequestMethod.GET)
    public User getUserById(int userId) {
        return userService.getUserById(userId);
    }

    @ResponseBody
    @RequestMapping(value = "getUserByName", method = RequestMethod.GET)
    public User getUserByName(String userName) {
        return userService.getUserByName(userName);
    }
}
