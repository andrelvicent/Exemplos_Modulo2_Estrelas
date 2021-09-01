package br.com.zup.Aula7;

import java.util.HashMap;
import java.util.Map;

public class Aula7_Exemplo2 {
    public static void main(String[] args) {
        // Criando uma estrutura HashMap
        Map<String, Integer> contatos = new HashMap<String, Integer>();

        contatos.put("André Luiz", 24);
        contatos.put("Karen", 26);
        contatos.put("@marcio",23);

        // Imprimindo chaves e valores
        for (String referencia : contatos.keySet()) {
            System.out.println("Chave: " +referencia + " valor: " +contatos.get(referencia));
        }

    }
}
