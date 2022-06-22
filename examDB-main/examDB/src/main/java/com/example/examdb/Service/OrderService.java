package com.example.examdb.Service;

import com.example.examdb.Exceptions.OrderNull;
import com.example.examdb.Repository.ClientRepository;
import com.example.examdb.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import com.example.examdb.model.Order;
import com.example.examdb.model.Pizza;

import java.util.List;

@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final ClientRepository clientRepository;

    public Order createOrder(Integer clientId, List<Pizza> currentOrder ) throws OrderNull {
        Order o = orderRepository.findOrderByUserId(clientId);
        if(currentOrder == null)
            throw new OrderNull();
        else{
            Order order = new Order();
            order.setCurrentOrder(currentOrder);
            orderRepository.save(order);
            return order;
        }
    }
}
