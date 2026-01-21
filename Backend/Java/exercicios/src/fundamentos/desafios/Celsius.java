
import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        
        System.out.println("Passe uma temperatura em Celsius");

        Scanner entrada = new Scanner(System.in);

        double temCe = entrada.nextDouble();

        double temFa = (temCe * 9/5) + 32;

        System.out.printf("A temperatura de %.1fC para %.1fF e de ",temCe,temFa);

        //double temCe = (temFa - 32) *5/9;
    }
}
