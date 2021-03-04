package model.entities;

import java.io.Serializable;

public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String descricao;
	
	private Tipo tipo;
	private Pessoa pessoa;
	
	//Constructors
	public Contato() {
		
	}

	public Contato(Integer id, String descricao, Tipo tipo, Pessoa pessoa) {
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
		this.pessoa = pessoa;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa Pessoa) {
		this.pessoa = Pessoa;
	}

	//Methods
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
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", descricao=" + descricao + ", Pessoa=" + pessoa
				+ ", tipo=" + tipo + "]";
	}
}
