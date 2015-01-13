package tp.pr3.logica;

public class ReglasGravity extends ReglasJuegoAbstracta{
	private int numCols;
	private int numFilas;
	public ReglasGravity(int numCols, int numFilas)
	{
		this.numCols = numCols;
		this.numFilas = numFilas;
	}
	@Override
	public Ficha hayGanador(Movimiento ultimoMovimiento, Tablero t) {
		MovimientoGravity mov =(MovimientoGravity)ultimoMovimiento;
		int col = ultimoMovimiento.getDonde();
		int fila = mov.getFila();
		if(comprueba(col,fila,t))
			return ultimoMovimiento.getJugador();
		else return Ficha.VACIA;
	}

	@Override
	public Tablero iniciaTablero() {
		return new Tablero(numCols,numFilas);
	}

	@Override
	public Ficha jugadorInicial() {
		return Ficha.BLANCA;
	}

	@Override
	public boolean tablas(Ficha ultimoEnPoner, Tablero t) {
		for (int i = 0; i < numCols; i++) {
			for (int j = 0; j < numFilas; j++) {
				if(t.getCasilla(i, j) == Ficha.VACIA)
					return false;
			}
		}
		return false;
	}

	@Override
	public Ficha siguienteTurno(Ficha ultimoEnPoner, Tablero t) {
		return ultimoEnPoner.Contraria();
	}

}
