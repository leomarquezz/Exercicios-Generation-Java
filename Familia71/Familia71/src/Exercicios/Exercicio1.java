package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		float salario, abono, novosalario;
		
				
				
			System.out.println("\nDigite o valor do salário: ");
			salario = leia.nextFloat();
			
			System.out.println("\nDigite o valor do abono: ");
			abono = leia.nextFloat();
			
			novosalario = salario + abono; 
			
			System.out.println("Novo Salario: " + novosalario);		
			
			

	}

}
