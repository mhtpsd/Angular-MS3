package com.assignment131.assignment131.Entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(nullable = false)
    private Date orderDate;

    @Column(nullable = false)
    private double totalAmount;

    @Column(nullable = false)
    private String status;

    // @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    // private List<OrderItem> items;

}

