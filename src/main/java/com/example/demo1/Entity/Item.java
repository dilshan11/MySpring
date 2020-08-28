package com.example.demo1.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "item")
public class Item {
    //id
    //name
    //qty

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int qty;

    @OneToMany
    private List<Orderdetails> orderdetailsList;


    public Item() {
    }

    public Item(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", orderdetailsList=" + orderdetailsList +
                '}';
    }
}
