package br.com.zup;

public class Aula1_Exemplo1 {

    public static void main(String[] args) {

        int idade_do_usuario = 700;
        String nomeDoUsuario = "Xablau";

        // Printando as variáveis declaradas
        System.out.print("Olá, meu nome é ");
        System.out.print(nomeDoUsuario);
        System.out.print(" e minha idade é ");
        System.out.print(idade_do_usuario);
        System.out.println(" anos");

        // Printando de forma concatenada as variáveis declaradas
        System.out.print("Olá, meu nome é " + nomeDoUsuario + " a minha idade é " + idade_do_usuario);

    }


}
