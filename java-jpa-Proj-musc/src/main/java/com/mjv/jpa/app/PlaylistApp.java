package com.mjv.jpa.app;

import com.mjv.jpa.model.Musica;
import com.mjv.jpa.repository.MusicaRepository;

public class PlaylistApp {
	
	public static void main(String[] args) {
		
		MusicaRepository mjr = new MusicaRepository();
	    Musica musica = new Musica();
	    musica.setNome("Hechizo De Luna");
	    musica.setAlbum("Hechizo De Luna");
	    musica.setArtista("Edgar Joel");
	    musica.setDuracao(4.55);
	    musica.setCompositor("Edgar Joel");
	    musica.setGenero("Salsa");
	    musica.setInternacional(true);
	    
	    Musica musica1 = new Musica();
	    musica1.setNome("Siempre");
	    musica1.setAlbum("La Magia de Tus Quince Años");
	    musica1.setArtista("Salsa Kids");
	    musica1.setDuracao(4.38);
	    musica1.setCompositor("Salsa Kids");
	    musica1.setGenero("Salsa");
	    musica1.setInternacional(true);

	     mjr.save(musica);
	     mjr.save(musica1);
		
		
	}

}
