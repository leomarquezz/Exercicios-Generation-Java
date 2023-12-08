package Exercicios;

import java.util.Scanner;

public class LacosCondicionais {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int a, b, c;
		

		System.out.println("\nDigite o numero A: ");
		a = input.nextInt();
		System.out.println("\nDigite o numero B: ");
		b = input.nextInt();
		System.out.println("\nDigite o numero C: ");
		c = input.nextInt();
		
		if((a + b) > c) {
			System.out.println("\nA soma de a + b é maior que c!");
		} else if ((a+b) ==c) {
			System.out.println("\nA soma de a + b é igual a c!");
			} else {
				System.out.println("\nA soma de a + b é menor que c");
			}
		
	}
		
		
	
}
