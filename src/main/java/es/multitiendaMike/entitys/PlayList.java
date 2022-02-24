package es.multitiendaMike.entitys;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PlayList {

	@Id
	@GeneratedValue
	private long id;

	private String nombre;
	
	private int valoracion;

	@ManyToMany
	private List<Cancion> canciones;
	
	public PlayList() {
	}

	public PlayList(String nombre, int valoracion) {
		this.nombre = nombre;
		this.valoracion = valoracion;
		this.canciones = new ArrayList<>();
	}

	
	public PlayList(long id, String nombre, int valoracion, List<Cancion> canciones) {
		this.id = id;
		this.nombre = nombre;
		this.valoracion = valoracion;
		this.canciones = canciones;
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

	public List<Cancion> getCanciones() {
		return this.canciones;
	}
	
	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayList other = (PlayList) obj;
		return id == other.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public String toString() {
		return "PlayList [id=" + id + ", nombre=" + nombre + ", valoracion=" + valoracion + "]";
	}
}
