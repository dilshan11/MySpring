package com.example.demo1.Repositery;

import com.example.demo1.Entity.Orderdetails;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface OrderdetailsRepositery extends JpaRepository<Orderdetails,Integer> {
}
