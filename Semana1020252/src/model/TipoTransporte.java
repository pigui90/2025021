package model;

public class TipoTransporte {

	private String descripcion;
	private int id;
	private boolean activo;
	
	public TipoTransporte() {

	}

	public TipoTransporte(String descripcion, int id, boolean activo) {
		this.descripcion = descripcion;
		this.id = id;
		this.activo = activo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
