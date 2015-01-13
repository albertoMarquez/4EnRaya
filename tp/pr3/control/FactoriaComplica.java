package tp.pr3.control;

import java.util.Scanner;

import tp.pr3.logica.Ficha;
import tp.pr3.logica.Movimiento;
import tp.pr3.logica.MovimientoConecta4;
import tp.pr3.logica.ReglasJuego;

public class FactoriaComplica implements FactoriaTipoJuego {

	@Override
	public ReglasJuego creaReglas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movimiento creaMovimiento(int col, int fila, Ficha color) {
		return new MovimientoConecta4(col,color);
	}

	@Override
	public Jugador creaJugadorHumanoConsola(Scanner in) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jugador creaJugadorAleatorio() {
		// TODO Auto-generated method stub
		return null;
	}

}
