package logica_de_programacao.aula_13;

public class Main2 {
    public static void main(String[] args) {
        int[] numeros = {2, 1, 3, 4, 7, 12, 34, 7, 23, 5};

        int i = 0;
        int comprimento = numeros.length;

        while (i < comprimento){
            System.out.print(numeros[i] + " ");
            i++;
        }
    }
}
