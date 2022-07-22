package com.example.PizzaShop.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DrinkDTO extends FoodDTO {

    private String id;
    private String liter;
}
