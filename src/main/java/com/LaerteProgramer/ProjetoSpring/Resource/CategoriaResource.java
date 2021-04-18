package com.LaerteProgramer.ProjetoSpring.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LaerteProgramer.ProjetoSpring.entities.Categoria;
import com.LaerteProgramer.ProjetoSpring.repositories.CategoriaRepository;

@RestController
@RequestMapping(value="/categorias")

public class CategoriaResource {

	@Autowired
	private CategoriaRepository categoriaRepositorio ;
 	
	@GetMapping
	public ResponseEntity<List<Categoria>>  findAll(){
		
		List<Categoria> lista = categoriaRepositorio.findAll();
		return ResponseEntity.ok().body(lista);
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		
		Categoria cat = categoriaRepositorio.findById(id).get();
		
		return ResponseEntity.ok().body(cat);
		 
	}
	
}
