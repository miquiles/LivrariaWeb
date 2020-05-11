package br.com.bean;

import java.util.ArrayList;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



import br.com.dao.PessoaDAO;
import br.com.entidade.Pessoa;


/**
 * 
 * @author PedroMiquiles
 *
 *  
 */

@SessionScoped
@ManagedBean (name = "loginbean")
public class LoginBean {
	
	private String txtCPF;
	private String txtSenha;
	
	private List<Pessoa> listarPessoas;
	private Pessoa pessoa;
	private String message;
	
	
	
	private PessoaDAO pessoaDAO;
	
	
			
	public LoginBean(){
		this.listarPessoas = new ArrayList<Pessoa>();
		this.pessoa = new Pessoa();
		this.pessoaDAO = new PessoaDAO();
	
	}
	
	public String entrar() {
		boolean contemUsuario = false;
		this.listarPessoas = this.pessoaDAO.listarTodos();
		for (Pessoa pessoaPesquisa : listarPessoas) {
			
			if (pessoaPesquisa.getCpf().equals(this.txtCPF) && pessoaPesquisa.getSenha().equals(this.txtSenha)) {
				contemUsuario = true;
				
			}
			
		}
		if (contemUsuario) {
			
		
			return "cadastrar_livro.xhtml";
			
		}else {
			message = "Campos incorretos";
			return "";
		}
	}
	



	public String getTxtCPF() {
		return txtCPF;
	}

	public void setTxtCPF(String txtCPF) {
		this.txtCPF = txtCPF;
	}

	public String getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(String txtSenha) {
		this.txtSenha = txtSenha;
	}

	public List<Pessoa> getListarPessoas() {
		return listarPessoas;
	}

	public void setListarPessoas(List<Pessoa> listarPessoas) {
		this.listarPessoas = listarPessoas;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PessoaDAO getPessoaDAO() {
		return pessoaDAO;
	}

	public void setPessoaDAO(PessoaDAO pessoaDAO) {
		this.pessoaDAO = pessoaDAO;
	}

	
	
	

}
