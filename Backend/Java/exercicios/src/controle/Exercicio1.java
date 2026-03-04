
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero");

        int num = entrada.nextInt();

        if( num >= 0 && num <= 10){
            System.out.println("Esta entre 0 e 10");
            if(num % 2 == 0){
                System.out.printf("O numero e par");
            }
        }else{
            System.out.println("o numero tem que estar entre 0 e 10");
        }
    }          
}
