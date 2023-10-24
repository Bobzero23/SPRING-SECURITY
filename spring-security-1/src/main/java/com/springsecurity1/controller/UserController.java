package com.springsecurity1.controller;

import com.springsecurity1.model.UserInfo;
import com.springsecurity1.service.UserInfoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserInfoService userInfoService;

    public UserController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @PostMapping("/add")
    private ResponseEntity<String> addUser(@Valid @RequestBody UserInfo userInfo) {
        userInfoService.addUser(userInfo);
        return new ResponseEntity<>("user added successfully1!", HttpStatus.OK);
    }
}
