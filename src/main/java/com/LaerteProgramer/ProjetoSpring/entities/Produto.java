package com.LaerteProgramer.ProjetoSpring.entities;

import java.io.Serializable;

public class Produto implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	private Long id;
	
	private String nome ;
	
	private Double preco;
	
	private Categoria categoria ;
	
	public Produto() {
		
	}
	
	public Produto(Long id,String nome,Double preco,Categoria categoria) {
		
		this.id=id;
		this.nome=nome;
		this.preco=preco;
		this.categoria=categoria;
		
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public String getNome() {
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco=preco;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		
		this.categoria=categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}