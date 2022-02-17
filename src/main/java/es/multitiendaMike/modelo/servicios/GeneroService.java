package es.multitiendaMike.modelo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.multitiendaMike.hibernate.Genero;
import es.multitiendaMike.modelo.repositorios.GeneroRepository;

@Service
public class GeneroService {
	
	@Autowired
	private GeneroRepository repositorioGenero;
	
	public Genero save(Genero genero) {
		return repositorioGenero.save(genero);
	}
	
	public Genero delete(Genero genero) {
		Genero result = findById(genero.getId());
		repositorioGenero.delete(result);
		return result;
	}
	
	public Genero findById(Long id) {
		return repositorioGenero.findById(id).orElse(null);
	}
	
	public List<Genero> findAll() {
		return repositorioGenero.findAll();
	}	
	
}
