package Orden;

import java.util.Comparator;

import ejercicio2.Elemento;

public class CondicionOrdenNombre implements Comparator<Elemento> {

	//OJO CON RESTARLOS. FECHA, STRING SE USA COMPARETO();
	@Override
	public int compare(Elemento o1, Elemento o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}

