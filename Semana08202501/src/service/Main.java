package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String menu = "1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3 \n4. Ejercicio 4 \n5. Ejercicio 5";
		System.out.println(menu);
		int opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Opcion 1 escogida");
			
			int numero1;
			int numero2;
			int suma;
			
			System.out.println("Digite un numero");
			numero1 = scan.nextInt();
			System.out.println("Digite otro numero");
			numero2 = scan.nextInt();
			
			suma = numero1 + numero2;
			
			System.out.println("El resultado de la suma es: " + suma);
			
			break;
		case 2:
			System.out.println("Opcion 2 escogida");
			int numeroTabla;
			System.out.println("Digite el numero de la tabla de multiplicar");
			numeroTabla = scan.nextInt();
			for(int i = 1; i <= 10; i++) {
				System.out.println("La tabla de " + numeroTabla + " * " + i + " = " + (numeroTabla * i));
			}
			break;
		case 3:
			System.out.println("Opcion 3 escogida");
			double peso;
			int edad;
			
			System.out.println("Digite su peso");
			peso = scan.nextDouble();
			System.out.println("Digite su edad");
			edad = scan.nextInt();
			System.out.println("Su peso es " + peso +" Kg y su edad es " + edad);
			break;
		case 4:
			double radio;
			double pi = 3.1416;
			double area = 0;
			System.out.println("Digite el radio, para decimales use la ,");
			radio = scan.nextDouble();
			area = radio * radio * pi;
			System.out.println("El area del circulo es: " + area);
			break;
		case 5:
			int numero3;
			System.out.println("Digite un numero");
			numero3 = scan.nextInt();
			if(numero3 > 0) {
				System.out.println("El numero es positivo");
			}else {
				if(numero3 < 0) {
					System.out.println("El numero es negativo");
				}else {
					System.out.println("Ninguno de los dos casos");
				}
			}
			break;
		default:
			System.out.println("Opcion no valida");
			break;

		}

		scan.close();
	}

}
