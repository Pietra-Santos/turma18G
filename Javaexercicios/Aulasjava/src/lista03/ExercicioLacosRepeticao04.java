/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, genero (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
1- o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.*/
/* 
 * 1- receber valor de idade
 * 2- receber o valor de genero = (1-feminino / 2-masculino / 3-Outros)
 * 3- receber o valor de humor da pessoa = (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva) 
 * 4- verificar se a pessoa é calma
 * 5- se for calmo, somar pessoasCalmas
 * 6- verificar se é mulher
 * 6- se for mulher, verificar se é nervosa
 * 7- se for mulher e nervosa, somar as mulheres nervosas
 * 8- verificar se é homem, se for homem, verificar se é agressivo, se for agressivo, somar homem agressivo
 * 9- verificar se é de outro( não sendo homem nem mulher), se for outro, verificar se é calmo, se for calmo, somar outros calmos
 * 10- verificar  se a pessoa é nervosa, se for nervosa, verificar se ela tem mais de 40 anos, se for nervosa e tiver mais de 40 anos, 
 * somar pessoas nervosas com 40+
 * 11-verificar se a pessoa é calma, se for calma, 
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
		 System.out.println("O total de pessoas calmas é: "+pessoasCalmas);
		 System.out.println("O total de mulheres nervosas é: "+mulheresNervosas);
		 System.out.println("O total de  homens agressivos é: "+homensAgressivos);
		 System.out.println("O total de outros calmos é: "+outrosCalmos);
		 System.out.println("O total de pessoas nervosas com mais de 40 anos é: "+pessoasNervosas40Mais);
		 System.out.println("o total de pessoas calmas com menos de 18 anos é: "+pessoasCalmasMenos18);
	}   
}
