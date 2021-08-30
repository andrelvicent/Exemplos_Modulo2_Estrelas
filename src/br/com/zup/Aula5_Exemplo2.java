package br.com.zup;

import jdk.swing.interop.SwingInterOpUtils;

public class Aula5_Exemplo2 {
    public static void main(String[] args) {
     //   System.out.println("0");
      //  System.out.println("1");
      //  System.out.println("2");
     //   System.out.println("3");
     //   System.out.println("4");
        int contador = -2;

    //    while (contador >= 0){
    //        System.out.println(contador);
    //        contador += 1;
    //    }

        do {
            System.out.println(contador);
            contador ++;
            System.out.println(contador);
        }while (contador >= 0);

    }
}
