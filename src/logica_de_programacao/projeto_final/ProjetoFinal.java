package logica_de_programacao.projeto_final;

import java.util.Scanner;

public class ProjetoFinal { //PROJETO FINAL DE MÁQUINA DE SNACKS
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cocaLata = 3.10;
        double doritosPequeno = 5.0;
        double bis = 4.50;
        double redBull = 7.30;
        double sonhoDeValsa = 1.0;
        double produtoMaisBarato = sonhoDeValsa;

        final int codigoCocaLata = 1;
        final int codigoDoritosPequeno = 2;
        final int codigoBis = 3;
        final int codigoRedBull = 4;
        final int codigoSonhoDeValsa = 5;

        System.out.println("1: COCA LATA       -  R$3,10");
        System.out.println("2: DORITOS PEQUENO -  R$5,00");
        System.out.println("3: BIS             -  R$4,50");
        System.out.println("4: RED BULL        -  R$7,30");
        System.out.println("5: SONHO DE VALSA  -  R$1,00");
        System.out.println("Insira uma cédula na máquina: ");
        double dinheiro = scanner.nextDouble();

        System.out.println("Digite o código de um produto: ");
        int codigoDoProdutoDesejado = scanner.nextInt();

        while (dinheiro >= produtoMaisBarato && codigoDoProdutoDesejado != 0){
            switch (codigoDoProdutoDesejado){
                case codigoCocaLata -> {
                    System.out.println("coca lata liberada");
                    dinheiro -= cocaLata;
                }
                case codigoDoritosPequeno -> {
                    System.out.println("doritos pequeno liberado");
                    dinheiro -= doritosPequeno;
                }
                case codigoBis -> {
                    System.out.println("bis liberado");
                    dinheiro -= bis;
                }
                case codigoRedBull -> {
                    System.out.println("red bull liberado");
                    dinheiro -= redBull;
                }
                case codigoSonhoDeValsa -> {
                    System.out.println("sonho de valsa liberado");
                    dinheiro -= sonhoDeValsa;
                }
            }
            System.out.printf("R$%.2f restantes\n", dinheiro);
            System.out.println("Digite o código de um produto: ");
            codigoDoProdutoDesejado = scanner.nextInt();
        }

        System.out.printf("Troco = R$%.2f\n", dinheiro);
    }
}
