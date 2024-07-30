package com.assignment131.assignment131.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "shopping_carts")
public class ShoppingCart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cartid;

    // @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    // private List<CartItem> items;

    public ShoppingCart() {
    }

    public long getCartid() {
        return cartid;
    }

    public void setCartid(long cartid) {
        this.cartid = cartid;
    }

    // public List<CartItem> getItems() {
    //     return items;
    // }

    // public void setItems(List<CartItem> items) {
    //     this.items = items;
    // }

    
}
