package br.com.zup.Aula1;

public class Aula1_Exemplo3 {
    public static void main(String[] args) {
        // Armazenou os dois dados necessários para o processamento

        float qtdDeHorasTrabalhadas = 10;
        float salarioPorHora = 20;

        // Calcular o salário bruto
        float salarioBruto = qtdDeHorasTrabalhadas * salarioPorHora;


        System.out.println("Você trabalhou " +qtdDeHorasTrabalhadas
                + "Hrs, e você recebe R$" +salarioPorHora
                + " por hora");

        System.out.println("Portanto, seu salário este mês, será: R$"+salarioBruto);
    }
}
