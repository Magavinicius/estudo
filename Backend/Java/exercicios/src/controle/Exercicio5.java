import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero");
        int num = entrada.nextInt();

        switch (num <= 1 ? 1 : 0){
            case 1:
                System.out.println("Nao e numero primo");

            case 0:
                break;
        }
            

        boolean ehPrimo = true;

        for (int i = 2; i * i <= num; i++) {
            switch (num % i == 0 ? 1 : 0){
                case 1:
                    ehPrimo = false;
                break;

                case 0:
                break;
            }
        }

        switch (ehPrimo ? 1 : 0){
            case 1:
                System.out.println("E numero primo");
            break;

            case 0:
                System.out.println("Nao e numero primo");
            break;
        }
        
    }
}
