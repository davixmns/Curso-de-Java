package logica_de_programacao.aula_12;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[3];

        alunos[0] = scanner.nextLine();
        alunos[1] = scanner.nextLine();
        alunos[2] = scanner.nextLine();

        System.out.println(alunos[0]);
        System.out.println(alunos[1]);
        System.out.println(alunos[2]);
    }
}
