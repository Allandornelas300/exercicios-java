package operadores;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	if( a % b == 0 || b % a == 0) {
		System.out.println("É multiplo");
	}
	else {
		System.out.println("Não é multiplo");
	}
	
	sc.close();
	}

}
