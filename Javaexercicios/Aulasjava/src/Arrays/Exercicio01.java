 /*
     * 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
        atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
     */
      // matriz e vetor == for
package Arrays;

import java.util.Scanner;

public class Exercicio01 {
 
	  public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
      int valores[] = new int [5];
      int maiorPontuacao = 0;
      
      for (int y=0;y<valores.length;y++) {
    	  System.out.printf("Digite o valor d%",(y+1));
    	  valores[y] = ler.nextInt();
    	  if (valores[y] > maiorPontuacao) {
    	  maiorPontuacao = valores[y];
    	  }
      }
      System.out.printf("A maior pontua��o �: %d ", maiorPontuacao);
	  }
}