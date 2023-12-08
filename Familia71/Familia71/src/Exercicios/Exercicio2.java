package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
			
		try (Scanner leia = new Scanner(System.in)) {
			int nota1, nota2, nota3, nota4, media1;
			
			
			System.out.println("\nDigite a primeira nota: ");
			nota1 = leia.nextInt();
			
			System.out.println("\nDigite a segunda nota: ");
			nota2 = leia.nextInt();
			
			System.out.println("\nDigite a terceira nota: ");
			nota3 = leia.nextInt();
			
			System.out.println("\nDigite a quarta nota: ");
			nota4 = leia.nextInt();
			
			int media = (nota1 + nota2 + nota3+ nota4/4);
			
			System.out.println("Media: " + media);
		}	
		

	}

}
