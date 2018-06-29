import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner patas = new Scanner(System.in);
		Scanner palabra = new Scanner(System.in);
		
		System.out.println("Que desea crear?");
		System.out.println("1) Una bestia asesina");
		System.out.println("2) un Batman");
		System.out.println("3) El animal de Jesuscristo");
		
		switch (sc.nextInt()) {
		case  1: 
			System.out.println("Cuantas patas va a tener la bestia asesina?");
			System.out.println("Que quiere que diga su bestia?");
			Gato macri = new Gato(patas.nextInt());
			palabra.nextLine();
			System.out.println("Creamos a una bestia asesina que dice "+ palabra +"");	
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("El perro "+doggo.hablar());
//		System.out.println("El gato "+macri.hablar());
//		System.out.println("El humano "+imbecil.hablar());
//		System.out.println(" ");
//		System.out.println("El perro "+doggo.caminar());
//		System.out.println("El gato "+macri.caminar());
//		System.out.println("El humano "+imbecil.caminar());
//		System.out.println(" ");
//		System.out.println("El perro "+doggo.respirar());
//		System.out.println("El gato "+macri.respirar());
//		System.out.println("El humano "+imbecil.respirar());
//		System.out.println(" ");
//		System.out.println("El perro "+doggo.getCantPatas());
//		System.out.println("El gato "+macri.getCantPatas());
//		System.out.println("El humano "+imbecil.getCantPatas());
	}

}
