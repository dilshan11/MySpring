package com.example.demo1.Service;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Dao.OrderDao;
import com.example.demo1.Entity.Customer;
import com.example.demo1.Entity.CustomerDetails;
import com.example.demo1.Entity.Order;
import com.example.demo1.Repositery.CustomerRepositery;
import com.example.demo1.Repositery.OrderRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    //getAllOrders
    //getOrder
    //addOrder
    //updateOrder
    //deleteOrder
    @Autowired
    private OrderRepositery orderRepositery;

   @Autowired
   private CustomerRepositery customerRepositery;

    public List<OrderDao> getAllOrders(){
            List<Order> orderList=this.orderRepositery.findAll();
            List<OrderDao> orderDaoList=new ArrayList<>();
            for(Order order: orderList){
                CustomerDao customerDao=new CustomerDao(order.getCustomer().getId(),order.getCustomer().getName(),order.getCustomer().getEmail(),order.getCustomer().getPassword());
                OrderDao orderDao=new OrderDao(order.getId(),order.getDate(),customerDao);
                orderDaoList.add(orderDao);
            }
        return orderDaoList;
    }

    public OrderDao getOrder(int id) {
        Optional<Order> optionalOrder = this.orderRepositery.findById(id);
        Order order = optionalOrder.get();
        if (optionalOrder.isPresent()) {
            CustomerDao customerDao = new CustomerDao(order.getCustomer().getId(), order.getCustomer().getName(), order.getCustomer().getEmail(), order.getCustomer().getPassword());
            OrderDao orderDao = new OrderDao(order.getId(), order.getDate(), customerDao);
            return orderDao;
        } else {
            OrderDao orderDao = new OrderDao(0, null, null);
            return orderDao;
        }
    }

         public void addOrder(OrderDao orderDao){
            CustomerDao customerDao=orderDao.getCustomerDao();
            Customer customer=this.customerRepositery.findById(customerDao.getId()).get();
            Order order=new Order(orderDao.getDate(),customer);
            this.orderRepositery.save(order);
    }

        public void updateOrder(OrderDao orderDao){
            CustomerDao customerDao=orderDao.getCustomerDao();
            Customer customer=this.customerRepositery.findById(customerDao.getId()).get();
            Order order=new Order(orderDao.getDate(),customer);
            order.setId(orderDao.getId());
            this.orderRepositery.save(order);
        }

        public void deleteOrder(int id){
            this.orderRepositery.deleteById(id);
        }
//    public void addOrder(CustomerDao customerDao){
//        Order order=new Order(customerDao.getDate());
//        CustomerDetails customerDetails=new CustomerDetails(customerDao.getJob(),customerDao.getFacebookName());
//        Customer customer=new Customer(customerDao.getName(),customerDao.getEmail(),customerDao.getPassword(),customerDetails);
//        order.setCustomer(customer);
//        this.orderRepositery.save(order);
//    }


}
