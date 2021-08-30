package br.com.zup.Aula2;

// Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.

import java.util.Scanner;

public class Aula2_Exemplo3 {
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner obj_leitor = new Scanner(System.in);

        // Declarar o valor de todas as variáveis
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float soma;
        float media;

        // Receber o valor das variáveis
        System.out.println("Vou calcular a média aritmética das notas para você.");
        System.out.println("Por favor, digite a nota 1: ");
        nota1 = obj_leitor.nextFloat();
        System.out.println("Por favor, digite a nota 2: ");
        nota2 = obj_leitor.nextFloat();
        System.out.println("Por favor, digite a nota 3: ");
        nota3 = obj_leitor.nextFloat();
        System.out.println("Por favor, digite a nota 4: ");
        nota4 = obj_leitor.nextFloat();

        // Processar os dados
        soma = nota1 + nota2 + nota3 + nota4;
        media = soma/4;

        // Exibir os dados
        System.out.println("A média aritmética de todas as notas é: ");
        System.out.println(media);

    }
}
