package com.LaerteProgramer.ProjetoSpring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.LaerteProgramer.ProjetoSpring.entities.Categoria;
import com.LaerteProgramer.ProjetoSpring.entities.Produto;
import com.LaerteProgramer.ProjetoSpring.repositories.CategoriaRepository;
import com.LaerteProgramer.ProjetoSpring.repositories.ProdutoRepository;

@SpringBootApplication
public class ProjetoSpringApplication implements CommandLineRunner{

	
	@Autowired
	private CategoriaRepository categoriaRepositorio;
	
	@Autowired
	private ProdutoRepository produtoRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		Categoria cat1 = new Categoria(null,"Eletronicos");
		
		Categoria cat2 = new Categoria(null,"Eletrodomésticos");
		
		Categoria cat3 = new Categoria(null,"Roupa e Cama");
		
		
		Produto prod1 = new Produto(null,"Celular",2500.00,cat1);
		
		Produto prod2 = new Produto(null,"Geladeira",6000.00,cat2);
		
		Produto prod3 = new Produto(null,"Lençól",50.00,cat3);
		
		cat1.getProdutos().addAll(Arrays.asList(prod1));
		cat2.getProdutos().addAll(Arrays.asList(prod2));
		cat3.getProdutos().addAll(Arrays.asList(prod3));
		
		
		categoriaRepositorio.save(cat1);
		categoriaRepositorio.save(cat2);
		categoriaRepositorio.save(cat3);
		
		
		produtoRepositorio.save(prod1);
		produtoRepositorio.save(prod2);
		produtoRepositorio.save(prod3);
		
	}

}
