package es.multitiendaMike.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import es.multitiendaMike.entitys.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList, Long> {
	
	
}
