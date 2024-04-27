package Exercicio8;

import java.util.ArrayList;

public class Pedido {
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private Pizza pizza;
    private String tamanho;
    private String endereco;
    private double valor;

    public Pedido(Pizza pizza, String tamanho, String endereco) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.endereco = endereco;
        this.valor = pizza.getValor(); 
    }


    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

   
    public static void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public static void cancelarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public static void gerarRelatorio() {
        System.out.println("RELATÓRIO DE PEDIDOS:");
        System.out.println("Número total de pedidos realizados: " + pedidos.size());
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.getValor();
        }
        System.out.println("Média de preço dos pedidos: " + (total / pedidos.size()));
    }
}
