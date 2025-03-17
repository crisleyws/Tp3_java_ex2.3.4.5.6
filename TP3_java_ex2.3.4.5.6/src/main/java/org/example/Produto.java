package org.example;

public class Produto {

    String nome;// Permite identificar o produto no sistema de forma clara
    double preco;// Essencial para definir o valor de venda do produto, calcular o faturamento e definir estratégias de precificação.
    int quantidade;// Fundamental para o controle de estoque

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    void atualizarPreco(double novoPreco) {
        preco = novoPreco;

    }

    void atualizarQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade;

    }

    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
