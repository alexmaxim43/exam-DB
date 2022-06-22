package com.example.examdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ClientOrder")
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer price;

    @ManyToOne
    private Client client;

    @OneToMany
    private List<Pizza> currentOrder;
}
