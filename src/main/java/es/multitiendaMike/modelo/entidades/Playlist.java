package es.multitiendaMike.modelo.entidades;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.validation.constraints.NotNull;

@Entity
public class Playlist {
	@Id
	@GeneratedValue
	private Long id;
	
	//@NotNull
	private String nombre;
	
	private int valoracion;
	
	private List<Cancion> canciones;
	
	public Playlist() {}

	public Playlist(Long id, String nombre, int valoracion, List<Cancion> canciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valoracion = valoracion;
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

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, valoracion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Playlist other = (Playlist) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre) && valoracion == other.valoracion;
	}

	@Override
	public String toString() {
		return "Playlist [id=" + id + ", nombre=" + nombre + ", valoracion=" + valoracion + ", canciones=" + canciones
				+ "]";
	}
	
}
