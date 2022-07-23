package com.example.PizzaShop.entity;

import lombok.*;


import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "dessert")
public class Dessert extends Food{

    private String flavored;

}
