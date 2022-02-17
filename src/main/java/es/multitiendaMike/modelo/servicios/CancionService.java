package es.multitiendaMike.modelo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.multitiendaMike.hibernate.Cancion;
import es.multitiendaMike.modelo.repositorios.CancionRepository;


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
		
		public Cancion delete(Cancion cancion) {
			Cancion result = findById(cancion.getId());
			repositorioCancion.delete(result);
			return result;
		}
		
	}
