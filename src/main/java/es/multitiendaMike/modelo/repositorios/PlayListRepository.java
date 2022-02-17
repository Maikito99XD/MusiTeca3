package es.multitiendaMike.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.multitiendaMike.hibernate.Playlist;


public interface PlayListRepository extends JpaRepository<Playlist, Long> {
	/*
	@Query("select p.id from playlist p")
	public List<Long> obtenerIds();
	
	@Query("select p from playlist p where p.categoria.id = ?1")
	public List<Playlist> findByCategoriaId(Long playlistId);
	
	@Query("select count(c) from cancion c where c.playlist = ?1")
	public Long findNumCancionesByPlaylist(Long playListId);
	*/
	

}
