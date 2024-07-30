package com.assignment162.assignment162.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment162.assignment162.entity.User;
import com.assignment162.assignment162.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/users/{userId}/groups/{groupId}")
    public User joinGroup(@PathVariable Long UserId,@PathVariable Long GroupId) {
        return userService.joinGroup(UserId, GroupId);
    }

    @GetMapping("/users/{userId}")
    public User getUserByUserId(Long userId) {
        return userService.getUserByUserId(userId);
    }
}
