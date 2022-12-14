package aula_14;

public class Exemplo1 {
    public static void main(String[] args) {
        int[] numeros = {2, 1, 3, 4, 7, 12, 34, 7, 23, 5};

        boolean flag = false;
        int comprimento = numeros.length - 1;
        int dado = 232;

        for (int i = 0; i < comprimento; i++) {
            if(numeros[i] == dado){
                System.out.println("Número encontrado no índice " + i);
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("numero nao encontrado");
        }
    }
}
