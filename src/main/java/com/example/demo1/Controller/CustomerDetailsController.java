package com.example.demo1.Controller;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailsController {

    //getAllCustomers
    //getCustomer
    //addCustomer
    //updateCustomer
    //deleteCustomer

//    @Autowired
//   private CustomerDetailsService customerDetailsService;
//
//    @PostMapping("/customerDetails")
//    public void addCustomer(@RequestBody CustomerDao customerDao){
//        this.customerDetailsService.addCustomerDetails(customerDao);
//    }
}
