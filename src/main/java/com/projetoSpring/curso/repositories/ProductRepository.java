package com.projetoSpring.curso.repositories;

import com.projetoSpring.curso.entities.Category;
import com.projetoSpring.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
