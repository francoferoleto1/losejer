package Examen;

import java.util.Scanner;

public class Microondas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejecutarMenu();
}

	public static void ejecutarMenu() {
		Pizza gdm = new Pizza ("mozzarella", "tomate", null, null, 5);
		Pizza dqcj = new Pizza ("mozzarella", "provolone", "tomate", "jamon", 10);
		Pizza vegeta = new Pizza ("mozzarella", "acelga", "salsa blanca", "queso rayado", 15);
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		int opcion, veces1 = 0,veces2 = 0,veces3 = 0,muzza = 0, tomate = 0, provolone = 0, jamon = 0, acelga = 0, salsa = 0, queso = 0;
		boolean flag = true;
		boolean flag2 = false;
		String orden;
		do {
			do {
				System.out.println("Ingrese la opción deseada:");
				System.out.println("1) Cocinar la Grande de Muzza");
				System.out.println("2) Cocinar la Doble queso con jamon");
				System.out.println("3) Cocinar la Vegetariana");
				
				opcion = sc3.nextInt();

				if (opcion < 1 || opcion > 3) {
					System.err.println("Error, opción no válida.");
					flag2 = true;
				} else {
					flag2 = false;
				}

			} while (flag2);

			switch (opcion) {
			case 1:
				System.out.println("La Grande de muzza fue cocinada en " + gdm.getmin() + " minutos");
				veces1++;
				muzza++;
				tomate++;
				break;
			case 2:
				System.out.println("La Doble queso con jamon fue cocinada en " + dqcj.getmin() + " minutos");
				veces2++;
				provolone++;
				muzza++;
				tomate++;
				jamon++;
				break;
			case 3:
				System.out.println("La vegetariana fue cocinada en " + vegeta.getmin() + " minutos");
				veces3++;
				muzza++;
				acelga++;
				salsa++;
				queso++;
				break;
			default:
				System.err.println("Error, opción no válida.");
				break;
			}// termino el switch

			System.out.println("¿Desea desenchufar el microondas? SI/NO");
			orden = sc4.nextLine();
			if (orden.equalsIgnoreCase("no")) {
				flag = true;
				System.out.println("");
			} else {
				flag = false;
			}

		} while (flag);
		int pizzas = (veces1+veces2+veces3);
		
		if (flag=true) {
		System.out.println("Cocinaste "+veces1+" Grades de muzza, "+veces2+" Dobles de queso con jamon, "+veces3+" Vegetarianas") ;
		System.out.println("Cocinaste en total "+ pizzas + " pizzas.");
		}
		if (flag=true) {System.out.println("Usaste estos ingredientes "+muzza+"muzzarelas"+"" );}
	
}// aca termina el método ejecutarMenu();

		
	
}// Aca termina la clase
