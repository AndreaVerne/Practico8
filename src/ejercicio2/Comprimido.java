package ejercicio2;

import java.util.ArrayList;

import ejercicio2.busqueda.*;

public class Comprimido extends Carpeta {
	double factorCompresion;
	double tamanio;

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
		double suma = super.getTamanio();
		return suma / this.factorCompresion;
	}

	@Override
	public ArrayList<Elemento> buscar(Condicion c) {
		ArrayList<Elemento> result = new ArrayList<>();
		for (int i = 0; i < elems.size(); i++) {
			if (c.cumple(elems.get(i))) {
				result.add(this);
			}
		}
		return result;
	}

	//Utiliza el del padre porque abstraje el codigo en copia tipo
	/*
	public Elemento copia() {
		//Comprimido copia = ---> [new Comprimido(this.getNombre(), this.getFactorCompresion());] //ESTO VA EN COPIATIPO();
		//Comprimido copia = this.copiaTipo(); //quedaria algo asi
		
		//esto es del padre
		/*for (int i = 0; i < elems.size(); i++) {
			Elemento aux = elems.get(i);
			copia.addElems(aux.copia());
		}
		return copia;
		
	}*/
	
	//para abstraer el copia de carpeta y no repetir codigo
	@Override
	public Comprimido copiaTipo() {
		return new Comprimido(this.getNombre(), this.getFactorCompresion());
	}
}
