package com.example.demo1.Service;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Dao.OrderDao;
import com.example.demo1.Entity.Customer;
import com.example.demo1.Entity.CustomerDetails;
import com.example.demo1.Entity.Order;
import com.example.demo1.Repositery.OrderRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    //getAllOrders
    //getOrder
    //addOrder
    //updateOrder
    //deleteOrder
    @Autowired
    private OrderRepositery orderRepositery;

    public List<OrderDao> getAllOrders(){
        this.orderRepositery.findAll();
        return null;
    }
//    public void addOrder(CustomerDao customerDao){
//        Order order=new Order(customerDao.getDate());
//        CustomerDetails customerDetails=new CustomerDetails(customerDao.getJob(),customerDao.getFacebookName());
//        Customer customer=new Customer(customerDao.getName(),customerDao.getEmail(),customerDao.getPassword(),customerDetails);
//        order.setCustomer(customer);
//        this.orderRepositery.save(order);
//    }


}
