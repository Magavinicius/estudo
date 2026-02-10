
import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        System.out.println("Digite um dia da semana");

        Scanner entrada = new Scanner(System.in);
        String semana = entrada.next();
        
        if(semana.equals("domingo")){
            System.out.println(1);
        }else if(semana.equals("segunda")){
            System.out.println(2);
        }else if(semana.equals("terça")){
            System.out.println(3);
        }else if(semana.equals("quarta")){
            System.out.println(4);
        }else if(semana.equals("quinta")){
            System.out.println(5);
        }else if(semana.equals("sexta")){
            System.out.println(6);
        }else if(semana.equals("sabado")){
            System.out.println(7);
        }else{
            System.out.println("ERRO");
        }
        
    }

}
