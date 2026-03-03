package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;

    //Construtor
    public Lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = estoque > 0;

    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setDescricao(String descricao) {
        if (descricao.isBlank()) {
            System.out.println("Informe uma descrição válida:");
        } else {
            this.descricao = descricao;
            System.out.println("Descrição alterada com sucesso.");
        }
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            System.out.println("Informe um valor maior que zero!");
        } else {
            this.valor = valor;
            System.out.println("Valor alterado com sucesso!");
        }
    }

    private void verificaDisponivel() {
        this.disponivel = this.estoque > 0;

    }

    public void incrementaEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            verificaDisponivel();
            System.out.println("Estoque atualizado com sucesso!");
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public boolean decrementaEstoque(int quantidade) {
        if (quantidade <= 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            verificaDisponivel();
            return true;
        } else {
            return false;
        }
    }

    public double valorTotal(int quantidade) {
        return this.valor * quantidade;
    }

    //toString = usado para mostrar os atributos da classe
    @Override
    public String toString() {
        return "Lanche{" +
                "Nome='" + nome +
                "\n Descricao: '" + descricao +
                "\n Valor: R$" + valor +
                "\n Estoque: " + estoque +
                "\n Disponivel: " + disponivel ;
    }
}
