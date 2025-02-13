package Ejec;

import java.util.List;

public class ejercicio02 {

	public static void main(String[] args) {
		
		
		int num = 20;
		
		int suma = 0;
		
		for (int i = 1; i <= num; i++) {
			suma += i;
			System.out.println(suma + " ");
		
		}
		
		System.out.println();
		
		int [] array = { 1,2,3,4,5};
		for (int i = 0; i <= array.length; i++) {
			System.out.println( i + " ");
			
		}
		
		for (int i : array) {
			System.out.println(i + " ");
		
		}
		
		System.out.println();
		
		List<String> frutas = List.of("Pera", "Mango", "Manzanas", "Fresas");
		for (String i : frutas) {
			System.out.println( i + " ");
		}
		
	}

}
