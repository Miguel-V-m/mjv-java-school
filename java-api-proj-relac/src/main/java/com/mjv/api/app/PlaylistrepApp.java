package com.mjv.api.app;

import com.mjv.api.model.Album;
import com.mjv.api.model.Artista;
import com.mjv.api.model.Music;
import com.mjv.api.repository.PlaylistRepository;

public class PlaylistrepApp {
public static void main(String[] args) {
		
	    PlaylistRepository  mjr = new PlaylistRepository ();
	    
	    Music music = new Music();
	    music.setNome("Hechizo De Luna");
	    music.setGenero("Salsa");
	    music.setInternacional(true);
	    
	    Music music1 = new Music();
	    music1.setNome("Siempre");
	    music1.setGenero("Salsa");
	    music1.setInternacional(true);

	    // mjr.save(music);
	    // mjr.save(music1);
	     
		/* ####################################################################### */
	    Album album = new Album();
	    album.setAlbum("Hechizo De Luna");
	    
	    Album album1 = new Album();
	    album1.setAlbum("La Magia de Tus Quince Años");
	    
	    // mjr.save(album);
	    // mjr.save(album1);
	    /* #################################################################### */
	    
	    Artista artista = new Artista();
	    artista.setArtista("Edgar Joel");
	    
	    Artista artista1 = new Artista();
	    artista1.setArtista("La Magia de Tus Quince Años");
	    
	    //mjr.save(artista);
	    // mjr.save(artista1);
	}

}
