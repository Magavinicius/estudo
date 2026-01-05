package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//informacao do funcionario
		
		//Tipo numerico inteiro
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 987324691;
		long pontoAcumulados = 3_134_845_223L;//literal do tipo long  precisa por o L no final, caso ultrapasse a quantidade suportada
		
		
		//Tipo numerico reais
		
		float salario = 11_445.44F;//literal double, precisa por o F no final
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		//Tipo booleano
		boolean estaDeFerias = false;// false ou true
		
		//Tipo caracter
		char status = 'A'; //so aceita uma letra
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontoAcumulados / vendasAcumuladas);
		System.out.println("Funcionario "+ id + ": ganha -> R$ "+ salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: "+ status);
	}

}
