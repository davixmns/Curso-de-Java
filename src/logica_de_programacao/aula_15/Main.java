package logica_de_programacao.aula_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - sonho de valsa, 1 real");
        System.out.println("3 - coca lata, 3.50 reais");
        System.out.println("7 - doritos, 7.30 reais");
        System.out.println("8 - red bull, 7.50 reais");

        System.out.println("Insira uma cedula na máquina");
        double dinheiro = scanner.nextDouble();

        System.out.println("Digite um numero de produto: ");
        int codigo = scanner.nextInt();

        while (dinheiro > 0 && codigo != 0){
            switch (codigo) {
                case 1 -> {
                    System.out.println("sonho de valsa");
                    dinheiro -= 1.0;
                }
                case 3 -> {
                    System.out.println("coca lata");
                    dinheiro -= 3.50;
                }
                case 7 -> {
                    System.out.println("doritos");
                    dinheiro -= 7.30;
                }
                case 8 -> {
                    System.out.println("red bull");
                    dinheiro -= 7.50;
                }
            }
            System.out.printf("Digite um numero de produto - R$%.2f restantes\n", dinheiro);
            codigo = scanner.nextInt();
        }
        System.out.printf("troco = R$%.2f\n", dinheiro);
    }
}
