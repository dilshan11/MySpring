package com.example.demo1.Repositery;

import com.example.demo1.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositery extends JpaRepository<Order,Integer> {
}
