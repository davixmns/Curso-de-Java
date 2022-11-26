package aula_8;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do João: ");
        float notaJoao = scanner.nextFloat();

        System.out.println("Digite a nota da Maria: ");
        float notaMaria = scanner.nextFloat();

        if (notaMaria == notaJoao){
            System.out.println("Notas são iguais!");
        } else {
            System.out.println("Notas diferentes");
        }
    }
}
