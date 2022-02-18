package es.multitiendaMike.modelo.entitys;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Playlist {

	@Override
	public String toString() {
		return "Playlist [id=" + id + ", nombre=" + nombre + ", valoracion=" + valoracion + "]";
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
		return id == other.id && Objects.equals(nombre, other.nombre) && valoracion == other.valoracion;
	}

	@Id
	private long id;
	private String nombre;
	private int valoracion;

	public Playlist() {
	}

	public Playlist(long id, int valoracion) {
		this.id = id;
		this.valoracion = valoracion;
	}

	public Playlist(long id, String nombre, int valoracion) {
		this.id = id;
		this.nombre = nombre;
		this.valoracion = valoracion;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
}
