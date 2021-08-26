package br.com.zup;

import java.util.Scanner;

public class Aula3_Exemplo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double produto1;
        // Recebendo os valores do usuário e armazenando eles em variáveis

        System.out.println("Por favor, digite o valor do produto 1: ");
        produto1 = leitor.nextDouble();
        System.out.println("Por favor, digite o valor do produto 2: ");
        double produto2 = leitor.nextDouble();
        System.out.println("Por favor, digite o valor do produto 3: ");
        double produto3 = leitor.nextDouble();

        // Criando a estrutura de decisão

        if (produto1 < produto2 & produto1 < produto3){
            System.out.println("O produto 1 é o mais barato");
        }
        else if (produto2 < produto1 & produto2 < produto3){
            System.out.println("O produto 2 é o mais barato");
        }
        else{
            System.out.println("O produto 3 é o mais barato");
        }

    }
}
