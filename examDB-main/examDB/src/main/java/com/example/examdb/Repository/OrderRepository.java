package com.example.examdb.Repository;

import com.example.examdb.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>{
    public Order findOrderByUserId(Integer id);
}
