package es.multitiendaMike.modelo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.multitiendaMike.hibernate.Playlist;
import es.multitiendaMike.modelo.repositorios.PlayListRepository;



@Service
public class PlayListService {
	/*
	@Autowired
	private PlayListRepository repositorioPlaylist;
	
	public List<Playlist> findAll() {
		return repositorioPlaylist.findAll();
	}
	/*
	public List<Playlist> findAllByPlaylistId(Long categoriaId) {
		return repositorioPlaylist.findByCategoriaId(categoriaId);
	}
	
	
	public Playlist findById(Long id) {
		return repositorioPlaylist.findById(id).orElse(null);
	}
	
	public Playlist save(Playlist playlist) {
		return repositorioPlaylist.save(playlist);
	}
	
	public Playlist delete(Playlist playlist) {
		Playlist result = findById(playlist.getId());
		repositorioPlaylist.delete(result);
		return result;
	}
	*/
	

}

