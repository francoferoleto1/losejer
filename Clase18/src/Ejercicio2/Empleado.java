package Ejercicio2;

public abstract class Empleado {
	
	private static String nom;
	private static int fechaNam;
	private String cargo;
	private int sueldo;
	
	public Empleado(String cargo, int sueldo, String nom, int fecha) {
		super();
		this.cargo = cargo;
		this.sueldo = sueldo;
		this.nom = nom;
		this.fechaNam = fecha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public static String getNom() {
		return nom;
	}

	public static int getFechaNam() {
		return fechaNam;
	}
	
	
	
	
}
