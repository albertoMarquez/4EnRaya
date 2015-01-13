package tp.pr3.control;

import java.util.Scanner;

import tp.pr3.logica.*;

public interface FactoriaTipoJuego {

	public ReglasJuego creaReglas();
	
	public Movimiento creaMovimiento(int col, int fila, Ficha color);
	
	public Jugador creaJugadorHumanoConsola(Scanner in);
	
	public Jugador creaJugadorAleatorio();
}
