package com.orange.modelo;

import com.orange.modelo.interfacee.IVehiculo;

/***
 * 
 * @descrp En la clase auto se va a implementar la interfaz de 
 * IVehiculo para esto se debe escribir la palabra reservada implements
 *
 */
 public class Auto implements IVehiculo {

	@Override
	public void crearVehiculo() {
		System.out.println("Creo un auto");
		
	}

	@Override
	public void crearVehiculo(String tipo) {
		System.out.println("Creo un auto de tipo "+ tipo);
		
	}

	@Override
	public IVehiculo[] crearVehiculos() {
		IVehiculo[] vList = new Auto[10];
  		return new Auto[5];
	}
	
}
