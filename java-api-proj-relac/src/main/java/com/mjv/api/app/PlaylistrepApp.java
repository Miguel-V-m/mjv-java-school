package com.mjv.api.app;

import com.mjv.api.infra.DAO;
import com.mjv.api.model.Album;
import com.mjv.api.model.Artista;
import com.mjv.api.model.Music;

public class PlaylistrepApp {
	
	public static void main(String[] args) {
		
		DAO<Music> dao = new DAO<>(Music.class);
		Music music = new Music(); 
		music.setNome("La Verdad");
	    music.setGenero("Salsa");
	    music.setInternacional(true);
		//dao.abrirT().incluirT(music).fecharT().fechar();
	    //dao.incluirAtomico(music).fechar();
	    
	    DAO<Artista> dao2 = new DAO<>(Artista.class);
	    Artista artista = new Artista();
	    artista.setArtista("Héctor Lavoe");
	    //dao2.incluirAtomico(artista).fechar();
	    
	    DAO<Album> dao3 = new DAO<>(Album.class);
	    Album album = new Album();
	    album.setAlbum("Comedia");
	    //dao3.incluirAtomico(album).fechar();
	}

}
