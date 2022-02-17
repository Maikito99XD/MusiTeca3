package es.multitiendaMike.modelo.servicios;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.multitiendaMike.hibernate.Playlist;
import es.multitiendaMike.modelo.repositorios.PlayListRepository;


@Service
public class PlayListService {
	@Autowired
	private PlayListRepository repositorioPlaylist;
	
	public List<Playlist> findAll() {
		return repositorioPlaylist.findAll();
	}
	
	public List<Playlist> findAllByPlaylist(Playlist playlist) {
		return repositorioPlaylist.findByCategoria(playlist);
	}
	
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
	
	public Long numeroPlaylistCancion(Long playlistId) {
		return repositorioPlaylist.findNumCancionesByPlaylist(playlistId);
	}
	
	
	/*
	 * Este método sirve para obtener un número de productos aleatorios.
	 * Lo realizamos en Java para abstraernos mejor de la base de datos
	 * concreta que vamos a usar.
	 * Algunos SGBDR nos permitirían usar la función RANDOM, y podríamos
	 * hacer esta consulta de forma nativa.
	 */
	public List<Playlist> obtenerPlaylistAleatorias(int numero) {
		// Obtenemos los ids de todos los productos
		List<Long> listaIds = repositorioPlaylist.obtenerIds();
		// Los desordenamos 
		Collections.shuffle(listaIds);
		// Nos quedamos con los N primeros, con N = numero.
		listaIds = listaIds.stream().limit(numero).collect(Collectors.toList());
		// Buscamos los productos con esos IDs y devolvemos la lista
		return repositorioPlaylist.findAllById(listaIds);

	}
	

}
