package org.example;


public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "maça";
        produto.preco = 1.99;
        produto.quantidade = 10;
        produto.exibirInformacoes();
        System.out.println();

        produto.atualizarPreco(2.00);
        produto.exibirInformacoes();
        System.out.println();

        produto.atualizarQuantidade(5);
        produto.exibirInformacoes();
        System.out.println();


        System.out.println();
        System.out.println();
        System.out.println("usando get e set");

        Produto produto2 = new Produto();

        produto2.setNome("banana");
        produto2.setPreco(0.50);
        produto2.setQuantidade(25);
        produto2.exibirInformacoes();

        System.out.println();

        produto2.setPreco(.95);
        produto2.exibirInformacoes();

        System.out.println();
        produto2.setQuantidade(20);
        produto2.exibirInformacoes();
        System.out.println();
        System.out.println();

    }
}
