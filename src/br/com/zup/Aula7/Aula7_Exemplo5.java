package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;

public class Aula7_Exemplo5 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(9);
        numeros.add(8);
        numeros.add(7);
        numeros.add(6);

        int contador = 0;
        while (contador<numeros.size()){
            System.out.println(numeros.get(contador));
            contador++;
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        for (Integer referencia: numeros) {
            System.out.println(referencia);
        }

    }
}
