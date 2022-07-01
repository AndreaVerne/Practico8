package busqueda;


import ejercicio2.Elemento;

public class CondicionPalabra extends Condicion {

	String pal;
	
	@Override
	public boolean cumple(Elemento e) {
		
		return e.getNombre().contains(pal);
	}

}
