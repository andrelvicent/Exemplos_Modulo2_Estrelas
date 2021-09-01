package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.
public class Aula7_Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List <Integer> numeros = new ArrayList<>();
        int contador = 1;
        int totalDeNumeros = 5;
        int valorDigitadoPeloUsuario = 0;

        while (contador <= totalDeNumeros){
            System.out.println("Por favor, digite o número "+contador+" :");
            valorDigitadoPeloUsuario = leitor.nextInt();

            // Verificando se o valor é maior do que 0
            if (valorDigitadoPeloUsuario >= 0 ){
                numeros.add(valorDigitadoPeloUsuario);
                contador ++;
            }else{
                System.out.println("Valor inválido");
            }
        }
        System.out.println(numeros);
    }
}
