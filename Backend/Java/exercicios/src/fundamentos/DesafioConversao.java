package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro Salario :");
		String numero1 = entrada.next().replace(",",".");
		
		System.out.print("Digite o segundo Salario:");
		String numero2 = entrada.next().replace(",",".");
		
		System.out.print("Digite o terceiro Salario:");
		String numero3 = entrada.next().replace(",",".");
		
		Double salario1 = Double.parseDouble(numero1);
		Double salario2 = Double.parseDouble(numero2);
		Double salario3 = Double.parseDouble(numero3);
		
		double soma = (salario1 + salario2 + salario3);
		System.out.println("Total: R$" + soma);
		System.out.println("Media: R$" +soma /3);
		
		entrada.close();
	}

}
