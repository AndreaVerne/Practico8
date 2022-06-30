package ejercicio2;

import java.time.LocalDate;

public class Link extends Elemento {

	Elemento referencia;
	final double tamanio = 1;
	static final String prefijo = "Acceso directo a ";
	
	public Link(Elemento ref) {
		super(prefijo + ref.getNombre());
		this.referencia = ref;
	}
	
	public Elemento getReferencia() {
		return referencia;
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}

	@Override
	public double getTamanio() {
		return this.getTamanio();
	}
	
	

}
