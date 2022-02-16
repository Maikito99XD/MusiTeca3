package es.multitiendaMike.hibernate;
// Generated 15 feb 2022 16:57:30 by Hibernate Tools 5.5.7.Final

/**
 * Cancion generated by hbm2java
 */
public class Cancion implements java.io.Serializable {

	private Long id;
	private String nombre;
	private String enlaceCancion;
	private int fkPlaylist;
	private int fkGenero;

	public Cancion() {
	}

	public Cancion(String nombre, String enlaceCancion, int fkPlaylist, int fkGenero) {
		this.nombre = nombre;
		this.enlaceCancion = enlaceCancion;
		this.fkPlaylist = fkPlaylist;
		this.fkGenero = fkGenero;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEnlaceCancion() {
		return this.enlaceCancion;
	}

	public void setEnlaceCancion(String enlaceCancion) {
		this.enlaceCancion = enlaceCancion;
	}

	public int getFkPlaylist() {
		return this.fkPlaylist;
	}

	public void setFkPlaylist(int fkPlaylist) {
		this.fkPlaylist = fkPlaylist;
	}

	public int getFkGenero() {
		return this.fkGenero;
	}

	public void setFkGenero(int fkGenero) {
		this.fkGenero = fkGenero;
	}

}