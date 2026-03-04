
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero");
        int num = entrada.nextInt();

        if(num <= 1){
            System.out.println("Nao e numero primo");
        }

        boolean ehPrimo = true;

        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0){
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo){
            System.out.println("E numero primo");
        } else {
            System.out.println("Nao e numero primo");
        }
    }

}
 