
import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        System.out.println("Formula de Bhaskara");
        System.err.println("Me informe as segintes variaveis A, B e C");

        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double delta = (b*b) - 4*a*c;

        double xMais = (-b + Math.sqrt(delta)) / 2*a;
        double xMenos = (-b - Math.sqrt(delta)) / 2*a;

        System.out.printf("O Resultado do Delta e de %.2f, e o Resultado de + %.2f e - %.2f",delta,xMais,xMenos);

    }

}
