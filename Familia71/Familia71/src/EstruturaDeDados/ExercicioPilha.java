package EstruturaDeDados;


import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        int option;

        do{
            System.out.println("********************************************************");
            System.out.println("\t\t\t1 - Adicionar Livro na pilha");
            System.out.println("\t\t\t2 - Listar todos os Livros");
            System.out.println("\t\t\t3 - Retirar Livro da pilha");
            System.out.println("\t\t\t0 - Sair");
            System.out.println("********************************************************");
            option = input.nextInt();

            switch (option) {
                case 1:
                    input.nextLine();
                    System.out.println("Digite o nome: ");
                    pilha.push(input.nextLine());
                    System.out.println("Pilha:\n");
                    for(String cliente:pilha) {
                        System.out.println(cliente);
                    }
                    System.out.println("\nLivro adicionado com sucesso");
                    break;
                case 2:
                    if(pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("Lista de Livros na Pilha:\n");
                        for(String cliente:pilha) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if(pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia");
                    } else {
                        pilha.pop();
                        System.out.println("Pilha:\n");
                        for(String cliente:pilha) {
                            System.out.println(cliente);
                        }
                        System.out.println("\nUm livro foi retirado da pilha");
                    }
                    break;
                case 0:
                    System.out.println("O programa foi finalizado");
                    break;
                default:
                    System.out.printf("Opção inválida");
            }

        }while (option != 0);
    }

}