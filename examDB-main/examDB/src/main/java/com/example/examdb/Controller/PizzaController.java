package com.example.examdb.Controller;

import com.example.examdb.Service.PizzaService;
import lombok.RequiredArgsConstructor;
import com.example.examdb.model.Pizza;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;

    @GetMapping("/Pizza-menu")
    public List<Pizza> getMenu(){
        return pizzaService.DisplayPizzaMenu();
    }
}
