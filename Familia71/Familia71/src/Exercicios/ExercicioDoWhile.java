package Exercicios;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = Input.nextInt();
			if(numero > 0) {
				soma += numero;
			}
			
		}while(numero !=0);
		
		System.out.println("A soma dos numeros positivos é: " + soma);
			
		}

	}

