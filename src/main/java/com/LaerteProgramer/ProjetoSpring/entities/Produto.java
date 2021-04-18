package com.LaerteProgramer.ProjetoSpring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Produto implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome ;
	
	private Double preco;
	
	
	@ManyToOne
	@JoinColumn(name="categoria_id")
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
