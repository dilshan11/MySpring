package com.example.demo1.Service;

import com.example.demo1.Dao.ItemDao;
import com.example.demo1.Dao.OrderDao;
import com.example.demo1.Dao.OrderdetailsDao;
import com.example.demo1.Entity.Item;
import com.example.demo1.Entity.Order;
import com.example.demo1.Entity.Orderdetails;
import com.example.demo1.Repositery.OrderdetailsRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsService {
    //getAllOrderDetails
    //getOrderDetails
    //addOrderDetails
    //updateOrderDetails
    //deleteOrderDetails
    @Autowired
    private OrderdetailsRepositery  orderdetailsRepositery;

//    private List<OrderdetailsDao> getAllOrderDetails(){
//        List<Orderdetails> orderdetailsList=this.orderdetailsRepositery.findAll();
//
//        for(Orderdetails orderdetails : orderdetailsList){
//            Item item=orderdetails.getItem();
//            ItemDao itemDao=new ItemDao(item.getId(),item.getName(),item.getQty());
//            Order order=orderdetails.getOrder();
//
//            OrderDao orderDao=new OrderDao(order.getId(),);
//            OrderdetailsDao orderdetailsDao=new OrderdetailsDao();
//
//        }
//    }

}
