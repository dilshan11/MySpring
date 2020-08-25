package com.example.demo1.Service;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Dao.CustomerDetailsDao;
import com.example.demo1.Dao.OrderDao;
import com.example.demo1.Entity.Customer;
import com.example.demo1.Entity.CustomerDetails;
import com.example.demo1.Entity.Order;
import com.example.demo1.Repositery.CustomerRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    //getAllCustomers
    //getCustomer
    //addCustomer
    //updateCustomer
    //deleteCustomer

    //addorder
    //addCustomerDetails

    @Autowired
    private CustomerRepositery customerRepositery;


    public List<CustomerDao> getAllCustomers(){
        List<CustomerDao> customerDaoList=new ArrayList<>();
        List<Customer> customerList =this.customerRepositery.findAll();

        for(Customer customer: customerList){
          CustomerDao customerDao=new CustomerDao(customer.getId(),customer.getName(),customer.getEmail(),customer.getPassword());
          CustomerDetailsDao customerDetailsDao=new CustomerDetailsDao(customer.getCustomerDetails().getJob(),customer.getCustomerDetails().getFacebookName());
           customerDao.setCustomerDetailsDao(customerDetailsDao);
          customerDaoList.add(customerDao);
      }
      return customerDaoList;
    }

    public CustomerDao getCustomer( int id){

        Optional<Customer> customerlist=this.customerRepositery.findById(id);
        Customer customer=customerlist.get();
        if(customerlist.isPresent()) {
            CustomerDao customerDao=new CustomerDao(customer.getId(),customer.getName(),customer.getEmail(),customer.getPassword());
            return customerDao;
        } else {
           CustomerDao customerDao=new CustomerDao(0,null,null,null);
           return customerDao;
        }
    }

    public void addCustomer(CustomerDao customerDao){
//        CustomerDetails customerDetails=new CustomerDetails(customerDao.getJob(),customerDao.getFacebookName());

        this.customerRepositery.save(new Customer(customerDao.getName(),customerDao.getEmail(),customerDao.getPassword()));

    }

    public void updateCustomer( CustomerDao customerDao){
//        CustomerDetails customerDetails=new CustomerDetails(customerDao.getJob(),customerDao.getFacebookName());
        Customer customer=new Customer(customerDao.getName(),customerDao.getEmail(),customerDao.getPassword());
        customer.setId(customerDao.getId());
        this.customerRepositery.save(customer);
    }

    public void deleteCustomer(int id){
    this.customerRepositery.deleteById(id);
    }


    public void addCustomerDetailsToCustomer(CustomerDao customerDao){
        Optional<Customer> customerOptional =this.customerRepositery.findById(customerDao.getId());
        Customer customer=customerOptional.get();
        CustomerDetails customerDetails=new CustomerDetails(customerDao.getCustomerDetailsDao().getJob(),customerDao.getCustomerDetailsDao().getFacebookName());
        customer.setCustomerDetails(customerDetails);
        this.customerRepositery.save(customer);
    }

    public void addOrdersToCustomers(CustomerDao customerDao){

            Optional<Customer> customerOptional =this.customerRepositery.findById(customerDao.getId());
            Customer customer=customerOptional.get();
            List<OrderDao> orderDaoList=customerDao.getOrderDaoList();

            for(OrderDao orderDao : orderDaoList){
            Order order=new Order(orderDao.getDate());
            customer.add(order);
                System.out.println(order);
        }

            this.customerRepositery.save(customer);
    }

}
