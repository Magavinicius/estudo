
import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Informe o numero:");
        double numero1 = entrada.nextDouble();
        System.out.printf("Informe o numero:");
        double numero2 = entrada.nextDouble();
        System.out.printf("Informe o operador:");
        String operador = entrada.next();
        

        double total = "+".equals(operador) ? numero1 + numero2: 0;
        total = "-".equals(operador) ? numero1 - numero2: total;
        total = "*".equals(operador) ? numero1 * numero2: total;
        total = "/".equals(operador) ? numero1 / numero2: total;
        total = "%".equals(operador) ? numero1 % numero2: total;


         System.out.printf("%.2f %s %.2f = %.2f",numero1,operador,numero2,total);
        //ler num1
        //ler num2
        //Selecione a operacao + - * / %

        entrada.close();
    }

}
