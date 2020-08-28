package com.example.demo1.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "my_order")
public class Order {
    //id
    //date
    //customer

    //orderdetailsList

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "customer_Id")
    private Customer customer;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    private List<Orderdetails> orderdetailsList;

    public Order() {
    }

    public Order(String date) {
        this.date = date;
    }

    public Order(String date, Customer customer) {
        this.date = date;
        this.customer = customer;
    }

    public List<Orderdetails> getOrderdetailsList() {
        return orderdetailsList;
    }

    public void setOrderdetailsList(List<Orderdetails> orderdetailsList) {
        this.orderdetailsList = orderdetailsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void add(Orderdetails tempOrderdetails){
        if(this.orderdetailsList==null){
            this.orderdetailsList=new ArrayList<>();
        }
        this.orderdetailsList.add(tempOrderdetails);
        tempOrderdetails.setOrder(this);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", customer=" + customer +
                ", orderdetailsList=" + orderdetailsList +
                '}';
    }
}
