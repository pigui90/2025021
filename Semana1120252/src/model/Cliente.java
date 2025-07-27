package model;

public class Cliente {
	private String nombre;
	private int cedula;
	private int edad;
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, int cedula, int edad) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getCedula() {
		return this.cedula;
	}
	
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
}
