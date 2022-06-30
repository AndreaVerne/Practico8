package ejercicio2;

import java.time.LocalDate;

public abstract class Elemento {
	String nombre;
	//VER PORQUE ESTAN EN TOODOS PERO SE CALCULAN DISTINTO
	final LocalDate fechaCreacion;
	
	//VER SI ESTOS METODOS VAN
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	//CONSTRUCTOR
	public Elemento(String nombre) {
		this.nombre = nombre;
		this.fechaCreacion = LocalDate.now();
	}
	
	public abstract double getTamanio();	
	
}
