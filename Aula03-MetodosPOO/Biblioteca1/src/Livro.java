public class Livro {
    String titulo;
    String autor;
    int quantidade;
    double valorLivro;

    //Construtor
    public Livro(String titulo, String autor, int quantidade, double valorLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.valorLivro = valorLivro;

    }

    //Metodo Devolver livro
    public void devolverLivro(int quantidade){
        if (quantidade > 0){
            this.quantidade += quantidade;
        } else {
            System.out.println("Informe a quantidade válida");
        }
    }

    public double valorTotal(){
        return this.valorLivro * this.quantidade;
    }


    //Metodo Empresta Livro
    public void emprestaLivro(int quantidade){
        if (quantidade > 0 && quantidade <= this.quantidade){
            this.quantidade = this.quantidade - quantidade;
            this.quantidade -= quantidade;
        } else {
            System.out.println("Informe uma quantidade válida");
        }

    }

    //Exibir as informações do livro
    public void exibirInformacoes() {
        System.out.println("Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nQuantidade: " + this.quantidade +
                "\nValor do Livro: R$ " + this.valorLivro +
                "\nValor Total: R$" + valorTotal()

        );
    }

}
