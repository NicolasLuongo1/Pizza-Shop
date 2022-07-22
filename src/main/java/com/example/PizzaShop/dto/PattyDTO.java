package com.example.PizzaShop.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PattyDTO extends FoodDTO {

    private String id;
    private String typeOfFilling; // tipo de relleno
}
