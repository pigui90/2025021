package model;

public class Cuenta {

	private int numeroCuenta;
	private double saldo;
	private boolean tieneTarjeta;
	private Cliente cliente;
	
	public Cuenta() {
		
	}
	
	public Cuenta(int numeroCuenta, double saldo, boolean tieneTarjeta, Cliente cliente) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.tieneTarjeta = tieneTarjeta;
		this.cliente = cliente;
	}
	
	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getTieneTarjeta() {
		return this.tieneTarjeta;
	}
	
	public void setTieneTarjeta(boolean tieneTarjeta) {
		this.tieneTarjeta = tieneTarjeta;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
}

}
