package br.com.zup;

public class ListaComplementar1_Resolucao1 {
    public static void main(String[] args) {
        double area = 60;
        double qtdDeLitrosNecessaria = area/6;
        double valorLata = 80;
        double valorGalao = 25;

        System.out.print("Você precisará de: ");

        double latasDeTintaNecessarias = qtdDeLitrosNecessaria/18;
        double latasDeTintaInteirasNecessarias = Math.ceil(latasDeTintaNecessarias);

        System.out.println(latasDeTintaInteirasNecessarias + " latas de tintas");

        double galaoDeTintaNecessarios = qtdDeLitrosNecessaria/3.6;
        double galoesDeTintaInteirosNecessarios = Math.ceil(galaoDeTintaNecessarios);

        System.out.print("Você precisará de: ");
        System.out.println("Você pagará: R$"+latasDeTintaInteirasNecessarias * valorLata);
        System.out.println(galoesDeTintaInteirosNecessarios+" galões de tinta");
        System.out.println("Você pagará: R$"+galoesDeTintaInteirosNecessarios * valorGalao);

        double folga = (0.1 * qtdDeLitrosNecessaria);
        double quantidadeTotalComFolga = qtdDeLitrosNecessaria + folga;

        double resultadoComLatas = Math.ceil(quantidadeTotalComFolga / 18);
        double resultadoComGaloes = Math.ceil(quantidadeTotalComFolga / 3.6);

        System.out.println("Você pode comprar " +resultadoComLatas );
        double valorASerPagoNaLataComFolga = resultadoComLatas*valorLata;

        System.out.println("Você precisará pagar "+valorASerPagoNaLataComFolga);

        double valorASerPagoNoGalaoComFolga = resultadoComGaloes*valorGalao;

        System.out.println("Ou você pode comprar " +resultadoComGaloes);
        System.out.println("Você precisará pagar "+valorASerPagoNoGalaoComFolga);

     //   System.out.println(resultadoComGaloes);


    }
}
