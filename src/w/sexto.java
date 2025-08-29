package w;

import java.util.Locale;
import java.util.Scanner;

public class sexto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double a, b, c, areaTriangulo, areaCirculo, areatrapezio, areaquadrado, arearetangulo, pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTriangulo = ( a * c /2);
		areaCirculo = ( pi * c *c );
		areatrapezio = ( (a + b) * c /2);
		areaquadrado = ( b * b);
		arearetangulo = (a * b);
		
		System.out.printf("triangulo :  %.3f%n", areaTriangulo);
		System.out.printf("circulo : %.3f%n", areaCirculo);
		System.out.printf("trapezio: %.3f%n", areatrapezio);
		System.out.printf("quadrado %.3f%n", areaquadrado);
		System.out.printf("retagulo %.3f%n", arearetangulo);
		
	
		
		sc.close();
		
		

	}

}
