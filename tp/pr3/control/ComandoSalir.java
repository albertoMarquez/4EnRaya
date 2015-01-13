package tp.pr3.control;

import tp.pr3.logica.TipoJuego;

public class ComandoSalir implements Comando{

	@Override
	public boolean analiza(String cmd) {
		if(cmd.equalsIgnoreCase("salir")) 
			return true;
		return false;
	}

	@Override
	public void ejecuta(TipoJuego tipoJuego) {
		System.exit(0);
	}

}
