package com.example.demo1.Service;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Entity.Customer;
import com.example.demo1.Entity.CustomerDetails;
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

    @Autowired
    private CustomerRepositery customerRepositery;


    public List<CustomerDao> getAllCustomers(){
        List<CustomerDao> customerDaoList=new ArrayList<>();
        List<Customer> customerList =this.customerRepositery.findAll();

        for(Customer customer: customerList){
          CustomerDao customerDao=new CustomerDao(customer.getId(),customer.getName(),customer.getPnumber(),customer.getCustomerDetails().getEmail(),customer.getCustomerDetails().getFaceBookName());
          customerDaoList.add(customerDao);
      }
      return customerDaoList;
    }


    public CustomerDao getCustomer( int id){

        Optional<Customer> customer=this.customerRepositery.findById(id);
        if(customer.isPresent()) {
         CustomerDao customerDao=new CustomerDao(customer.get().getId(),customer.get().getName(),customer.get().getPnumber());
         return customerDao;
        } else {

           CustomerDao customerDao=new CustomerDao(0,"0",0);
           return customerDao;
        }
    }


    public void addCustomer(CustomerDao customerDao){
        CustomerDetails customerDetails=new CustomerDetails(customerDao.getEmail(),customerDao.getFaceBookName());
        this.customerRepositery.save(new Customer(customerDao.getId(),customerDao.getName(),customerDao.getPnumber(),customerDetails));

    }

    public void updateCustomer( CustomerDao customerDao){
        this.customerRepositery.save(new Customer(customerDao.getId(),customerDao.getName(),customerDao.getPnumber()));
    }

    public void deleteCustomer(int id){
    this.customerRepositery.deleteById(id);
    }

}
