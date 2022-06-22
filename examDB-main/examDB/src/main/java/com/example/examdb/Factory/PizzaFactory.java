package com.example.examdb.Factory;

import com.example.examdb.model.Order;

public class PizzaFactory {
    public enum PizzaType{
        MARGHERITA, DIAVOLA, PEPPERONI
    }
    public static Order CreateOrder(PizzaType pizza){
        return switch (pizza){
            case DIAVOLA: new diavolaPizza();
            case PEPPERONI: new pepperonniPizza();
            case MARGHERITA: new margheritaPizza();
        }
    }
}
