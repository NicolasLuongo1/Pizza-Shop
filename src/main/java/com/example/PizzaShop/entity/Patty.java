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
@Table(name = "patty")
public class Patty extends Food{



    @Column(name = "typeoffilling")
    private String typeOfFilling;


}
