package br.com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



import br.com.dao.PessoaDAO;
import br.com.entidade.Pessoa;

/**
 * 
 * @author PedroMiquiles
 *
 *  
 */

@ViewScoped
@ManagedBean(name = "pessoabean")
public class PessoaBean {
	
	private Pessoa pessoa = new Pessoa();
	
	private PessoaDAO pessoaDao = new PessoaDAO();
	
	private List<Pessoa> listarTodos = new ArrayList<Pessoa>();
	private List<Pessoa> listarUser = new ArrayList<Pessoa>();
	
	private String message;
	
	

	

	public String editar_usuario() {
		carregarCPF();
		System.out.println("cheguei aqui");
		return "";	
	} 
		
	public String salvar_usuario() {
		
		
		if (pessoa.getCpf().isEmpty() || pessoa.getNome().isEmpty() || pessoa.getEmail().isEmpty() || pessoa.getSenha().isEmpty()) {
			
			message = "Preencha todos os campos!";
			
		}else {
		pessoa = pessoaDao.merge(pessoa);
		System.out.println("Salvo com sucesso");
	
		pessoa = new Pessoa();
		
		
		}return"";
	}
	
	
	public void carregarCPF() {
		listarTodos = pessoaDao.listarCPF(pessoa);
	}
	
	public void carregarPessoas() {
		
		listarTodos = PessoaDAO.getListEntity(Pessoa.class);
		
	}
	
	

	
	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PessoaDAO getPessoaDao() {
		return pessoaDao;
	}

	public void setPessoaDao(PessoaDAO pessoaDao) {
		this.pessoaDao = pessoaDao;
	}

	public List<Pessoa> getListarTodos() {
		return listarTodos;
	}

	public void setListarTodos(List<Pessoa> listarTodos) {
		this.listarTodos = listarTodos;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	public List<Pessoa> getListarUser() {
		return listarUser;
	}

	public void setListarUser(List<Pessoa> listarUser) {
		this.listarUser = listarUser;
	}

	
		
	
	
	

}
