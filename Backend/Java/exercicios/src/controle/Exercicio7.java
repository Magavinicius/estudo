
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
        int num = 0;

        while(true){
        int cont = entrada.nextInt();
        
        if(cont > 0){
            int soma = num + cont;

            System.out.println( num + "+" + cont + "=" + soma);

            num = soma;

        }else if(cont< 0){
            break;
        }
        }
        System.out.println("Saiu");
    }

}
