package org.example;

class Carro {
    String modelo;
    String cor;
    int ano;

    void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    public static class Main {
        public static void main(String[] args) {
            Carro carro1 = new Carro();
            carro1.modelo = "Ford";
            carro1.cor = "Branco";
            carro1.ano = 2016;

            Carro carro2 = new Carro();
            carro2.modelo = "Fiat";
            carro2.cor = "Preto";
            carro2.ano = 2010;

            carro1.exibirInfo();
            System.out.println();
            carro2.exibirInfo();
        }
    }
}
