/**
 * 
 */
package com.devpredator.practicajsf.entity;

/**
 * @author Juan Fernando Amador Miranda
 *
 */
public class Restaurante {
	private String nombre;
	private String direccion;
	private String pais;
	private Gerente gerente;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

}
