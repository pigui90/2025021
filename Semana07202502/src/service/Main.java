package service;

import java.util.Scanner;

import model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("HOLA MUNDO");
		Persona persona = new Persona();
		persona.setNombre("Sergio Campos");
		System.out.println("Favor escribir una edad");
		int edad = scan.nextInt();
		persona.setEdad(edad);
		System.out.println("La edad que ingreso es " + persona.getEdad());
		
		
		scan.close();
	}

}
