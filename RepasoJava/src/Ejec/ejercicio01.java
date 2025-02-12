package Ejec;

import java.util.Scanner;
import static java.lang.String.format;

public class ejercicio01 {
	
	//lectura de datos por teclado

	public static void main(String[] args) {
		
		var lector = new Scanner(System.in);
		
	/*	System.out.print("Nombre: ");
		var nombre = lector.nextLine();
		
		System.out.println("Nombre: " + nombre);
		
		
	System.out.println("***OPERADOR TERNARIO***");
		
		System.out.println(" que edad tienes?: ");
		var edad = lector.nextInt(); 
	
		var esMayor = (edad >= 18) ? "es mayor" : "es menor";
		System.out.println(esMayor); */
		
	System.out.println("**NOTAS**");

		System.out.print(" nota 1:  ");
		var nota1 = lector.nextDouble();
		
		System.out.print(" nota 2:  ");
		var nota2 = lector.nextDouble();
		
		System.out.print(" nota 3:  ");
		var nota3 = lector.nextDouble();
		
		var promedio = (nota1 + nota2 + nota3) / 3 ;
		
		var notas =  ( promedio >= 350) ? "aprobado" : "reprobado";
		var mensaje = format ("tiene un promedio de: %.2f y usted esta %s" , promedio , notas) ;
		System.out.println(mensaje);
	
	
	
	
	}

	
	
}
