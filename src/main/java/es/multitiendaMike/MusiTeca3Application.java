package es.multitiendaMike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("es.multitiendaMike.hiberante")
public class MusiTeca3Application {

	public static void main(String[] args) {
		SpringApplication.run(MusiTeca3Application.class, args);
	}

}
