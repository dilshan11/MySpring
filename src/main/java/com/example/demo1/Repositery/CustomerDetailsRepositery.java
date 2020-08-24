package com.example.demo1.Repositery;

import com.example.demo1.Entity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepositery extends JpaRepository<CustomerDetails,Integer> {
}
