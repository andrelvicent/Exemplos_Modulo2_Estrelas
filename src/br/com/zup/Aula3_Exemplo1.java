package br.com.zup;

import java.util.Scanner;

public class Aula3_Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite o número 1: ");
        double numero1 = leitor.nextDouble();

        System.out.println("Por favor, digite o número 2: ");
        double numero2 = leitor.nextDouble();

        // Verificando se o número 1 é maior que o número 2
        if (numero1 < numero2){
            System.out.println("O número 2 é o maior");
        }
        // Verificando se os números são iguais
        else if (numero1 == numero2){
            System.out.println("Os números são iguais");
        }
        // Caso o num1 não for maior que o num2 e não forem iguais
        else{
            System.out.println("O número 1 é o maior");
        }
    }
}
