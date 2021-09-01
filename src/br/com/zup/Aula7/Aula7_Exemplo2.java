package br.com.zup.Aula7;

import java.util.HashMap;
import java.util.Map;

public class Aula7_Exemplo2 {
    public static void main(String[] args) {
        // Criando uma estrutura HashMap
        Map<String, String> contatos = new HashMap<String, String>();

        contatos.put("andre@andre", "André");
        contatos.put("joao@joao", "Joao");
        contatos.put("marcio@marcio", "Marcio");
        contatos.put("ev@ev", "Evellyn");

        System.out.println("Este email é do: " +contatos.get("andre@andre"));
    }
}
