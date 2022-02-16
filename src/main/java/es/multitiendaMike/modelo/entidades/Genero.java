package es.multitiendaMike.modelo.entidades;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.validation.constraints.NotNull;

@Entity
public class Genero {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private List<Cancion> canciones;
	

	public Genero(Long id, String nombre, List<Cancion> canciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.canciones = canciones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(canciones, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		return Objects.equals(canciones, other.canciones) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Genero [id=" + id + ", nombre=" + nombre + ", canciones=" + canciones + "]";
	}
	
	
}

