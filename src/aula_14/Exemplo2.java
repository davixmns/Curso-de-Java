package aula_14;

public class Exemplo2 {
    public static void main(String[] args) {
        int[] numeros = {2, 1, 3, 4, 7, 12, 34, 7, 23, 5};

        int dado = 232;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == dado){
                System.out.println("Número encontrado no índice " + i);
            }
        }
    }
}
