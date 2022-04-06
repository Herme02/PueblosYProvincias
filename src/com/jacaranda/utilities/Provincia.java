package com.jacaranda.utilities;

public class Provincia {
	private String nombre;
	private String codigo;
	private Integer numeroHabitantes;
	private Double rentaPerCapita;
	private Double superficie;
	
	
	public Provincia(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}


	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	private boolean existePueblo(String codigo) {
		return false;
	}
	
	
	public boolean addPueblo(String nombre, String codigo, Integer numeroHabitantes, Double rentaPerCapita, Double superficie) {
		return false;
	}
	
	
	public String listadoNombresPueblos() {
		return null;
	}
	
	
	public String listadoPueblos() {
		return null;
	}
	
	
	public boolean delPueblo(String codigo) {
		return false;
	}
	
	
	public Integer numPueblos() {
		return null;
	}

	public Integer getNumeroHabitantes() {
		return numeroHabitantes;
	}

	public void setNumeroHabitantes(Integer numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}


	public Double getRentaPerCapita() {
		return rentaPerCapita;
	}


	public void setRentaPerCapita(Double rentaPerCapita) {
		this.rentaPerCapita = rentaPerCapita;
	}


	public Double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}


	public String getNombre() {
		return nombre;
	}


	public String getCodigo() {
		return codigo;
	}
	
	
	@Override
	public String toString() {
		return "Provincia con nombre:" + nombre + ", codigo:" + codigo + ", numeroHabitantes:" + numeroHabitantes
				+ ", rentaPerCapita:" + rentaPerCapita + ", superficie:" + superficie;
	}


	public String getInformacionPueblo(String codigo){
		return null;
	}
}
