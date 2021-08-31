package br.com.zup.Aula6;

import java.util.ArrayList;
import java.util.List;

// Crie uma lista para todos números lidos
// Adicione na lista de números pares, todos os números pares da lista de números
// Adicione na lista de números impares, todos os números impares da lista de números


public class Aula6_Exemplo2 {
    public static void main(String[] args) {
        List <Integer> todosOsNumeros = new ArrayList<>();
        List <Integer> numerosImpares = new ArrayList<>();
        List <Integer> numerosPares = new ArrayList<>();

        todosOsNumeros.add(70);
        todosOsNumeros.add(5);
        todosOsNumeros.add(8);
        todosOsNumeros.add(11);
        todosOsNumeros.add(17);
        todosOsNumeros.add(24);
        todosOsNumeros.add(23);
        todosOsNumeros.add(22);
        todosOsNumeros.add(21);
        todosOsNumeros.add(89);
        todosOsNumeros.add(100001);


        for (Integer xablau : todosOsNumeros) {

            if (xablau % 2 == 0){
                numerosPares.add(xablau);
            } else{
                numerosImpares.add(xablau);
            }

        }

        System.out.println("Lista completa de números: ");
        System.out.println(todosOsNumeros);

        System.out.println("Quantidade de números impares: ");
        System.out.println(numerosImpares.size());

        System.out.println("Numeros impares: ");
        System.out.println(numerosImpares);

        System.out.println("Numeros Pares");
        System.out.println(numerosPares);
        System.out.println("Quantidade de números pares: ");
        System.out.println(numerosPares.size());

    }
}
