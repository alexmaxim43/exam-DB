package com.example.examdb.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String phoneNo;

    @OneToMany
    private List<Order> orderList;
}
