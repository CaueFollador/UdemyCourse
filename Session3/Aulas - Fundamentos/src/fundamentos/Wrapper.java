package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Byte b = 100; //byte
		Short s = 1000; //short
		Integer i = 10000; // int
		Long l = 100000L; ///lomg
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(l.doubleValue());

		Scanner entrada = new Scanner(System.in);
		
		Integer outro = Integer.parseInt(entrada.next());
		
		System.out.println(i.compareTo(outro));
		
		entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
	}
}
