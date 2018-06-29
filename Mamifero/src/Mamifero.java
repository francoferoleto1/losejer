
public abstract class Mamifero {
	
	private int cantPatas;
	
	public abstract String Hablar(String palabra);
	public abstract String Respirar();
	public abstract String Caminar();
	
	public Mamifero(int cantPatas) {
		this.cantPatas = cantPatas;
		
	}
	
	public int getCantPatas() {
			return cantPatas;
	}

	
}
