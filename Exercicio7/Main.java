package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean fechar = false;
        while (!fechar) {
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Atualizar Produto");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Gerar Relatório de Estoque");
            System.out.println("5 - Fechar");
            System.out.print("======================");
            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    add();
                    break;
                case 2:
                    att();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    gerar();
                    break;
                case 5:
                    fechar = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void add() {
        scanner.nextLine(); 
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 
        

        Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void att() {
        System.out.print("Digite o código do produto a ser atualizado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 

        Produto produto = buscarProduto(codigo);
        if (produto != null) {
            System.out.print("Novo nome do produto: ");
            String nome = scanner.nextLine();
            produto.thisNome(nome);
            System.out.print("Novo preço do produto: ");
            double preco = scanner.nextDouble();
            produto.thisPreco(preco);
            System.out.print("Nova quantidade em estoque: ");
            int quantidade = scanner.nextInt();
            produto.thisQntd(quantidade);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void remove() {
        System.out.print("Digite o código do produto a ser removido: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 

        Produto produto = buscarProduto(codigo);
        if (produto != null) {
            estoque.remove(produto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static Produto buscarProduto(int codigo) {
        for (Produto produto : estoque) {
            if (produto.code() == codigo) {
                return produto;
            }
        }
        return null;
    }

    private static void gerar() {
        System.out.println("RELATÓRIO DE ESTOQUE:");
        for (Produto produto : estoque) {
            System.out.println("Nome: " + produto.nome());
            System.out.println("Código: " + produto.code());
            System.out.println("Preço: " + produto.preco());
            System.out.println("Quantidade em estoque: " + produto.qntd());
            System.out.println("---------------------------");
        }
    }
}