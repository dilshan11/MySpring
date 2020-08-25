package com.example.demo1.Controller;

import com.example.demo1.Dao.CustomerDao;
import com.example.demo1.Dao.OrderDao;
import com.example.demo1.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

//    @GetMapping("orders")
//    public List<OrderDao> getAllOrdrs(){
//       return this.orderService.getAllOrders();
//    }
//    @PostMapping("orders")
//    public void addOrder(@RequestBody CustomerDao customerDao){
//
//         this.orderService.addOrder(customerDao);
//    }

}
