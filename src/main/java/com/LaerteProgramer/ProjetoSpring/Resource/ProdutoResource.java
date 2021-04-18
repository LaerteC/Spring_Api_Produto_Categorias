package com.LaerteProgramer.ProjetoSpring.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LaerteProgramer.ProjetoSpring.entities.Produto;
import com.LaerteProgramer.ProjetoSpring.repositories.ProdutoRepository;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoRepository produtoRepositorio;
	
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		
		List<Produto> produtos = produtoRepositorio.findAll();
		
		return ResponseEntity.ok().body(produtos);
		
	}
	
	@GetMapping(value="/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id){
		
		
		Produto produto = produtoRepositorio.findById(id).get();
		
		return ResponseEntity.ok().body(produto);
	}
	
}
