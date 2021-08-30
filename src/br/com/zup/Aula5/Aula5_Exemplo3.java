package br.com.zup.Aula5;

import java.util.Scanner;

// Escreva, usando while, um programa para calcular a média de N números. O valor de N é dado pelo usuário.
public class Aula5_Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double quantidadeDeNumeros;
        double soma = 0;
        double media = 0;
        int contador = 0;
        System.out.println("Por favor, digite a quantidade de números: ");
        quantidadeDeNumeros = leitor.nextDouble();

        while (contador < quantidadeDeNumeros){
            System.out.println("Digite um número: ");
            double valorLidoPeloUsuario = leitor.nextDouble();
            // Toda vez que executar o loop, nós vamos somar o valor lido a variável soma
            soma = soma + valorLidoPeloUsuario;
            contador ++;
        }
        media = soma / quantidadeDeNumeros;

        System.out.println("A média aritmética dos números é: " +media);
    }


}
