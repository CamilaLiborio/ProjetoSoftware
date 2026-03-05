// Usados para armazenar uma coleção de elementos do mesmo tipo. Diferente de uma array que armazena diferentes valores.
// tudo no java é uma classe
public class Vetores {
    public static void main(String[] args) {
        double[] listaNumeros = new double[10];
        // double = tipo ; / [] = tamanho;

        // listaNumeros[0] = 1; : Atribuindo valores as variáveis;
        // Ele ja identifica o tipo de valor, no caso e numerico,
        // então eu não poderia colocar texto, ele vai armazenar apenas tipo double.
        listaNumeros[0] = 1;
        listaNumeros[1] = 3;
        listaNumeros[2] = 4;
        listaNumeros[3] = 5;
        listaNumeros[4] = 6;

        //Percorrer Vetores em Java
        // Metodo Tradicional - for
        // int i = 0;= inicio / i< listaNumeros.length;= condição separada / i++ = incremento
        for(int i = 0; i< listaNumeros.length; i++){
            System.out.println(listaNumeros[i]);

        }

        // forEach
        // O forEach precisa dessas 3 informações para funcionar. | tipo = double; variavel= num(nome da variavel); nome= vetor(listaNumeros);
        // num = Equivalente ao (listaNumeros[i]).
        for (double num : listaNumeros ) {
            System.out.println(num);

        }


    }

}
