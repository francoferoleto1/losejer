package Ejercicio2;

public class Ejecutivo extends Empleado {
	
	int bonus;
	Jerarquia jerar;
	
	public Ejecutivo(String cargo, int sueldo, String nom, int fecha, Jerarquia jerar, int bonus) {
		super(cargo,sueldo,nom,fecha);
		this.jerar = jerar;
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Jerarquia getJerar() {
		return jerar;
	}

	public void setJerar(Jerarquia jerar) {
		this.jerar = jerar;
	}

}
