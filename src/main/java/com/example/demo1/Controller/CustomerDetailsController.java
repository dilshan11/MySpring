package com.example.demo1.Controller;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Dao.CustomerDetailsDao;
import com.example.demo1.Service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerDetailsController {

    //getAllCustomersDetails
    //getCustomerDetails
    //addCustomerDetails
    //updateCustomerDetails
    //deleteCustomerDetails

    @Autowired
   private CustomerDetailsService customerDetailsService;

    @GetMapping("/customerDetails")
    public List<CustomerDetailsDao> getAllCustomerDetails(){
       return this.customerDetailsService.getAllCustomerDetails();
    }
    @GetMapping("/customerDetails/{id}")
    public CustomerDetailsDao getCustomerDetails(@PathVariable int id){
        return  this.customerDetailsService.getCustomerDetails(id);
    }

    @PostMapping("/customerDetails")
    public void addCustomer(@RequestBody CustomerDetailsDao customerDetailsDao){
        this.customerDetailsService.addCustomerDetails(customerDetailsDao);
    }

    @PutMapping("/customerDetails")
    public void updateCustomerDetails(@RequestBody CustomerDetailsDao customerDetailsDao){
        this.customerDetailsService.updateCustomerDetails(customerDetailsDao);
    }

    @DeleteMapping("/customerDetails/{id}")
    public void deleteCustomerDetails(@PathVariable int id){
        this.customerDetailsService.deleteCustomerDetails(id);
    }

}
