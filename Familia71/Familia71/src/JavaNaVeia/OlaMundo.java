package JavaNaVeia;//estou indicando o package onde está minha class

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, y, resul;
		
		System.out.println("\nDigite i primeiro numero:");
		x = leia.nextInt();
		System.out.println("\nDigite o segundo numero:");
		y = leia.nextInt();
		
		resul = x / y;
		
		System.out.println("\nSoma: " + resul);
		
		leia.close();
		
		

	}

}
