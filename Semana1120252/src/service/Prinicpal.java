package service;

import java.util.Scanner;

import model.Cliente;
import model.Cuenta;
import model.MovimientoCuenta;

public class Prinicpal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		String menu = "*****************\n* Menu del profesor\n" + "* 1. Ingresar un Cliente\n"
				+ "* 2. Ingresar una Cuenta\n" + "* 3. Ingresar un MovimientoCuenta\n* 4. Salir\n"
				+ "*****************\n" + "Digite una opcion: ";
		int opcion = 0;
		Cliente cliente = new Cliente();
		Cuenta cuenta = new Cuenta();
		MovimientoCuenta movimientoCuenta = new MovimientoCuenta();

		Cliente vectorClientes[] = new Cliente[3];
		int contadorClientes = 0;

		do {

			System.out.println(menu);
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				cliente = new Cliente();
				System.out.println("Digite el nombre del cliente");
				cliente.setNombre(scan.next());
				int edad;
				System.out.println("Digite la edad del Cliente");
				edad = scan.nextInt();
				cliente.setEdad(edad);
				System.out.println("Digite la cedula del Cliente");
				int cedula = scan.nextInt();
				cliente.setCedula(cedula);
				vectorClientes[contadorClientes] = cliente;
				contadorClientes++;
				break;
			case 2:
				System.out.println("Digite el numero de cuenta");
				cuenta.setNumeroCuenta(scan.nextInt());
				System.out.println("digite el saldo de la cuenta");
				cuenta.setSaldo(scan.nextDouble());
				System.out.println("Digite si tiene tarjeta o no (true/false)");
				cuenta.setTieneTarjeta(scan.nextBoolean());
				String lista = mostrarDatosCliente(vectorClientes);
				System.out.println("Escoja el numero del cliente");
				int indiceCliente = scan.nextInt();
				cuenta.setCliente(vectorClientes[indiceCliente]);
				System.out.println(lista);
				break;
			case 4:
				System.out.println("Saliendo del sistema");
				continuar = false;
				break;
			default:
				System.out.println("Opcion no valida");

				break;
			}

		} while (continuar);
	}

	public static String mostrarDatosCliente(Cliente[] clientes) {
		String lista = "";
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				lista = lista + " " + i + " " + clientes[i].getNombre() + "\n";
			}
		}
		return lista;
	}

}
