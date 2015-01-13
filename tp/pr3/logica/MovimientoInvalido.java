package tp.pr3.logica;

public class MovimientoInvalido extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Throwable arg;
	private String msg;

	public MovimientoInvalido(){
		msg = "";
		this.arg = null;
	}
	public MovimientoInvalido(Throwable arg){
		msg = "";
		this.arg = arg;
	}
	
	public MovimientoInvalido(String msg){
		this.msg = msg;
		this.arg = null;
	}
	
	public MovimientoInvalido(String msg, Throwable arg){
		this.msg = msg;
		this.arg = arg;
	}
	
	
	
}
