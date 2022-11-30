package aula_11;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaGravada = "100% JESUS";

        System.out.println("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        //SOLUÇÃO NÃO TÃO BOA
        if(senhaDigitada.equals(senhaGravada)){
            System.out.println("acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        //SOLUÇÃO BOA
        String texto = senhaDigitada.equals(senhaGravada) ? "acesso concedido" : "acesso negado";
        System.out.println(texto);

        //SOLUÇÃO MUITO BOA
        boolean acesso = senhaDigitada.equals(senhaGravada);

        if (acesso){
            System.out.println("acesso concedido");
            //entrar no sistema
        } else {
            System.out.println("acesso negado");
            //bloquear entrada no sistema
        }
    }
}
