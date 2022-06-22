package com.example.examdb.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="menu")
@RequiredArgsConstructor
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer price;
    private String name;

    @ManyToOne
    private Order order;

}
