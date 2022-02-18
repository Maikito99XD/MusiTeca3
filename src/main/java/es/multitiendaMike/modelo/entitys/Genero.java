package es.multitiendaMike.modelo.entitys;

import java.util.Objects;

public class Genero {

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
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
		return id == other.id && Objects.equals(nombre, other.nombre);
	}

	private long id;
	private String nombre;

	public Genero() {
	}

	public Genero(long id) {
		this.id = id;
	}

	public Genero(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Genero [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
