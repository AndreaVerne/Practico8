package ejercicio2;


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

	
}
