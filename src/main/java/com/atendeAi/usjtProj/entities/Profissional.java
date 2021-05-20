package com.atendeAi.usjtProj.entities;

import java.io.Serializable;

public class Profissional implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String email;
	private int idade;
	private String cpf;
	private String senha;
	private int crm;
	
	public Profissional () {}

	public Profissional(int id, String email, int idade, String cpf, String senha, int crm) {
		super();
		this.id = id;
		this.email = email;
		this.idade = idade;
		this.cpf = cpf;
		this.senha = senha;
		this.crm = crm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + crm;
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
		Profissional other = (Profissional) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (crm != other.crm)
			return false;
		return true;
	}
	
	
	
}
