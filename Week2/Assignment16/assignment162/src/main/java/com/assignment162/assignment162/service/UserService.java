package com.assignment162.assignment162.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment162.assignment162.entity.Group;
import com.assignment162.assignment162.entity.User;
import com.assignment162.assignment162.repository.GroupRepository;
import com.assignment162.assignment162.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GroupRepository groupRepository;

    public User joinGroup(Long UserId, Long GroupId) {
        Group grp = groupRepository.findById(GroupId).get();
        if(grp!=null){
            User user= userRepository.findById(UserId).get();
            user.getGroup().add(grp);
            userRepository.save(user);
            return user;
        }
        return null;
    }
    

    public User getUserByUserId(Long UserId) {
        return userRepository.findById(UserId).get();
    }

    
}
