package aula_9;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voce participou da palestra?");
        String participouPalestra = scanner.next();

        System.out.println("Qual é a sua nota da prova?");
        double nota = scanner.nextDouble();

        if (participouPalestra.equals("sim") && nota >= 9){
            System.out.println("voce ganhou o premio");
        } else {
            System.out.println("voce nao ganhou o premio");
        }

        if(participouPalestra.equals("sim") || nota >= 9){
            System.out.println("voce passou de ano");
        } else {
            System.out.println("voce repetiu de ano");
        }

        if(!participouPalestra.equals("sim")){
            System.out.println("voce nao ganhou");
        }
    }
}
