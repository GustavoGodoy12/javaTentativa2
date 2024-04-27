package Exercicio6;

import java.util.ArrayList;
import java.util.List;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato novoContato) {
        contatos.add(novoContato);
    }

    public void removerContato(Contato contatoRemover) {
        contatos.remove(contatoRemover);
    }

    public Contato buscarContatoPorNome(String nomeBusca) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nomeBusca)) {
                return contato;
            }
        }
        return null;
    }

    public void exibirTodosContatos() {
        System.out.println("Lista de contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato.getNome() + ": " + contato.getTelefone());
        }
    }
}