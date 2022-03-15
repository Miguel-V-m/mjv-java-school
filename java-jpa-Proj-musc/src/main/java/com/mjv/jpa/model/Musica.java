package com.mjv.jpa.model;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "musicas")
public class Musica {
	 @Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    @Column(name = "nome",length=50)
	    private String nome;
	    @Column(name = "genero",length=50)
	    private String genero;
	    @Column(name = "duracao",precision=4, scale=2)
	    private double duracao;
	    @Column(name = "artista",length=50)
	    private String artista;
	    @Column(name = "compositor",length=50)
	    private String compositor;
	    @Column(name = "album",length=50)
	    private String album; 
	    @Column(name = "internacional")
	    private boolean internacional;
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public double getDuracao() {
			return duracao;
		}
		public void setDuracao(double duracao) {
			this.duracao = duracao;
		}
		public String getArtista() {
			return artista;
		}
		public void setArtista(String artista) {
			this.artista = artista;
		}
		public String getCompositor() {
			return compositor;
		}
		public void setCompositor(String compositor) {
			this.compositor = compositor;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public boolean isInternacional() {
			return internacional;
		}
		public void setInternacional(boolean internacional) {
			this.internacional = internacional;
		}
	
   

}
