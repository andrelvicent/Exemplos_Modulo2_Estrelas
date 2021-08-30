package br.com.zup.Aula4;

import java.util.Scanner;

public class Aula4_Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tipo do combustivel ");
        String tipoDeCombustivel = leitor.nextLine();
        System.out.println("Digite a quantidade que você deseja abastecer");
        double qtd_combustivel = leitor.nextDouble();

        if (tipoDeCombustivel.equals("G") | tipoDeCombustivel.equals("g")) {
            if (qtd_combustivel > 20) {
                // Calculo do desconta acima de 20L
            } else {
                // Calculo de desconto abaixo de 20L
            }
        } else if (tipoDeCombustivel.equals("A") | tipoDeCombustivel.equals("a")) {
            if (qtd_combustivel > 20) {
                // Calculo do desconta acima de 20L
            } else {
                // Calculo de desconto abaixo de 20L
            }
        } else {
            System.out.println("Por favor, digite um tipo válido de combustivel.");
        }

    }
}
