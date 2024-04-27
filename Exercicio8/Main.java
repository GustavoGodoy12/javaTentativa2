package Exercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pizza> pizzas = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pizza margherita = new Pizza("Margherita", 30.0, new ArrayList<>());
        Pizza pepperoni = new Pizza("Pepperoni", 35.0, new ArrayList<>());
        pizzas.add(margherita);
        pizzas.add(pepperoni);

        boolean sair = false;
        while (!sair) {
            System.out.println("MENU:");
            System.out.println("1 - Adicionar Pedido");
            System.out.println("2 - Cancelar Pedido");
            System.out.println("3 - Gerar Relatório de Pedidos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarPedido();
                    break;
                case 2:
                    cancelarPedido();
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void adicionarPedido() {
        System.out.println("Escolha uma pizza:");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i + 1) + " - " + pizzas.get(i).getNome() + " - R$" + pizzas.get(i).getValor());
        }
        System.out.print("Opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); 

        if (escolha > 0 && escolha <= pizzas.size()) {
            Pizza pizzaEscolhida = pizzas.get(escolha - 1);
            System.out.print("Informe o tamanho da pizza (P, M, G): ");
            String tamanho = scanner.nextLine();
            System.out.print("Informe o endereço de entrega: ");
            String endereco = scanner.nextLine();
            Pedido novoPedido = new Pedido(pizzaEscolhida, tamanho, endereco);
            pedidos.add(novoPedido);
            System.out.println("Pedido adicionado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void cancelarPedido() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos para cancelar.");
            return;
        }

        System.out.println("Escolha o pedido a ser cancelado:");
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println((i + 1) + " - " + pedidos.get(i).getPizza().getNome() + " - " + pedidos.get(i).getEndereco());
        }
        System.out.print("Opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha > 0 && escolha <= pedidos.size()) {
            pedidos.remove(escolha - 1);
            System.out.println("Pedido cancelado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void gerarRelatorio() {
        System.out.println("RELATÓRIO DE PEDIDOS:");
        for (Pedido pedido : pedidos) {
            System.out.println("Pizza: " + pedido.getPizza().getNome());
            System.out.println("Tamanho: " + pedido.getTamanho());
            System.out.println("Endereço: " + pedido.getEndereco());
            System.out.println("---------------------------");
        }
    }
}
