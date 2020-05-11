package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import br.com.entidade.Pessoa;
import br.com.util.JPAUtil;


/**
 * 
 * @author PedroMiquiles
 *
 *  
 */
public class PessoaDAO {



	public Pessoa merge(Pessoa pessoa) {

		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Pessoa retorno = entityManager.merge(pessoa);

		entityTransaction.commit();
		entityManager.close();

		return retorno;
	}

	public static List<Pessoa> getListEntity(Class<Pessoa> pessoa) {

		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		List<Pessoa> retorno = entityManager.createQuery("from " + pessoa.getName()).getResultList();

		entityTransaction.commit();
		entityManager.close();

		return retorno;
	}

	public List<Pessoa> listarTodos() {

		EntityManager entityManager = JPAUtil.getEntityManager();

		javax.persistence.Query query = entityManager.createQuery("from pessoa");

		List<Pessoa> pessoa = query.getResultList();

		return pessoa;

	}

	public Pessoa editar(Pessoa pessoa) {

		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Pessoa retorno = entityManager.merge(pessoa);

		entityTransaction.commit();
		entityManager.close();

		return retorno;
	}

}
