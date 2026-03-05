//Wrapper classe = cada tipo primitivo tem seu weapper classe. são classes que encapsulam tipos primitivos em java.

import javax.swing.*;
import java.util.ArrayList;

public class ListasArray {
    public static void main(String[] args) {
        // criando arraylist. int= Tipos Primitivos. listasNotas = nome;
        ArrayList<Integer> listaNotas = new ArrayList<>();

        //Adicionar Valores
        listaNotas.add(1);
        listaNotas.add(2);
        listaNotas.add(4);
        listaNotas.add(5);
        System.out.println(listaNotas);

        //Adicionar Valores em uma posição específica
        listaNotas.add(2, 3 );
        listaNotas.add(4, 5 );
        System.out.println(listaNotas);

        //Verificar o tamanho da lista
        System.out.println("O tamanho da lista é " + listaNotas.size());

        //Acessar um elemento da lista
        System.out.println("A segunda posição tem o valor " + listaNotas.get(1));

        //Alterar o valor da lista
        // (0 = posição, 20 =novo valor)
        listaNotas.set(0, 20);
        System.out.println(listaNotas);

        //Encontrar a posição pelo valor
        listaNotas.indexOf(20);

        //Remover um item
        listaNotas.remove(1); // Posição
        listaNotas.remove(listaNotas.indexOf(20)); // Pelo valor

        // Remover a partir de uma função lambda
        listaNotas.removeIf(e -> e < 7 );
        System.out.println(listaNotas);

        for (Integer nota : listaNotas){
            System.out.println(nota);
        }

    }
}
