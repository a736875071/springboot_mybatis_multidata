package com.change.controller;

import com.change.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YangQing
 * @version 1.0.0
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    private String getAll() {
        return userService.selectAll();
    }
    //事物测试
    @RequestMapping("/userTransaction")
    public String userTransaction() {
        userService.userTransaction();
        return "success";
    }
    @RequestMapping("/notuserTransaction")
    public String notUserTransaction() {
        userService.notUserTransaction();
        return "success";
    }
}
