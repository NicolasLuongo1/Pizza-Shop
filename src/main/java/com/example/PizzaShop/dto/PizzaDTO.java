package com.example.PizzaShop.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PizzaDTO extends FoodDTO {

    private String size;
}
