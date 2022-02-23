package es.multitiendaMike.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.multitiendaMike.entitys.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
	

}
