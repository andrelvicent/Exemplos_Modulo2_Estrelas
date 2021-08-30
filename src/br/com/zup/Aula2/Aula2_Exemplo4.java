package br.com.zup.Aula2;

 // Trabalhando com estruturas de decisão

import java.util.Scanner;

public class Aula2_Exemplo4 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        System.out.println("Vamos decidir se você pode ou não comprar cerveja");
        System.out.println("Por favor, digite sua idade");

        int idadeDoUsuario = obj_leitor.nextInt();

        if (idadeDoUsuario >= 18){
            System.out.println("Você pode comprar cerveja");
        }
        else{
            System.out.println("Você é menor que 18 anos. Portanto não pode comprar cerveja.");
        }

    }
}
