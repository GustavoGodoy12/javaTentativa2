package Exercicio5;

public class Carro {
    private String fabricante;
    private String tipo;
    private int anoFabricacao;
    private double velocidade;


    public String getFabricante() {
        return fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public Carro(String fabricante, String tipo, int anoFabricacao) {
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = 0;
    }

    public void acelerar(double velocidadeAcionada) {
        if (velocidadeAcionada > 0) {
            velocidade = velocidade +  velocidadeAcionada;
            System.out.println("O veículo está acelerando e sua velocidade atual é: " + velocidade + " km/h");
        } else {
            System.out.println("Valor inválido para aceleração.");
        }
        System.out.println("===================");
    }

    public void frear(double reducaoVelocidade) {
        if (reducaoVelocidade <= 0) {
            System.out.println("Valor inválido para frenagem.");
            return;
        }

        if (velocidade >= reducaoVelocidade) {
            velocidade -= reducaoVelocidade;
        } else {
            System.out.println("Impossível frear mais do que isso.");
        }

    }

    public void mostrarInformacoes() {
        System.out.println("===================");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Velocidade Atual: " + velocidade + " km/h");
    }
}
