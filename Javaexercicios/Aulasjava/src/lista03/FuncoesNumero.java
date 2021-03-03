package lista03;

import java.util.Scanner;

public class FuncoesNumero {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero; 
		int maiorNumero = 0;
		System.out.println("Digite um numero");
		numero = ler.nextInt();
	
		while(numero>= 0) {
			if (numero<maiorNumero) {
				maiorNumero = numero;
		    }
		   System.out.println("Digite mais um número");
		   numero = ler.nextInt();
		
		}
		System.out.println("O maior numero digitado é: "+maiorNumero);
		 numero = ler.nextInt();
	}		
}
		   
		
		

