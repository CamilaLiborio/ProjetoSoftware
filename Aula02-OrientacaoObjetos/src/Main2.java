public class Main2 {
    public static void main(String[] args) {

        Carro parati = new Carro();
        parati.modelo = "Perua";
        parati.marca = "Volkswagen";
        parati.ano =  "1991\n";

        Carro hb20 = new Carro();
        hb20.modelo = "Fiat";
        hb20.marca = "hyundai";
        hb20.ano = "2012";

        parati.exibirCarro();
        hb20.exibirCarro();


    }
}
