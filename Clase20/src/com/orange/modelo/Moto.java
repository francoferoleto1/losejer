package com.orange.modelo;

import com.orange.modelo.interfacee.IVehiculo;

/***
 * 
 * @desc Se va a implementar la interfaz IVehiculo
 *
 */

 public class Moto implements IVehiculo {
	 
	 private String marca;
	 private String modelo;
	 private int cc;

	public Moto() {
		// TODO Auto-generated constructor stub
	}
	
	public Moto(String marca, String modelo, int cc) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cc = cc;
	}



	@Override
	public void crearVehiculo() {
		System.out.println("Creo una moto");
		
	}

	@Override
	public void crearVehiculo(String tipo) {
		System.out.println("Creo una moto de tipo "+ tipo);
		
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", cc=" + cc + "]";
	}

	@Override
	public IVehiculo[] crearVehiculos() {
		
		return new Moto[5];
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
