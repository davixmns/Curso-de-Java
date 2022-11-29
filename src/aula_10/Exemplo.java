package aula_10;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - sonho de valsa");
        System.out.println("3 - coca lata");
        System.out.println("7 - doritos");
        System.out.println("8 - red bull");
        System.out.println("Insira na máquina o valor do produto desejado: ");

        int dinheiro = scanner.nextInt();

        switch (dinheiro) {
            case 1 -> System.out.println("sonho de valsa");
            case 3 -> System.out.println("coca lata");
            case 7 -> System.out.println("doritos");
            case 8 -> System.out.println("red bull");
            default -> System.out.println("dinheiro devolvido");
        }
    }
}
