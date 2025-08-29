package w;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);	
    
    	
    	int numero1 = sc.nextInt();
    	int numero2 = sc.nextInt();
    	
    	System.out.println("O resultado da soma é:" + (numero1 + numero2));
    	 
    	

    	 sc.close();
     
    }
}


