package Examen;

public class Pizza {
	private  String ingrediente1;
	private  String ingrediente2;
	private  String ingrediente3;
	private  String ingrediente4;
	private  String ingredientes = (ingrediente1 + ingrediente2 + ingrediente3 + ingrediente4);
	private  int minutos;
	

	public Pizza(String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4,
			int minutos) {
		super();
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
		this.ingrediente4 = ingrediente4;
		this.minutos = minutos;
	}

	// Devuelve los ingredientes
	public  String getIngre() {
		return ingredientes;
	}

	public  int getmin() {
		return minutos;
	}
	
	
	
}
