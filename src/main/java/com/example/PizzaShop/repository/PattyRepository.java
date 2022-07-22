package com.example.PizzaShop.repository;

import com.example.PizzaShop.entity.Patty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PattyRepository extends JpaRepository<Patty, Serializable> {
}
