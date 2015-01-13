package tp.pr3.control;

import tp.pr3.logica.Partida;
import tp.pr3.logica.TipoJuego;

//!! Comentarios en todas las clases
public class ComandoDeshacer implements Comando{
	private Partida partida;
	
	public ComandoDeshacer(Partida partida) {
		this.partida = partida;
	}

	
	@Override
	public boolean analiza(String cmd) {
		if(cmd.equalsIgnoreCase("deshacer")) 
			return true;
		return false;
	}

	@Override
	public void ejecuta(TipoJuego tipoJuego) {
		if (!partida.undo())
			System.err.println("Imposible deshacer.");
	}

}
