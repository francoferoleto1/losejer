package com.orange.modelo.interfacee;

/***
 * 
 * @Descp: 	Creacion de vehiculos
 *			La interfaz se implementa en las clases
 *			Java permite la implementacion de multiples interfaces
 *			la interfaz tiene todos sus metodos abstractos 
 * 			esto quiere decir decir que no se va a implementar
 * 			en la interfaz a no ser que trabajemos con una version de java 1.8
 * 			en cual existen los metodos default 
 */

public interface IVehiculo {
	// JDK 1.5.10 que obsoleto escribir abstract
	/***
	 * @desc creamos un vehiculo
	 */
	public void crearVehiculo();
	
	public void crearVehiculo(String tipo);
	
	public abstract IVehiculo[] crearVehiculos();
	
}
