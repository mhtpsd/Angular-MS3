package com.assignment162.assignment162.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment162.assignment162.entity.Group;
import com.assignment162.assignment162.repository.GroupRepository;

@Service
public class GroupService {
    
    @Autowired
    private GroupRepository groupRepository;

    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }

    public Group getGroupById(Long id) {
        return groupRepository.findById(id).get();
    }
}
