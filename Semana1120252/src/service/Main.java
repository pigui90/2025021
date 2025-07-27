package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numImpar;
		int numeroImpares[] = new int[5];
		
		System.out.println("Ingrese un tamaño para el vector de pares");
		int size = scan.nextInt();
		
		int[] numeroPares = new int[size];
		
		for (int i = 0; i < numeroImpares.length; i++) {
			System.out.println("Digite un numero impar");
			numImpar = scan.nextInt();
			numeroImpares[i] = numImpar;
		}
		
		for(int i = 0; i < numeroImpares.length; i++) {
			System.out.println("El valor de la posicion " + i + " es: " + numeroImpares[i]);
		}
	}

}
