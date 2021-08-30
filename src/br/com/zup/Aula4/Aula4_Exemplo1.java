package br.com.zup.Aula4;

// Corrigindo exercício 4 da lista 2

import java.util.Scanner;

public class Aula4_Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Salários até R$ 280,00 (incluindo), receberão aumento de 20%");
        System.out.println("Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%");
        System.out.println("Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%");
        System.out.println("Salários de R$ 1500,00 em diante, receberão aumento de 5% ");

        System.out.println("Por favor, digite o seu salário: ");

        double salarioAtual = leitor.nextDouble();
        double percentualDeAumento = 0;
        double valorDoAumento = 0;
        double novoSalario;

        if (salarioAtual > 0) {

            if (salarioAtual <= 280) {
                //System.out.println("Você recebeu um aumento de 20% ");
                percentualDeAumento = 0.2;
            } else if (salarioAtual > 280 & salarioAtual <= 700) {
                // System.out.println("Você recebeu um aumento de 15%");
                percentualDeAumento = 0.15;
            } else if (salarioAtual > 700 & salarioAtual <= 1500) {
                // System.out.println("Você recebeu um aumento de 10%");
                percentualDeAumento = 0.1;
            } else {
                //  System.out.println("Você recebeu um aumento de 5%");
                percentualDeAumento = 0.05;
            }

            valorDoAumento = salarioAtual * percentualDeAumento;
            novoSalario = salarioAtual + valorDoAumento;

            double valorEmPorcentagemDoAumento = (percentualDeAumento * 100);
            System.out.println("O salário atual da pessoa é: R$ " + salarioAtual);
            System.out.println("Você receberá " + valorEmPorcentagemDoAumento + "% de aumento");
            System.out.println("O valor do seu aumento será: R$ " + valorDoAumento);
            System.out.println("O seu novo salário será: R$ " + novoSalario);

        } else {
            System.out.println("Digite um salário maior que 0. ");
        }

    }
}
