package es.multitiendaMike.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import es.multitiendaMike.hibernate.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
	
	
}
