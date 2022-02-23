package es.multitiendaMike.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.multitiendaMike.entitys.Cancion;
import es.multitiendaMike.repositorios.CancionRepository;

@Service
public class CancionService {
	
	@Autowired
	private CancionRepository repositorioCancion;
	
	public List<Cancion> findAll() {
		return repositorioCancion.findAll();
	}	
	
	public Cancion save(Cancion cancion) {
		return repositorioCancion.save(cancion);
	}
	
	public Cancion findById(Long id) {
		return repositorioCancion.findById(id).orElse(null);
	}
	
	public void delete(Cancion cancion) {
		repositorioCancion.delete(cancion);
	}
}