package tp.pr3;

import java.util.Scanner;

import tp.pr3.control.Controlador;
import tp.pr3.logica.Partida;
import tp.pr3.logica.ReglasConecta4;
import tp.pr3.logica.ReglasJuego;

public class Main {
	/**
	 * Metodo principal de la aplicacion.
	 * @param args - Argumentos pasados a la aplicacion. No se utilizan.
	 */
	public static void main(String[] args) {
		ReglasJuego reglas = new ReglasConecta4();
		Partida partida = new Partida(reglas);
		Scanner in = new Scanner(System.in);
		Controlador controlador = new Controlador(partida, in);
		controlador.run();
		
	}
}

