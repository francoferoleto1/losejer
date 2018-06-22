
public class Cuadrado extends Forma {
	
	String nombre;
	
	public Cuadrado(String nombre) {
		super();
		this.nombre = nombre;
		lado = 4;
		cantEsq = 4;
	}

	@Override
	protected double getPerimeter(double length) {
		return 4*length;
	}

	@Override
	protected double getArea(double length) {
		return length*length;
	}

	
}
