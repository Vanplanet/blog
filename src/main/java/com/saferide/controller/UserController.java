package com.saferide.controller;


import com.saferide.common.lang.Result;
import com.saferide.entity.User;
import com.saferide.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {

        return Result.succ(user

        );
    }

}
