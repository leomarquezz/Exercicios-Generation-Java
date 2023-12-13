package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecao1 {
	
	public static void main(String [] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		
		minhaLista.add(2);//add --> adiciona valores para o arraylist
		minhaLista.add(1);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(8);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(3);
		
		for (Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
			
		}
		
		System.out.println("\n Removendo um elemento da lista");
		System.out.println();
		minhaLista.remove(0);
	
		for (Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
			
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento é: " +primeiroElemento);
		
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++) {
			System.out.println("\n ELemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);
		
		System.out.println("\nDepois de ordenado...");
		System.out.println(minhaLista);
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		
		
		
		
	}

}
