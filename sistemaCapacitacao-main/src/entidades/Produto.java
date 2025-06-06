package entidades;

import javax.swing.*;

public class Produto {

    private String nome;
    private double preco;
    private int quant;

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

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Produto(String nome, double preco, int quant){

        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public double valorTotalEstoque() {

        double valorTotal = getPreco()*getQuant();
        return valorTotal;

    }

    public void adicionarProdutos(int quantMais) {

        setQuant(getQuant() + quantMais);
        mostrarInfo();
    }

    public void removerProdutos(int quantMenos) {

        setQuant(getQuant() - quantMenos);
        mostrarInfo();
    }

    public void mostrarInfo() {

        System.out.printf("Nome:" + getNome() +"\n" +
                "Preço: R$" + getPreco() + "\n" +
                "Quantidade:" + getQuant() + "\n" +
                "Valor Total: R$" +String.format("%.2f", valorTotalEstoque()));
        System.out.println();

    }
}


