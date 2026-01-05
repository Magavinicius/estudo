package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//trabalho na terca ( V ou F)
		//trabalho na quinta (V ou F)
		// 2 trabalhos Verdadeira: TV de 50'
		// 1 trabalho Verdadeiro: TV de 32'
		// 1 ou 2 trabalhos: tomar sorvete
		// 0 trabalho: ficar em casa
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		if(trabalho1 && trabalho2 == true) {
			System.out.print("Vamos comprar a TV de 50', ");
			System.out.println("e bora ir no shopping tomar sorvete!");
		}else if(trabalho1 || trabalho2 == true) {
			System.out.print("Vamos comprar a TV de 32', ");
			System.out.println("e bora ir no shopping tomar sorvete!");
		}else {
			System.out.print("Vamos ficar em casa, ");
			System.out.println("e sem sorvete.");
		}
		
	}
}
