package com.example.demo1.Dao;


import java.util.List;

public class OrderDao {

    //id
    //date
    //customerDao

    private int id;
    private String date;
    private CustomerDao customerDao;
    private List<OrderdetailsDao> orderdetailsDaoList;

    public OrderDao() {
    }

    public OrderDao(int id, String date, CustomerDao customerDao) {
        this.id = id;
        this.date = date;
        this.customerDao = customerDao;
    }

    public List<OrderdetailsDao> getOrderdetailsDaoList() {
        return orderdetailsDaoList;
    }

    public void setOrderdetailsDaoList(List<OrderdetailsDao> orderdetailsDaoList) {
        this.orderdetailsDaoList = orderdetailsDaoList;
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

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public String toString() {
        return "OrderDao{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", customerDao=" + customerDao +
                ", orderdetailsDaoList=" + orderdetailsDaoList +
                '}';
    }
}
