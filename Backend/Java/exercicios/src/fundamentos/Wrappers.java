package fundamentos;


public class Wrappers {
	public static void main(String[] args) {
		
		
				
		//byte
		Byte b = 100;
		System.out.println(b.byteValue());
		
		//short
		Short s = 1000;
		System.out.println(s.toString());
		
		//int
		//Integer.parseInt(10000);
		Integer i = 10000;
		System.out.println(i);
		
		//long
		Long l = 100000L;
		System.out.println(l/3);
		
		//float
		Float f = 123.0F;
		System.out.println(f);
		
		//double
		Double d = 1234.5678;
		System.out.println(d);
		
		
		//boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		
		
		//char
		Character c = 'L';
		System.out.println(c.toString().toLowerCase());
		
		
	}
}
