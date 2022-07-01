package Orden;

import java.util.Comparator;

import ejercicio2.Elemento;

public class CondicionOrdenFecha implements Comparator<Elemento> {

	
	//OJO CON RESTARLOS. FECHA, STRING SE USA COMPARETO();
	@Override
	public int compare(Elemento o1, Elemento o2) {
		
		return o1.getFechaCreacion().compareTo(o2.getFechaCreacion());
	}

}
