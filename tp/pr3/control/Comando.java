package tp.pr3.control;

import tp.pr3.logica.TipoJuego;

//!! ¿Qué representa esta interfaz?
public interface Comando {
	
	/**
	 * Analiza dado un string, si coincide con este comando.
	 * @param cmd - string con el que compara.
	 */
	public boolean analiza(String cmd);
	
	/**
	 * Ejecuta el comado introducido.
	 * @param tipoJuego - Tipo de juego al que se esta jugando.
	 */
	public void ejecuta(TipoJuego tipoJuego);

}
