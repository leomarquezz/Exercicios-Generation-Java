package Exercicios;

import java.util.Scanner;

public class ExercicioLacoRepFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero, sImpar = 0, sPar = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("\nDigite " + (i + 1) + " numero: ");

			numero = leia.nextInt();

			if (numero % 2 == 0) {
				sPar += 1;

			} else {
				sImpar += 1;

			}

		}

		System.out.println("\nTotal de numeros pares: " +sPar);
		
		System.out.println("\nTotal de numeros impares: " +sImpar);
		

		leia.close();

	}
}
