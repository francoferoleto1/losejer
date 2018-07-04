package com.orange.modelo;

import com.orange.modelo.interfacee.IVehiculo;

public class Camion implements IVehiculo {

	@Override
	public void crearVehiculo() {
		System.out.println("Se creo un camion");
		
	}

	@Override
	public void crearVehiculo(String tipo) {
		System.out.println("Creo un camion de tipo "+ tipo);
		
	}

	@Override
	public IVehiculo[] crearVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

}
