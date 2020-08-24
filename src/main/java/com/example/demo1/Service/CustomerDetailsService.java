package com.example.demo1.Service;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Entity.Customer;
import com.example.demo1.Entity.CustomerDetails;
import com.example.demo1.Repositery.CustomerDetailsRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsService {
    //getAllCustomersDetails
    //getCustomerDetails
    //addCustomerDetails
    //updateCustomerDetails
    //deleteCustomerDetails

    @Autowired
    CustomerDetailsRepositery customerDetailsRepositery;

//    public void addCustomerDetails(CustomerDao customerDao){
//        Customer customer=new Customer(customerDao.getId(),customerDao.getName(),customerDao.getPnumber());
//        CustomerDetails customerDetails=new CustomerDetails(customerDao.getEmail(),customerDao.getFaceBookName());
//        customerDetails.setCustomer(customer);
//        this.customerDetailsRepositery.save(customerDetails);
//    }
}
