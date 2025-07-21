package service;

import java.util.Scanner;

import model.TipoTarifa;
import model.TipoTransporte;
import model.Transporte;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		TipoTarifa tipoTarifa = new TipoTarifa();
		
		System.out.println("Ingrese un id para el tipo de Tarifa");
		int id = scan.nextInt();
		System.out.println("Ingrese una descripcion para el tipo de Tarifa");
		String descripcion = scan.next();
		System.out.println("Ingrese si esta activo o no (true/false) para el tipo de Tarifa");
		boolean activo = scan.nextBoolean();
		
		tipoTarifa.setActivo(activo);
		tipoTarifa.setDescripcion(descripcion);
		tipoTarifa.setId(id);
		
		System.out.println("Ingrese un id para el tipo de Transporte");
		int identificacion = scan.nextInt();
		System.out.println("Ingrese una descripcion para el tipo de Transporte");
		String desc = scan.next();
		System.out.println("Ingrese si esta activo o no (true/false) para el tipo de transporte");
		boolean active = scan.nextBoolean();
		
		TipoTransporte tipoTransporte = new TipoTransporte(desc, identificacion, active);
		
		
		Transporte transporte = new Transporte();
		
		transporte.setTipoTarifa(tipoTarifa);
		transporte.setTipoTransporte(tipoTransporte);
		
		System.out.println("Digite la placa de su transporte");
		String placa = scan.next();
		System.out.println("Digite la tarifa de su transporte");
		int tarifa = scan.nextInt();
		System.out.println("Digite la capacidad de su transporte");
		int capacidad = scan.nextInt();
		
		transporte.setPlaca(placa);
		transporte.setCapacidad(capacidad);
		transporte.setTarifa(tarifa);
		
		
		System.out.println("El tipo de transporte es : " + transporte.getTipoTransporte().getDescripcion());
		System.out.println("El tipo de tarifa es : " + transporte.getTipoTarifa().getDescripcion());
		System.out.println("La capacidad del transporte es : " + transporte.getCapacidad());

		
		scan.close();
	}

}
