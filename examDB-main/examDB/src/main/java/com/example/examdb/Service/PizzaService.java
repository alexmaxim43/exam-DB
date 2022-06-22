package com.example.examdb.Service;

import com.example.examdb.Repository.PizzaRepository;
import lombok.RequiredArgsConstructor;
import com.example.examdb.model.Pizza;

import java.util.List;

@RequiredArgsConstructor
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public List<Pizza> DisplayPizzaMenu(){
        return pizzaRepository.findAll();
    }
}
