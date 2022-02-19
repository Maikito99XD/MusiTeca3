package es.multitiendaMike.modelo.servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.multitiendaMike.hibernate.Playlist;
import es.multitiendaMike.modelo.repositorios.PlayListRepository;



@Service
public class PlayListService {
	
	private List<Playlist> repositorio = new ArrayList<>();
	
	
	public Playlist add(Playlist e) {
		repositorio.add(e);
		return e;
	}
	
	public List<Playlist> findAll() {
		return repositorio;
	}
	
	@PostConstruct
	public void init() {
		repositorio.addAll(
				Arrays.asList(new Playlist(1,"Antonio García", 2),
						new Playlist(2,"María López",3),
						new Playlist(3,"Ángel Antúnez",4)						
						)
				);
	}
	
	public Playlist findById(long id) {
		Playlist result = null;
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
	
	public Playlist edit(Playlist e) {
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
	
	public void delete(Playlist playlist) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < repositorio.size()) {
			if (repositorio.get(i).getId() == playlist.getId()) {
				encontrado = true;
				repositorio.remove(i);
			}
		}
	}
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

