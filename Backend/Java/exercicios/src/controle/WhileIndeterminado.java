
import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        
        System.out.println("Voce diz: ");
        Scanner entrada = new Scanner(System.in);
        
        String digitado = entrada.nextLine();

        while(!digitado.equalsIgnoreCase("sair")){
   
            System.out.printf("Voce digitou: %s",digitado);
            digitado = entrada.nextLine();
        }
        System.out.println("agora voce saiu");
    }

}
