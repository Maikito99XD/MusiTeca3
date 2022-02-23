package es.multitiendaMike;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import es.multitiendaMike.entitys.Cancion;
import es.multitiendaMike.entitys.Genero;
import es.multitiendaMike.entitys.PlayList;
import es.multitiendaMike.servicios.CancionService;
import es.multitiendaMike.servicios.GeneroService;
import es.multitiendaMike.servicios.PlayListService;

@SpringBootApplication
public class MusiTeca3Application {

	public static void main(String[] args) {
		SpringApplication.run(MusiTeca3Application.class, args);
	}
	
	@Bean
	public CommandLineRunner initData(GeneroService generoService, CancionService cancionService, PlayListService playlistService) {
		return args -> {
			Genero genero = generoService.save(new Genero("Rock"));
			Cancion cancion = cancionService.save(new Cancion("Feels Like Spirit", genero, "https://www.youtube.com/watch?v=hTWKbfoikeg"));
			PlayList playlist = playlistService.save(new PlayList("Rock", 5));
		};
	}
}
