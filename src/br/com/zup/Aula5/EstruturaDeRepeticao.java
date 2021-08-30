package br.com.zup.Aula5;

import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 1;
        int qtdDeRepeticao = 5;
        double lendoOUsuario;
        double soma = 0;

        while (contador <= qtdDeRepeticao){

            System.out.println("Digite o número " +contador);
            lendoOUsuario = leitor.nextDouble();

            soma = soma + lendoOUsuario;
           System.out.println("SOMA DEPOIS DE LER " +contador + " NUMEROS: "+ soma);
            contador ++;

        }

        System.out.println("SOMA TOTAL: " +soma);



    }
}
