package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exemplo2 {
    public static void main(String[] args) {

        // Instanciando o meu objeto Scanner
        Scanner dedoDuro = new Scanner(System.in);


        // Lendo os dados do usuário
        System.out.println("Por favor digite o seu nome de usuário");
        String nomeDoUsuario = dedoDuro.nextLine();
        System.out.println("Por favor digite sua idade: ");
        int idadeDoUsuario = dedoDuro.nextInt();

        System.out.println("O seu nome é: " +nomeDoUsuario);
        System.out.println("A sua idade é: "  +idadeDoUsuario);


    }
}
