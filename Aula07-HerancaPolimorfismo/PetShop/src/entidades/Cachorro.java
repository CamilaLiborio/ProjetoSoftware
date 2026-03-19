/* HERANÇA E POLIMORFISMO.
1-Encapsulamento
2-Herança : Extends, super.
3-Polimorfismo
*/

package entidades;

// EXTENDS : Informa que a classe filha(Cachorro) está herdando os atributos(nome, idade, peso) da classe pai(Animal)
public class Cachorro extends Animal {
    private String raca;

    // CONSTRUTOR
    public Cachorro(String nome, int idade, double peso, String raca) {
        // SUPER: uma extensão da classe pai(Animal)
        super(nome, idade, peso);
        this.raca = raca;
    }

    public Cachorro(String raca) {
        super(raca);
        this.raca = raca;
    }

    // GETTERS E SETTERS
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    /* tem que usar o get pq a informação está em outra classe.
    return  " | " + raca + " | " + getNome() + " | " + getIdade() + " | " + getPeso() + " |";
     */
    @Override
    public String toString() {
        return  "Cachorro | Raça: " + raca +  super.toString() + " | ";
    }
}
