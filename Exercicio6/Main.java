package Exercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda(); 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("\n===============");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Encontrar contato");
            System.out.println("3. Remover contato");
            System.out.println("4. Mostrar todos os contatos");
            System.out.println("5. Sair");

            System.out.println("\n===============");
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número do contato: ");
                    String telefone = scanner.nextLine();
                    agenda.adicionarContato(new Contato(nome, telefone));
                    break;
                case 2:
                    System.out.print("Digite o nome para buscar: ");
                    String nomeBusca = scanner.nextLine();
                    Contato contatoEncontrado = agenda.buscarContatoPorNome(nomeBusca);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado: " + contatoEncontrado.getNome() + " - " + contatoEncontrado.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome para remover: ");
                    String nomeRemover = scanner.nextLine();
                    Contato contatoRemover = agenda.buscarContatoPorNome(nomeRemover);
                    if (contatoRemover != null) {
                        agenda.removerContato(contatoRemover);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    agenda.exibirTodosContatos();
                    break;
                case 5:
                    System.out.println("Fechando agenda");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Digite um número de 1 a 5");
            }

        }
    }
}
