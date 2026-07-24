package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Vehiculo v;
		
		v = new Vehiculo();
		
		System.out.println("Vehiculo 1: Creado");
		
		
		System.out.println("Año:" + v.año);
		System.out.println("Marca:" + v.marca);
		System.out.println("Modelo:" + v.modelo);
		
		System.out.println("=========Vehiculo 1: Valores asignados=====");
		v.año = "2012";
		v.marca = "Chevrolet";
		v.modelo ="Nuevo";
		
		System.out.println("Año:" + v.año);
		System.out.println("Marca:" + v.marca);
		System.out.println("Modelo:" + v.modelo);
		
		

	}

}
