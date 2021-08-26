package br.com.zup;
// Faça um programa que receba dois números e imprima o maior deles.

import java.util.Scanner;

public class Aula2_Exemplo5 {
    public static void main(String[] args) {
        // Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

        // Lendo os valores do console
        System.out.println("Por favor digite o primeiro número: ");
        double primeiroNumero = leitor.nextDouble();

        System.out.println("Por favor digite o segundo número: ");
        double segundoNumero = leitor.nextDouble();

        // Se o primeiro número for maior que o segundo, fale que ele é o maior
        if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro numero é o maior");
        }

        else if (primeiroNumero == segundoNumero){
            System.out.println("Os números são iguais");
        }
        // Se não, o segundo número é o maior
        else {
            System.out.println("O segundo número é o maior");
        }
    }
}
