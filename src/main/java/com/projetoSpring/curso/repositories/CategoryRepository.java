package com.projetoSpring.curso.repositories;

import com.projetoSpring.curso.entities.Category;
import com.projetoSpring.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//spring dataJpa ja tem uma implementação para a inteface
//se for definido JpaRepository com minha entidade e o tipo do seu ID(implementação padrão)

@Repository //-> opicional
public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
