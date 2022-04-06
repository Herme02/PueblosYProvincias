package com.jacaranda.utilities;

import java.util.Objects;

public class Pueblo implements Comparable<Pueblo> {

	private String nombre;
	private String codigo;
	private Integer numeroHabitantes;
	private Double rentaPerCapita;
	private Double superficie;
	
	
public Pueblo(String nombre, String codigo, Integer numeroHabitantes, Double rentaPerCapita, Double superficie) {
	
}


public Pueblo(String nombre, String codigo) {
	
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


public void setCodigo(String codigo) {
	this.codigo = codigo;
}


public String getCodigo() {
	return codigo;
}


@Override
public int hashCode() {
	return Objects.hash(codigo, nombre, numeroHabitantes, rentaPerCapita, superficie);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pueblo other = (Pueblo) obj;
	return Objects.equals(codigo, other.codigo) && Objects.equals(nombre, other.nombre)
			&& Objects.equals(numeroHabitantes, other.numeroHabitantes)
			&& Objects.equals(rentaPerCapita, other.rentaPerCapita) && Objects.equals(superficie, other.superficie);
}


@Override
public String toString() {
	return "Pueblo [nombre=" + nombre + ", codigo=" + codigo + ", numeroHabitantes=" + numeroHabitantes
			+ ", rentaPerCapita=" + rentaPerCapita + ", superficie=" + superficie + "]";
}


@Override
public int compareTo(Pueblo arg0) {
	// TODO Auto-generated method stub
	return 0;
}




}
