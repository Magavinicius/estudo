
import java.util.Scanner;

public class AoQuadradoEAoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero, que o resultado sera o seu quadrado e o seu cubo");

        int numero = entrada.nextInt();

        int resultadoQuadrado = numero * numero;
        int resultadoCubo = numero * numero * numero;

        System.out.printf( "O %d ao Quadrado e %d e ao cubo e %d",numero,resultadoQuadrado,resultadoCubo);
        entrada.close();
    }
}
