package clase7;

import java.util.Random;

public class claseSiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Matriz es un vector (bidimensional)

		int[] v = new int[10];
		// primero cargamos el vector automaticamente
		cargovector(v);
		imprimovector(v);
	} // aca termina el metodo main

	public static void cargovector(int[] v) {

		int i = 0;

		do {
			Random aleatorio = new Random(System.currentTimeMillis());
			// Producir nuevo int aleatorio entre 0 y 99
			int intAleatorio = aleatorio.nextInt(10);
			// refrescar datos aleatorios
			// aleatorio.setSeed(System.currentTimeMillis());
			try {
				Thread.sleep(5);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			v[i] = intAleatorio;
			i++;
			System.out.print(intAleatorio + " ");
		} while (i < 10);

	}//aca termina cargovector

	public static void ordenovector(int[] v) {
		int valorMasGrande = 0;
		int valorMasChico = 0;
		int c = 1;
		for (int i = 0; i < v.length; i++) {
			if ((v[i]-v[c])<0) {
				valorMasGrande = i + 1;
				valorMasChico = v[i];
			}
			v [i]= valorMasChico;
			c++;
			for (int u = 0; i < v.length; i++) {
				
			}
				if ((v[i]-v[c])<0) {
					valorMasGrande = i + 1;
					valorMasChico = v[i];
				}
		}
			
	}//aca termina ordenovector

	public static void imprimovector(int[] v) {
		// imprimo vector
		System.out.println(" ");
		System.out.println("Mi vector esta cargando con: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}//aca termina imprimo vector

	}// aca termina el metodo main
}// aca termina la clase
