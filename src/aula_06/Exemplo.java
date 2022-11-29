package aula_06;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        int distancia = scanner.nextInt();

        System.out.println("Digite o total de combustível gasto: ");
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distancia / combustivelGasto;

        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}
