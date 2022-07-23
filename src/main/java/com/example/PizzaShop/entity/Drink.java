package com.example.PizzaShop.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "drink")
public class Drink extends Food {


    @Column(name = "liter")
    private String liter;
}
