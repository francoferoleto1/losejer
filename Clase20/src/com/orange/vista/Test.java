package com.orange.vista;

import com.orange.controlador.FabricaVehiculoControlador;

/***
 * 
 * @desc mostraremos nuestra app por consola
 *
 */
public class Test {

	public static void main(String[] args) {
		
	FabricaVehiculoControlador fvc = new FabricaVehiculoControlador();
	fvc.creoVehiculo("moto");
	}

}
