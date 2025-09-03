package operadores;

import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		System.out.println("Qual foi as notas do seu aluno ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if ( media >=6 ) {
			System.out.printf("NOTA FINAL : %.1f%n" , media);
			System.out.printf("Parabens você foi aprovado");
		}
		else {
			System.out.printf("Nota final: %.1f%n" , media);
			System.out.printf("Reprovado");
		}
		
		sc.close();	
		}
	
	}