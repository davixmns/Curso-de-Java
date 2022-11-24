package aula_4;

public class Main {
    public static void main(String[] args) {
        //area do triangulo
        double base = 23.2;
        double altura = 30.5;
        double areaTriangulo = (base * altura) / 2;
        System.out.println("Área do triangulo = " + areaTriangulo);

        //area do trapezio
        double baseMaior = 10;
        double baseMenor = 7;
        altura =  15;
        double areaTrapezio = ((baseMaior + baseMenor) * altura)/ 2;

        System.out.println("área do trapézio = " + areaTrapezio + "m^2");
    }
}
