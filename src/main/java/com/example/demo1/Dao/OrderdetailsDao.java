package com.example.demo1.Dao;

import com.example.demo1.Entity.Item;

public class OrderdetailsDao {
    //id
    //itemDao
    //orderDao
    //qty

    private int id;
    private ItemDao itemDao;
    private OrderDao orderDao;
    private int qty;

    public OrderdetailsDao() {
    }

    public OrderdetailsDao(int id, ItemDao itemDao, OrderDao orderDao, int qty) {
        this.id = id;
        this.itemDao = itemDao;
        this.orderDao = orderDao;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderdetailsDao{" +
                "id=" + id +
                ", itemDao=" + itemDao +
                ", orderDao=" + orderDao +
                ", qty=" + qty +
                '}';
    }
}
