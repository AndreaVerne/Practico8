package ejercicio2;

import java.util.ArrayList;

import busqueda.Condicion;

public class Archivo extends Elemento {

	double tamanio;
	String extension;
	
	public Archivo(String nombre, String extension, double tamanio) {
		super(nombre);
		this.tamanio = tamanio;
		this.extension = extension;
	}

	@Override
	public double getTamanio() {
		return this.tamanio;
	}

	@Override
	public ArrayList<Elemento> buscar(Condicion c) {
		ArrayList<Elemento> result = new ArrayList<>();
		if(c.cumple(this)) {
			result.add(this);
		}
		return result;
	}

	
}
