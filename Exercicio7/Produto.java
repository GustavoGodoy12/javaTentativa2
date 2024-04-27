package Exercicio7;

public class Produto {
  private String nome;
  private int codigo;
  private double preco;
  private int quantidade;

  public Produto(String nome, int codigo, double preco, int quantidade){
    this.nome = nome;
    this.codigo = codigo;
    this.preco = preco;
    this.quantidade = quantidade; 
  }

  public String nome(){
    return nome;
  }

  public void thisNome(String nome){
    this.nome = nome;
  }

  public int code(){
    return codigo;
  }

  public void thisCode(int codigo){
    this.codigo = codigo;
  }

  public double preco(){
    return preco;
  }

  public void thisPreco(double preco) {
    this.preco = preco;
}

public int qntd() {
  return quantidade;
}

public void thisQntd(int quantidade) {
  this.quantidade = quantidade;
}
  
}
