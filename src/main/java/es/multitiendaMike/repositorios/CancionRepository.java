package es.multitiendaMike.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import es.multitiendaMike.entitys.Cancion;

public interface CancionRepository extends JpaRepository<Cancion, Long> {

	
}