
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um ano");

        int ano = entrada.nextInt();

        if(ano % 4 == 0){
            System.out.println("E ano bissexto");
        }else{
            System.err.println("Nao e bissexto");
        }


    }

}
