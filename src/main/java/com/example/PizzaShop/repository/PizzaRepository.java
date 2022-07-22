package com.example.PizzaShop.repository;


import com.example.PizzaShop.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Serializable> {
}
