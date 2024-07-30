package com.onetoone.onetoone.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passport {

    @Id
    private Long id;

    private String passportId;

    private String issuePlace;

    private Date issueDate;

    public Passport(Long id, String passportId, String issuePlace, Date issueDate) {
        this.id = id;
        this.passportId = passportId;
        this.issuePlace = issuePlace;
        this.issueDate = issueDate;
    }

    public Passport() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getIssuePlace() {
        return issuePlace;
    }

    public void setIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    
    
}
