package com.example.demo1.Repositery;

import com.example.demo1.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositery extends JpaRepository<Customer,Integer> {
}
