import entidades.Produto;
import entidades.GerenciarProdutos;

import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        GerenciarProdutos lista = new GerenciarProdutos();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("MENU INTERATIVO");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Alterar produto");
            System.out.println("4 - Excluir produto");
            System.out.println("5 - Sair");
            System.out.println("Digite uma opção:");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.println("Digite o nome do produto:");
                    String nome = sc.nextLine();

                    System.out.println("Digite o valor do produto:");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a quantidade do produto:");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Produto produto = new Produto(nome, preco, quantidade);
                    lista.cadastrarProduto(produto);

                }

                case "2" -> {
                    lista.listarProdutos();

                }

                case "3" -> {
                    lista.listarProdutos();
                    System.out.println("Digite o id do produto:");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a nome do produto:");
                    String nome = sc.nextLine();

                    System.out.println("Digite o preço do produto:");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a quantidade do produto:");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    lista.alterarProduto(idProduto, nome, preco, quantidade);

                }

                case "4" -> {
                    lista.listarProdutos();
                    System.out.println("Digite o id do produto:");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    lista.excluirProduto(idProduto);

                }

                case "5" -> {
                    System.out.println("Saindo do programa!");
                    return;
                }
            }
        }
    }
}

