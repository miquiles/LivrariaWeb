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

	
	public List<Pessoa> listarTodos() {

		EntityManager entityManager = JPAUtil.getEntityManager();

		javax.persistence.Query query = entityManager.createQuery("from pessoa");

		List<Pessoa> pessoa = query.getResultList();

		return pessoa;

	}


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

	public List<Pessoa> listarCPF(Pessoa pessoa) {

		EntityManager entityManager = JPAUtil.getEntityManager();
		
		javax.persistence.Query query = entityManager.createQuery("from pessoa where cpf =" + pessoa.getCpf());

		List<Pessoa> pessoas = query.getResultList();

		return pessoas;

	}

	
	
	
public void editarPorId(Pessoa pessoa) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		
		Object id = JPAUtil.getPrimaryKey(pessoa);
		entityManager.createQuery("select from " + pessoa.getClass().getCanonicalName() + " where cpf = '?'" + id).executeUpdate();
		
		entityTransaction.commit();
		entityManager.close();
		
		
	}

}
