/**
 * 
 */
package com.krakedev;


public class TestCalculadora {
	
	public static void main(String[]args)
	//TODO Auto regenerated method stub
	
	Calculadora c1;
	//apuntador 1 llamado c1
	c1= new Calculadora ();
	//apuntador2 llamdo c2
	Calculadora c2 = new Calculadora ();
	
	int resultado ;
	resultado= c1.sumar(2, 5)
	System.out.printIn("Resultado es :"+ resultado);
	
	double resultadoSuma = c2.restar(2, 7);
	System.out.printIn("El resultado es:" +resultadoResta);
	
	//apuntador3 llamado multiplicar
	Calculadora multiplicar = new Calculadora();
	
	double resultadoM = multiplicar.multiplicar(10, 5)
	System.out.printIn("El resultado de la multiplicacion es :" + resultadoM);
	
	double resultadoD = c1.dividir(10, 2)
	System.out.printIn("El resultado de la division es:"+ resultadoD);

	
	double resultadoP = c2.promediar(10, 8, 9)
	System.out.printIn("El resultado del promedio es:" +resultadoP);
	
	c2.mostrarResultado();
}


