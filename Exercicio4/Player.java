package Exercicio4;

public class Player {
    private String name;
    private int rank;
    private int level;

    public Player(String name, int rank, int level) {
        this.name = name;
        this.rank = rank;
        this.level = level;
    }

    public void addPoints(int points) {
        if (points > 0) {
            rank = rank + points;
            System.out.println("voce adicionou os pontos");
        } else {
            System.out.println("Número inválido de pontos");
        }
    }

    public void removePoints(int points) {
        if (points > 0 && points <= rank) {
            rank = rank - points;
            System.out.println("Você removeu os pontos");
        } else {
            System.out.println("Número de pontos inválido ou insuficiente.");
        }
    }

    public void levelUp() {
        level++;
        System.out.println("Nível modificado para " + level);
    }

    public void displayInfo() {
        System.out.println("\nInformações:");
        System.out.println("Nome: " + name);
        System.out.println("Pontuação: " + rank);
        System.out.println("Nível: " + level);
    }
}

