package br.com.zup.Aula2;

// Importando o Scanner
import java.util.Scanner;

public class Aula2_Exemplo1 {
    public static void main(String[] args) {

        // Instanciando o scanner
        Scanner obj_leitor = new Scanner(System.in);

        System.out.println("Por favor, digite o valor lido na balança: ");
        // Variavel de entrada
        double pesoDosPeixes = obj_leitor.nextDouble();

        // Variaveis de processamento
        double kg_MaximoPermitido = 55;
        double valorDaMulta = 4.9;

        // Variaveis de resposta
        double kg_excedente;
        double valorDaMultaASerPaga;

        // Processando a quantidade de kg excedente e valor da multa
        kg_excedente = pesoDosPeixes - kg_MaximoPermitido;
        valorDaMultaASerPaga = kg_excedente * valorDaMulta;

        // Exibindo os valores para o usuário
        System.out.println("Kg lido na balança: " +pesoDosPeixes);
        System.out.println("O permitido pelo estado era: " +kg_MaximoPermitido + " kg");
        System.out.println("O valor atual da multa é: R$ " +valorDaMulta);
        System.out.println("O valor excendente lido na balança foi " +kg_excedente + " kg");
        System.out.println("Você terá que pagar R$ " +valorDaMultaASerPaga + " de multa");

    }
}
