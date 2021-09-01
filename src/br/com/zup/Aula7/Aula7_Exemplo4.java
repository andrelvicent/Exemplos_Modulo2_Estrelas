package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 9 - Faça um Programa que leia uma lista de 10 números e mostre-os na ordem inversa.
public class Aula7_Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int contador = 1;
        int contadorDeExibicao = 9;
        int finalDeExibicao = 0;
        int totalDeNumeros = 10;
        int valorDigitadoPeloUsuario = 0;

        while (contador <= totalDeNumeros){
            System.out.println("Digite o número "+ contador + " :");
            valorDigitadoPeloUsuario = leitor.nextInt();
            numeros.add(valorDigitadoPeloUsuario);
            contador++;
        }
        // System.out.println(numeros);
        for (int contadorInverso = 9; contadorInverso >= 0; contadorInverso--) {
            System.out.println(numeros.get(contadorInverso));
        }

    }
}
