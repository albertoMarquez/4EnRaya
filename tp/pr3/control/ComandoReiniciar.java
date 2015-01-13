package tp.pr3.control;

import tp.pr3.logica.Partida;
import tp.pr3.logica.TipoJuego;

public class ComandoReiniciar implements Comando{
	private Partida partida;
	public ComandoReiniciar(Partida partida)
	{
		this.partida = partida;
	}
	@Override
	public boolean analiza(String cmd) {
		if(cmd.equalsIgnoreCase("reiniciar")) 
			return true;
		return false;
	}
	
	@Override
	public void ejecuta(TipoJuego tipoJuego) {
		//!! ¿No se pueden reiniciar partidas de Complica?
		if (tipoJuego == TipoJuego.C4)
			partida.reset(tipoJuego.reglas());
		if (tipoJuego == TipoJuego.CO)
			partida.reset(tipoJuego.reglas());

		System.out.println("Partida reiniciada.");
		
	}

}
