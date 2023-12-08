package Exercicios;

import java.util.Scanner;


	public class Exercicio6LacosCondi {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			String nome; 
			int codigo;
			double salario;
			
System.out.println("\nDigite o nome do funcionario: ");
nome = input.nextLine()	;

System.out.println("\nCargo: ");
codigo = input.nextInt();

System.out.println("\nSalario");
salario = input.nextDouble();


switch(codigo) {
case 1:
    System.out.println("Nome do funcionario: " + nome + "\nCargo: Gerente\nSalário: R$ " + String.format("%.2f", salario + (0.1 * salario)));
    break;
case 2:
    System.out.println("Nome do funcionario: " + nome + "\nCargo: Vendedor\nSalário: R$ " + String.format("%.2f",salario + (0.07 * salario)));
    break;
case 3:
    System.out.println("Nome do funcionario: " + nome + "\nCargo: Supervisor\nSalário: R$ " + String.format("%.2f",salario + (0.09 * salario)));
    break;
case 4:
    System.out.println("Nome do funcionario: " + nome + "\nCargo: Motorista\nSalário: R$ " + String.format("%.2f",salario + (0.06 * salario)));
    break;
case 5:
    System.out.println("Nome do funcionario: " + nome + "\nCargo: Estoquista\nSalário: R$ " + String.format("%.2f",salario + (0.05 * salario)));
    break;
case 6:
    System.out.println("Nome do funcionario: " + nome + "\nCargo: Técnico de TI\nSalário: R$ " + String.format("%.2f",salario + (0.08 * salario)));
    break;
default:
    System.out.println("Código inválido!");
}

		}
		
	}
