package com.example.demo1.Dao;


public class OrderDao {

    //id
    //date
    //customerDao

    private int id;
    private String date;
    private CustomerDao customerDao;

    public OrderDao() {
    }

    public OrderDao(int id, String date, CustomerDao customerDao) {
        this.id = id;
        this.date = date;
        this.customerDao = customerDao;
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
                '}';
    }
}
