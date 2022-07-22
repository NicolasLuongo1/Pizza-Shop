package com.example.PizzaShop.repository;

import com.example.PizzaShop.entity.Dessert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface DessertRepository extends JpaRepository<Dessert, Serializable> {
}
