public class DesafioFor {
    public static void main(String[] args) {
        
        String valor = "#";

        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);

            valor += "#";
        }
        // desafio 

        //restricao nao pode valor numerico para controlar laco
        valor = "#";

        for (String i = "#"; !i.equals("######"); i+= "#") {
            System.out.println(valor);

            valor += "#";
        }
    }
}
