package com.projetoSpring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoSpring.curso.entities.User;

//spring dataJpa ja tem uma implementação para a inteface
//se for definido JpaRepository com minha entidade e o tipo do seu ID(implementação padrão)

@Repository //-> opicional
public interface UserRepository extends JpaRepository<User, Long>{
	

}
