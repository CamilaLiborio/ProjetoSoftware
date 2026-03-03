import entidades.Lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lanche x_burguer = new Lanche ("X-BURGUER",
                "Pão, Hamburguer, Queijo, Maionese Verde",
                24.9, 10
        );

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("LISTA DE OPÇÕES");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - ADICIONAR NO ESTOQUE");
            System.out.println("3 - INFORMAÇÃO DO LANCHE");
            System.out.println("4- ALTERAR VALOR");
            System.out.println("5 - ALTERAR DESCRIÇÃO");
            System.out.println("6 - SAIR");
            System.out.println("DIGITE A OPÇÃO DESEJADA:");
            String opcao = sc.nextLine();

        // acões das opções escolhidas, switch seria "se"(if)
        // Getters --> acessar / Setters --> modificar ( são métodos para estar aceesando ou modificando um atributo privado
        // (opcao) seria um parametro
        switch (opcao) {
            // case --> caso(else)
            case "1":
                System.out.println("Quantos lanches você deseja:");
                int quantidade = sc.nextInt();
                sc.nextLine();

                if (x_burguer.decrementaEstoque(quantidade)) {
                        System.out.println("Você pediu " + quantidade +
                        " " + x_burguer.getNome() + " e o valor final, foi de R$ " +
                        x_burguer.valorTotal(quantidade)
                        );
                } else {
                    System.out.println("Pedido não realizado!");
                    System.out.println("Quantidade inválida");
                }
                break;

            case "2":
                System.out.println("Quantos lanches deseja:");
                int quantidadeEstoque = sc.nextInt();
                sc.nextLine();
                x_burguer.incrementaEstoque(quantidadeEstoque);
                break;
            case "3":
                System.out.println(x_burguer.toString());
                break;
            case "4":
                // Os métodos estão sempre vínculados a um objeto.
                System.out.println("O lanche" + x_burguer.getNome() +
                        " custa R$ " + x_burguer.getValor()
                );
                System.out.println("Informe o novo valor do lanche: ");
                double valor = sc.nextDouble();
                sc.nextLine();

                x_burguer.setValor(valor);
                break;
            case "5":
                System.out.println("O lanche" + x_burguer.getNome() +
                        "tem a seguinte descrição " + x_burguer.getDescricao());

                System.out.println("Informe a nova descrição:");
                String descricao = sc. nextLine();

                x_burguer.setDescricao(descricao);
                break;
            //default = seria para que o usuário digitasse apenas os case
            default:
                System.out.println("Informe uma opção válida");
                break;
        }

        }

    }

}
