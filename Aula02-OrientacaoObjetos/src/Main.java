public class Main {
    public static void main(String[] args) {

        Lanche xEgg = new Lanche();
        // NomeDaClasse nomeDoObjeto = new NomeDaClass();
        xEgg.nome = "X-Egg";
        xEgg.preco = 24.90;
        xEgg.descricao = "Pão, Maionese, Ovo, Hamburguer, Queijo";

        //System.out.println("Lanche: "+ xEgg.nome + "\nPreco R$: "+ xEgg.preco+ "\nDescricao: "+ xEgg.descricao);

        // Nome -Null
        // preco - 0
        // descricao - Null


        Lanche xTudo = new Lanche();
        xTudo.nome = "X-Tudo";
        xTudo.preco = 26.90;
        xTudo.descricao = "Pão, Ovo, Hamburguer, Queijo, Tomate";

        //System.out.println("Lanche: "+ xTudo.nome + "\nPreco R$: "+ xTudo.preco+ "\nDescricao: "+ xTudo.descricao);

        xEgg.exibir();
        xTudo.exibir();

    }

}
