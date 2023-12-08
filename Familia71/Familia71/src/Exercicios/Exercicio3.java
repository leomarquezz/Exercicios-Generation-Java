package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			float SalarioBruto, Adicional, HoraExtra, Descontos, SalarioLiquido;
			
			
			System.out.println("Digite o salario: ");
			SalarioBruto = input.nextFloat();
			
			System.out.println("Digite o adicional noturno: ");
			Adicional = input.nextFloat();
			
			System.out.println("Digite a hora extra: ");
			HoraExtra = input.nextFloat();
			
			System.out.println("Digite os descontos: ");
			Descontos = input.nextFloat();
			
			
			
			SalarioLiquido = (SalarioBruto + Adicional + (HoraExtra*5 ))- Descontos;
			
			System.out.println("SalarioLiquido: " + SalarioLiquido);
			
						
	
		}

	}
