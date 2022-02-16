package es.multitiendaMike.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.multitiendaMike.hibernate.Cancion;


public interface CancionRepository extends JpaRepository<Cancion, Long> {

public List<Cancion> findByCategoria(Cancion cancion);
	
	@Query("select c.id from cancion c")
	public List<Long> obtenerIds();
	
	@Query("select c from cancion c where c.id = ?1")
	public List<Cancion> findCancionById(Long cancion);
	
	
	@Query("select count(c) from cancion c where c.playlist.id = ?1")
	public int findNumCancionesByPlaylist(Cancion cancion);
	
}