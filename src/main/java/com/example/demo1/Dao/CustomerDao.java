package com.example.demo1.Dao;

import java.util.List;

public class CustomerDao {

    //name
    //email
    //password

    private int id;
    private String name;
    private String email;
    private String password;

    private CustomerDetailsDao customerDetailsDao;

    private List<OrderDao> orderDaoList;

    public CustomerDao() {
    }

    public CustomerDao(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public CustomerDao(int id, String name, String email, String password, CustomerDetailsDao customerDetailsDao) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.customerDetailsDao = customerDetailsDao;
    }

    public CustomerDao(int id, String name, String email, String password, CustomerDetailsDao customerDetailsDao, List<OrderDao> orderDaoList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.customerDetailsDao = customerDetailsDao;
        this.orderDaoList = orderDaoList;
    }

    public List<OrderDao> getOrderDaoList() {
        return orderDaoList;
    }

    public void setOrderDaoList(List<OrderDao> orderDaoList) {
        this.orderDaoList = orderDaoList;
    }

    public CustomerDetailsDao getCustomerDetailsDao() {
        return customerDetailsDao;
    }

    public void setCustomerDetailsDao(CustomerDetailsDao customerDetailsDao) {
        this.customerDetailsDao = customerDetailsDao;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", customerDetailsDao=" + customerDetailsDao +
                ", orderDaoList=" + orderDaoList +
                '}';
    }
}
