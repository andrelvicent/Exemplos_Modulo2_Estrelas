package br.com.zup;

public class Aula3_Exemplo5 {
    public static void main(String[] args) {
        int opcao = 1;
        System.out.println("Exibindo o Menu principal");

        // Criando um menu dentro do submenu
        switch (opcao){
            case 1:
                System.out.println("Exibindo o menu dentro do menu");
                int opcao2 = 2;

                switch (opcao2){
                    case 1:
                        System.out.println("Exibindo opcao 1 do submenu");
                        break;
                    case 2:
                        System.out.println("Exibindo opcao 2 do submenu");
                        break;
                }
                break;
            case 2:
                System.out.println("Exibindo opcao 2");
                break;
        }
    }
}
