package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula7_Exemplo1 {
    public static void main(String[] args) {
       // Criando Listas de alunos
        List <String> alunos = new ArrayList<>();
        alunos.add("André");
        alunos.add("Paulo");
        alunos.add("Paulo");

        for(String xablau : alunos){
            System.out.println(xablau);
        }


    }
}
