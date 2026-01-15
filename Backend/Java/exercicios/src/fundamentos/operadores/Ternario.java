public class Ternario {
    public static void main(String[] args) {

        double media = 5.8;

        String resultadoRecuperacao = media >= 5.0 ? "em recuperacao": "reprovado";
        String resultado = media >= 7.0 ? "Aprovado." : resultadoRecuperacao ;

        System.out.println("O aluno esta " + resultado);
    }

}
