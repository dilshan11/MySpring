package com.example.demo1.Service;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Dao.CustomerDetailsDao;
import com.example.demo1.Entity.Customer;
import com.example.demo1.Entity.CustomerDetails;
import com.example.demo1.Repositery.CustomerDetailsRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerDetailsService {
    //getAllCustomersDetails
    //getCustomerDetails
    //addCustomerDetails
    //updateCustomerDetails
    //deleteCustomerDetails

    @Autowired
    CustomerDetailsRepositery customerDetailsRepositery;

    public List<CustomerDetailsDao> getAllCustomerDetails(){
        List<CustomerDetails> customerDetailsList=this.customerDetailsRepositery.findAll();
        List<CustomerDetailsDao> customerDetailsDaoList=new ArrayList<>();

        for(CustomerDetails  customerDetails: customerDetailsList){
             CustomerDetailsDao customerDetailsDao=new CustomerDetailsDao(customerDetails.getId(),customerDetails.getJob(),customerDetails.getFacebookName());
            customerDetailsDaoList.add(customerDetailsDao);
        }
        return customerDetailsDaoList;
    }

    public CustomerDetailsDao getCustomerDetails(int id){
        Optional<CustomerDetails> customerDetails =this.customerDetailsRepositery.findById(id);
        CustomerDetails customerDetails1=customerDetails.get();
        if(customerDetails.isPresent()){
            CustomerDetailsDao customerDetailsDao=new CustomerDetailsDao(customerDetails1.getId(),customerDetails1.getJob(),customerDetails1.getFacebookName());
            return customerDetailsDao;
        }
        else{
            CustomerDetailsDao customerDetailsDao=new CustomerDetailsDao(0,null,null);
            return customerDetailsDao;
        }
    }

    public void addCustomerDetails(CustomerDetailsDao customerDetailsDao){
        CustomerDetails customerDetails=new CustomerDetails(customerDetailsDao.getJob(),customerDetailsDao.getFacebookName());
        this.customerDetailsRepositery.save(customerDetails);
    }

    public void updateCustomerDetails(CustomerDetailsDao customerDetailsDao){
        CustomerDetails customerDetails=new CustomerDetails(customerDetailsDao.getJob(),customerDetailsDao.getFacebookName());
        customerDetails.setId(customerDetailsDao.getId());
        this.customerDetailsRepositery.save(customerDetails);
    }

    public void deleteCustomerDetails(int id){
        this.customerDetailsRepositery.deleteById(id);
    }
}
