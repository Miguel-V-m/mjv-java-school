package com.mjv.api.app;

import com.mjv.api.infra.DAO;
import com.mjv.api.model.Music;

public class PlaylistrepApp {
	
	public static void main(String[] args) {
		
		DAO<Music> dao = new DAO<>(Music.class);
		Music music = new Music(); 
		music.setNome("Procura");
	    music.setGenero("Salsa");
	    music.setInternacional(true);
		// dao.abrirT().incluirT(music).fecharT().fechar();
	    dao.incluirAtomico(music).fechar();
	}

}
