
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe duas notas");

        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double media = (nota1+nota2)/2;

        if(media >= 7.0){
            System.out.println("Aprovado");
            System.out.println("nota "+ media);
        }else if(media< 7.0 && media >4.0){
            System.out.println("Recuperacao");
            System.out.println("nota "+ media);
        }else{
            System.out.println("Reprovado");
            System.out.println("nota "+ media);
        }


    }

}
