package Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciar {
    private List<Livro> livros;

    public Gerenciar() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Scanner scanner) {
        System.out.print("Escolha o ID do livro: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Informe o nome do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Informe o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Informe o ano do livro: ");
        int ano = scanner.nextInt();

        livros.add(new Livro(id, titulo, autor, ano));
        System.out.println("Livro adicionado com sucesso");
    }

    public void exibirInfoLivro(Scanner scanner) {
        System.out.print("Digite o ID do livro que deseja exibir: ");
        int idExibir = scanner.nextInt();

        for (Livro livro : livros) {
            if (livro.getId() == idExibir) {
                System.out.println(livro.exibirInfo());
                return;
            }
        }

        System.out.println("Livro não encontrado");
    }
}

