package excecoes;

import java.io.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoTxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        while (true) {
            System.out.println("====== SISTEMA CADASTRO ======");
            System.out.println("1 - CADASTRAR PESSOA");
            System.out.println("2 - LISTAR PESSOA");
            System.out.println("3 - SAIR DO PROGRAMA");
            System.out.println("Digite a opcao: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    try {
                        System.out.println("Digite o nome do Pessoa: ");
                        String nome = sc.next();

                        System.out.println("Digite a idade da Pessoa: ");
                        int idade = sc.nextInt();
                        sc.nextLine();

                        FileWriter write = new FileWriter("dados.txt", true);
                        write.write(nome + "," + idade + "\n");
                        write.close();
                        System.out.println("Dados cadastrados com sucesso!");

                    // IO = seria entrada e saida
                    } catch (IOException e) {
                        System.out.println("Erro ao criar o arquivo");
                        System.out.println("Detalhe: " + e.getMessage());
                    }  catch (InputMismatchException e) {
                        System.out.println("Informe um valor numerico:");
                        System.out.println("Detalhe: " + e.getMessage());
                    }
                    break;

                case "2":
                    try {
                        // BufferedReader: ele lê a linha toda
                        BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));
                        String linha;

                       System.out.println("==== LISTA DE PESSOAS ==== ");

                       while((linha = reader.readLine()) != null) {
                           System.out.println(linha);
                       }


                    } catch (FileNotFoundException e) {
                        System.out.println("arquivo não criado");
                        System.out.println("Detalhe: " + e.getMessage());
                    } catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo");
                        System.out.println("Detalhe: " + e.getMessage());
                    }
            }
        }
    }

}
