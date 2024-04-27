package Exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("nome do titular da conta: ");
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();

        ContaBancaria minhaConta = new ContaBancaria(numeroConta, nomeTitular);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("\n==============");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir conta");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 3:
                    minhaConta.mostrarInfos();
                    break;
                case 4:
                    System.out.println("Fechando");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

