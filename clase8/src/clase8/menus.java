package clase8;

import java.util.Scanner;

public class menus {
	public static void main(String[] args) {

		ejecutarMenu();

		System.out.println("GRACIAS");

	}// aca termina el método main

	public static void ejecutarMenu() {

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		int num1, num2, option;
		boolean flag = true;
		boolean flag2 = false;
		String orden;

		int[] vec = new int[10];
		int[] vec2 = { 0, 1, 2, 3 };

		do {
			do {
				System.out.println("Ingrese la opción deseada:");
				System.out.println("1) Sumar");
				System.out.println("2) Restar");
				System.out.println("3) Multiplicar");
				System.out.println("4) Dividir");

				option = sc3.nextInt();

				if (option < 1 || option > 4) {
					System.err.println("Error, opción no válida.");
					flag2 = true;
				} else {
					flag2 = false;
				}

			} while (flag2);

			System.out.print("Ingrese el primer numero: ");
			num1 = sc.nextInt();

			System.out.print("Ingrese el segundo numero: ");
			num2 = sc2.nextInt();

			switch (option) {
			case 1:
				System.out.println("La suma dio: " + (num1 + num2));
				break;
			case 2:
				System.out.println("La resta dio: " + (num1 - num2));
				break;
			case 3:
				System.out.println("La multiplicación dio: " + (num1 * num2));
				break;
			case 4:
				System.out.println("La división dio: " + (num1 / num2));
				break;
			default:
				System.err.println("Error, opción no válida.");
				break;
			}// termino el switch

			System.out.println("¿Desea realizar otra operación? SI/NO");
			orden = sc4.nextLine();
			if (orden.equalsIgnoreCase("si")) {
				flag = true;
			} else {
				flag = false;
			}

		} while (flag);

	}// aca termina el método ejecutarMenu();

}// aca termina la clase menu1

// El switch evalua solamente casos completos
// default: este es un caso que se va a ejecutar cuando el dato ingresado no este+
	// + contemplado en el switch. Es opcional en la esctructura, se puede borrar
// 
//
	
	

