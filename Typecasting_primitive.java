package module1;

public class Typecasting_primitive {

	public static void main(String[] args) {

		byte a = 100; 					// widening implicitly from byte into int
		int con_val = a;
		System.out.println(con_val);

		int con_val1 = (int) a;
		System.out.println(con_val1); 	// widening explicitly from byte into int

		double weight = a;
		System.out.println(weight); 	// byte into double

		double weight1 = (double) a;
		System.out.println(weight1);

		double b = 8.9;					 // narrowing double into int
		int c = (int) b;
		System.out.println(c);

		int p = 251;
		byte d = (byte) p;
		System.out.println(d); 			// narrowing int into byte - explicitly

	}

}
