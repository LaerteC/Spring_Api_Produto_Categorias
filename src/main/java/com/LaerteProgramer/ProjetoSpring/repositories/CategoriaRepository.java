package com.LaerteProgramer.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LaerteProgramer.ProjetoSpring.entities.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
	
	

}
