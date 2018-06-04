package Clase10;

public class corredor {
	
	
	private String[] names = new String[3];
	int[] times = new int[names.length];
	public corredor(String[] nombre, int[] tiempo) {
		nombre = names;
		tiempo = times;		
	}
	
	
	static int[] cargoTiempos(int[] tiempo) {
		for (int i = 0; i < tiempo.length; i++) {
			tiempo[i] = (int) (Math.random() * 100);
		}
		return tiempo; 
	}
	
	public int[] getTimes() {
		return times;
	}
	public void setTimes(int[] times) {
		this.times = times;
	}



























}
