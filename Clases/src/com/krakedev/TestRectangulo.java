package com.krakedev;
	
public class TestRectangulo {
	public static void main (String[] args)
	//para crear unas varibales antes de crear mi apuntador
    //creo la variable con el tipo de dato (nombre de la clase)con el que voy a acceder a mi computador
	
	Rectangulo r1 = new Rectangulo();
	
	int resultadoArea;
	
	//asigno esa variable para almacenar el resulltado de calcular 
	//y hasta este punto aun no sea ha dado a imprimir nada
	
	resultadoArea= r1.calcularArea();
	//imprimio el calculo de la operacion con valores vacios
	System.out.printIn("Resultado de calcular area antes de setear atributos"+resultadoArea);
	// en este punto asigno valores
	r1.altura=2;
	r1.base=5;
	//viuuelvo a llamar la funcion/metodo con valores
	resultadoArea= r1.calcularArea();
	//aqui imprime los valores
	System.out.printIn("Resultado de calcular area antes de setear atributos"+resultadoArea);
	
	

}
