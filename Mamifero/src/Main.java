

public class Main {

	public static void main(String[] args) {
		Perro doggo = new Perro(); 
		Gato macri = new Gato();
		Humano imbecil = new Humano();
		
		System.out.println("El perro "+doggo.Hablar());
		System.out.println("El gato "+macri.Hablar());
		System.out.println("El humano "+imbecil.Hablar());
		System.out.println(" ");
		System.out.println("El perro "+doggo.Caminar());
		System.out.println("El gato "+macri.Caminar());
		System.out.println("El humano "+imbecil.Caminar());
		System.out.println(" ");
		System.out.println("El perro "+doggo.Respirar());
		System.out.println("El gato "+macri.Respirar());
		System.out.println("El humano "+imbecil.Respirar());
		System.out.println(" ");
		System.out.println("El perro "+doggo.CantPatas());
		System.out.println("El gato "+macri.CantPatas());
		System.out.println("El humano "+imbecil.CantPatas());
	}

}
