package es.multitiendaMike.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.multitiendaMike.entitys.Cancion;
import es.multitiendaMike.entitys.Genero;

public interface CancionRepository extends JpaRepository<Cancion, Long> {

	List<Cancion> findByGenero(Genero genero);
	
}