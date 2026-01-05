package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		final double AJUSTE = 32.0;
		final double FATOR =  5/9.0;
		
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(fahrenheit + "°F é a mesma coisa que " + celsius + "°C");
				
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.printf("%.2f°F é a mesma coisa que %.2f°C%n", fahrenheit, celsius);
	}

}
