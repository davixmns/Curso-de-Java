package logica_de_programacao.aula_08;

import java.util.Objects;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioBanido = "emailfulano@gmail.com";

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        if(Objects.equals(email, usuarioBanido)){
            System.out.println("Você está banido!");
        } else {
            System.out.println("Conta Criada");
        }
    }
}
