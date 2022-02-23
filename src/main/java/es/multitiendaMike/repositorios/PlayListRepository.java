package es.multitiendaMike.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.multitiendaMike.entitys.Cancion;
import es.multitiendaMike.entitys.PlayList;
@Repository
public interface PlayListRepository extends JpaRepository<PlayList, Long> {
	
	@Query("SELECT pl FROM PlayList pl WHERE :cancion MEMBER pl.canciones")
	List<PlayList> findByCancion(@Param("cancion") Cancion cancion);
	
}
