package ejercicio2;

import java.util.ArrayList;

import ejercicio2.busqueda.*;

public class Archivo extends Elemento {

	double tamanio;
	String extension;
	
	public Archivo(String nombre, String extension, double tamanio) {
		super(nombre);
		this.tamanio = tamanio;
		this.extension = extension;
	}
	
	public String getExtension() {
		return this.extension;
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
	
	//copia COMPLETA
	public Elemento copia() {
		Elemento copia = new Archivo(this.getNombre(), this.getExtension(), this.getTamanio());
		
		return copia;
		
	}
	
	//copia restringida donde copio el elemento y respeta la estructura (si un hijo cumple se copia la carpeta tambien)
	public Elemento copiaRestringida(Condicion c) {
		if(c.cumple(this)) {
			return this.copia();
		}
		else{
			return null;
		}
	}

	
}
