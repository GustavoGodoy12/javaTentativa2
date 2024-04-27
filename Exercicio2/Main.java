package Exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Gerenciar gerenciador = new Gerenciar();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar livro");
            System.out.println("2. Exibir informações de um livro");
            System.out.println("3. Sair do programa");

            System.out.print("\n==============");
            System.out.print("\n\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerenciador.adicionarLivro(scanner);
                    break;
                case 2:
                    gerenciador.exibirInfoLivro(scanner);
                    break;
                case 3:
                    System.out.println("Fechando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
