package ejercicio2;

import java.util.ArrayList;

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

}