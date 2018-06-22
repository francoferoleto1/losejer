package Abstracta;

public abstract class Persona {
	String nombre;
	int edad;
	int peso;
	String comida;
	
	public Persona(String nombre, int edad, int peso, String comida) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.comida = comida;
	}
	
	protected abstract String habla (String habla);
	protected abstract String come (String come);	
	
	


}
