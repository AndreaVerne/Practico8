package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import ejercicio2.busqueda.*;

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

	@Override
	public ArrayList<Elemento> buscar(Condicion c) {
		ArrayList<Elemento> result = new ArrayList<>();
		if(c.cumple(this)) {
			result.add(this);
		}
		return result;
	}

	//COPIA COMPLETA
	@Override
	public Elemento copia() {
		Elemento copia = new Link(this.getReferencia());
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
