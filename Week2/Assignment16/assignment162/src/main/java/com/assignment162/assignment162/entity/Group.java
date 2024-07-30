package com.assignment162.assignment162.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Group {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  groupId;
    
    private String groupName, description;

    @ManyToMany
    private List<User> user;

    public Group() {
    }

    public Group(Long groupId, String groupName, String description, List<User> user) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.description = description;
        this.user = user;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    
}
