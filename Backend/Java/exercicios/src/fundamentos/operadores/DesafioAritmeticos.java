package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double a = 6 * (3 + 2);		
		double b = Math.pow(a, 2);		
		double primeiraFunc = b/(3*2);
		
		double c = (1-5) * (2 -7);
		double d = c / 2;
		double segundaFunc = Math.pow(d, 2);
		
		double e = (primeiraFunc - segundaFunc);
		
		double f = Math.pow(e, 3);
		double g = Math.pow(10, 3);
		double resultado = f / g;
		
		System.out.println( "("+ primeiraFunc + " - " + segundaFunc + ")³");
		System.out.println("___________");
		System.out.println("");
		System.out.println("10³");
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Resultado: " + resultado);
		
	
	}
}
