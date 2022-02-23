package es.multitiendaMike.servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.multitiendaMike.entitys.Cancion;
import es.multitiendaMike.entitys.PlayList;
import es.multitiendaMike.repositorios.PlayListRepository;


@Service
public class PlayListService {
	
	@Autowired
	private PlayListRepository repositorioPlaylist;
	
	public List<PlayList> findAll() {
		return repositorioPlaylist.findAll();
	}
	
	public List<PlayList> findByCancion(Cancion cancion) {
		return repositorioPlaylist.findByCancion(cancion);
	}
	
	public PlayList findById(Long id) {
		return repositorioPlaylist.findById(id).orElse(null);
	}
	
	public PlayList save(PlayList playList) {
		return repositorioPlaylist.save(playList);
	}
	
	public void delete(PlayList playList) {
		repositorioPlaylist.delete(playList);
	}
	
	
	/*
	private List<PlayList> repositorio = new ArrayList<>();
	
	
	public PlayList add(PlayList e) {
		repositorio.add(e);
		return e;
	}
	
	public List<PlayList> findAll() {
		return repositorio;
	}
	
	@PostConstruct
	public void init() {
		repositorio.addAll(
				Arrays.asList(new PlayList(1,"AC/DC", 5),
						new PlayList(2,"Banda de musica",1),
						new PlayList(3,"Bad bunny",3)						
						)
				);
	}
	
	public PlayList findById(long id) {
		PlayList result = null;
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < repositorio.size()) {
			if (repositorio.get(i).getId() == id) {
				encontrado = true;
				result = repositorio.get(i);
			} else {
				i++;
			}
		}
		
		return result;
	}
	
	public PlayList edit(PlayList e) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < repositorio.size()) {
			if (repositorio.get(i).getId() == e.getId()) {
				encontrado = true;
				repositorio.remove(i);
				repositorio.add(i, e);
			} else {
				i++;
			}
		}
		
		if (!encontrado)
			repositorio.add(e);
		
		return e;
	}
	
	public void delete(PlayList playlist) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < repositorio.size()) {
			if (repositorio.get(i).getId() == playlist.getId()) {
				encontrado = true;
				repositorio.remove(i);
			}
			i++;
		}
	}

	*/
}

