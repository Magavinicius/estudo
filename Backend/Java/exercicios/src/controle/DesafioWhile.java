
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        System.out.println("Digite as notas dos alunos (entre 0 a 10)");
        System.out.println("Para sair digite -1");
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        double total = 0;
        int cont = 0;

        while(nota != -1){
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){
                total += nota;
                cont++;
            }else if(nota != -1){
                System.out.println("Nota invalida");
            }
        }
   

        double media = total/cont;

        System.out.printf("O total das notas de alunos e de %s de %s alunos,"
        +" com isso a media e de %s",total,cont, media);

    }  
}
