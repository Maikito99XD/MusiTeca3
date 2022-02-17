package es.multitiendaMike.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.multitiendaMike.hibernate.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
	
	/*
	@Query("select g from genero g where g.id = ?1")
	public List<Genero> findCancionById(Long generoId);
	*/
}
