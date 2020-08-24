package com.example.demo1.Service;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Entity.Customer;
import com.example.demo1.Entity.CustomerDetails;
import com.example.demo1.Entity.Order;
import com.example.demo1.Repositery.CustomerRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
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

    @Autowired
    private CustomerRepositery customerRepositery;



    public List<CustomerDao> getAllCustomers(){
        List<CustomerDao> customerDaoList=new ArrayList<>();
        List<Customer> customerList =this.customerRepositery.findAll();

        for(Customer customer: customerList){
          CustomerDao customerDao=new CustomerDao(customer.getId(),customer.getName(),customer.getEmail(),customer.getPassword(),customer.getCustomerDetails().getJob(),customer.getCustomerDetails().getFacebookName());
          customerDaoList.add(customerDao);
      }
      return customerDaoList;
    }


    public CustomerDao getCustomer( int id){

        Optional<Customer> customerlist=this.customerRepositery.findById(id);
        Customer customer=customerlist.get();
        if(customerlist.isPresent()) {
            CustomerDao customerDao=new CustomerDao(customer.getId(),customer.getName(),customer.getEmail(),customer.getPassword(),customer.getCustomerDetails().getJob(),customer.getCustomerDetails().getFacebookName());

//            CustomerDao customerDao=new CustomerDao(customer.get().getId(),customer.get().getName(),customer.get().getPnumber());
         return customerDao;
        } else {

           CustomerDao customerDao=new CustomerDao(0,null,null,null,null,null);
           return customerDao;
        }

    }


    public void addCustomer(CustomerDao customerDao){
        CustomerDetails customerDetails=new CustomerDetails(customerDao.getJob(),customerDao.getFacebookName());

        this.customerRepositery.save(new Customer(customerDao.getName(),customerDao.getEmail(),customerDao.getPassword(),customerDetails));

    }

    public void updateCustomer( CustomerDao customerDao){
        CustomerDetails customerDetails=new CustomerDetails(customerDao.getJob(),customerDao.getFacebookName());
        this.customerRepositery.save(new Customer(customerDao.getName(),customerDao.getEmail(),customerDao.getPassword(),customerDetails));
    }

    public void deleteCustomer(int id){
    this.customerRepositery.deleteById(id);
    }

    public void addOrder(CustomerDao customerDao) {
        Customer customer=new Customer();
        customer.setId(customerDao.getId());
        Order order=new Order(customerDao.getDate());
        customer.add(order);
        System.out.println(customer);
        this.customerRepositery.save(customer);
    }
}
