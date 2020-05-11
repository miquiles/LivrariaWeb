package br.com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dao.LivroDAO;

import br.com.entidade.Livro;
/**
 * 
 * @author PedroMiquiles
 *
 *  
 */



@ViewScoped
@ManagedBean (name = "livrobean")
public class LivroBean {

	
	private Livro livro = new Livro();
	
	private LivroDAO livroDao = new LivroDAO();
	private List<Livro> listarLivros = new ArrayList<Livro>();
	
	
	public String salvar_livro() {
		
			livro = livroDao.merge(livro);
			
			System.out.println("Salvo com sucesso");
			livro = new Livro();
			
			return"index.xhtml";
			
	}
		
		
	
	
public String carregarLivros() {
		
		listarLivros = LivroDAO.getListEntity(Livro.class);
		return "";
	}
	
	
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public LivroDAO getLivroDao() {
		return livroDao;
	}
	public void setLivroDao(LivroDAO livroDao) {
		this.livroDao = livroDao;
	}
	public List<Livro> getListarLivros() {
		return listarLivros;
	}
	public void setListarLivros(List<Livro> listarLivros) {
		this.listarLivros = listarLivros;
	}





	
}
