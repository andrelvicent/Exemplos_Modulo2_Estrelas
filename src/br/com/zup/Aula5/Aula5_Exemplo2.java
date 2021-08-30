package br.com.zup.Aula5;

import jdk.swing.interop.SwingInterOpUtils;

public class Aula5_Exemplo2 {
    public static void main(String[] args) {

        // Contador Incrementando
        System.out.println("Contando de 0 a 100");
        int contador;
        for (contador = 0; contador <= 100; contador++){
            System.out.println(contador);
        }

        System.out.println("Contando de 100 a 0");

        // Contador decrementando
        for (contador = 100; contador >= 0; contador--){
            System.out.println(contador);
        }

    }
}
