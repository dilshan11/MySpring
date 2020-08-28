package com.example.demo1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "orderdetails")
public class Orderdetails {
    //id
    //item
    //order
    //qty

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "my_order_id")
    private Order order;

    private int qty;

    public Orderdetails() {
    }

    public Orderdetails(Item item, int qty) {
        this.item = item;
        this.qty = qty;
    }

    public Orderdetails(Item item, Order order, int qty) {
        this.item = item;
        this.order = order;
        this.qty = qty;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Orderdetails{" +
                "id=" + id +
                ", item=" + item +
//                ", order=" + order +
                ", qty=" + qty +
                '}';
    }
}
