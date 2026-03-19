/* HERANÇA E POLIMORFISMO.
1-Encapsulamento
2-Herança
3-Polimorfismo
*/

package entidades;

// EXTENDS : Informa que a classe filha(Peixe) está herdando os atributos(nome, idade, peso) da classe pai(Animal)
public class Peixe extends Animal {
    private String especie;

    // CONSTRUTOR
    public Peixe(String nome, int idade, double peso, String especie) {
        // SUPER: uma extensão da classe pai(Animal)
        super(nome, idade, peso);
        this.especie = especie;
    }

    public Peixe(String nome, String especie) {
        super(nome);
        this.especie = especie;
    }

    // GETTERS E SETTERS
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return  "Peixe | Espécie: " + especie +  super.toString() + " | ";
    }
}
