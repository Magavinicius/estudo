
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int cont = 0;

        System.out.println("Digite 10 numeros");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = entrada.nextInt();
             
            if(num > cont){ 
                cont = num;
            }
        }
        System.out.println("O maior numero foi o " + cont);
    }
}