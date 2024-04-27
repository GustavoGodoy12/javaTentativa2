package Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro meuCarro = obterDetalhesCarro(scanner);
        interagirComCarro(scanner, meuCarro);
        exibirInformacoesCarro(meuCarro);
    }

    public static Carro obterDetalhesCarro(Scanner scanner) {
        System.out.print("Marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano do carro: ");
        int ano = Integer.parseInt(scanner.nextLine());

        return new Carro(marca, modelo, ano);
    }

    public static void interagirComCarro(Scanner scanner, Carro carro) {
        System.out.print("Digite o valor de aceleração por km/h ");
        double acelerar = Double.parseDouble(scanner.nextLine());
        carro.acelerar(acelerar);

        System.out.print("Digite o valor de frenagem por km/h ");
        double freio = Double.parseDouble(scanner.nextLine());
        carro.frear(freio);
    }

    public static void exibirInformacoesCarro(Carro carro) {
        carro.mostrarInformacoes();
    }
}

    
