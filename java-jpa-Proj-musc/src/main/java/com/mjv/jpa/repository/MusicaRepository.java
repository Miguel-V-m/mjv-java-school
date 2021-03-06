package com.mjv.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mjv.jpa.model.Musica;

public class MusicaRepository {
	
	private EntityManager em;
	public MusicaRepository() {
		EntityManagerFactory entityManagerFactory 
        = Persistence.createEntityManagerFactory("MUSICAS-PU");
		em = entityManagerFactory.createEntityManager();
		em.close(); // agrege de forma adicional se não funciona comenta
		entityManagerFactory.close();//agresgue de forma adicional si no funciona comenta 
	} 
	
	 public void save(Musica musica){
	        em.getTransaction().begin();
	        em.persist(musica);
	        em.getTransaction().commit();
	    }
	 

}
