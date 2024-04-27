package Exercicio4;

import java.util.Scanner;

public class Gerenciar {
    private Player player;

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nome do jogador: ");
        String NomePlayer = scanner.nextLine();

        System.out.print("pontuação inicial do jogador: ");
        int ScoreInicio = scanner.nextInt();

        System.out.print("nível inicial do jogador: ");
        int LevelInicio = scanner.nextInt();

        player = new Player(NomePlayer, ScoreInicio, LevelInicio);

        int opcoes;
        do {
            displayMenu();
            opcoes = scanner.nextInt();
            opcoes(opcoes);
        } while (opcoes != 5);

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("\n===============");
        System.out.println("1. Adicionar pontos");
        System.out.println("2. Remover pontos");
        System.out.println("3. Avançar de nível");
        System.out.println("4. Exibir informações do jogador");
        System.out.println("5. Sair do programa");
        System.out.print("Digite o número da opção desejada: ");
    }

    private void opcoes(int opcoes) {
        Scanner scanner = new Scanner(System.in);
        switch (opcoes) {
            case 1:
                System.out.print("Adicione pontos: ");
                int pontosParaAdicionar = scanner.nextInt();
                player.addPoints(pontosParaAdicionar);
                break;
            case 2:
                System.out.print("Remova pontos: ");
                int pontosParaRemover = scanner.nextInt();
                player.removePoints(pontosParaRemover);
                break;
            case 3:
                player.levelUp();
                break;
            case 4:
                player.displayInfo();
                break;
            case 5:
                System.out.println("Saindo!!!!!!");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

