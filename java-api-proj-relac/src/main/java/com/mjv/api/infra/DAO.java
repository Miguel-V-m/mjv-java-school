package com.mjv.api.infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

// criamos um classe generic entidade
public class DAO<E> {
		
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	static {
		try {
		emf = Persistence.createEntityManagerFactory("Consultas-PU");
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	// criamos um construtor padrão
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	// criamos um método abrir transação T
	public DAO<E> abrirT(){
		em.getTransaction().begin();
		return this;
	}
	public DAO<E> fecharT(){
		em.getTransaction().commit();
		return this;
	}
	public DAO<E> incluirT(E entidade){
		em.persist(entidade);
		return this;
	}
	//incluir todos
	public DAO<E> incluirAtomico(E entidade){
		em.persist(entidade);
		return this.abrirT().incluirT(entidade).fecharT();
	}
	// metodo para obter todos
	public List<E> obterTodos(){
		return this.obterTodos();
		
	}
	
	public List<E> obterTodos(int qtde, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("classe nula.");
		}
		// JPQL =  Java Persistence Query Language
		String jpql = "select e from " + classe.getName() + " e";
		// fazemos a consulta
		TypedQuery<E> query = em.createQuery(jpql,classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	public void fechar() {
		em.close();
	}

}
