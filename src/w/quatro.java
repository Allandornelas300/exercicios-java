package w;

import java.util.Locale;
import java.util.Scanner;

public class quatro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero_do_Funcionario, horas;
		double valorHora, salario;
		
		numero_do_Funcionario = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		
		
		salario = horas * valorHora;
		
		System.out.println("Number: " + numero_do_Funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		
		
		sc.close();

	}

}
