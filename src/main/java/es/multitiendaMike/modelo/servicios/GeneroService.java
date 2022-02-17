package es.multitiendaMike.modelo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.multitiendaMike.hibernate.Genero;
import es.multitiendaMike.modelo.repositorios.GeneroRepository;

@Service
public class GeneroService {
	
	@SuppressWarnings("unused")
	@Autowired
	private GeneroRepository repositorioGenero;
	
	public Genero save(Genero genero) {
		return repositorioGenero.save(genero);
	}
	
	
}
