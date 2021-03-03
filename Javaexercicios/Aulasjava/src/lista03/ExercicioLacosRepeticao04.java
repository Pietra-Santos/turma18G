/*4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, genero (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
1- o n�mero de pessoas calmas;
o n�mero de mulheres nervosas;
o n�mero de homens agressivos;
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos;
o n�mero de pessoas calmas com menos de 18 anos.*/
/* 
 * 1- receber valor de idade
 * 2- receber o valor de genero = (1-feminino / 2-masculino / 3-Outros)
 * 3- receber o valor de humor da pessoa = (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva) 
 * 4- verificar se a pessoa � calma
 * 5- se for calmo, somar pessoasCalmas
 * 6- verificar se � mulher
 * 6- se for mulher, verificar se � nervosa
 * 7- se for mulher e nervosa, somar as mulheres nervosas
 * 8- verificar se � homem, se for homem, verificar se � agressivo, se for agressivo, somar homem agressivo
 * 9- verificar se � de outro( n�o sendo homem nem mulher), se for outro, verificar se � calmo, se for calmo, somar outros calmos
 * 10- verificar  se a pessoa � nervosa, se for nervosa, verificar se ela tem mais de 40 anos, se for nervosa e tiver mais de 40 anos, 
 * somar pessoas nervosas com 40+
 * 11-verificar se a pessoa � calma, se for calma, 
 * verificar se ela tem menos de 18 anos, se tiver mneos de 18 anos, somar pessoa calma -18
 * 12 - ler os Dados de 150 pessoas
 */
package lista03;

import java.util.Scanner;

public class ExercicioLacosRepeticao04 {

	public static void main(String[] args) {
		 Scanner ler= new Scanner(System.in); 
         int idade;
         int sexo;
         int humor;
         int pessoasCalmas= 0;
         int mulheresNervosas=0;
         int homensAgressivos=0;
         int outrosCalmos=0;
         int pessoasNervosas40Mais = 0;
         int pessoasCalmasMenos18 = 0;
         int quantidadePessoas= 3;
         int contador = 0;
         while (contador <= quantidadePessoas) {
	         System.out.print("Escreva sua idade: "); 
			 idade = ler.nextInt();
			 System.out.print("Escreva seu sexo: (1-mulher / 2-homem / 3-Outros) ");	
			 sexo = ler.nextInt();
			 System.out.print("Escreva seu humor: (1, calma(o); 2, nervosa(o); 3, agressiva(o) ");
			 humor = ler.nextInt(); 
		 
			 if (humor == 1 ) {
				 pessoasCalmas= pessoasCalmas + 1;
				 
			 }
			 if (sexo == 1 && humor == 2) {
			  mulheresNervosas = mulheresNervosas + 1;
		     }
		     if (sexo == 2 && humor == 3) {
		    	 homensAgressivos = homensAgressivos + 1; 	 
		     }
		     if (sexo == 3 && humor == 1) {
		    	 outrosCalmos = outrosCalmos + 1; 
		     }
		     if (humor == 2 && idade > 40 ) {
		    	 pessoasNervosas40Mais = pessoasNervosas40Mais + 1;
		     }
		     if (humor == 1 && idade < 18) {
		    	 pessoasCalmasMenos18 = pessoasCalmasMenos18 +1;
	         }
		     contador++;
		 }
		 System.out.println("O total de pessoas calmas �: "+pessoasCalmas);
		 System.out.println("O total de mulheres nervosas �: "+mulheresNervosas);
		 System.out.println("O total de  homens agressivos �: "+homensAgressivos);
		 System.out.println("O total de outros calmos �: "+outrosCalmos);
		 System.out.println("O total de pessoas nervosas com mais de 40 anos �: "+pessoasNervosas40Mais);
		 System.out.println("o total de pessoas calmas com menos de 18 anos �: "+pessoasCalmasMenos18);
	}   
}
