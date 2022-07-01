package busqueda;

import java.time.LocalDate;

import ejercicio2.Elemento;

public class CondicionModificacionAntes extends Condicion {

LocalDate fecha;
	
	@Override
	public boolean cumple(Elemento e) {
		
		return e.getFechaCreacion().isBefore(fecha);
	}

}
