package ejercicio2;

import java.util.ArrayList;


import ejercicio2.busqueda.*;

public class Carpeta extends Elemento {

	ArrayList<Elemento> elems;
	double tamanio;
	
	public Carpeta(String nombre) {
		super(nombre);
		this.elems = new ArrayList<>();
	}
	
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
	@Override
	public double getTamanio() {
		double suma = 0;
		for (int i = 0; i < elems.size(); i++) {
			suma += (elems.get(i).getTamanio());
		}
		return suma;
	}

	@Override
	public ArrayList<Elemento> buscar(Condicion c) {
		ArrayList<Elemento> result = new ArrayList<>();
		for (int i = 0; i < elems.size(); i++) {
			result.addAll(elems.get(i).buscar(c));
		}
		return result;
	}

	//COPIA COMPLETA
	@Override
	public Elemento copia() {
		Carpeta copia = this.copiaTipo();
		for (int i = 0; i < elems.size(); i++) {
			Elemento aux = this.elems.get(i);
			copia.addElems(aux.copia());
		}
		return copia;
	}

	public Carpeta copiaTipo() {
		return new Carpeta(this.getNombre());
	}

	@Override
	public Elemento copiaRestringida(Condicion c) {
		//creo una carpeta vacia
		Carpeta copia = null;
		//creo un array para guardar los elementos que cumplen
		ArrayList<Elemento> elemsCumplen = new ArrayList<>();
		//recorro mis elementos y me fijo si cumplen
		for (int i = 0; i < this.elems.size(); i++) {
			//creo un elemento en la posicion i y le paso de nuevo el copiaRestringida
			Elemento copiaElems = this.elems.get(i).copiaRestringida(c);
			//si la copia no es nula significa que cumple entonces lo agrego al array
			if(copiaElems != null) {
				elemsCumplen.add(copiaElems);
			}
		}
		
		//CHEQUEO QUE LOS HIJOS CUMPLAN CON ESA CONDICION
		//si el array no esta vacio entonces lo agrego a la copia
		if(!elemsCumplen.isEmpty()) {
			//instancio la copia que cree nula arriba
			copia = copiaTipo();
			//agrego los hijos que cumplen con la condicion
			for (int i = 0; i < elemsCumplen.size(); i++) {
				copia.addElems(elemsCumplen.get(i));
			}
		}
		//SI LOS HIJOS NO CUMPLEN CHEQUEO QUE LA CARPETA CUMPLA CON LA CONDICION
		else {
			if(c.cumple(this)) {
				copia = copiaTipo();
			}
		}
		return null;
	}
	
}
