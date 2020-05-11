package br.com.entidade;

/**
 * 
 * @author PedroMiquiles
 *
 *  
 */



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity (name = "livro")
public class Livro {
	
	@Id
	@Column (name = "id_ref", nullable = false)
	private long id_ref;
	@Column (name = "nome", nullable = false)
	private String nome;
	@Column (name = "idioma", nullable = false)
	private String idioma;
	@Column (name = "descricao", nullable = false)
	private String descricao;
	@Column (name = "nacionalidade", nullable = false)
	private String nacionalidade;
	
	@Column (name = "autor", nullable = false)
	private String autor;
	

	
	
	
	
	
	public long getId_ref() {
		return id_ref;
	}
	public void setId_ref(long id_ref) {
		this.id_ref = id_ref;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public long getId() {
		return id_ref;
	}
	public void setId(long id) {
		this.id_ref = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	
	
	
	
	

}
