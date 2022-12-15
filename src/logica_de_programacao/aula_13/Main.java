package logica_de_programacao.aula_13;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {2, 1, 3, 4, 7, 12, 34, 7, 23, 5};

        int i = 0;
        int dado = 200;
        int comprimentoDoVetor = numeros.length - 1;
        boolean flag = false;

        while(i < comprimentoDoVetor){
            if(numeros[i] == dado){
                flag = true;
                break;
            }
            i++;
        }

        if(flag){
            System.out.println("Número encontrado no índice " + i);
        } else {
            System.out.println("Número não encontrado");
        }
    }
}
