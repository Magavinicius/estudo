
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        
        System.out.println("Calculadora de Area de Triangolo");

        System.out.println("Informe a base e a altura do triangulo");

        Scanner entrada = new Scanner(System.in);
        
        double base = entrada.nextDouble();
        double altura = entrada.nextDouble();
        
        double resultado = (base * altura)/2;

        System.out.printf("A area do seu triangulo e de %.2f metros quadrados",resultado);
    }

}
