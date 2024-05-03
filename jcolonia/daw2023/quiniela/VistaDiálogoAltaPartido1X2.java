
package jcolonia.daw2023.quiniela;

/**
 * Clase en la que se realizarán los metodos necesarios para hacer una alta
 * correctamente
 */
public class VistaDiálogoAltaPartido1X2 {

	/**
	 * datos del partido que se van a introduxir en la lista
	 */
	ConjuntoQuiniela1X2 partido;
	/**
	 * variable de tipo ElementoPartido1X2 que nos ayudara a utilizar los métodos
	 * correspondientes
	 */
	ElementoPartido1X2 datos;
	
	/**
	 * Resultado 1-X-2 del partido.
	 */
	Resultado1X2 resultado;

	/**
	 * Constructor que nos inicializa la variable
	 * @param dlg
	 */
	public VistaDiálogoAltaPartido1X2(String dlg) {
		
	}
	
	/**
	 * Método en el que introduciremos los datos de la apuesta
	 * @return los datos
	 */
	public ElementoPartido1X2 entradaQuiniela1X2() {
		System.out.println("Elige un equipo local:\n");
		String equipoLocal=datos.getEquipoLocal();
		System.out.println("Elige un equipo visitante:\n");
		String equipoVisitante=datos.getEquipoVisitante();
		datos= new ElementoPartido1X2(equipoLocal, equipoVisitante);
		
		partido.agregarElemento(datos);
		System.out.println("datos del partido introducido\n");
		return datos;
	}

	public boolean confirmarAlta(String string) {
		boolean eleccion;
		System.out.print("Cuidado vas a borrar todo estas seguro S/N");
		eleccion = VistaGeneral.pedirConfirmación("Estas seguro de que quieres borrar todo");
		if(eleccion==true) {
			System.out.print("has escogido si");
			
		}else {
			System.out.print("has escogido no");
		}
		return eleccion;
	}

}
