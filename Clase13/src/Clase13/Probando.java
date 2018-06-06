package Clase13;

import java.util.Scanner;

public class Probando {

	public static void main(String[] args) {

		// int cantidad = 10;
		// int[] ramon = new int[cantidad];
		//
		// for (int i = 0; i < ramon.length; i++) {
		// ramon[i] = (int) (Math.random() * 100);
		// }
		// System.out.println("Ahora imprimo el vector");
		// for (int i = 0; i < ramon.length; i++) {
		// System.out.print(ramon[i] + " ");
		// }
		// System.out.println();
		//
		// System.out.println("Ahora agrando el vector agregandole 2 espacios");
		// cantidad = 12;
		//
		// System.out.println("Ahora imprimo el tamaño del vector ramon");
		// System.out.println(ramon.length);
		// // ahora cargo los valores posicion 11 y 12
		// ramon[10] = 99;
		// ramon[11] = 99;

		int tamanio = 0;
		int number;
		int condition = 0;
		int[] oldArray = new int[tamanio];
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		do {
			condition = 1;
			if (tamanio >= 0) {
				int[] newArray = new int[(tamanio + 1)];
				System.arraycopy(oldArray, 0, newArray, 0, tamanio);
				oldArray = newArray;
				System.out.println("El tamaño de oldArray es: " + oldArray.length);
			}

			System.out.println("Ingrese un valor para number: ");
			number = input.nextInt();

			oldArray[tamanio] = number;
			tamanio++;
			System.out.println("El tamaño de oldArray es: " + oldArray.length);
			System.out.print("Ahora imprimo todos los valores del vector oldArray: ");
			for (int i = 0; i < oldArray.length; i++) {
				System.out.print(oldArray[i] + " ");
			}
			System.out.println();
			System.out.println("¿Desea continuar?");
			condition = input2.nextInt();
		} while (condition == 0);
		System.out.println("El vector termino con dimension: " + oldArray.length);
		System.out.println();
		System.out.print("Los valores del vector fueron: ");
		for (int i = 0; i < oldArray.length; i++) {
			System.out.print(oldArray[i] + " ");
		}
	}

}
