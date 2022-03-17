package com.mjv.api.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mjv.api.model.Album;
import com.mjv.api.model.Artista;
import com.mjv.api.model.Music;

public class PlaylistRepository {

	private EntityManager em;
	public PlaylistRepository() {
		EntityManagerFactory entityManagerFactory 
        = Persistence.createEntityManagerFactory("Consultas-PU");
		em = entityManagerFactory.createEntityManager();
	}
	public void save(Music music){
        em.getTransaction().begin();
        em.persist(music);
        em.getTransaction().commit();
    }
	public void save(Album album){
        em.getTransaction().begin();
        em.persist(album);
        em.getTransaction().commit();
    }
	public void save(Artista artista){
        em.getTransaction().begin();
        em.persist(artista);
        em.getTransaction().commit();
    }

}
