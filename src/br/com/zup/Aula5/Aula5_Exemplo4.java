package br.com.zup.Aula5;

import java.util.Scanner;

// Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar a quantidade de números pares desses números.

public class Aula5_Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdDeNumerosPares = 0;
        int contador = 1;

        System.out.println("Digite a quantidade de números que você quer digitar: ");
        double qtdDeNumeros = leitor.nextDouble();

        while (contador <= qtdDeNumeros){

            // Lendo os valores digitados pelo usuário
            System.out.println("Digite o numero " +contador+ " :");
            double valorDigitadoPeloUsuario = leitor.nextDouble();

            // Descobrindo se o valor digitado pelo usuário é par
            if (valorDigitadoPeloUsuario % 2 == 0){
                qtdDeNumerosPares = qtdDeNumerosPares + 1;
                // qtdDeNumerosPares += 1;
            }

            contador ++;
        }

        System.out.println("A quantidade de números pares é: " +qtdDeNumerosPares);


    }
}
