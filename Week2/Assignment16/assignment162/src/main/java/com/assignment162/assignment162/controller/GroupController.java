package com.assignment162.assignment162.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment162.assignment162.entity.Group;
import com.assignment162.assignment162.service.GroupService;

@RestController
public class GroupController {
    
    @Autowired
    private GroupService groupService;

    @PostMapping("/groups")
    public Group createGroup(@RequestBody Group group) {
        return groupService.createGroup(group);
    }

    @GetMapping("/groups/{groupId}")
    public Group getGroupById(@PathVariable Long groupId) {
        return groupService.getGroupById(groupId);
    }
    
}
