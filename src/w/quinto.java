package w;

import java.util.Locale;
import java.util.Scanner;

public class quinto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		int quantidade1 , codigo1, codigo2, quantidade2;
		double valor1 , valor2,  total;
		
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		valor1 = sc.nextDouble();
		codigo2= sc.nextInt();
		quantidade2 =sc.nextInt();
		valor2 = sc.nextDouble();
		
		
		total = (quantidade1 * valor1) + (quantidade2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


		sc.close();
		

	}

}
