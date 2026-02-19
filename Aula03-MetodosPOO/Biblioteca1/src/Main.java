public class Main {
    public static void main(String[] args) {
        Livro harryPotter = new Livro("Harry Potter e a Pedra Filosofal",
                "J. K Rowlling", 500, 69.90
        );

        Livro senhorDosAneis = new Livro("Senhor do Aneis: A Sociedade do Anel",
                "J. R. R. Tolkien", 300, 100.00
        );

        harryPotter.emprestaLivro(20);
        senhorDosAneis.emprestaLivro(5);

        harryPotter.devolverLivro(10);
        senhorDosAneis.devolverLivro(10);

        harryPotter.exibirInformacoes();
        senhorDosAneis.exibirInformacoes();
    }
}


