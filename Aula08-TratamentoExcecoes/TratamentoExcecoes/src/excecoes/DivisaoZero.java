package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Usando o try para tratamento da exceção
        try {

            System.out.println("Digite um número: ");
            int n1 = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite um número: ");
            int n2 = sc.nextInt();
            sc.nextLine();

            double resultado = n1 / n2;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Informe um valor numerico");
        }

        sc.close();
    }
}
