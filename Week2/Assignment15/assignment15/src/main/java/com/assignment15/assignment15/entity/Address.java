package com.assignment15.assignment15.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToOne;

@Entity
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;

    private String street, city, state, zipCode;

    // @OneToOne(mappedBy = "address")
    // private Employee employee;

    public Address() {
    }

    public Address(Long addressId, String street, String city, String state, String zipCode) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        // this.employee = employee;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // public Employee getEmployee() {
    //     return employee;
    // }

    // public void setEmployee(Employee employee) {
    //     this.employee = employee;
    // }

    
}
