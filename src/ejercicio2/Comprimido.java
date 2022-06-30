package ejercicio2;

import java.util.ArrayList;

import busqueda.Condicion;

public class Comprimido extends Elemento {

	ArrayList<Elemento> elems = new ArrayList<>();
	double factorCompresion;
	double tamanio;
	
	public ArrayList<Elemento> getElems() {
		ArrayList<Elemento> aux = new ArrayList<>();
		for (int i = 0; i < elems.size(); i++) {
			aux.add(elems.get(i));
		}
		return aux;
	}

	public void addElems(Elemento e) {
		if(!elems.contains(e)) {
			elems.add(e);
		}
	}

	public boolean equals(Elemento e) {
		return this.getNombre().equals(e.getNombre());
		
	}
	public double getFactorCompresion() {
		return factorCompresion;
	}

	public void setFactorCompresion(double factorCompresion) {
		this.factorCompresion = factorCompresion;
	}


	public Comprimido(String nombre, double compres) {
		super(nombre);
		this.factorCompresion = compres;
		this.elems = new ArrayList<>();
	}


	@Override
	public double getTamanio() {
		double suma = 0.0;
		for (int i = 0; i < elems.size(); i++) {
			suma += elems.get(i).getTamanio();
		}
		return suma/this.factorCompresion;
	}

	@Override
	public ArrayList<Elemento> buscar(Condicion c) {
		ArrayList<Elemento> result = new ArrayList<>();
		for (int i = 0; i < elems.size(); i++) {
			if(c.cumple(elems.get(i))) {
				result.add(this);
			}
		}
		return result;
	}

	
}
