package model;

public class Transporte {

	private String placa;
	private int tarifa;
	private int capacidad;
	private TipoTransporte tipoTransporte;
	private TipoTarifa tipoTarifa;
	
	public Transporte() {
		
	}
	
	public Transporte(String placa, int tarifa, int capacidad, TipoTransporte tipoTransporte, TipoTarifa tipoTarifa) {
		this.placa = placa;
		this.tarifa = tarifa;
		this.capacidad = capacidad;
		this.tipoTransporte = tipoTransporte;
		this.tipoTarifa = tipoTarifa;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public TipoTransporte getTipoTransporte() {
		return this.tipoTransporte;
	}
	
	public void setTipoTransporte(TipoTransporte tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public TipoTarifa getTipoTarifa() {
		return tipoTarifa;
	}

	public void setTipoTarifa(TipoTarifa tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	
	
}
