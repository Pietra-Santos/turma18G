package lista02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double peso = 0.0, excesso = 0.0, multa = 0.0 ;
	System.out.print("Informe o peso dos tomates ");
    peso = ler.nextDouble();
    
    if ((int)peso > 50){
    excesso = ((int)peso - 50);
    multa= excesso * 4 ;
    
    }
	 System.out.println("O peso é de "+ peso+ ", o excesso é " 
    + excesso + " e a multa é de R$ "+ multa+ " reais");
	
	 System.out.printf("o peso é de %.2f, o excesso é %.2f, a multa é %.2f", 
		 peso,excesso,multa);
	 
	}

}
