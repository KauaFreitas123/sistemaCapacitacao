package aplicacao;

import entidades.Produto;
import entidades.ServidorPublico;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        //ServidorPublico isabela = new ServidorPublico();
       // isabela.setNome("Isabela");
       // isabela.setCargo("Auditor");
       // isabela.setOrgao("ANVISA");
       // isabela.setLotacao("Brasilia");
       // isabela.setEmail("isabela@gmail.");

       // isabela.calcularSalarioHorasExtras(10, 5.60);

       // System.out.println("Servidor: "+ isabela.getNome());
       // System.out.println("Horas extras: R$ "+ isabela.getHorasExtras());

        String nome;
        int quant;
        double preco;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva os seguintes dados");
        System.out.println("Nome do produto: ");
        nome = scanner.nextLine();
        System.out.println("Preço do produto: ");
        preco = scanner.nextDouble();
        System.out.println("Quantidade do produto: ");
        quant = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quant);
        System.out.println(produto.toString());;

        System.out.println("Quantos produtos você deseja adicionar? ");
        int quantMais = scanner.nextInt();
        produto.adicionarProdutos(quantMais);


        System.out.println("Quantos produtos você deseja remover? ");
        int quantMenos = scanner.nextInt();
        produto.removerProdutos(quantMenos);
        
    }
}
