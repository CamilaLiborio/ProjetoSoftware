/* HERANÇA E POLIMORFISMO.
1-Encapsulamento
2-Herança
3-Polimorfismo
*/

package entidades;

// EXTENDS : Informa que a classe filha(Gato) está herdando os atributos(nome, idade, peso) da classe pai(Animal)
public class Gato extends Animal {
    private String cor;

    //CONSTRUTOR
    public Gato(String nome, double peso, int idade, String cor) {
        // SUPER: uma extensão da classe pai(Animal)
        super(nome, idade, peso);
        this.cor = cor;
    }

    public Gato(String nome, String cor) {
        super(nome);
        this.cor = cor;
    }

    // GETTERS E SETTERS
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return  "Gato | Cor: " + cor +  super.toString() + " | ";
    }
}
