
import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Random random = new Random();
        int num = random.nextInt(100);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Acerte o numero de 0 a 100");

        loop: for (int i = 10; i > 0; i--) {

            int adivinha = entrada.nextInt();

            if(num == adivinha){
                System.out.println("Voce acertou o numero");
                break loop;
            } else if(num > adivinha){
                System.out.println("O numero e maior");
            } else if(num < adivinha){
                System.out.println("O numero e menor");
            }
            System.out.println("Falta apenas " + i + " tentativas");
        }
    }
}
