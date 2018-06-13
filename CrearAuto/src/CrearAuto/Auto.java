package CrearAuto;

public class Auto {

	private String color;
	private int precio;
	private int ruedas;
	private Motor mot;

	public Auto(String color, int precio, int ruedas, Motor motor) {
		super();
		this.color = color;
		this.precio = precio;
		this.ruedas = ruedas;
		this.mot = motor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getRuedas() {
		return ruedas;
	}

	public Motor getMot() {
		return mot;
	}

	@Override
	public String toString() {
		return "Auto [color=" + color + ", precio=" + precio + ", ruedas=" + ruedas + ", mot=" + mot + "]";
	}

}
