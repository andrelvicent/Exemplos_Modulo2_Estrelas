package br.com.zup.Aula5;

/*
  # 2 - Um posto está vendendo combustíveis com a seguinte tabela de descontos:
  # Álcool:
  # até 20 litros, desconto de 3% por litro
  # acima de 20 litros, desconto de 5% por litro
  # Gasolina:
  # até 20 litros, desconto de 4% por litro
  # acima de 20 litros, desconto de 6% por litro
  # Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.
 */

import java.util.Scanner;

public class Aula5_Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valorTotal = 0; // O resultado em R$
        double valorDoDesconto = 0; // valor do desconto do valor total

        System.out.println("Seja bem vindo ao posto André ");
        System.out.println("Por favor, digite G para gazolina e A para Alcool");
        String tipoDeCombustivel = leitor.nextLine();
        System.out.println("Digite o valor em L do quanto voccê quer abastecer: ");
        double valorEmL = leitor.nextDouble();

        if (tipoDeCombustivel.equals("G") | tipoDeCombustivel.equals("g")) {
            valorTotal = valorEmL * 2.5; // O quanto a pessoa vai ter que pagar

            if (valorEmL <= 20 & valorEmL > 0) {
                //   System.out.println("Calcular o desconto de < 20L");
                valorDoDesconto = 0.04 * valorTotal;
            } else {
                // System.out.println("Calcular o descondo > 20L");
                valorDoDesconto = 0.06 * valorTotal;
            }
        } else if (tipoDeCombustivel.equals("A") | tipoDeCombustivel.equals("a")) {
            valorTotal = valorEmL * 1.9; // O quanto a pessoa vai ter que pagar

            if (valorEmL <= 20 & valorEmL > 0) {
                valorDoDesconto = 0.03 * valorTotal;
            } else {
                // System.out.println("Calcular o descondo > 20L");
                valorDoDesconto = 0.05 * valorTotal;
            }
        }

        // Exibindo as informações
        System.out.println("Você precisará pagar: ");
        double valorTotalComDescontos = valorTotal  - valorDoDesconto;
        System.out.print(" R$ " +valorTotalComDescontos);
    }
}
