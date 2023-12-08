package Exercicios;

import java.util.Scanner;

public class ExercicioWhile {
	
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		int numero, soma=0;
		
		
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			if (numero > 0) {
				soma += numero;}
			} while(numero!=0);
			System.out.println("\nSoma dos numero positivos é: " +soma);
		
		
		
		
		}
	
	
	
	
	}
	
	
