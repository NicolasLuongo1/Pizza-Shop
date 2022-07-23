package com.example.PizzaShop.dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class FoodDTO {

    private String id;
    private String name;
    private String description;
    private int cant;
    private int price;
    private String category;





}
