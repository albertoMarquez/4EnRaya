package tp.pr3.control;

import tp.pr3.logica.Ficha;
import tp.pr3.logica.Movimiento;
import tp.pr3.logica.Tablero;

public interface Jugador {

	public Movimiento getMovimiento(Tablero tab, Ficha color);
}
