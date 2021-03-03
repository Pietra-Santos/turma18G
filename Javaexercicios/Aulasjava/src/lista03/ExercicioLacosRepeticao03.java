 package lista03;

import java.util.Scanner;

public class ExercicioLacosRepeticao03 {
	 public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
	 int idade=0, idadeMenor21=0, idadeMaior50=0;
	 final int PARAR=-99;
	 while (idade != PARAR) {
	 System.out.print("Digite a idade: ");
	 idade = ler.nextInt();
	 if (idade < 21 && idade >= PARAR ) {
		 idadeMenor21 = idadeMenor21 + 1;
	 }
	 else if(idade > 50) {
	     idadeMaior50++;
	 }
	 } 
	 System.out.printf("O total de pessoas com menos de 21 anos é: %d ", idadeMenor21);
	 System.out.printf("\nO total de pessoas com mais de 50 anos é: %d ", idadeMaior50);
	 }
 }
