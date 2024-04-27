package Exercicio1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Utilize a calculadora");
        System.out.println("\n===================");
        System.out.println("\n1. Adicionar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.calcular(escolha, a, b);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
