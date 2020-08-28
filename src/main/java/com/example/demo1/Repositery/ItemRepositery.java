package com.example.demo1.Repositery;

import com.example.demo1.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepositery extends JpaRepository<Item,Integer> {
}
