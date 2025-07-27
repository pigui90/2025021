package model;

public class MovimientoCuenta {

	private double monto;
	private String origen;
	private boolean ingreso;
	private Cuenta cuenta;

	public MovimientoCuenta() {

	}

	public MovimientoCuenta(double monto, String origen, boolean ingreso, Cuenta cuenta) {
		this.monto = monto;
		this.origen = origen;
		this.ingreso = ingreso;
		this.cuenta = cuenta;
	}

	public double getMonto() {
		return this.monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getOrigen() {
		return this.origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public boolean getIngreso() {
		return this.ingreso;
	}
	
	public void setIngreso(boolean ingreso) {
		this.ingreso = ingreso;
	}
	
	public Cuenta getCuenta() {
		return this.cuenta;
	}
	
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}
