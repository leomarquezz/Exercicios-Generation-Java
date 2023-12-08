package Operadores;

import java.util.Scanner;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, y, resul;
		
		System.out.println("\nDigite i primeiro numero:");
		x = leia.nextInt();
		System.out.println("\nDigite o segundo numero:");
		y = leia.nextInt();
		
		x += y;
		
		System.out.println("\nSoma: " + x);
		
		leia.close();
		
		

	}

}