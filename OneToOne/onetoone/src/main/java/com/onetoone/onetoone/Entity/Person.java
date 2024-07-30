package com.onetoone.onetoone.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

    @Id
    private Long id;

    private String name;

    private Date dateOfBirth;

    private String birthPlcae;

    @OneToOne
    @JoinColumn(name = "passport_id")
    private Passport passport;

    public Person(Long id, String name, Date dateOfBirth, String birthPlcae, Passport passport) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.birthPlcae = birthPlcae;
        this.passport = passport;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBirthPlcae() {
        return birthPlcae;
    }

    public void setBirthPlcae(String birthPlcae) {
        this.birthPlcae = birthPlcae;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    
    
}
