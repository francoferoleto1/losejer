package Abstracta;

public class Taxista extends Persona {
	
	String oficio;
	int sueldo;
	
	public Taxista(String nombre, int edad, int peso, String comida, String oficio, int sueldo) {
		super(nombre, edad, peso, comida);
		this.oficio = oficio;
		this.sueldo = sueldo;
	
	
	}
	@Override
	protected String habla(String habla) {
		
		return nombre;
	}
	@Override
	protected String come(String come) {
		come = comida;
		return come;
	}
	
	
}
