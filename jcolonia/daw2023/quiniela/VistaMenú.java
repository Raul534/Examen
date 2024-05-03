/**
 * 
 */
package jcolonia.daw2023.quiniela;

import static java.lang.System.out;

/**
 * Clase que nos generará el menu con sus opciones
 */
public class VistaMenú {
	
	/**
	 * Titulo que aparecera antes del menú
	 */
	private String titulo;

	/**
	 * Texto que aparecerá como título
	 */
	private String[] TXT_MENÚ_PRINCIPAL;
	/**
	 * Constructor que nos inicializara estas variables
	 * @param titulo del programa
	 * @param TXT_MENÚ_PRINCIPAL opciones del menú
	 */
	public VistaMenú(String titulo, String[] TXT_MENÚ_PRINCIPAL) {
		this.titulo=titulo;
		this.TXT_MENÚ_PRINCIPAL=TXT_MENÚ_PRINCIPAL;
	}
	
	/**
	 * Genera una línea con guiones «-» o iguales «=» de la misma longitud que el
	 * texto facilitado. La línea resultante se puede utilizar como subrayado del
	 * texto referido.
	 * 
	 * @param texto    el texto de referencia
	 * @param realzado indicando si el carácter a utilizar será «=» (para
	 *                 <code>true</code>) o «-» (para <code>false</code>)
	 * @return el texto generado
	 */
	public static String generarLínea(String texto, boolean realzado) {
		String línea;
		String relleno = realzado ? "=" : "-";

		// A: Composición manual
		// StringBuffer línea = new StringBuffer();
		// for (int i = 0; i < texto.length(); i++) {
		// línea.append(relleno);
		// }

		// B: API Java, String...
		línea = relleno.repeat(texto.length());

		return línea;
	}
	
	/**
	 * Genera varias líneas de texto con el texto facilitado integrado dentro de un
	 * marco simulado con caracteres de texto.
	 * 
	 * @param texto el texto de referencia
	 * @return el texto generado
	 */
	public static String generarMarco(String texto) {
		StringBuffer marco = new StringBuffer();
		String líneaArribaAbajo, líneaTexto;

		// String líneaHueco;
		// líneaHueco = String.format("|%s|", " ".repeat(2 + texto.length()));

		líneaArribaAbajo = String.format("+%s+", "-".repeat(2 + texto.length()));
		líneaTexto = String.format("| %s |", texto);

		marco.append(líneaArribaAbajo);
		marco.append("\n");
		// marco.append(líneaHueco);
		// marco.append("\n");
		marco.append(líneaTexto);
		marco.append("\n");
		// marco.append(líneaHueco);
		// marco.append("\n");
		marco.append(líneaArribaAbajo);
		marco.append("\n");
		return marco.toString();
	}
	

	/**
	 * Muestra el nombre o título, con subrayado doble.
	 */
	public void mostrarTítuloPrincipal() {
		String línea = generarLínea(titulo, true);

		out.println();
		out.println(línea);
		out.println(titulo);
		out.println(línea);
	}
	
	/**
	 * Metodo que nos muestra el menú
	 */
	public void mostrarMenú() {
		for (int i = 1; i < TXT_MENÚ_PRINCIPAL.length; i++) {
			System.out.printf("%d. %s%n", i, TXT_MENÚ_PRINCIPAL[i - 1]);
		}
		System.out.printf("%d. %s%n", 0, TXT_MENÚ_PRINCIPAL[TXT_MENÚ_PRINCIPAL.length - 1]);
	}
	
	
	/**
	 * Metodo que le permitirá al usuario elegir una opción
	 * @return opcion elegida
	 */
	public int pedirOpción() {
		int opcion;
		
		System.out.print("Elige una opcion \n");
		opcion = Integer.parseInt(VistaGeneral.getScEntrada().nextLine());
		return opcion;
	}
}
