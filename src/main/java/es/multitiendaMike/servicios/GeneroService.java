package es.multitiendaMike.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.multitiendaMike.entitys.Genero;
import es.multitiendaMike.repositorios.GeneroRepository;

@Service
public class GeneroService {
	
	@Autowired
	private GeneroRepository repositorioGenero;
	
	public Genero save(Genero genero) {
		return repositorioGenero.save(genero);
	}
	
	public void delete(Genero genero) {
		repositorioGenero.delete(genero);
	}
	
	public Genero findById(Long id) {
		return repositorioGenero.findById(id).orElse(null);
	}
	
	public List<Genero> findAll() {
		return repositorioGenero.findAll();
	}	
}
