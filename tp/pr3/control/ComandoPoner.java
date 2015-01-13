package tp.pr3.control;

import java.util.Scanner;

import tp.pr3.logica.Movimiento;
import tp.pr3.logica.MovimientoComplica;
import tp.pr3.logica.MovimientoConecta4;
import tp.pr3.logica.Partida;
import tp.pr3.logica.TipoJuego;

public class ComandoPoner implements Comando {
	private Partida partida;
	private Scanner in;
	private Movimiento mov;

	
	public ComandoPoner(Partida partida, Scanner in) {
		this.partida = partida;
		this.in = in;
	}

	@Override
	public boolean analiza(String cmd) {
		if(cmd.equalsIgnoreCase("poner")) 
			return true;
		return false;
	}

	@Override
	public void ejecuta(TipoJuego tipoJuego) {
		int i = 0;
		System.out.print("Introduce la columna: ");
		if (in.hasNextInt()) {
			i = in.nextInt();
			in.nextLine();
			if (tipoJuego == TipoJuego.C4)
				mov = new MovimientoConecta4(i, partida.getTurno());
			else
				mov = new MovimientoComplica(i, partida.getTurno());

			if (!partida.ejecutaMovimiento(mov)){
				System.err.println("Movimiento incorrecto");
			}
		}
	}
}
	

