package br.com.zup;

import java.util.Scanner;

public class Aula2_Exemplo6 {
    public static void main(String[] args) {

        // Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

        // Lendo os valores do console
        System.out.println("Por favor digite a nota do aluno: ");
        double notaDoAluno = leitor.nextDouble();

        if (notaDoAluno >= 0 & notaDoAluno < 6){
            System.out.println("Você foi reprovado com a nota: " +notaDoAluno);
        }
        if (notaDoAluno >= 6 & notaDoAluno < 10){
            System.out.println("Você foi aprovado com a nota: " +notaDoAluno);
        }

       if(notaDoAluno == 10){
            System.out.println("Você foi aprovado com distinção");
        }

        else{
            System.out.println("Valor Invalido.");
        }

    }
}
