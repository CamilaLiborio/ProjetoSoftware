package entidades;

import java.util.ArrayList;

public class GerenciarProdutos {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto Cadastrado com sucesso!");
    }

    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado com sucesso!");
        } else {
            System.out.println("| ID | NOME | PRECO | QUANTIDADE | VALOR EM ESTOQUE");

            for (int i = 0; i < listaProdutos.size(); i++) {
                System.out.println("|" + i +listaProdutos.get(i));
            }
        }
    }

    public void alterarProduto(int idProduto, String nome, double preco, int quantidade) {
        Produto produto = listaProdutos.get(idProduto);

        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);

        System.out.println("Produto Alterado com sucesso!");
    }

    public void excluirProduto(int idProduto) {
        listaProdutos.remove(idProduto);
        System.out.println("Produto removido com sucesso!");
    }
}
