package com.atendeAi.usjtProj.entities;

import java.io.Serializable;

public class Paciente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String logradouro;
	private String telefone;
	private String email;
	private String senha;
	private String cep ;
	private int id;
	private int idade;
	private Integer cpf;
	private int numero;

	public Paciente () {}

	public Paciente(String nome, String logradouro, String telefone, String email, String senha, String cep, int id,
			int idade, int cpf, int numero) {
		
		this.nome = nome;
		this.logradouro = logradouro;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.cep = cep;
		this.id = id;
		this.idade = idade;
		this.cpf = cpf;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
		result = prime * result + id;
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
		Paciente other = (Paciente) obj;
		if (cpf != other.cpf)
			return false;
		if (id != other.id)
			return false;
		return true;
	};
}
