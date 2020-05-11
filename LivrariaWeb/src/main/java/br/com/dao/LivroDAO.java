package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.entidade.Livro;

import br.com.util.JPAUtil;


/**
 * 
 * @author PedroMiquiles
 *
 *  
 */


public class LivroDAO {
	
	
	public Livro merge(Livro livro) {

		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Livro retorno = entityManager.merge(livro);

		entityTransaction.commit();
		entityManager.close();

		return retorno;
	}

	
	
	public List<Livro> listarLivros() {

		EntityManager entityManager = JPAUtil.getEntityManager();

		javax.persistence.Query query = entityManager.createQuery("from livro");

		List<Livro> livro = query.getResultList();

		return livro;

	}
	
	
	public static List<Livro> getListEntity(Class<Livro> livro) {

		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		List<Livro> retorno = entityManager.createQuery("from " + livro.getName()).getResultList();

		entityTransaction.commit();
		entityManager.close();

		return retorno;
	}
	

}
