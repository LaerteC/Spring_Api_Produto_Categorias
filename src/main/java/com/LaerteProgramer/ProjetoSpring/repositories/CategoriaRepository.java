package com.LaerteProgramer.ProjetoSpring.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.LaerteProgramer.ProjetoSpring.entities.Categoria;

@Component
public class CategoriaRepository {
	
	
	private Map<Long,Categoria> mapa =new HashMap<>();
	
	public void save(Categoria objeto) {
		
		
		mapa.put(objeto.getId(), objeto);
	}
	
	
	public Categoria findById(Long id) {
		
		return mapa.get(id);
		
	}
	
	public List<Categoria> findAll(){
		
		return new ArrayList<Categoria>(mapa.values());
		
	}

}
