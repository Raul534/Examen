
package jcolonia.daw2023.quiniela;

import java.util.List;


/**
 * Clase que nos listara los partidos apostados
 */
public class VistaListado {

	/**
	 * Constructor 	que nos inicializara la variable
	 * @param texto que introduzca el usuario
	 */
	public VistaListado(String texto) {
		
	}
	
	/**
	 * Muestra la lista de partidos
	 * @param lista listado de partidos
	 */
	public void mostrar(List<String> lista) {
		if(lista.isEmpty()) {
			System.out.print("No hay partidos en la lista");
		}
		System.out.printf("Lista de partidos: \n");
		for (int i = 0; i < lista.size(); i ++) {
			String listaPartidos= lista.get(i);
			System.out.println(listaPartidos.toString());
	}
	}
}
