/*
 *PAQUETES
 *
 * 	Son directorios normales y/O comprimidos (JAR) que contienen archivos BYTECODE 
 * 	para la ejecuci�n de programas en Java
 * 
 * Pueden contener otros archivos como c�digo fuente, documentos, sonido, imagenes, video, etc.
 * 
 * 
 * Para crear y nombrar paquetes se sigue una convenci�n:
 * 
 * -Dominio del sitio web de la emprese/instituci�n a la inversa.
 * 	
 * 	Ejemplo: www.tecjerez.edu.mx
 * 		Paquete: edu.tecjerez.topicos
 * 
 * Se debe declarar al inicio del c�digo fuente, antes de las importaciones de otros paquetes
 * a traves de la palabra reservada PACKAGE
 */
package edu.tecjerez.topicos;

import javax.swing.SwingUtilities;
import edu.tecjerez.topicos.vista.VentanaInicio;
//Aplicacion que obtenga el area de un triangulo a traves de la formula de HERON, con interfaz grafica y paquetes
public class PruebaPaquetes {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});

	}

}
