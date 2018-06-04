package Clase10;

import java.util.Scanner;

public class Clase10 {
	
	public static void main(String[] arguments) {
			
			// no va en el metodo main
			
			// el metodo main solo va a tener un menu donde me permita elegir si quiero
			// imprimir el mas rapido
			// imprimir el mas lento
			// imprimir todos los corredores
			System.out.println(corredor.cargoTiempos(null));
			// otra clase donde se hace todo, todo lo pedido arriba
			
			
		}
		
		// esto no va a estar en el metodo main
		static void imprimirCorredores(int[] times, String[] names) {
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i] + ": " + times[i]);
			}
		}

		static void cargoCorredores(String[] names) {
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < names.length; i++) {
				System.out.println("Por favor ingrese el nombre del corredor " + (i + 1));
				names[i] = sc.nextLine();
			}
		}

		
		static void calculoElMasRapido(int[] times, String[] names) {
			// mas cosas
			int menor = times[0];
			int pos = 0;
			int aux = 0;

			for (int i = 0; i < times.length; i++) {
				if (menor >= times[i]) {
					menor = times[i];
					aux = pos;
					pos = i;
				} // estructura para calcular el más rapido
			}

			// imprimo el mas rapido
			System.out.println("El corredor " + names[pos] + " mas rapido con un tiempo de: " + times[pos]);
			System.out.println("El segundo corredor mas rapido fue " + names[aux] + " con un tiempo de: " + times[aux]);
		///////////////////////////////////////////////
		}
	}