package com.LaerteProgramer.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LaerteProgramer.ProjetoSpring.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
	
	

}
