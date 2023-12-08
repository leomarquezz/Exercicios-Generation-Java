package Exercicios;
import java.util.Scanner;	
	public class Exercicio2LacosCondi {
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int numero;
			
			String result;
			
			System.out.println("\nDigite um numero: ");
			numero = input.nextInt();
			
			if (numero % 2 == 0) {
				result = "O numero " + numero + " é par"; 
			} else {
				result = " o numero " + numero + "é impar";
			}
			
			if (numero < 0) {
				result += "\t\n e negativo";
			}else {
				result += "\t\n e positivo";
			}
			
			System.out.println(result);
			
			
			}
			
	

}
