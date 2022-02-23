package es.multitiendaMike.entitys;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Cancion {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Genero genero;
	
	private String enlaceCancion;
	
	private String nombre;

	public Cancion() {

	}

	public Cancion(String nombre, Genero genero, String enlaceCancion) {
		this.nombre = nombre;
		this.genero = genero;
		this.enlaceCancion = enlaceCancion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getEnlaceCancion() {
		return enlaceCancion;
	}

	public void setEnlaceCancion(String enlaceCancion) {
		this.enlaceCancion = enlaceCancion;
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
		return id == other.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public String toString() {
		return "Cancion [id=" + id + ", genero=" + genero + ", enlaceCancion="
				+ enlaceCancion + ", nombre=" + nombre + "]";
	}
}
