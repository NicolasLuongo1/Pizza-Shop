package com.example.PizzaShop.repository;

import com.example.PizzaShop.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface FoodRepository extends JpaRepository<Food, Serializable> {
}
