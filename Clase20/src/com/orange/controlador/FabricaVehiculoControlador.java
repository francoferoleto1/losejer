package com.orange.controlador;

import com.orange.modelo.Auto;
import com.orange.modelo.Moto;
import com.orange.modelo.interfacee.IVehiculo;

/***
 * 
 * @desc En esta clase creamos vehiculos a partir de cierto atributo
 *
 */
public class FabricaVehiculoControlador {

	/***
	 * Patron de diseño creacion Factoria abstracta a partir de una clase abstracta
	 * o interfaz se crea una instancia del objeto que se extiende o implementa
	 * 
	 */

	public void creoVehiculo(String tipoVehiculo) {

		IVehiculo vehiculo1 = null;

		switch (tipoVehiculo.toLowerCase()) {
		case "auto":
			vehiculo1 = new Auto();
			break;
		case "moto":
			vehiculo1 = new Moto("Honda", "Buena onda", 350);
			break;
		default:
			System.out.println("Ese tipo no lo conozco");
			break;
		}
		vehiculo1.crearVehiculo();
		vehiculo1.crearVehiculo("Diegote");
		
		IVehiculo[] vList = vehiculo1.crearVehiculos();
		
		vList [0] = new Moto("Kawasaki", "Perro", 200);
		vList [1] = new Moto("Kawasaki", "Gato", 200);
		vList [2] = new Moto("Kawasaki", "Roedor", 200);
		vList [3] = new Moto("Kawasaki", "Mamifero", 200);
		vList [4] = new Moto("Kawasaki", "Elefante", 200);
		
		for (int i = 0; i < vList.length; i++) {
			System.out.println(vList[i]);
		}
		
		if (vehiculo1 instanceof Moto) {
			Moto m1 = (Moto) vehiculo1;
			System.out.println("La cilindrada es de "+ m1.getCc());
			m1.getMarca();
			m1.getModelo();
		}
		
	}
	
	
	

}
