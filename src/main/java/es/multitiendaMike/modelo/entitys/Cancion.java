package es.multitiendaMike.modelo.entitys;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;


//@Entity
public class Cancion {

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", genero=" + genero + ", playlist=" + playlist + ", enlaceCancion="
				+ enlaceCancion + ", nombre=" + nombre + "]";
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
				&& id == other.id && Objects.equals(nombre, other.nombre) && Objects.equals(playlist, other.playlist);
	}

	//@Id
	private long id;
	private Genero genero;
	private Playlist playlist;
	private String enlaceCancion;
	private String nombre;

	public Cancion() {
	}

	public Cancion(long id) {
		this.id = id;
	}

	public Cancion(long id, Genero genero, Playlist playlist, String enlaceCancion, String nombre) {
		this.id = id;
		this.genero = genero;
		this.playlist = playlist;
		this.enlaceCancion = enlaceCancion;
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}

	public String getEnlaceCancion() {
		return enlaceCancion;
	}

	public void setEnlaceCancion(String enlaceCancion) {
		this.enlaceCancion = enlaceCancion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
