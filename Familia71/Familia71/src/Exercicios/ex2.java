package Exercicios;

import java.util.Scanner;	

public class ex2 {
	
	
	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		
			System.out.println("\nDigite um numero: ");
			
				numero = leia.nextInt();
	
				if(numero % 2 == 0) { 
					if (numero >= 0) {
						System.out.println("\nEsse numero é par e positivo");
					}else {
						System.out.println("\nEsse numero é par e negativo");
					}
				} else {
					if (numero >= 0) {
						System.out.println("\nEsse numero é impar e positivo");
					}else {
						System.out.println("\nEsse numero é impar e negativo");
					
				}
				}
	
	
	
	
	}
	
	
	

}
