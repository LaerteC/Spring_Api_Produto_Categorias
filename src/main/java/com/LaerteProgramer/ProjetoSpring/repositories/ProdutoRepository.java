package com.LaerteProgramer.ProjetoSpring.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.LaerteProgramer.ProjetoSpring.entities.Produto;

@Component
public class ProdutoRepository {
	
	private Map<Long,Produto> mapa = new HashMap<>();
	
	public void save(Produto prod) {
		
		mapa.put(prod.getId(), prod);
	}
	public Produto findById(Long id) {
		
		return mapa.get(id);
		
	}
	
	public List<Produto> findAll(){
		
		return new ArrayList<Produto>(mapa.values());
		
	}

}
