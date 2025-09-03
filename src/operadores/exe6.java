package operadores;

import java.util.Locale;
import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		double preco = 0.0;
		double total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = 4.00;
		}
		else if ( codigo == 2) {
			preco = 4.50;
		}
		
		else if (codigo == 3) {
			preco = 5.00;
		}
		else if ( codigo == 4) {
			preco = 2.00;
		}
		else if ( codigo == 5) {
			preco = 1.50;
		}
		
		total = preco * quantidade;
		
		System.out.printf("Total %.2f%n", total);
		
		sc.close();
	}

}
