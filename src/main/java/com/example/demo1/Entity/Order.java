package com.example.demo1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "myorder")
public class Order {
    //id
    //date
    //customer
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "customer_Id")
    private Customer customer;

    public Order() {
    }

    public Order(String date) {
        this.date = date;
    }

    public Order(String date, Customer customer) {
        this.date = date;
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", customer=" + customer +
                '}';
    }
}
