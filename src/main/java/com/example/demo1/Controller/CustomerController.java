package com.example.demo1.Controller;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    //getAllCustomers
    //getCustomer
    //addCustomer
    //updateCustomer
    //deleteCustomer

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String testGet(){
        return "test";
    }

    @GetMapping("/customers")
    public List<CustomerDao> getAllCustomers(){
          return   this.customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public CustomerDao getCustomer(@PathVariable int id){
        return this.customerService.getCustomer(id);
    }

    @PostMapping("/customers")
    public void addCustomer(@RequestBody CustomerDao customerDao){
        System.out.println(customerDao);
         this.customerService.addCustomer(customerDao);
    }
    @PutMapping("/customers")
    public void updateCustomer(@RequestBody CustomerDao customerDao){
        this.customerService.updateCustomer(customerDao);
    }
    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable int id){
        this.customerService.deleteCustomer(id);
    }

}
