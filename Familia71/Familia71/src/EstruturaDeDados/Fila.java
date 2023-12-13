package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        int option;

        do{
            System.out.println("********************************************************");
            System.out.println("\t\t\t1 - Adicionar o Cliente na Fila");
            System.out.println("\t\t\t2 - Listar todos os Clientes");
            System.out.println("\t\t\t3 - Retirar Cliente da Fila");
            System.out.println("\t\t\t0 - Sair");
            System.out.println("********************************************************");
            option = input.nextInt();

            switch (option) {
                case 1:
                    input.nextLine();
                    System.out.println("Digite o nome: ");
                    fila.add(input.nextLine());
                    System.out.println("Fila:\n");
                    for(String cliente:fila) {
                        System.out.println(cliente);
                    }
                    System.out.println("\nCliente adicionado à fila com sucesso!");
                    break;
                case 2:
                    if(fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Lista de Clientes na Fila:\n");
                        for(String cliente:fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if(fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        fila.remove();
                        System.out.println("Fila:\n");
                        for(String cliente:fila) {
                            System.out.println(cliente);
                        }
                        System.out.println("\nO Cliente foi chamado!");
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.printf("Opção inválida!");
            }

        }while (option != 0);

    }

}