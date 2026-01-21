import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Passe uma temperatura em Fahrenheit");
        double temFa = entrada.nextDouble();

        double temCe = (temFa - 32) *5/9;

        System.out.printf("%.1fF para %.1fC e de ",temFa,temCe);


        

    }

}
