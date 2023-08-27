package com.projetoSpring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
