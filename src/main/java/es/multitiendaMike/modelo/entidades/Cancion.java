package es.multitiendaMike.modelo.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Cancion {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private String enlaceCancion;
	
	@ManyToOne
	private Playlist playlist;
	
	private Genero genero;

	public Cancion(Long id, String nombre, String enlaceCancion, Playlist playlist, Genero genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.enlaceCancion = enlaceCancion;
		this.playlist = playlist;
		this.genero = genero;
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

	public String getEnlaceCancion() {
		return enlaceCancion;
	}

	public void setEnlaceCancion(String enlaceCancion) {
		this.enlaceCancion = enlaceCancion;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(enlaceCancion, genero, id, nombre, playlist);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Objects.equals(enlaceCancion, other.enlaceCancion) && Objects.equals(genero, other.genero)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(playlist, other.playlist);
	}

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", nombre=" + nombre + ", enlaceCancion=" + enlaceCancion + ", playlist="
				+ playlist + ", genero=" + genero + "]";
	}
	
	
}

