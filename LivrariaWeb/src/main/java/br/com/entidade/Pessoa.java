package br.com.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author PedroMiquiles
 *
 *  
 */


@Entity(name="pessoa")

public class Pessoa {
	
	@Id
	@Column(name="cpf" , nullable = false)
	private String cpf;
	
	@Column(name="nome" , nullable = false)
	private String nome;
	
	@Column(name="senha" , nullable = false)
	private String senha;
	
	@Column(name="email" , nullable = false)
	private String email;
	
	
	
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
