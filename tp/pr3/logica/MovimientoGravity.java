package tp.pr3.logica;

public class MovimientoGravity extends Movimiento {
	private int fila;
	protected MovimientoGravity(int x,int y, Ficha color) {
		super(x, color);
		fila = y;
	}

	@Override
	public Ficha getJugador() {
		return color;
	}

	@Override
	public boolean ejecutaMovimiento(Tablero tab) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undo(Tablero tab) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDonde() {
		return donde;
	}
	
	public int getFila(){
		return fila;
	}
}
