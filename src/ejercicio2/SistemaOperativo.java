package ejercicio2;

public class SistemaOperativo {

	public static void main(String[] args) {
		Carpeta raiz = new Carpeta("/");

		Carpeta sistemas = new Carpeta("Sistemas");

		Carpeta anio1 = new Carpeta("1er anio");
		Carpeta anio2 = new Carpeta("2do anio");
		Carpeta anio3 = new Carpeta("3er anio");
		Carpeta poo = new Carpeta("POO");

		Carpeta fotos = new Carpeta("Fotos");
		Carpeta mascotas = new Carpeta("Mascotas");
		Comprimido paisajes = new Comprimido("Paisajes", 0.5);

		raiz.addElems(sistemas);
		raiz.addElems(fotos);

		sistemas.addElems(anio1);
		sistemas.addElems(anio2);
		sistemas.addElems(anio3);
		anio3.addElems(poo);

		fotos.addElems(mascotas);
		fotos.addElems(paisajes);

		Archivo parcialPOO = new Archivo("parcial", "doc", 50.5);
		Archivo recuPOO = new Archivo("recuperatorio", "pdf", 150.5);
		Archivo prefiPOO = new Archivo("prefinal", "doc", 20.0);

		poo.addElems(parcialPOO);
		poo.addElems(recuPOO);
		poo.addElems(prefiPOO);

		Archivo correlativas = new Archivo("correlativas", "xls", 120.0);
		sistemas.addElems(correlativas);

		Archivo gatito = new Archivo("gatito", "jpg", 2000.0);
		Archivo perrito = new Archivo("perrito", "jpg", 1000.0);
		Archivo caballito = new Archivo("caballito", "jpg", 3000.0);
		mascotas.addElems(gatito);
		mascotas.addElems(perrito);
		mascotas.addElems(caballito);

		Archivo montanias = new Archivo("montanias", "png", 2000.0);
		Archivo lago = new Archivo("lago", "png", 2200.0);
		Archivo rio = new Archivo("rio", "png", 2400.0);
		Archivo bosque = new Archivo("bosque", "png", 2500.0);
		paisajes.addElems(montanias);
		paisajes.addElems(lago);
		paisajes.addElems(rio);
		paisajes.addElems(bosque);

		Carpeta calendario = new Carpeta("Calendario");
		raiz.addElems(calendario);
		Archivo junio = new Archivo("Junio", "cal", 10);
		calendario.addElems(junio);

		Link linkAPrefiPoo = new Link(prefiPOO);
		raiz.addElems(linkAPrefiPoo);

		System.out.println(raiz);

		/*
		 * System.out.println(raiz.imprimir("-"));
		 * 
		 * Elemento copiaRaiz = raiz.getCopia();
		 * System.out.println(copiaRaiz.imprimir("-"));
		 * 
		 * Condicion condRIO = new CondicionNombreContiene("rio"); Elemento
		 * copiaRestringidaRaiz = raiz.getCopiaRestringida(condRIO);
		 * System.out.println(copiaRestringidaRaiz.imprimir("-"));
		 * 
		 */
	}

}
