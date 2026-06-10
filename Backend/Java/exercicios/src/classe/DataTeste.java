public class DataTeste {
    public static void main(String[] args) {
        
        Data data1 = new Data();
        data1.dia = 17;
        data1.mes = 3;
        data1.ano = 2026;
        
        Data data2 = new Data();  
        data2.dia = 24;
        data2.mes = 2;
        data2.ano = 1998;

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

    }

}
