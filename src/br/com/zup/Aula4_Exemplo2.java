package br.com.zup;

import java.util.Scanner;

public class Aula4_Exemplo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contadorDeRespostas = 0;
        // Exibir as perguntas e armazenar as repostas.
        System.out.println("Olá, sou agente do FBI");
        System.out.println("Vamos te fazer algumas perguntas. ");
        System.out.println("Responda S para sim ou N para não");

        // Fazendo a primeira pergunta
        System.out.println("Telefonou para a vítima?");
        String resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Esteve no local do crime?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Mora perto da vítima?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Devia para a vítima?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Já trabalhou com a vítima?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        switch (contadorDeRespostas) {

            case 2:
                System.out.println("Você é um Suspeito do crime.");
                break;

            case 3:
                System.out.println("Você é cúmplice do crime");
                break;

            case 4:
                System.out.println("Você é cúmplice do crime");
                break;

            case 5:
                System.out.println("Você é o assassino! Você está preso.");
                break;

            default:
                System.out.println("Você é inocente. Me perdoe o incômodo");
                break;
        }
    }
}
