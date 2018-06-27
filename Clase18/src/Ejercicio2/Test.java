package Ejercicio2;

public class Test {

	public static void main(String[] args) {
								
		Ejecutivo Ella = new Ejecutivo("Gerente", 100000, "Lucio", 1990, Jerarquia.L2, 3000);
		System.out.println(Ella.getBonus());
		System.out.println(Ella.getJerar());
	}

}
