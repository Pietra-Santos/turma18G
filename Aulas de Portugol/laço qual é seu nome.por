programa
{
    funcao inicio()
	{
		cadeia nome
		inteiro anoNasc
		inteiro idade
		
		caracter parar = 'N'

		enquanto (parar != 'S')
		{
escreva("Qual seu nome : ")
leia(nome)
escreva("Qual seu ano de nascimento :")
leia(anoNasc)
idade = 2021 - anoNasc
escreva(idade, "\n")


			
			escreva ("deseja parar o laço? (S/N)")
			leia (parar)
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */