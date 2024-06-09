package com.inventory_orders.controllers;
import com.inventory_orders.model.Order;
import com.inventory_orders.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order){
      return   orderService.createOrder(order);

    }
    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("{id}")
    public Order searchOrderById(@PathVariable("id") Long id){
        return orderService.getOrderById(id);
    }

    @DeleteMapping("{id}")
    public void deleteOrderById(@PathVariable("id") Long id){
         orderService.deleteOrder(id);
    }
}
