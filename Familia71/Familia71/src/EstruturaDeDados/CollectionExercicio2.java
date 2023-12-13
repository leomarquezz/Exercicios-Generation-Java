package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExercicio2 {
	

	public static void main(String [] args) {

	Scanner leia = new Scanner(System.in);
	
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	numeros.add(2);
	numeros.add(5);
	numeros.add(1);
	numeros.add(3);
	numeros.add(4);
	numeros.add(9);
	numeros.add(7);
	numeros.add(8);
	numeros.add(10);
	numeros.add(6);
	
	System.out.println("\n Digite o número que você deseja encontrar: ");
	int n = leia.nextInt();
	
	
	int posicao = numeros.indexOf(n);
	
	if(posicao != -1) {
		System.out.printf("O numero %d está logalizado na posição %d" ,n,posicao);
	}else {
		System.out.printf("\nO numero não foi encontrado!",n);
		}
	}
	
	
}
