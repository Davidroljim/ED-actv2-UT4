package unidad4;

/**
 * 
 * @author DavidRoldan
 *
 */

public class CCuenta {


	// Propiedades de la Clase Cuenta
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Este es el constructor por defecto de la clase cuenta
	 */
	
	public CCuenta() {
	}

	/**
	 * Este es el constructor sobrecargado de la clase cuenta
	 * @param nom nombre del usuario
	 * @param cue nombre de la cuenta
	 * @param sal salario de la cuenta
	 * @param tipo tipo de interés de la cuenta 
	 */
	
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInterés = tipo;
	}

	public void asignarNombre(String nom) {
		nombre = nom;
	}

	public String obtenerNombre() {
		return nombre;
	}

	public double estado() {
		return saldo;
	}

	/**
	 * Este método se utiliza para controlar errores
	 * @param cantidad cantidad de dinero a ingresar
	 * @throws Exception No se puede ingresar una cantidad negativa
	 */
	
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * Este método se utiliza para controlar errores
	 * cuando no hay suficiente saldo o la cantidad a retirar
	 * es un número negativo.
	 * @param cantidad cantidad de dinero a retirar
	 * @throws Exception Controla los errores
	 */
	
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	public String obtenerCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
}
