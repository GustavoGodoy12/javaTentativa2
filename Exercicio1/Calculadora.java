package Exercicio1;


public class Calculadora {

    public double calcular(int escolha, double a, double b) {
        double resultado = 0;
        switch (escolha) {
            case 1:
                resultado = adicao(a, b);
                break;
            case 2:
                resultado = subtracao(a, b);
                break;
            case 3:
                resultado = multiplicacao(a, b);
                break;
            case 4:
                if (b != 0) {
                    resultado = divisao(a, b);
                } else {
                    System.out.println("-erro de divisão-");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("opção inexistente");
                return Double.NaN;
        }
        return resultado;
    }

    private double adicao(double num1, double num2) {
        return num1 + num2;
    }

    private double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    private double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    private double divisao(double num1, double num2) {
        return num1 / num2;
    }
}

        