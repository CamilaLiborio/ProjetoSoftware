import java.util.ArrayList;

public class ListaNomes {
    public static void main() {
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Pedro");
        listaNomes.add("Maria");
        listaNomes.add("Antonio");
        listaNomes.add("Julia");
        listaNomes.add("Juanito");
        listaNomes.add("Maria");

        //Função anonima
        // Remove valores iguais a "Maria"
        listaNomes.removeIf(nome -> nome.equals("Maria"));

        //Remove a partir uma letra
        listaNomes.removeIf(nome -> nome.contains("r"));


        for(String nome : listaNomes) {
            System.out.println(nome);
        }

    }
}
