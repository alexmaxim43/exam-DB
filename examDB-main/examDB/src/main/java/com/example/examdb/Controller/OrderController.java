package com.example.examdb.Controller;

import com.example.examdb.Exceptions.OrderNull;
import com.example.examdb.Service.OrderService;
import lombok.RequiredArgsConstructor;
import com.example.examdb.model.Pizza;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/idClient/createOrder")
    public boolean createOrder(@PathVariable Integer idClient, List<Pizza> pizzas) throws OrderNull {
        orderService.createOrder(idClient, pizzas);
        return true;
    }

}
