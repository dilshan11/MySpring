package com.example.demo1.Controller;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Dao.OrderDao;
import com.example.demo1.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    //getAllOrders
    //getOrder
    //addOrder
    //updateOrder
    //deleteOrder
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<OrderDao> getAllOrdrs(){
       return this.orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public OrderDao getOrder(@PathVariable int id){
       return this.orderService.getOrder(id);
    }

    @PostMapping("/orders")
    public void addOrder(@RequestBody OrderDao orderDao){
         this.orderService.addOrder(orderDao);
    }

    @PutMapping("/orders")
    public void updateOrder(@RequestBody OrderDao orderDao){
        this.orderService.updateOrder(orderDao);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable int id){
        this.orderService.deleteOrder(id);
    }
}
