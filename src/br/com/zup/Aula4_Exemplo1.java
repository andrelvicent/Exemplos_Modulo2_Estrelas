package br.com.zup;

// Corrigindo exercício 4 da lista 2

import java.util.Scanner;

public class Aula4_Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite o seu salário: ");
        double salarioAtual = leitor.nextDouble();
        // double percentualDeAumento;
        double valorDoAumento = 0;
        double novoSalario;

        if (salarioAtual > 0 & salarioAtual <= 280){
            System.out.println("Você recebeu um aumento de 20% ");
            valorDoAumento = salarioAtual * 0.2;
        }
        else if (salarioAtual > 280 & salarioAtual <= 700){
            System.out.println("Você recebeu um aumento de 15%");
            valorDoAumento = salarioAtual * 0.15;
        }
        else if (salarioAtual > 700 & salarioAtual <= 1500){
            System.out.println("Você recebeu um aumento de 10%");
            valorDoAumento = salarioAtual * 0.1;
        }
        else if(salarioAtual > 1500){
            System.out.println("Você recebeu um aumento de 5%");
            valorDoAumento = salarioAtual * 0.05;
        }
        else{
            System.out.println("Por favor, digite um valor maior que 0");
        }

        novoSalario = salarioAtual + valorDoAumento;

        System.out.println("O salário atual da pessoa é: R$ " +salarioAtual);
        System.out.println("O valor do seu aumento será: R$ "+valorDoAumento);
        System.out.println("O seu novo salário será: R$ "+novoSalario);
    }
}
