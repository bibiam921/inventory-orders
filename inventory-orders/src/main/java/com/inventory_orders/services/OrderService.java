package com.inventory_orders.services;

import com.inventory_orders.model.Order;
import com.inventory_orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Component
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public Order getOrderById(long id){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        return optionalOrder.orElse(null);
    }
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public void deleteOrder(Long id){
        orderRepository.deleteById(id);

    }
}
